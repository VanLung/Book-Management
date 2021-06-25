/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dto.BookDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import utils.DBUltis;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class TblBookDAO {

    

    public static int addBook(String bookID, String bookName, String author,
            String publisher, int publishedYear, boolean forRent) throws SQLException {
        Connection con = DBUltis.openConnection();
        int result = 0;
        if (con != null) {

            String sql = "Insert into TblBook(bookID, bookName,"
                    + " author, publisher, publishedYear, forRent)"
                    + " values(?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, bookID);
            pst.setString(2, bookName);
            pst.setString(3, author);
            pst.setString(4, publisher);
            pst.setInt(5, publishedYear);
            pst.setBoolean(6, forRent);

            result = pst.executeUpdate();
        }
        return result;
    }

    public static Vector<BookDTO> getAllBook() {
        Vector<BookDTO> result = new Vector<>();
        Connection con = null;
        try {
            con = DBUltis.openConnection();
            if (con != null) {
                String sql = "Select bookID, bookName, author,"
                        + " publisher, publishedYear, forRent"
                        + " from TblBook";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookName = rs.getString("bookName");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    int publishedYear = rs.getInt("publishedYear");
                    boolean forRent = rs.getBoolean("forRent");
                    BookDTO book = new BookDTO(bookID, bookName, author,
                            publisher, publishedYear, forRent);
                    result.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static int updateBook(String bookID, String bookName, String author,
            String publisher, int publishedYear, boolean forRent) throws Exception {
        Connection con = DBUltis.openConnection();
        int result = 0;
        if (con != null) {
            try {
                String sql = "Update TblBook"
                        + " set bookName = ?, author = ?, publisher = ?,"
                        + " publishedYear = ?, forRent = ? "
                        + " where bookId = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, bookName);
                pst.setString(2, author);
                pst.setString(3, publisher);
                pst.setInt(4, publishedYear);
                pst.setBoolean(5, forRent);
                pst.setString(6, bookID);

                result = pst.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    
    public static Vector<String> getColumsName() {
        Vector<String> header = new Vector<>();
        Connection con = null;
        try {
            con = utils.DBUltis.openConnection();

            if (con != null) {
                String sql = "Select bookID, bookName, author,"
                        + " publisher, publishedYear, forRent"
                        + " from TblBook";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    header.add(meta.getColumnName(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return header;
    }

    public static int deleteBook(String bookID) throws Exception {
        Connection con = DBUltis.openConnection();
        int result = 0;
        if (con != null) {
            try {
                String sql = "Delete from TblBook"
                        + " where bookID = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, bookID);

                result = pst.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Vector<BookDTO> sortByNameDescending() {
        Vector<BookDTO> result = new Vector<>();
        Connection con = null;
        try {
            con = utils.DBUltis.openConnection();
            if (con != null) {
                String sql = "Select bookID, bookName, author,"
                        + " publisher, publishedYear, forRent"
                        + " from TblBook\n"
                        + " order by bookName DESC";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookName = rs.getString("bookName");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    int publishedYear = rs.getInt("publishedYear");
                    boolean forRent = rs.getBoolean("forRent");
                    BookDTO book = new BookDTO(bookID, bookName, author, publisher, publishedYear, forRent);
                    result.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Vector<BookDTO> searchByName(String searchName) {
        Vector<BookDTO> result = new Vector<>();
        Connection cn = null;
        try {
            cn = DBUltis.openConnection();
            if (cn != null) {
                String sql = "Select bookID, bookName, author,"
                        + " publisher, publishedYear, forRent"
                        + " from TblBook\n"
                        + " where bookName like ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + searchName + "%");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookName = rs.getString("bookName");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    int publishedYear = rs.getInt("publishedYear");
                    boolean forRent = rs.getBoolean("forRent");
                    BookDTO book = new BookDTO(bookID, bookName, author, publisher, publishedYear, forRent);
                    result.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Vector<BookDTO> searchByID(String searchID) {
        Vector<BookDTO> result = new Vector<>();
        Connection con = null;
        try {
            con = DBUltis.openConnection();
            if (con != null) {
                String sql = "Select bookID, bookName,"
                        + " author, publisher, publishedYear, forRent"
                        + " from TblBook\n"
                        + " where bookID LIKE ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, "%" + searchID + "%");
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookName = rs.getString("bookName");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    int publishedYear = rs.getInt("publishedYear");
                    boolean forRent = rs.getBoolean("forRent");
                    BookDTO book = new BookDTO(bookID, bookName, author, publisher, publishedYear, forRent);
                    result.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    
    public static Vector<BookDTO> sortByNameAscending() {
        Vector<BookDTO> result = new Vector<>();
        Connection con = null;
        try {
            con = DBUltis.openConnection();
            if (con != null) {
                String sql = "Select bookID, bookName, author,"
                        + " publisher, publishedYear, forRent"
                        + " from TblBook\n"
                        + " order by bookName ASC";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookName = rs.getString("bookName");
                    String author = rs.getString("author");
                    String publisher = rs.getString("publisher");
                    int publishedYear = rs.getInt("publishedYear");
                    boolean forRent = rs.getBoolean("forRent");
                    BookDTO book = new BookDTO(bookID, bookName, author, publisher, publishedYear, forRent);
                    result.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
