package FrontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import FrontEnd.ConnectionProviderHealthKeeper;
import static FrontEnd.User.date;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class CreateAccount extends javax.swing.JFrame {
    
    
//    flag variable for created account(when the account will be created successfully)
    boolean flag=false;
    /*passwordVisible identifier for the password button*/
    boolean passwordVisible=false;
//    this date will be shared to the UserData.java and stored to the history table, when the user created accounted
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    
    public CreateAccount() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HealthKeeperLabel = new javax.swing.JLabel();
        PicturePanel = new javax.swing.JPanel();
        PictureLabel = new javax.swing.JLabel();
        UserSideLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JPasswordField();
        RepeatPasswordLabel = new javax.swing.JLabel();
        CreateAccountButton = new javax.swing.JButton();
        RepeatPasswordField = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));

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

        PicturePanel.setBackground(new java.awt.Color(255, 255, 255));

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/man user 256.png"))); // NOI18N
        PictureLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PictureLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PictureLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PictureLabelMouseExited(evt);
            }
        });

        UserSideLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UserSideLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserSideLabel.setText("User Side");
        UserSideLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserSideLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserSideLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserSideLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PicturePanelLayout = new javax.swing.GroupLayout(PicturePanel);
        PicturePanel.setLayout(PicturePanelLayout);
        PicturePanelLayout.setHorizontalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserSideLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PicturePanelLayout.setVerticalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(UserSideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NameLabel.setBackground(new java.awt.Color(255, 255, 255));
        NameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/man.png"))); // NOI18N
        NameLabel.setText("  Name");
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

        NameTextField.setBackground(new java.awt.Color(255, 153, 51));
        NameTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        NameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        PasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/key.png"))); // NOI18N
        PasswordLabel.setText("Create Password");
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

        PasswordTextField.setBackground(new java.awt.Color(255, 153, 51));
        PasswordTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PasswordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));

        RepeatPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        RepeatPasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        RepeatPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        RepeatPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RepeatPasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/forgot-password.png"))); // NOI18N
        RepeatPasswordLabel.setText("Repeat Password");
        RepeatPasswordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RepeatPasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RepeatPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RepeatPasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RepeatPasswordLabelMouseExited(evt);
            }
        });

        CreateAccountButton.setBackground(new java.awt.Color(255, 153, 51));
        CreateAccountButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        CreateAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/add-button.png"))); // NOI18N
        CreateAccountButton.setText("Create Account");
        CreateAccountButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateAccountButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateAccountButtonMouseExited(evt);
            }
        });
        CreateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountButtonActionPerformed(evt);
            }
        });

        RepeatPasswordField.setBackground(new java.awt.Color(255, 153, 51));
        RepeatPasswordField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        RepeatPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RepeatPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        BackButton.setBackground(new java.awt.Color(255, 153, 51));
        BackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
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

        PasswordButton.setBackground(new java.awt.Color(255, 153, 51));
        PasswordButton.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        PasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/eye.png"))); // NOI18N
        PasswordButton.setText("Password");
        PasswordButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswordButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordButtonMouseExited(evt);
            }
        });
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/MFGDate.png"))); // NOI18N
        jLabel1.setText("Date");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(RepeatPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RepeatPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(PasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(287, 287, 287))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(HealthKeeperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepeatPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RepeatPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

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

    private void HealthKeeperLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthKeeperLabelMouseEntered
        Border border=BorderFactory.createEtchedBorder();
        HealthKeeperLabel.setBorder(border);

    }//GEN-LAST:event_HealthKeeperLabelMouseEntered

    private void HealthKeeperLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthKeeperLabelMouseExited
            Border border=BorderFactory.createEmptyBorder();
            HealthKeeperLabel.setBorder(border);
    }//GEN-LAST:event_HealthKeeperLabelMouseExited

    private void PictureLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PictureLabelMouseEntered
        // TODO add your handling code here:
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

    private void NameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameLabelMouseEntered
        NameLabel.setFont(new Font("Comic Sans MS",1,17));
    }//GEN-LAST:event_NameLabelMouseEntered

    private void NameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameLabelMouseExited
        NameLabel.setFont(new Font("Comic Sans Ms",1,16));
    }//GEN-LAST:event_NameLabelMouseExited

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void PasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseEntered
        PasswordLabel.setFont(new Font("Comic Sans MS",1,17));
    }//GEN-LAST:event_PasswordLabelMouseEntered

    private void PasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseExited
        PasswordLabel.setFont(new Font("Comic Sans Ms",1,16));
    }//GEN-LAST:event_PasswordLabelMouseExited

    private void RepeatPasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepeatPasswordLabelMouseEntered
    RepeatPasswordLabel.setFont(new Font("Comic Sans MS",1,17));
    }//GEN-LAST:event_RepeatPasswordLabelMouseEntered

    private void RepeatPasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepeatPasswordLabelMouseExited
    RepeatPasswordLabel.setFont(new Font("Comic Sans MS",1,16));
    }//GEN-LAST:event_RepeatPasswordLabelMouseExited

    private void CreateAccountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseEntered
        CreateAccountButton.setFont(new Font("Comic Sans MS",1,13));
    }//GEN-LAST:event_CreateAccountButtonMouseEntered

    private void CreateAccountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseExited
    CreateAccountButton.setFont(new Font("Comic Sans MS",1,12));
    }//GEN-LAST:event_CreateAccountButtonMouseExited

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed


 String name=NameTextField.getText();
              String password=PasswordTextField.getText();
              boolean wrong=false;
              
              if((! NameTextField.getText().trim().isEmpty()) && (!PasswordTextField.getText().trim().isEmpty()) &&  !(DateChooser.getDate()==null)&& (PasswordTextField.getText().equals(RepeatPasswordField.getText())) ) 
     {
         try {
             Connection connection=ConnectionProviderHealthKeeper.getCon();
             Statement statement=connection.createStatement();
             ResultSet rs =statement.executeQuery("Select UserName, Password from useraccount");
             int count=0;
             while(rs.next())
             {
                 if( (rs.getString("UserName").equalsIgnoreCase(name)) && (rs.getString("Password").equals(password)))
                 { 
                     flag=false;
                     NameTextField.setText("");
                     PasswordTextField.setText("");
                     RepeatPasswordField.setText("");
                 }
                 if( ! (rs.getString("UserName").equalsIgnoreCase(name)) && ! (rs.getString("Password").equals(password)))
                 {
                                    flag=true;  
                                    
                 }
                 
               
             }
         } catch (Exception e) {
             System.out.println(e);
         }
         finally{
             if(flag==false)
             {                       JOptionPane.showMessageDialog(null, "Account Already Exist", "Account Exist", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
             if(flag)
             {
                 JOptionPane.showMessageDialog(null, "Account Created Successfully", "Account Creation", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src\\Pics\\icons\\LoggedIn.png"));
                 SimpleDateFormat Format=new SimpleDateFormat("dd-MM-yyyy");
                  try {
                     Connection connection=ConnectionProviderHealthKeeper.getCon();
                    Statement statement=connection.createStatement();
                    statement.executeUpdate("insert into useraccount (UserName, Password, RepeatPassword, Date) values ('"+NameTextField.getText()+"', '"+PasswordTextField.getText()+"' , '"+RepeatPasswordField.getText()+"' ,'"+DateChooser.getDate()+"' )");
                    this.dispose();
                    new User().setVisible(true);

                 } catch (Exception e) {
                      System.out.println(e);
                 }
             }
         }
     }
        else
        {
            ImageIcon icon=new ImageIcon("src\\Pics\\icons\\EnterTheData.png");
            if(NameTextField.getText().trim().isEmpty())
                        JOptionPane.showMessageDialog(null, "Enter the Name","Name Field",JOptionPane.INFORMATION_MESSAGE,icon);
            else if(PasswordTextField.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(null, "Enter the Password","Password",JOptionPane.INFORMATION_MESSAGE,icon);
            else if(RepeatPasswordField.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(null, "Enter the Password","Password",JOptionPane.INFORMATION_MESSAGE,icon);
            else if(DateChooser.getDate() == null )
                  JOptionPane.showMessageDialog(null, "Select the Date","Date Not Selected",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\EnterTheData.png"));
            else if(! PasswordTextField.getText().equals(RepeatPasswordField.getText()))
                  JOptionPane.showMessageDialog(null, "Password Doesn't Match","Password Erorr",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\EnterTheData.png"));
        }
        
        
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void UserSideLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserSideLabelMouseEntered
        UserSideLabel.setFont(new Font("Comic Sans Ms",1,19));
    }//GEN-LAST:event_UserSideLabelMouseEntered

    private void UserSideLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserSideLabelMouseExited
        UserSideLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_UserSideLabelMouseExited

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setFont(new Font("Comic Sans MS",1,19));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_BackButtonMouseExited

    private void PasswordButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordButtonMouseEntered
        PasswordButton.setFont(new Font("Comic Sans Ms",1,17));
    }//GEN-LAST:event_PasswordButtonMouseEntered

    private void PasswordButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordButtonMouseExited
        PasswordButton.setFont(new Font("Comic Sans MS",1,16));
    }//GEN-LAST:event_PasswordButtonMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
          this.dispose();
          User openWindow=new User();
          openWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
       if(! PasswordTextField.getText().trim().isEmpty())
       {
        if(passwordVisible)
        {
            PasswordTextField.setEchoChar('*');
            PasswordButton.setText("Show");
            passwordVisible=false;
            PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\eye.png"));
        }
        else
        {
            PasswordTextField.setEchoChar((char)0);
            PasswordButton.setText("Hide");
            passwordVisible=true;
            PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\hide.png"));
        }
       }
       else
       {
           ImageIcon icon=new ImageIcon("src\\Pics\\icons\\EnterTheData.png");
           JOptionPane.showMessageDialog(null, "Password Field is Empty","Password",JOptionPane.INFORMATION_MESSAGE,icon);
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {new CreateAccount().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CreateAccountButton;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel HealthKeeperLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JPanel PicturePanel;
    private javax.swing.JPasswordField RepeatPasswordField;
    private javax.swing.JLabel RepeatPasswordLabel;
    private javax.swing.JLabel UserSideLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
