package FrontEnd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;

public class StartPage extends javax.swing.JFrame {
    public StartPage() {
        initComponents();
        this.setTitle("");
        //        Start progress bar
        startProgressBar();
        ProgressBar.setForeground(Color.red);

    }
 private void startProgressBar() {
        Thread t = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                ProgressBar.setValue(i);
                
            }
            dispose();
            Switch enter=new Switch();
            enter.setVisible(true);
        });
        t.start();
    }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PicturePanel = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        HealthKeeperLabel = new javax.swing.JLabel();
        PictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        PicturePanel.setBackground(new java.awt.Color(20, 20, 20));
        PicturePanel.setForeground(new java.awt.Color(20, 20, 20));
        PicturePanel.setPreferredSize(new java.awt.Dimension(950, 500));

        HealthKeeperLabel.setBackground(new java.awt.Color(255, 255, 255));
        HealthKeeperLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        HealthKeeperLabel.setForeground(new java.awt.Color(255, 255, 255));
        HealthKeeperLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HealthKeeperLabel.setText("Health Keeper");
        HealthKeeperLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/healthcare.png"))); // NOI18N
        PictureLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PictureLabel.setDoubleBuffered(true);

        javax.swing.GroupLayout PicturePanelLayout = new javax.swing.GroupLayout(PicturePanel);
        PicturePanel.setLayout(PicturePanelLayout);
        PicturePanelLayout.setHorizontalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        PicturePanelLayout.setVerticalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PicturePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HealthKeeperLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JPanel PicturePanel;
    private javax.swing.JProgressBar ProgressBar;
    // End of variables declaration//GEN-END:variables
}
