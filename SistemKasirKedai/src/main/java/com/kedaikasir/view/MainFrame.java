/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kedaikasir.view;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.ArrayList; 
import java.util.List;
import com.kedaikasir.model.DataGlobal;
/**
 *
 * @author user
 */
public class MainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    private List<String[]> daftarProduk = new ArrayList<>();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        loadProductButtons("");
        setSize (1280, 720);      
        setLocationRelativeTo(null);
        
    }
    
    // 1. Fungsi untuk memuat tombol produk (Data Dummy)
    // Fungsi ini sekarang butuh parameter 'keyword' untuk menyaring
    private void loadProductButtons(String keyword) {
        panelGridProduk.removeAll();
        
        // Loop data produk global
        for (String[] produk : DataGlobal.daftarProduk) {
            String nama = produk[0];
            int harga = Integer.parseInt(produk[1]);
            
            // --- LOGIKA PENCARIAN ---
            // Cek: Apakah nama produk mengandung huruf yang diketik?
            // (Kita ubah semua ke huruf kecil/LowerCase biar pencarian tidak sensitif huruf besar)
            boolean match = nama.toLowerCase().contains(keyword.toLowerCase());
            
            // Jika keyword kosong (""), tampilkan semua.
            // Jika ada match, tampilkan yang cocok saja.
            if (keyword.isEmpty() || match) {
                
                JButton btn = new JButton("<html><center>" + nama + "<br>Rp " + harga + "</center></html>");
                btn.setPreferredSize(new Dimension(100, 80));
                
                // Pasang aksi klik (Masih sama seperti kemarin)
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tambahKeKeranjang(nama, harga);
                    }
                });
                
                panelGridProduk.add(btn);
            }
        }
        
        panelGridProduk.revalidate();
        panelGridProduk.repaint();
    }

    // 2. Fungsi saat tombol produk diklik
    private void tambahKeKeranjang(String nama, int harga) {
        DefaultTableModel model = (DefaultTableModel) tblKeranjang.getModel();
        
        // Cek apakah barang sudah ada di keranjang?
        boolean ada = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            String namaDiTabel = (String) model.getValueAt(i, 0);
            if (namaDiTabel.equals(nama)) {
                // Kalau ada, tambahkan Qty-nya saja
                int qtyLama = Integer.parseInt(model.getValueAt(i, 2).toString());
                int qtyBaru = qtyLama + 1;
                int subtotalBaru = qtyBaru * harga;
                
                model.setValueAt(qtyBaru, i, 2); // Update Qty
                model.setValueAt(subtotalBaru, i, 3); // Update Subtotal
                ada = true;
                break;
            }
        }
        
        // Kalau belum ada, tambah baris baru
        if (!ada) {
            model.addRow(new Object[]{nama, harga, 1, harga});
        }
        
        model.fireTableDataChanged(); // Memberitahu tabel ada data baru
        tblKeranjang.repaint();       // Paksa gambar ulang
        
        hitungTotalBelanja();
    }

    // 3. Fungsi Hitung Total
    private void hitungTotalBelanja() {
        DefaultTableModel model = (DefaultTableModel) tblKeranjang.getModel();
        int subTotal = 0;

        // 1. Hitung Subtotal (Jumlah murni harga barang)
        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                // Ambil angka dari kolom ke-3 (index 3) yaitu Subtotal
                int nilai = Integer.parseInt(model.getValueAt(i, 3).toString());
                subTotal += nilai;
            } catch (Exception e) {
                // Abaikan error jika data belum siap
            }
        }

        // 2. Hitung Pajak (10% dari Subtotal)
        // (int) gunanya untuk membulatkan koma ke bawah
        int pajak = (int) (subTotal * 0.10);

        // 3. Hitung Total Akhir (Grand Total)
        int grandTotal = subTotal + pajak;

        // 4. TAMPILKAN KE LAYAR (Update Label)
        // Pastikan nama variabel di bawah ini sesuai dengan yang Anda buat di Langkah 1
        lblAngkaSubtotal.setText("Rp " + subTotal); 
        lblAngkaPajak.setText("Rp " + pajak);
        lblAngkaTotal.setText("Rp " + grandTotal);
        
        // Panggil fungsi hitung kembalian juga (biar kalau tabel berubah, kembalian update)
        updateKembalian();
    }
    
    private void updateKembalian() {
        try {
            // Ambil Total (yang sudah kena pajak)
            String strTotal = lblAngkaTotal.getText().replace("Rp ", "").replace(".", "");
            int total = strTotal.isEmpty() ? 0 : Integer.parseInt(strTotal);
            
            // Ambil Tunai
            String strTunai = txtTunai.getText();
            
            if (!strTunai.isEmpty()) {
                int tunai = Integer.parseInt(strTunai);
                int kembalian = tunai - total;
                
                if (kembalian >= 0) {
                    lblKembalian.setText("Rp " + kembalian);
                } else {
                    lblKembalian.setText("Kurang Rp " + Math.abs(kembalian));
                }
            }
        } catch (Exception e) {
            // Abaikan error parsing
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHeader = new javax.swing.JPanel();
        btnNavProduk = new javax.swing.JButton();
        btnNavLaporan = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        scrollPaneProduk = new javax.swing.JScrollPane();
        panelGridProduk = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelPembayaran = new javax.swing.JPanel();
        lblSubTotal = new javax.swing.JLabel();
        lblPajak = new javax.swing.JLabel();
        lblAngkaTotal = new javax.swing.JLabel();
        lblKembalian = new javax.swing.JLabel();
        txtTunai = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        scrollPaneKeranjang = new javax.swing.JScrollPane();
        tblKeranjang = new javax.swing.JTable();
        lblAngkaSubtotal = new javax.swing.JLabel();
        lblAngkaPajak = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHapusItem = new javax.swing.JButton();
        btnKurangi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNavProduk.setText("Manajemen Produk");
        btnNavProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavProdukActionPerformed(evt);
            }
        });

        btnNavLaporan.setText("Laporan Penjualan");
        btnNavLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavLaporanActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelHeaderLayout.createSequentialGroup()
                        .addComponent(btnNavProduk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNavLaporan)))
                .addContainerGap(712, Short.MAX_VALUE))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNavLaporan)
                    .addComponent(btnNavProduk))
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(PanelHeader, java.awt.BorderLayout.NORTH);

        jSplitPane1.setResizeWeight(0.6);

        jPanel1.setLayout(new java.awt.BorderLayout());

        panelGridProduk.setName(""); // NOI18N
        panelGridProduk.setLayout(new java.awt.GridLayout(0, 2, 12, 12));
        scrollPaneProduk.setViewportView(panelGridProduk);

        jPanel1.add(scrollPaneProduk, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        lblSubTotal.setText("Subtotal");

        lblPajak.setText("Pajak (10%)");

        lblAngkaTotal.setText("Rp 0");

        lblKembalian.setText("Rp 0");

        txtTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTunaiActionPerformed(evt);
            }
        });
        txtTunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTunaiKeyReleased(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 0, 0));
        btnBatal.setForeground(java.awt.Color.WHITE );
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(0, 102, 255));
        btnBayar.setForeground(java.awt.Color.WHITE);
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        tblKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga", "Qty", "Subtotal"
            }
        ));
        scrollPaneKeranjang.setViewportView(tblKeranjang);

        lblAngkaSubtotal.setText("Rp 0");

        lblAngkaPajak.setText("Rp 0");

        lblTotal.setText("TOTAL");

        jLabel1.setText("Kembalian");

        jLabel2.setText("Tunai Diterima");

        btnHapusItem.setText("Hapus Item");
        btnHapusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusItemActionPerformed(evt);
            }
        });

        btnKurangi.setText("Kurangi");
        btnKurangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPembayaranLayout = new javax.swing.GroupLayout(panelPembayaran);
        panelPembayaran.setLayout(panelPembayaranLayout);
        panelPembayaranLayout.setHorizontalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnKurangi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapusItem)
                        .addGap(37, 37, 37)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTunai, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubTotal)
                            .addComponent(lblPajak)
                            .addComponent(jLabel1)
                            .addComponent(lblTotal)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKembalian)
                            .addGroup(panelPembayaranLayout.createSequentialGroup()
                                .addComponent(btnBatal)
                                .addGap(29, 29, 29)
                                .addComponent(btnBayar))
                            .addComponent(lblAngkaTotal)
                            .addComponent(lblAngkaSubtotal)
                            .addComponent(lblAngkaPajak)))
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scrollPaneKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelPembayaranLayout.setVerticalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addComponent(scrollPaneKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubTotal)
                            .addComponent(lblAngkaSubtotal))
                        .addGap(15, 15, 15)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPajak)
                            .addComponent(lblAngkaPajak))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPembayaranLayout.createSequentialGroup()
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapusItem)
                            .addComponent(btnKurangi))
                        .addGap(27, 27, 27)))
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblAngkaTotal))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblKembalian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtTunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnBayar))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jPanel2.add(panelPembayaran, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        String textTotal = lblAngkaTotal.getText().replace("Rp ", "").replace(".", "");
        int total = textTotal.isEmpty() ? 0 : Integer.parseInt(textTotal);

        // Ambil Tunai
        String textTunai = txtTunai.getText();
        int tunai = textTunai.isEmpty() ? 0 : Integer.parseInt(textTunai);

        if (total == 0) {
            JOptionPane.showMessageDialog(this, "Keranjang masih kosong!");
            return;
        }

        if (tunai < total) {
            JOptionPane.showMessageDialog(this, "Uang tunai kurang!");
            return;
        }
        
        // Hitung Kembalian
        int kembalian = tunai - total;
        lblKembalian.setText("Rp " + kembalian);
        
        String noTransaksi = "TRX-" + System.currentTimeMillis();
        String tanggal = new java.util.Date().toString();
    
        // 2. Simpan ke DataGlobal
        // (Pastikan sudah import com.kedaikasir.model.DataGlobal di paling atas file)
        com.kedaikasir.model.DataGlobal.riwayatTransaksi.add(new String[]{
            noTransaksi, 
            tanggal, 
            String.valueOf(total)
        });
        JOptionPane.showMessageDialog(this, "Transaksi Berhasil!\nKembalian: Rp " + kembalian);
        
        // Reset Transaksi
        btnBatal.doClick();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // Kosongkan Tabel
        DefaultTableModel model = (DefaultTableModel) tblKeranjang.getModel();
        model.setRowCount(0);
        lblAngkaTotal.setText("Rp 0");
        txtTunai.setText("");
        lblKembalian.setText("Rp 0");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnNavProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavProdukActionPerformed
       ProdukDialog dialog = new ProdukDialog(this, true);
        dialog.setVisible(true); 
        loadProductButtons(""); 
    }//GEN-LAST:event_btnNavProdukActionPerformed

    private void btnNavLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavLaporanActionPerformed
        LaporanDialog dialog = new LaporanDialog(this, true);
        dialog.setVisible(true); 
        loadProductButtons(""); 
    }//GEN-LAST:event_btnNavLaporanActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTunaiActionPerformed

    private void txtTunaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTunaiKeyReleased
        String strTotal = lblAngkaTotal.getText().replace("Rp ", "").replace(".", "");
        int total = strTotal.isEmpty() ? 0 : Integer.parseInt(strTotal);

        // 2. Ambil Uang Tunai yang diketik
        String strTunai = txtTunai.getText();

        // Cek biar tidak error kalau kosong
        if (strTunai.isEmpty()) {
            lblKembalian.setText("Rp 0");
            return;
        }

        try {
            int tunai = Integer.parseInt(strTunai);

            // 3. Hitung Kembalian
            int kembalian = tunai - total;

            // 4. Tampilkan
            if (kembalian >= 0) {
                lblKembalian.setText("Rp " + kembalian);
            } else {
                lblKembalian.setText("Kurang Rp " + Math.abs(kembalian));
            }

        } catch (NumberFormatException e) {
            // Kalau user mengetik huruf, abaikan saja
        }
    }//GEN-LAST:event_txtTunaiKeyReleased

    private void btnHapusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusItemActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblKeranjang.getModel();
    
        // 1. Cek apakah ada baris yang dipilih?
        int row = tblKeranjang.getSelectedRow();

        if (row == -1) {
            // Kalau belum pilih, marahi user :D
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih barang di tabel dulu!");
            return;
        }

        // 2. Hapus Baris tersebut
        model.removeRow(row);

        // 3. Hitung ulang total
        hitungTotalBelanja();

        // 4. Update kembalian jika ada uang tunai tertulis
        if (!txtTunai.getText().isEmpty()) {
            // Panggil logic keyReleased txtTunai secara manual
            txtTunaiKeyReleased(null); 
        }
    }//GEN-LAST:event_btnHapusItemActionPerformed

    private void btnKurangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangiActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblKeranjang.getModel();
        int row = tblKeranjang.getSelectedRow();

        // 1. Validasi baris terpilih
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih barang dulu!");
            return;
        }

        // 2. Ambil data Qty & Harga saat ini
        int qty = Integer.parseInt(model.getValueAt(row, 2).toString());
        int harga = Integer.parseInt(model.getValueAt(row, 1).toString());

        // 3. Logika Pengurangan
        if (qty > 1) {
            // Kurangi 1
            int qtyBaru = qty - 1;
            int subtotalBaru = qtyBaru * harga;

            // Update Tabel
            model.setValueAt(qtyBaru, row, 2);
            model.setValueAt(subtotalBaru, row, 3);
        } else {
            // Jika Qty tinggal 1, langsung hapus baris
            model.removeRow(row);
        }

        // 4. Hitung Ulang Semuanya
        hitungTotalBelanja();

        // Update kembalian juga
        if (!txtTunai.getText().isEmpty()) {
             txtTunaiKeyReleased(null);
        }
    }//GEN-LAST:event_btnKurangiActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
    String katakunci = txtSearch.getText();
    loadProductButtons(katakunci);
    }//GEN-LAST:event_txtSearchKeyReleased

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHapusItem;
    private javax.swing.JButton btnKurangi;
    private javax.swing.JButton btnNavLaporan;
    private javax.swing.JButton btnNavProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAngkaPajak;
    private javax.swing.JLabel lblAngkaSubtotal;
    private javax.swing.JLabel lblAngkaTotal;
    private javax.swing.JLabel lblKembalian;
    private javax.swing.JLabel lblPajak;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelGridProduk;
    private javax.swing.JPanel panelPembayaran;
    private javax.swing.JScrollPane scrollPaneKeranjang;
    private javax.swing.JScrollPane scrollPaneProduk;
    private javax.swing.JTable tblKeranjang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTunai;
    // End of variables declaration//GEN-END:variables
}
