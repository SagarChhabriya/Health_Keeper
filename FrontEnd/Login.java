package FrontEnd;

import FrontEnd.ConnectionProviderHealthKeeper;
//import static FrontEnd.ManagerAdd.row;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {
    
    boolean passwordVisible=false;
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginButton = new javax.swing.JPanel();
        PicturePanel = new javax.swing.JPanel();
        PictureLabel = new javax.swing.JLabel();
        BlackScreenIcon = new javax.swing.JLabel();
        LoginPageLabel = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        Field = new javax.swing.JTextField();
        LoginButtonLogo = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ManagerIDLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        PasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));

        PicturePanel.setBackground(new java.awt.Color(255, 255, 255));

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/logo_login.png"))); // NOI18N
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
                .addContainerGap()
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PicturePanelLayout.setVerticalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PicturePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        BlackScreenIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlackScreenIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/Login.jpg"))); // NOI18N
        BlackScreenIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BlackScreenIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BlackScreenIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BlackScreenIconMouseExited(evt);
            }
        });

        LoginPageLabel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LoginPageLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginPageLabel.setText("Login Page");
        LoginPageLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginPageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginPageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginPageLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginPageLabelMouseExited(evt);
            }
        });

        PasswordTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PasswordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        PasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/key.png"))); // NOI18N
        PasswordLabel.setText("Password");
        PasswordLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordLabelMouseExited(evt);
            }
        });

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/businessman.png"))); // NOI18N
        NameLabel.setText(" Name");
        NameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NameLabelMouseExited(evt);
            }
        });

        Field.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LoginButtonLogo.setBackground(new java.awt.Color(255, 153, 51));
        LoginButtonLogo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        LoginButtonLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/login.png"))); // NOI18N
        LoginButtonLogo.setText("Login");
        LoginButtonLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginButtonLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButtonLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonLogoMouseExited(evt);
            }
        });
        LoginButtonLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonLogoActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 153, 51));
        BackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/left-arrow-in-circular-button-black-symbol.png"))); // NOI18N
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

        ManagerIDLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ManagerIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        ManagerIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManagerIDLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/id-card.png"))); // NOI18N
        ManagerIDLabel.setText("Manager-ID");
        ManagerIDLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ManagerIDLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManagerIDLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManagerIDLabelMouseExited(evt);
            }
        });

        IDTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        IDTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PasswordButton.setBackground(new java.awt.Color(255, 153, 51));
        PasswordButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        PasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/eye.png"))); // NOI18N
        PasswordButton.setText("Password");
        PasswordButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginButtonLayout = new javax.swing.GroupLayout(LoginButton);
        LoginButton.setLayout(LoginButtonLayout);
        LoginButtonLayout.setHorizontalGroup(
            LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginButtonLayout.createSequentialGroup()
                .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginButtonLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BlackScreenIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LoginButtonLayout.createSequentialGroup()
                                .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ManagerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(IDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(LoginButtonLayout.createSequentialGroup()
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginButtonLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(LoginPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginButtonLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(LoginButtonLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        LoginButtonLayout.setVerticalGroup(
            LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LoginPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginButtonLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManagerIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(LoginButtonLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BlackScreenIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButtonLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginPageLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPageLabelMouseEntered
        LoginPageLabel.setFont(new Font("Comic Sans MS",1,26));
        Border border=BorderFactory.createEtchedBorder();
        LoginPageLabel.setBorder(border);
    }//GEN-LAST:event_LoginPageLabelMouseEntered

    private void LoginPageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPageLabelMouseExited
        LoginPageLabel.setFont(new Font("Comic Sans MS",1,24));
        Border border=BorderFactory.createEmptyBorder();
        LoginPageLabel.setBorder(border);
    }//GEN-LAST:event_LoginPageLabelMouseExited

    private void PictureLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PictureLabelMouseEntered
        ImageIcon icon=(ImageIcon) PictureLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        PictureLabel.setIcon(new ImageIcon(img));

    }//GEN-LAST:event_PictureLabelMouseEntered

    private void PictureLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PictureLabelMouseExited
        // TODO add your handling code here:
        ImageIcon icon=(ImageIcon) PictureLabel.getIcon();
        Image img= icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        PictureLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_PictureLabelMouseExited

    private void PasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseEntered
        PasswordLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_PasswordLabelMouseEntered

    private void PasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseExited
        PasswordLabel.setFont(new Font("Comic Sans Ms",1,18));
    }//GEN-LAST:event_PasswordLabelMouseExited

    private void NameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameLabelMouseEntered
        NameLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_NameLabelMouseEntered

    private void NameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameLabelMouseExited
        NameLabel.setFont(new Font("Comic Sans Ms",1,18));
    }//GEN-LAST:event_NameLabelMouseExited

    private void LoginButtonLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonLogoMouseEntered
        LoginButtonLogo.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_LoginButtonLogoMouseEntered

    private void LoginButtonLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonLogoMouseExited
        LoginButtonLogo.setFont(new Font("Comic Sans MS",1,14));
    }//GEN-LAST:event_LoginButtonLogoMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        Switch openWindow=new Switch();
        openWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed
    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setFont(new Font("Comic Sans MS",1,16));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_BackButtonMouseExited
    private void LoginButtonLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonLogoActionPerformed
        if(! Field.getText().trim().isEmpty() && ! PasswordTextField.getText().trim().isEmpty())
        {
         
            try {
                Connection connection = ConnectionProviderHealthKeeper.getCon();
                Statement statement=connection.createStatement();
                ResultSet rs=statement.executeQuery("Select ID, Name, Password from login");
            /*count function in mysql database*/
             int count=0;
            while(rs.next())
            {
                if( (rs.getString("Name").equalsIgnoreCase(Field.getText())) && (rs.getString("Password").equals(PasswordTextField.getText()))  /*&& (rs.getString("ID").equalsIgnoreCase(IDTextField.getText())) */)
                {       count++;break;     }
                else 
                {JOptionPane.showMessageDialog(null, "Incorrect User Name or Password","Password error",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
            }
            if(count==1)
                { 
                    Icon icon=new ImageIcon(("src\\Pics\\icons\\LoggedIn.png"));
                     JOptionPane.showMessageDialog(null, "Successfully Logged in", "Logged in", JOptionPane.INFORMATION_MESSAGE, icon);
                    /*Related to the manager.java file*/
                    Manager.setManagerName(Field.getText());
                     this.dispose();
                    Manager openWindow=new Manager();
                    openWindow.setVisible(true);
                }
            }
        catch (Exception ex)
        {    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);   System.out.println(ex);}   
        }
        else 
        {
            Icon icon=new javax.swing.ImageIcon(("src\\Pics\\icons\\EnterTheData.png"));
            JOptionPane.showMessageDialog(null, "Please Enter the Data", "Data Missing", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_LoginButtonLogoActionPerformed

    private void BlackScreenIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlackScreenIconMouseEntered
        // TODO add your handling code here:
       ImageIcon icon=(ImageIcon) BlackScreenIcon.getIcon();
       Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        BlackScreenIcon.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_BlackScreenIconMouseEntered

    private void BlackScreenIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlackScreenIconMouseExited
        // TODO add your handling code here:
        ImageIcon icon=(ImageIcon) BlackScreenIcon.getIcon();
        Image img= icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        BlackScreenIcon.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_BlackScreenIconMouseExited

    private void ManagerIDLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerIDLabelMouseEntered
    ManagerIDLabel.setFont(new Font("Comic Sans MS",1,19));
    }//GEN-LAST:event_ManagerIDLabelMouseEntered

    private void ManagerIDLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerIDLabelMouseExited
        ManagerIDLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_ManagerIDLabelMouseExited

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
          if(!PasswordTextField.getText().trim().isEmpty())
          {
           if(passwordVisible)
           {
               PasswordTextField.setEchoChar('*');
               passwordVisible=false;
              PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\eye.png"));
              PasswordButton.setText("Show ");


           }
           else 
           {
           PasswordTextField.setEchoChar((char)0);
           passwordVisible=true;   
           PasswordButton.setText("Hide");
           PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\hide.png"));
           
           }
          }
    }//GEN-LAST:event_PasswordButtonActionPerformed
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BlackScreenIcon;
    private javax.swing.JTextField Field;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JPanel LoginButton;
    private javax.swing.JButton LoginButtonLogo;
    private javax.swing.JLabel LoginPageLabel;
    private javax.swing.JLabel ManagerIDLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JPanel PicturePanel;
    // End of variables declaration//GEN-END:variables
}
