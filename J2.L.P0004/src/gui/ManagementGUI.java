/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.TblBookDAO;
import dto.BookDTO;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class ManagementGUI extends javax.swing.JFrame {

    /**
     * Creates new form ManagementGUI
     */
    private boolean addNew = true;

    /**
     * Creates new form BookManager
     */
    public ManagementGUI() {
        initComponents();
        loadPublishYear();
        txtBookID.setEnabled(false);
    }

    public void loadPublishYear() {
        Vector v = new Vector();
        for (int i = 1800; i <= 2020; i++) {
            v.add(i);
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(v);
        jcbPublishedYear.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField3 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        label2 = new java.awt.Label();
        jcbSortByName = new javax.swing.JComboBox<>();
        btnSearchByName = new javax.swing.JButton();
        txtSearchByName = new javax.swing.JTextField();
        btnGetAllBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label8 = new java.awt.Label();
        txtBookName = new java.awt.TextField();
        btnFindByID = new javax.swing.JButton();
        txtBookID = new java.awt.TextField();
        txtAuthor = new java.awt.TextField();
        txtPublisher = new java.awt.TextField();
        jcbPublishedYear = new javax.swing.JComboBox<>();
        chkcbForRent = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Main part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 13))); // NOI18N

        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name", "Author", "Publisher", "Published year", "For rent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBook);

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Sort by name:");

        jcbSortByName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbSortByName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-Z", "Z-A" }));
        jcbSortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSortByNameActionPerformed(evt);
            }
        });

        btnSearchByName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchByName.setText("Search by name");
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        txtSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchByNameActionPerformed(evt);
            }
        });

        btnGetAllBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetAllBook.setText("Get all book");
        btnGetAllBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSortByName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGetAllBook))
                            .addComponent(txtSearchByName))
                        .addGap(41, 41, 41)
                        .addComponent(btnSearchByName)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSortByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByName))
                .addGap(18, 18, 18)
                .addComponent(btnGetAllBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 13))); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Book ID:");

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setText("Author:");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setText("Book name:");

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setText("Publisher:");

        label8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label8.setText("Published year:");

        btnFindByID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFindByID.setText("Find by ID");
        btnFindByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByIDActionPerformed(evt);
            }
        });

        txtBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIDActionPerformed(evt);
            }
        });

        jcbPublishedYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020" }));

        chkcbForRent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkcbForRent.setText("For rent");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAddNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNew.setText("Add new");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(97, 97, 97)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFindByID)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkcbForRent)
                            .addComponent(jcbPublishedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindByID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPublishedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(chkcbForRent)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNew)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Book Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(549, 549, 549)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchByNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String id = txtBookID.getText();
        String name = txtBookName.getText();
        String author = txtAuthor.getText();
        String publishes = txtPublisher.getText();
        //int year = Integer.parseInt((String) Cb_PublishedYear.getSelectedItem());
        int year = (int) jcbPublishedYear.getSelectedItem();
        boolean forRent = chkcbForRent.isSelected();
        int result = 0;
        try {
            result = TblBookDAO.updateBook(id, name, author, publishes, year, forRent);

            if (result != 0) {
                JOptionPane.showMessageDialog(null, "Update sucessfull!!!");

            } else {
                JOptionPane.showMessageDialog(null, "Update fail!!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        addNew = true;
        txtBookID.setEnabled(true);
        txtBookID.setText("");
        txtBookName.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        txtSearchByName.setEnabled(false);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnGetAllBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllBookActionPerformed

    }//GEN-LAST:event_btnGetAllBookActionPerformed

    private void tableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookMouseClicked
        int index = tableBook.getSelectedRow();
        addNew = false;
        if (index >= 0) {
            Vector<BookDTO> book = TblBookDAO.getAllBook();
            BookDTO temp = book.get(index);
            
            txtPublisher.setText(temp.getPublisher());
            jcbPublishedYear.setSelectedItem(tableBook.getValueAt(index, 4));
            chkcbForRent.setSelected(temp.isForRent());
            txtBookID.setEnabled(false);
            txtBookID.setText(temp.getBookID());
            txtBookName.setText(temp.getBookName());
            txtAuthor.setText(temp.getAuthor());

        }
    }//GEN-LAST:event_tableBookMouseClicked

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed
        String searchName = txtSearchByName.getText();
        Vector<BookDTO> list = TblBookDAO.searchByName(searchName);
        Vector<String> header = TblBookDAO.getColumsName();
        Vector data = new Vector();

        for (BookDTO p : list) {
            Vector row = new Vector();
            
            row.add(p.getPublisher());
            row.add(p.getPublishedYear());
            row.add(p.isForRent());
            row.add(p.getBookID());
            row.add(p.getBookName());
            row.add(p.getAuthor());

            data.add(row);
        }
        DefaultTableModel model = (DefaultTableModel) tableBook.getModel();
        model.setDataVector(data, header);
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tableBook.getSelectedRow();
        if (index >= 0) {
            if (checkEmpty()) {
                String id = txtBookID.getText();
                try {
                    if (TblBookDAO.deleteBook(id) != 0) {
                        JOptionPane.showMessageDialog(null, "Delete successfully!!!");
                        txtBookName.setText("");
                        txtAuthor.setText("");
                        txtPublisher.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Choose a row you want to delete!!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jcbSortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSortByNameActionPerformed
        if (jcbSortByName.getSelectedIndex() == 0) {
            Vector<BookDTO> list = TblBookDAO.sortByNameAscending();
            Vector<String> header = TblBookDAO.getColumsName();
            Vector data = new Vector();

            for (BookDTO p : list) {
                Vector row = new Vector();
                row.add(p.getBookID());
                row.add(p.getBookName());
                row.add(p.getAuthor());
                row.add(p.getPublisher());
                row.add(p.getPublishedYear());
                row.add(p.isForRent());

                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) tableBook.getModel();
            model.setDataVector(data, header);
        } else {
            Vector<BookDTO> list = TblBookDAO.sortByNameDescending();
            Vector<String> header = TblBookDAO.getColumsName();
            Vector data = new Vector();

            for (BookDTO p : list) {
                Vector row = new Vector();
                row.add(p.getBookID());
                row.add(p.getBookName());
                row.add(p.getAuthor());
                row.add(p.getPublisher());
                row.add(p.getPublishedYear());
                row.add(p.isForRent());

                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) tableBook.getModel();
            model.setDataVector(data, header);
        }
    }//GEN-LAST:event_jcbSortByNameActionPerformed

    private void btnFindByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByIDActionPerformed
        // TODO add your handling code here:
        String searchID = txtBookID.getText();
        Vector<BookDTO> listsearch = TblBookDAO.searchByID(searchID);
        Vector<String> header = TblBookDAO.getColumsName();
        Vector data = new Vector();

        for (BookDTO p : listsearch) {
            Vector row = new Vector();
            row.add(p.getBookID());
            row.add(p.getBookName());
            row.add(p.getAuthor());
            row.add(p.getPublisher());
            row.add(p.getPublishedYear());
            row.add(p.isForRent());

            data.add(row);
        }
        DefaultTableModel model = (DefaultTableModel) tableBook.getModel();
        model.setDataVector(data, header);
    }//GEN-LAST:event_btnFindByIDActionPerformed

    private void txtBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookIDActionPerformed
    public boolean checkInputName() {
        return false;
        
    }

    public boolean checkEmpty() {
       
        return true;
    }

    public int getYear(String bookID) {
        
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindByID;
    private javax.swing.JButton btnGetAllBook;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JCheckBox chkcbForRent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbPublishedYear;
    private javax.swing.JComboBox<String> jcbSortByName;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label8;
    private javax.swing.JTable tableBook;
    private java.awt.TextField textField3;
    private java.awt.TextField txtAuthor;
    private java.awt.TextField txtBookID;
    private java.awt.TextField txtBookName;
    private java.awt.TextField txtPublisher;
    private javax.swing.JTextField txtSearchByName;
    // End of variables declaration//GEN-END:variables
}
