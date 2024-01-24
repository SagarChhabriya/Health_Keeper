package FrontEnd;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
public class User extends javax.swing.JFrame {
// boolean visible to show/hide the password
        boolean passwordVisible=false;
//  boolean flag to open the UserData window(finally block)
        boolean flag=false;
//        date for the UserData class, the date will be stored in the database
        static String date="";
//        public static void setDate(String d)
//        { date=d;}
//        public static String getDate()
//        {return date;}
        public User() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        PicturePanel = new javax.swing.JPanel();
        PictureLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        UserSideHeaderLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        OkayButton = new javax.swing.JButton();
        DoctorLabel = new javax.swing.JLabel();
        CreateAccountButton = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setPreferredSize(new java.awt.Dimension(1000, 580));

        PicturePanel.setBackground(new java.awt.Color(255, 255, 255));

        PictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PictureLabel.setIcon(new javax.swing.ImageIcon("E:\\FOLDER\\Documents\\Second_Semester\\Java\\PROJECT\\PICS\\Cover small .png")); // NOI18N
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
                .addGap(15, 15, 15)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PicturePanelLayout.setVerticalGroup(
            PicturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PicturePanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

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

        UserSideHeaderLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        UserSideHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserSideHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserSideHeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/man.png"))); // NOI18N
        UserSideHeaderLabel.setText("User Side");
        UserSideHeaderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserSideHeaderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserSideHeaderLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserSideHeaderLabelMouseExited(evt);
            }
        });

        UserNameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/man.png"))); // NOI18N
        UserNameLabel.setText("  User Name");
        UserNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserNameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserNameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserNameLabelMouseExited(evt);
            }
        });

        UserNameTextField.setBackground(new java.awt.Color(255, 153, 51));
        UserNameTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UserNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OkayButton.setBackground(new java.awt.Color(255, 153, 51));
        OkayButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        OkayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/check.png"))); // NOI18N
        OkayButton.setText("Okay");
        OkayButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OkayButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OkayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OkayButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OkayButtonMouseExited(evt);
            }
        });
        OkayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkayButtonActionPerformed(evt);
            }
        });

        DoctorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoctorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/doctor 512.png"))); // NOI18N
        DoctorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoctorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoctorLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoctorLabelMouseExited(evt);
            }
        });

        CreateAccountButton.setBackground(new java.awt.Color(255, 153, 51));
        CreateAccountButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        CreateAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/add-button.png"))); // NOI18N
        CreateAccountButton.setText("Account");
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

        PasswordTextField.setBackground(new java.awt.Color(255, 153, 51));
        PasswordTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PasswordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PasswordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/key.png"))); // NOI18N
        PasswordLabel.setText("Password");
        PasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordLabelMouseExited(evt);
            }
        });

        PasswordButton.setBackground(new java.awt.Color(255, 153, 51));
        PasswordButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
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

        DateChooser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(UserSideHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(OkayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(PasswordTextField)
                                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(DoctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PicturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DoctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(UserSideHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OkayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGap(26, 26, 26))
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

    private void BackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseEntered
        BackButton.setFont(new Font("Comic Sans MS",1,16));
    }//GEN-LAST:event_BackButtonMouseEntered

    private void BackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseExited
        BackButton.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_BackButtonMouseExited

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        Switch openWindow=new Switch();
        openWindow.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void OkayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkayButtonActionPerformed
              String name=UserNameTextField.getText();
              String password=PasswordTextField.getText();
              boolean wrong=false;
              System.out.println("inside button");
              if((! UserNameTextField.getText().trim().isEmpty()) && (!PasswordTextField.getText().trim().isEmpty()) &&  !(DateChooser.getDate()==null) ) 
     {
         try {
             System.out.println("inside the try");
             Connection connection=ConnectionProviderHealthKeeper.getCon();
             Statement statement=connection.createStatement();
             ResultSet rs =statement.executeQuery("Select UserName, Password from useraccount");
             while(rs.next())
             {
                 System.out.println("inside the while loop");
                if((rs.getString("UserName").equalsIgnoreCase(name)) && (rs.getString("Password").equals(password)))
                {
                    System.out.println("inside the if condition");
                    
                
                    UserData openWindow=new UserData();
                 openWindow.setVisible(true);
                 this.dispose();
                 break;
                }
             }
         } catch (Exception e) {
             System.out.println(e);
             
         }
     }
        else
        {
            ImageIcon icon=new ImageIcon("src\\Pics\\icons\\EnterTheData.png");
            if(UserNameTextField.getText().trim().isEmpty())
                        JOptionPane.showMessageDialog(null, "Enter the Name","Name Field",JOptionPane.INFORMATION_MESSAGE,icon);
            else if(PasswordTextField.getText().trim().isEmpty())
                JOptionPane.showMessageDialog(null, "Enter the Password","Password",JOptionPane.INFORMATION_MESSAGE,icon);
            else if((Date)DateChooser.getDate() == null )
                  JOptionPane.showMessageDialog(null, "Select the Date","Date Not Selected",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\EnterTheData.png"));
            /*Insert the history to the Database*/
            
        }
    }//GEN-LAST:event_OkayButtonActionPerformed

    private void OkayButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkayButtonMouseEntered
        OkayButton.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_OkayButtonMouseEntered

    private void OkayButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkayButtonMouseExited
        OkayButton.setFont(new Font("Comic Sans MS",1,14));
    }//GEN-LAST:event_OkayButtonMouseExited

    private void DoctorLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorLabelMouseEntered
          ImageIcon icon=(ImageIcon) DoctorLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        DoctorLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_DoctorLabelMouseEntered

    private void DoctorLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorLabelMouseExited
        ImageIcon icon=(ImageIcon) DoctorLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        DoctorLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_DoctorLabelMouseExited

    private void UserNameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameLabelMouseExited
        UserNameLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_UserNameLabelMouseExited

    private void UserNameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameLabelMouseEntered
        UserNameLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_UserNameLabelMouseEntered

    private void UserSideHeaderLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserSideHeaderLabelMouseEntered
        UserSideHeaderLabel.setFont(new Font("Comic Sans MS",1,26));
        Border border= BorderFactory.createEtchedBorder();
        UserSideHeaderLabel.setBorder(border);
        
    }//GEN-LAST:event_UserSideHeaderLabelMouseEntered

    private void UserSideHeaderLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserSideHeaderLabelMouseExited
        UserSideHeaderLabel.setFont(new Font("Comic Sans MS",1,24));
        Border border=BorderFactory.createEmptyBorder();
        UserSideHeaderLabel.setBorder(border);
    }//GEN-LAST:event_UserSideHeaderLabelMouseExited

    private void CreateAccountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseEntered
        CreateAccountButton.setFont(new Font("Comic Sans MS",1,13));
    }//GEN-LAST:event_CreateAccountButtonMouseEntered

    private void CreateAccountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountButtonMouseExited
        CreateAccountButton.setFont(new Font("Comic Sans MS",1,12));
    }//GEN-LAST:event_CreateAccountButtonMouseExited

    private void CreateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountButtonActionPerformed
        CreateAccount openWindow= new CreateAccount();
        this.dispose();
        openWindow.setVisible(true);
    }//GEN-LAST:event_CreateAccountButtonActionPerformed

    private void PasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseExited
        PasswordLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_PasswordLabelMouseExited

    private void PasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordLabelMouseEntered
            PasswordLabel.setFont(new Font("Comic Sans Ms",1,19));
    }//GEN-LAST:event_PasswordLabelMouseEntered

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
  if(!PasswordTextField.getText().trim().isEmpty())
  {
        if(passwordVisible)
    {
        PasswordTextField.setEchoChar('*');
        passwordVisible=false;
        PasswordButton.setText("Show");
        PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\eye.png"));
    }
    else
    {
        PasswordTextField.setEchoChar((char)0);
        passwordVisible=true;
        PasswordButton.setText("Hide");
        PasswordButton.setIcon(new ImageIcon("src\\Pics\\icons\\hide.png"));
    }
  }
  else
  {
      ImageIcon icon=new ImageIcon("src\\Pics\\icons\\EnterTheData.png");
      JOptionPane.showMessageDialog(null, "Password Field is Empty","Password",JOptionPane.INFORMATION_MESSAGE,icon);
  }
        
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void PasswordButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordButtonMouseEntered
        PasswordButton.setFont(new Font("Comic Sans MS",1,15));
    }//GEN-LAST:event_PasswordButtonMouseEntered

    private void PasswordButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordButtonMouseExited
        PasswordButton.setFont(new Font("Comic Sans MS",1,14));
    }//GEN-LAST:event_PasswordButtonMouseExited

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CreateAccountButton;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel DoctorLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OkayButton;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JPanel PicturePanel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel UserSideHeaderLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
