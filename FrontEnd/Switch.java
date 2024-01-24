
package FrontEnd;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Switch extends javax.swing.JFrame {

    public Switch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        PicturePanel = new javax.swing.JPanel();
        PictureLabel = new javax.swing.JLabel();
        UserButton = new javax.swing.JButton();
        ManagerButton = new javax.swing.JButton();
        HealthKeeperLabel = new javax.swing.JLabel();
        SwitchLabel = new javax.swing.JLabel();
        SwitchManLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));

        PicturePanel.setBackground(new java.awt.Color(255, 255, 255));

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/dices.png"))); // NOI18N
        PictureLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PictureLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PictureLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PictureLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PicturePanelLayout = new javax.swing.GroupLayout(PicturePanel);
        PicturePanel.setLayout(PicturePanelLayout);
        PicturePanelLayout.setHorizontalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PicturePanelLayout.setVerticalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserButton.setBackground(new java.awt.Color(255, 153, 51));
        UserButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/man.png"))); // NOI18N
        UserButton.setText("User");
        UserButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserButtonMouseExited(evt);
            }
        });
        UserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserButtonActionPerformed(evt);
            }
        });

        ManagerButton.setBackground(new java.awt.Color(255, 153, 51));
        ManagerButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ManagerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/businessman.png"))); // NOI18N
        ManagerButton.setText("Manager");
        ManagerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ManagerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagerButton.setHideActionText(true);
        ManagerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManagerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManagerButtonMouseExited(evt);
            }
        });
        ManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerButtonActionPerformed(evt);
            }
        });

        HealthKeeperLabel.setBackground(new java.awt.Color(255, 255, 255));
        HealthKeeperLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        HealthKeeperLabel.setForeground(new java.awt.Color(255, 255, 255));
        HealthKeeperLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HealthKeeperLabel.setText("Health Keeper");
        HealthKeeperLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        HealthKeeperLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HealthKeeperLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HealthKeeperLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HealthKeeperLabelMouseExited(evt);
            }
        });

        SwitchLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SwitchLabel.setForeground(new java.awt.Color(255, 255, 255));
        SwitchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SwitchLabel.setText("Switch Mode");
        SwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseExited(evt);
            }
        });

        SwitchManLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SwitchManLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/mental-health.png"))); // NOI18N
        SwitchManLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SwitchManLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SwitchManLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SwitchManLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(SwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(SwitchManLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(ManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SwitchManLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerButtonMouseEntered
        ManagerButton.setFont(new Font("Comic Sans MS", 1, 20));
    }//GEN-LAST:event_ManagerButtonMouseEntered

    private void ManagerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerButtonMouseExited
        ManagerButton.setFont(new Font("Comic Sans MS", 1, 18));
    }//GEN-LAST:event_ManagerButtonMouseExited

    private void UserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseEntered
        UserButton.setFont(new Font("Comic Sans MS",1,20));
        
    }//GEN-LAST:event_UserButtonMouseEntered

    private void UserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserButtonMouseExited
        UserButton.setFont(new Font("Comic Sans MS",1,18));
        
    }//GEN-LAST:event_UserButtonMouseExited

    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        User userWindow=new User();
        userWindow.setVisible(true);
    }//GEN-LAST:event_UserButtonActionPerformed

    private void ManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login openWindow=new Login();
//           ManagerAdd openWindow=new ManagerAdd();
        openWindow.setVisible(true);
    }//GEN-LAST:event_ManagerButtonActionPerformed

    private void HealthKeeperLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthKeeperLabelMouseEntered
        Border border=BorderFactory.createEtchedBorder();
        HealthKeeperLabel.setBorder(border);
        
        
    }//GEN-LAST:event_HealthKeeperLabelMouseEntered

    private void HealthKeeperLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthKeeperLabelMouseExited
           Border border=BorderFactory.createEmptyBorder();
           HealthKeeperLabel.setBorder(border);
           
        
    }//GEN-LAST:event_HealthKeeperLabelMouseExited

    private void PictureLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PictureLabelMouseEntered
        ImageIcon icon=(ImageIcon) PictureLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        PictureLabel.setIcon(new ImageIcon(img));
        
    }//GEN-LAST:event_PictureLabelMouseEntered

    private void PictureLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PictureLabelMouseExited
        ImageIcon icon=(ImageIcon) PictureLabel.getIcon();
        Image img= icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        PictureLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_PictureLabelMouseExited

    private void SwitchLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseEntered
        SwitchLabel.setForeground(Color.white);
        SwitchLabel.setFont(new Font("Comic Sans MS",1,19));
    }//GEN-LAST:event_SwitchLabelMouseEntered

    private void SwitchLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseExited
        SwitchLabel.setForeground(Color.white);
        SwitchLabel.setFont(new Font("Comic Sans Ms",1,18));
    }//GEN-LAST:event_SwitchLabelMouseExited

    private void SwitchManLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchManLabelMouseEntered
        ImageIcon icon=(ImageIcon) SwitchManLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        SwitchManLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_SwitchManLabelMouseEntered

    private void SwitchManLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchManLabelMouseExited
        ImageIcon icon=(ImageIcon) SwitchManLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        SwitchManLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_SwitchManLabelMouseExited

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
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Switch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HealthKeeperLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton ManagerButton;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JPanel PicturePanel;
    private javax.swing.JLabel SwitchLabel;
    private javax.swing.JLabel SwitchManLabel;
    private javax.swing.JButton UserButton;
    // End of variables declaration//GEN-END:variables
}
