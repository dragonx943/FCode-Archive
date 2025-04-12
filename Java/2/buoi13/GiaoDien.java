package buoi13;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GiaoDien extends javax.swing.JFrame {

    
    ArrayList<SanPham> list = new ArrayList();
    SanPhamRepository service = new SanPhamRepository();
    DefaultTableModel _defaultTableModel = new DefaultTableModel();
    DefaultComboBoxModel defaultcbm = new DefaultComboBoxModel();
    
    public GiaoDien() {
        initComponents();
        loadCBMWeb();
        loadTable();
        fillData(0);
    }

    public void loadTable(){
        _defaultTableModel = (DefaultTableModel) tblSanPham.getModel();
        _defaultTableModel.setRowCount(0);
        for (SanPham sp : service.getAll()) {
            _defaultTableModel.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getNgaySX(), sp.getWebsite(), sp.getSoLuong(), sp.getTrangThai() == 1 ? "Còn hàng" : "Hết hàng"
            });
        }
    }
    
    public void clearTable(){
        _defaultTableModel = (DefaultTableModel) tblSanPham.getModel();
        _defaultTableModel.setRowCount(0);
    }
    
    public void clearForm() {
        txtMa.setText("");
        txtTen.setText("");
        txtNgaySX.setText("");
        cboWebsite.removeAllItems();
        txtSoLuong.setText("");
        buttonGroup1.clearSelection();
    }
    
    public void loadCBMWeb(){
        defaultcbm.addElement("fpoly.com");
        defaultcbm.addElement("APPoly.com");
        cboWebsite.setModel(defaultcbm);
    }
    
    public void fillData(int index) {
        list = service.getAll();
        SanPham sp = list.get(index);
        txtMa.setText(sp.getMaSP());
        txtTen.setText(sp.getTenSP());
        txtNgaySX.setText(String.valueOf(sp.getNgaySX()));
        cboWebsite.setSelectedItem(sp.getWebsite());
        txtSoLuong.setText(String.valueOf(sp.getSoLuong()));
        if (sp.getTrangThai() == 1) {
            rdoCon.setSelected(true);
        } else rdoHet.setSelected(true);
    } 
    
    private SanPham getValueForm(){
        String ngayStr = txtNgaySX.getText();
        java.sql.Date ngaySanXuat = java.sql.Date.valueOf(ngayStr);
        return new SanPham(
                txtMa.getText(),
                txtTen.getText(),
                ngaySanXuat,
                (String) cboWebsite.getSelectedItem(),
                Integer.parseInt(txtSoLuong.getText()),
                rdoCon.isSelected()? 1:0 )
                ;
    }
    
    public void sortBySoLuong() {
        clearTable();
        for (SanPham sp : service.sort()) {
            _defaultTableModel.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getNgaySX(), sp.getWebsite(), sp.getSoLuong(), sp.getTrangThai() == 1 ? "Còn hàng" : "Hết hàng"
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNgaySX = new javax.swing.JTextField();
        cboWebsite = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        rdoCon = new javax.swing.JRadioButton();
        rdoHet = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quản Lý Sản Phẩm");

        jLabel2.setText("Mã Sản Phẩm");

        jLabel3.setText("Tên Sản Phẩm");

        jLabel4.setText("Ngày Sản Xuất");

        jLabel5.setText("Website");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Trạng thái");

        cboWebsite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rdoCon);
        rdoCon.setText("Còn");

        buttonGroup1.add(rdoHet);
        rdoHet.setText("Hết");

        jLabel8.setText("Tìm kiếm theo tên");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Ngày sản xuất", "Website", "Số lượng", "Trạng thái"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        btnThem.setText("Add");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnXoa.setText("Delete");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sort");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgaySX, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearch)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoCon)
                                .addGap(42, 42, 42)
                                .addComponent(rdoHet))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(63, 63, 63)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa)
                                .addGap(69, 69, 69)
                                .addComponent(btnSapXep)
                                .addGap(66, 66, 66)
                                .addComponent(btnClear)
                                .addGap(30, 30, 30)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdoCon)
                    .addComponent(rdoHet))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnUpdate)
                    .addComponent(btnXoa)
                    .addComponent(btnSapXep)
                    .addComponent(btnClear))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        int index = tblSanPham.getSelectedRow();
        clearForm();
        loadCBMWeb();
        fillData(index);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon xoa Form khong?", "Xac nhan", JOptionPane.YES_NO_CANCEL_OPTION);
        if(JOptionPane.YES_OPTION == choice){
                clearForm();
                JOptionPane.showMessageDialog(this,"Xoa Form thanh cong","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        } else if(JOptionPane.NO_OPTION == choice) {
                JOptionPane.showMessageDialog(this,"Xoa Form that bai","Thong bao",JOptionPane.ERROR_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this,"Ban da huy Xoa Form!","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        clearTable();
        String ten = txtSearch.getText();
        for (SanPham sp : service.searchFT(ten)) {
            _defaultTableModel.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getNgaySX(), sp.getWebsite(), sp.getSoLuong(), sp.getTrangThai() == 1 ? "Còn hàng" : "Hết hàng"
            });
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon them khong?", "Xac nhan", JOptionPane.YES_NO_CANCEL_OPTION);
        if(JOptionPane.YES_OPTION == choice){
                if (Integer.parseInt(txtSoLuong.getText()) < 0) {
                    JOptionPane.showMessageDialog(this,"So luong phai la so duong!","Loi",JOptionPane.ERROR_MESSAGE);
                } else if (txtTen.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this,"Vui long nhap ten san pham!","Loi",JOptionPane.ERROR_MESSAGE);
                } else if (txtMa.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this,"Vui long khong de trong cac truong!","Loi",JOptionPane.ERROR_MESSAGE);
                } else if (txtNgaySX.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this,"Vui long khong de trong cac truong!","Loi",JOptionPane.ERROR_MESSAGE);
                } else {
                    SanPham sp = getValueForm();
                    service.addSP(sp);
                    loadTable();
                }
        } else if(JOptionPane.NO_OPTION == choice) {
                JOptionPane.showMessageDialog(this,"Them that bai","Thong bao",JOptionPane.ERROR_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this,"Ban da huy them","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon Update khong?", "Xac nhan", JOptionPane.YES_NO_CANCEL_OPTION);
        if(JOptionPane.YES_OPTION == choice){
                int indexRow = tblSanPham.getSelectedRow();
                if(indexRow != -1){
                    if (Integer.parseInt(txtSoLuong.getText()) < 0) {
                        JOptionPane.showMessageDialog(this,"So luong phai la so duong!","Loi",JOptionPane.ERROR_MESSAGE);
                    } else if (txtTen.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this,"Vui long nhap ten san pham!","Loi",JOptionPane.ERROR_MESSAGE);
                    } else if (txtMa.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this,"Vui long khong de trong cac truong!","Loi",JOptionPane.ERROR_MESSAGE);
                    } else if (txtNgaySX.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this,"Vui long khong de trong cac truong!","Loi",JOptionPane.ERROR_MESSAGE);
                    } else {
                        SanPham spNew = getValueForm();
                        service.updatesp(spNew);
                        loadTable();
                    }          
                } else JOptionPane.showMessageDialog(this,"Chua chon hang trong bang");
        } else if(JOptionPane.NO_OPTION == choice) {
                JOptionPane.showMessageDialog(this,"Cap nhat that bai","Thong bao",JOptionPane.ERROR_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this,"Ban da huy Update","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong?", "Xac nhan", JOptionPane.YES_NO_CANCEL_OPTION);
        if(JOptionPane.YES_OPTION == choice){
                int indexRow = tblSanPham.getSelectedRow();
                if(indexRow != -1){
                    String ma = txtMa.getText(); // Lấy mã từ cột đầu tiên
                    boolean deleted = service.deletegv(ma);
                    loadTable();
                } else JOptionPane.showMessageDialog(this,"Chua chon hang trong bang");
        } else if(JOptionPane.NO_OPTION == choice) {
                JOptionPane.showMessageDialog(this,"Xoa that bai","Thong bao",JOptionPane.ERROR_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this,"Ban da huy xoa","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon sap xep khong?", "Xac nhan", JOptionPane.YES_NO_CANCEL_OPTION);
        if(JOptionPane.YES_OPTION == choice){
                sortBySoLuong();
                JOptionPane.showMessageDialog(this,"Sap xep thanh cong","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        } else if(JOptionPane.NO_OPTION == choice) {
                JOptionPane.showMessageDialog(this,"Sap xep that bai","Thong bao",JOptionPane.ERROR_MESSAGE);
        } else {
                JOptionPane.showMessageDialog(this,"Ban da huy sap xep","Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboWebsite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoHet;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaySX;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
