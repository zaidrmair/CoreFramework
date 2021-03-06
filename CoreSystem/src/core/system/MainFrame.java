/*
 * DeteksiPenyakitGUI.java
 *
 * Created on August 10, 2007, 3:34 PM
 */
package core.system;

import core.system.ModuleManager;
import core.*;


import core.system.ApplicationInfo;
import java.awt.Component;
import java.awt.Frame;



/**
 *
 * @author  Harry Prasetyo
 */
public class MainFrame extends javax.swing.JFrame {
    private static MainFrame instance;


    private MainFrame() {
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        initComponents();
        setTitle(ApplicationInfo.TITLE + " Versi " + ApplicationInfo.VERSION + " oleh " + ApplicationInfo.AUTHOR);
    }

    public static MainFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;
    }


    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar6 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        mnuSistem2 = new javax.swing.JMenu();
        jMenuItemExit2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        pnlUtama = new javax.swing.JScrollPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuSistem = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Kepegawaian Purworejo Versi 1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("frameMain"); // NOI18N
        setState(Frame.MAXIMIZED_BOTH);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jToolBar6.setRollover(true);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/KoneksiKlaster.jpg"))); // NOI18N
        jButton8.setText("Pairwise Klaster");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar6.add(jButton8);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/FlexibleANP.jpg"))); // NOI18N
        jToggleButton1.setText("Pegawai");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        mnuSistem2.setMnemonic('f');
        mnuSistem2.setText("File");

        jMenuItemExit2.setMnemonic('x');
        jMenuItemExit2.setText("Exit");
        jMenuItemExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        mnuSistem2.add(jMenuItemExit2);

        jMenuBar4.add(mnuSistem2);

        jMenu1.setMnemonic('h');
        jMenu1.setText("Help");

        jMenuItem1.setMnemonic('a');
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar4.add(jMenu1);

        pnlUtama.setBorder(null);

        mnuSistem.setMnemonic('f');
        mnuSistem.setText("File");

        jMenuItemExit.setMnemonic('x');
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        mnuSistem.add(jMenuItemExit);

        jMenuBar2.add(mnuSistem);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/FlexibleANP.jpg"))); // NOI18N
        jMenu2.setMnemonic('h');
        jMenu2.setText("Help");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/images/KoneksiNode.jpg"))); // NOI18N
        jMenuItem2.setMnemonic('a');
        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlUtama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-561)/2, (screenSize.height-408)/2, 561, 408);
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowStateChanged (java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
// TODO add your handling code here:

    }//GEN-LAST:event_formWindowStateChanged

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        pnlUtama.setViewportView(ModuleManager.getInstance().getModule("pegawai"));
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AboutBox.getInstance().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void afterUserLogin() {
    //lblSelamatDatang.setText ("Selamat datang " + Main.getSingleton ().getUserId() + "! \nSemoga hari Anda menyenangkan! ");
    //txtInformasi.setText ("\nSilahkan menjalankan berbagai fitur aplikasi ini baik melalui tombol-tombol di bawah ini, maupun melalui menu.\nSelamat bekerja!");

    }

    protected void afterUserLogout() {
    //lblSelamatDatang.setText ("Silahkan login terlebih dahulu dengan ID dan Sandi Anda untuk memulai ...");
    //txtInformasi.setText ("\nAnda belum melakukan proses login.\nSilahkan login terlebih dahulu untuk mengakses fitur-fitur aplikasi ini, sesuai dengan hak akses Anda.\nSelamat bekerja!");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemExit2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JMenu mnuSistem;
    private javax.swing.JMenu mnuSistem2;
    private javax.swing.JScrollPane pnlUtama;
    // End of variables declaration//GEN-END:variables

}
