
package FrontEnd;

import DataBase.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import FrontEnd.Login;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Manager extends javax.swing.JFrame {
    DefaultTableModel model;
    static  int row=-1;
    int c;
    
    public Manager() {
        initComponents();
        
        try {
                Connection connection = ConnectionProviderHealthKeeper.getCon();
                PreparedStatement statement=connection.prepareStatement("Select * from user");
                ResultSet rs=statement.executeQuery();
                ResultSetMetaData rss=rs.getMetaData();
                c=rss.getColumnCount();
                model= (DefaultTableModel) DataTable.getModel();
                model.setRowCount(0);
                while(rs.next())
                {
                    Vector vector=new Vector();
                    for(int i=1; i<=c; i++ )
                    {
                        vector.add(rs.getString("Name"));
                        vector.add(rs.getString("Age"));
                        vector.add(rs.getString("Disease"));
                        vector.add(rs.getString("Symptoms"));
                        
                    }
                    
                model.addRow(vector);
                }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    static String ManagerNameHeader;
    public static void setManagerName(String name)
    {ManagerNameHeader=name;}
    
    public static String getMangerName()
    {   return ManagerNameHeader;}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        UserNameHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        ManagerSidePanel = new javax.swing.JPanel();
        ManagerLabel = new javax.swing.JLabel();
        ManagerSideLabel = new javax.swing.JLabel();
        UsersLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UserHistory = new javax.swing.JMenuItem();
        Accounts = new javax.swing.JMenuItem();
        EditMenuItem = new javax.swing.JMenu();
        Modify = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));

        BackButton.setBackground(new java.awt.Color(255, 153, 51));
        BackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackButtonMouseExited(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DataTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Disease", "Symptoms"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.setShowGrid(true);
        jScrollPane1.setViewportView(DataTable);
        if (DataTable.getColumnModel().getColumnCount() > 0) {
            DataTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            DataTable.getColumnModel().getColumn(1).setPreferredWidth(2);
            DataTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            DataTable.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        ManagerSidePanel.setBackground(new java.awt.Color(51, 0, 0));

        ManagerLabel.setBackground(new java.awt.Color(51, 51, 0));
        ManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/Manager.png"))); // NOI18N

        ManagerSideLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ManagerSideLabel.setForeground(new java.awt.Color(255, 255, 255));
        ManagerSideLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerSideLabel.setText("Manager Side");
        ManagerSideLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManagerSideLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManagerSideLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManagerSidePanelLayout = new javax.swing.GroupLayout(ManagerSidePanel);
        ManagerSidePanel.setLayout(ManagerSidePanelLayout);
        ManagerSidePanelLayout.setHorizontalGroup(
            ManagerSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagerSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ManagerSidePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(ManagerSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManagerSidePanelLayout.setVerticalGroup(
            ManagerSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagerSidePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ManagerSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(ManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UsersLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UsersLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsersLabel.setText("Active Users");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(ManagerSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(UsersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserNameHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(UsersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ManagerSidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/menu-burger.png"))); // NOI18N
        jMenu1.setText("Users");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        UserHistory.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        UserHistory.setText("Users History");
        UserHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserHistoryActionPerformed(evt);
            }
        });
        jMenu1.add(UserHistory);

        Accounts.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Accounts.setText("Accounts");
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });
        jMenu1.add(Accounts);

        jMenuBar1.add(jMenu1);

        EditMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/Edit.png"))); // NOI18N
        EditMenuItem.setText("Edit");
        EditMenuItem.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EditMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditMenuItemMouseEntered(evt);
            }
        });

        Modify.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });
        EditMenuItem.add(Modify);

        jMenuBar1.add(EditMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        // TODO add your handling code here:
        BackButton.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        // TODO add your handling code here:
        BackButton.setFont(new Font("Comic Sans MS",1,14));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Login openWindow = new Login();
        this.dispose();
        openWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void UserHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserHistoryActionPerformed
               new History().setVisible(true);
    }//GEN-LAST:event_UserHistoryActionPerformed

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed
        new Accounts().setVisible(true);
    }//GEN-LAST:event_AccountsActionPerformed

    private void ManagerSideLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerSideLabelMouseEntered
        ManagerSideLabel.setFont(new Font("Comic Sans MS",1,19));
    }//GEN-LAST:event_ManagerSideLabelMouseEntered

    private void ManagerSideLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerSideLabelMouseExited
        ManagerSideLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_ManagerSideLabelMouseExited

    private void EditMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMenuItemMouseEntered
        
    }//GEN-LAST:event_EditMenuItemMouseEntered

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
           this.dispose();
           Modify openWindow = new Modify();
           openWindow.setVisible(true);
           
    }//GEN-LAST:event_ModifyActionPerformed
    
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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Manager().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Accounts;
    private javax.swing.JButton BackButton;
    private javax.swing.JTable DataTable;
    private javax.swing.JMenu EditMenuItem;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ManagerLabel;
    private javax.swing.JLabel ManagerSideLabel;
    private javax.swing.JPanel ManagerSidePanel;
    private javax.swing.JMenuItem Modify;
    private javax.swing.JMenuItem UserHistory;
    private javax.swing.JLabel UserNameHeading;
    private javax.swing.JLabel UsersLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
