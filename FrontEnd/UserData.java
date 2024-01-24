
package FrontEnd;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
public class UserData extends javax.swing.JFrame {
    
    public static String UserName="";
    public static String disease="";
    public static String symptom="";
    public static int age=0;
    
   /*sets the userNameHeaderLabel*/
    public static void setUserName(String name)
       {   UserName=name; }
        public static String getUserName()
        {   return UserName;}
    public static void setAge(Integer a)
    {   age=a;}
    public static Integer getAge()
    {return age;}
        
        
    public UserData() {
        initComponents();
        UserNameHeaderLabel.setText(getUserName());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        DiseaseLabel = new javax.swing.JLabel();
        DiseaseList = new javax.swing.JComboBox<>();
        AgeLabel = new javax.swing.JLabel();
        AgeList = new javax.swing.JComboBox<>();
        MaseehaLabel = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        Symptoms = new javax.swing.JComboBox<>();
        SymptomsLabel = new javax.swing.JLabel();
        VitalSignsLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        UserNameHeaderLabel = new javax.swing.JLabel();
        GoButton = new javax.swing.JButton();
        SelectedDiseaseLabel = new javax.swing.JLabel();
        SelectedSymptomLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));

        DiseaseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        DiseaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        DiseaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiseaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/infectious.png"))); // NOI18N
        DiseaseLabel.setText("  Disease");
        DiseaseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiseaseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DiseaseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DiseaseLabelMouseExited(evt);
            }
        });

        DiseaseList.setBackground(new java.awt.Color(255, 153, 51));
        DiseaseList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DiseaseList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Flu", "Cough", "Headache", "Stomach ache", "Common cold", "Body Pain", "Acidity", "Skin Burn" }));
        DiseaseList.setToolTipText("Select Disease");
        DiseaseList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DiseaseList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiseaseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiseaseListActionPerformed(evt);
            }
        });

        AgeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/age.png"))); // NOI18N
        AgeLabel.setText("  Age");
        AgeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgeLabelMouseExited(evt);
            }
        });

        AgeList.setBackground(new java.awt.Color(255, 153, 51));
        AgeList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        AgeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        AgeList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AgeList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MaseehaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaseehaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/rich-man.png"))); // NOI18N
        MaseehaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaseehaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaseehaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaseehaLabelMouseExited(evt);
            }
        });

        HeaderLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Here To Serve You");
        HeaderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HeaderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeaderLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeaderLabelMouseExited(evt);
            }
        });

        Symptoms.setBackground(new java.awt.Color(255, 153, 51));
        Symptoms.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Symptoms.setToolTipText("Select Symptom");
        Symptoms.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Symptoms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Symptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymptomsActionPerformed(evt);
            }
        });

        SymptomsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SymptomsLabel.setForeground(new java.awt.Color(255, 255, 255));
        SymptomsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SymptomsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/loss-of-sense-of-smell.png"))); // NOI18N
        SymptomsLabel.setText("Symptoms");
        SymptomsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SymptomsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SymptomsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SymptomsLabelMouseExited(evt);
            }
        });

        VitalSignsLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        VitalSignsLabel.setForeground(new java.awt.Color(255, 255, 255));
        VitalSignsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VitalSignsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/heart-beat.png"))); // NOI18N
        VitalSignsLabel.setText("Vital Signs");
        VitalSignsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VitalSignsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VitalSignsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VitalSignsLabelMouseExited(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 153, 51));
        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UserNameHeaderLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UserNameHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameHeaderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserNameHeaderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserNameHeaderLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserNameHeaderLabelMouseExited(evt);
            }
        });

        GoButton.setBackground(new java.awt.Color(255, 153, 51));
        GoButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        GoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/go-to-location.png"))); // NOI18N
        GoButton.setText("Go");
        GoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GoButtonMouseExited(evt);
            }
        });
        GoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoButtonActionPerformed(evt);
            }
        });

        SelectedDiseaseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SelectedDiseaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        SelectedDiseaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectedDiseaseLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        SelectedSymptomLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        SelectedSymptomLabel.setForeground(new java.awt.Color(255, 255, 255));
        SelectedSymptomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectedSymptomLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaseehaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(UserNameHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(SelectedSymptomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(VitalSignsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(DiseaseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(SymptomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                        .addComponent(AgeList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(22, 22, 22))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(SelectedDiseaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(UserNameHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiseaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VitalSignsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SymptomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(SelectedDiseaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(SelectedSymptomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MaseehaLabel)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DiseaseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiseaseLabelMouseEntered
        DiseaseLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_DiseaseLabelMouseEntered

    private void DiseaseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiseaseLabelMouseExited
        DiseaseLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_DiseaseLabelMouseExited

    private void DiseaseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiseaseListActionPerformed
        /*static, because it will be shared with the result.java disease label*/  
        disease=(String) DiseaseList.getSelectedItem();
          String symptoms[] = null;
          
          switch(disease)
          {
              case default->     JOptionPane.showMessageDialog(null, "Select the valid one");
              case "Fever"  ->  {   symptoms=new String [] {"High Body Temperature","Sweating","Headache","Muscels ache"};  }
              case "Flu"     ->  {  symptoms=new  String [] {"Fatigue","Fever","Muscels ache"};}
              case "Cough"  ->  {   symptoms=new String [] {"Dry Cough","Wet Cough","Sore Throat"}; }
              case "Headache"->{    symptoms=new String [] {"A dull or sharp pain in the head","Pressure or tightness in forehead","Pressure or tightness in back of head","Senstivity to light or sound","diziness or nausea"};}
              case "Stomach ache"->{symptoms = new String[] {"Cramping","Dull ache","Burning sensation","Vomiting","Diarrhea","Bloating","Indigestion"};}
              case "Common cold"->{symptoms=new String[]{"Runny or Stuffy nose","Sneezing","Sore throat","Cough","Headache","Body aches"};}
              case "Body Pain"->{symptoms=new String[]{"Joint Pane","Fatigue","Fever","Headache"};}
              case "Acidity"->{ symptoms=new String[]{"Regurgitation","Chest Pain"};}
              case "Skin Burn"->{symptoms=new String[]{"Redness","Swelling","Blistering","Peeling","Scarring"};}
              
          }
          Symptoms.setModel(new DefaultComboBoxModel<>(symptoms));
          SelectedDiseaseLabel.setText(disease);
          switch(disease)
          {
              case "Fever" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fever.png"));       SelectedDiseaseLabel.setText(disease);}
              case "Flu" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\flu.png"));                   SelectedDiseaseLabel.setText(disease);}
              case "Cough" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cough.png"));             SelectedDiseaseLabel.setText(disease);}
              case "Headache" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\headache.png"));    SelectedDiseaseLabel.setText(disease);}
              case "Common cold" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\CommonCold.png"));    SelectedDiseaseLabel.setText(disease);}
              case "Stomach ache" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Stomach.png")); SelectedDiseaseLabel.setText(disease);}
              case "Body Pain" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyPain.png"));      SelectedDiseaseLabel.setText(disease);}
              case "Acidity" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Acidity.png"));          SelectedDiseaseLabel.setText(disease);}
              case "Skin Burn" ->{  SelectedDiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SkinBurn.png"));     SelectedDiseaseLabel.setText(disease);}
          }
          
    }//GEN-LAST:event_DiseaseListActionPerformed

    private void AgeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeLabelMouseEntered
        AgeLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_AgeLabelMouseEntered

    private void AgeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeLabelMouseExited
        AgeLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_AgeLabelMouseExited

    private void MaseehaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaseehaLabelMouseEntered
        ImageIcon icon=(ImageIcon) MaseehaLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()+5, icon.getIconHeight()+5, Image.SCALE_DEFAULT);
        MaseehaLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_MaseehaLabelMouseEntered

    private void MaseehaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaseehaLabelMouseExited
        ImageIcon icon=(ImageIcon) MaseehaLabel.getIcon();
        Image   img=icon.getImage().getScaledInstance(icon.getIconWidth()-5, icon.getIconHeight()-5, Image.SCALE_DEFAULT);
        MaseehaLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_MaseehaLabelMouseExited

    private void HeaderLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderLabelMouseEntered
        HeaderLabel.setFont(new Font("Comic Sans MS",1,25));
        Border border=BorderFactory.createEtchedBorder();
        HeaderLabel.setBorder(border);
    }//GEN-LAST:event_HeaderLabelMouseEntered

    private void HeaderLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderLabelMouseExited
        HeaderLabel.setFont(new Font("Comic Sans Ms",1,24));
        Border border=BorderFactory.createEmptyBorder();
        HeaderLabel.setBorder(border);
    }//GEN-LAST:event_HeaderLabelMouseExited

    private void UserNameHeaderLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameHeaderLabelMouseEntered
        UserNameHeaderLabel.setFont(new Font("Comic Sans MS",1,19));
        Border border=BorderFactory.createEtchedBorder();
        UserNameHeaderLabel.setBorder(border);
    }//GEN-LAST:event_UserNameHeaderLabelMouseEntered

    private void UserNameHeaderLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameHeaderLabelMouseExited
        UserNameHeaderLabel.setFont(new Font("Comic Sans MS",1,18));
        Border border=BorderFactory.createEmptyBorder();
        UserNameHeaderLabel.setBorder(border);
    }//GEN-LAST:event_UserNameHeaderLabelMouseExited

    private void GoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoButtonMouseEntered
        GoButton.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_GoButtonMouseEntered

    private void GoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoButtonMouseExited
        GoButton.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_GoButtonMouseExited

    private void SymptomsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SymptomsLabelMouseEntered
        SymptomsLabel.setFont(new Font("Comic Sans MS",1,19) );
    }//GEN-LAST:event_SymptomsLabelMouseEntered

    private void SymptomsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SymptomsLabelMouseExited
        SymptomsLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_SymptomsLabelMouseExited

    private void VitalSignsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VitalSignsLabelMouseEntered
        VitalSignsLabel.setFont(new Font("Comic Sans MS",1,19));
    }//GEN-LAST:event_VitalSignsLabelMouseEntered

    private void VitalSignsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VitalSignsLabelMouseExited
        VitalSignsLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_VitalSignsLabelMouseExited

    private void SymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymptomsActionPerformed
    /*static, because it will be accessed in result.java in Symprom label*/    
        symptom=(String)Symptoms.getSelectedItem();
          switch(symptom)
          {
              case "High Body Temperature"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\HighBodyTemp.png")); SelectedSymptomLabel.setText(symptom);}
              case "Sweating"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Sweating.png")); SelectedSymptomLabel.setText(symptom);}
              case "Headache"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\headache.png"));SelectedSymptomLabel.setText(symptom);}
              case "Muscels ache"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyPain.png"));SelectedSymptomLabel.setText(symptom);}
              case "Fatigue"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fatigue.png"));SelectedSymptomLabel.setText(symptom);}
              case "Fever"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fever.png"));SelectedSymptomLabel.setText(symptom);}
              case "Dry Cough"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\DryCough.png"));SelectedSymptomLabel.setText(symptom);}
              case "Wet Cough"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\WetCough.png"));SelectedSymptomLabel.setText(symptom);}
              case "Sore Throat"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SoreThroat.png"));SelectedSymptomLabel.setText(symptom);}
              case "A dull or sharp pain in the head"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\DullSharpPain.png"));SelectedSymptomLabel.setText(symptom);}
              case "Pressure or tightness in forehead"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Pressure.png"));SelectedSymptomLabel.setText(symptom);}
              case "Pressure or tightness in back of head"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Tightness.png"));SelectedSymptomLabel.setText(symptom);}
              case "Senstivity to light or sound"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Senstivity.png"));SelectedSymptomLabel.setText(symptom);}
              case "diziness or nausea"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Diziness.png"));SelectedSymptomLabel.setText(symptom);}
              case "Cramping"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cramping.png"));SelectedSymptomLabel.setText(symptom);}
              case "Dull ache"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Discomfort.png"));SelectedSymptomLabel.setText(symptom);}
              case "Burning sensation"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Burning.png"));SelectedSymptomLabel.setText(symptom);}
              case "Vomiting"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Vomiting.png"));SelectedSymptomLabel.setText(symptom);}
              case "Diarrhea"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Diarrhea.png"));SelectedSymptomLabel.setText(symptom);}
              case "Bloating"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Bloating.png"));SelectedSymptomLabel.setText(symptom);}
              case "Indigestion"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Indigestion.png"));SelectedSymptomLabel.setText(symptom);}
              case "Runny or Stuffy nose"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Runny.png"));SelectedSymptomLabel.setText(symptom);}
              case "Sneezing"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Sneezing.png"));SelectedSymptomLabel.setText(symptom);}
              case "Sore throat"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SoreThroat.png"));SelectedSymptomLabel.setText(symptom);}
              case "Cough"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cough.png"));SelectedSymptomLabel.setText(symptom);}
              case "Body aches"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyAches.png"));SelectedSymptomLabel.setText(symptom);}
              case "Joint Pane"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\JointPane.png"));SelectedSymptomLabel.setText(symptom);}
//              case "Regurgitation"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Regurgitation.png"));SelectedSymptomLabel.setText(symptom);}
              case "Chest Pain"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\ChestPain.png"));SelectedSymptomLabel.setText(symptom);}
              case "Redness"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Redness.png"));SelectedSymptomLabel.setText(symptom);}
              case "Swelling"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Swelling.png"));SelectedSymptomLabel.setText(symptom);}
              case "Blistering"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Blistering.png"));SelectedSymptomLabel.setText(symptom);}
              case "Peeling"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Peeling.png"));SelectedSymptomLabel.setText(symptom);}
              case "Scarring"->    {SelectedSymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Scarring.png"));SelectedSymptomLabel.setText(symptom);}
              
          }
        
    }//GEN-LAST:event_SymptomsActionPerformed

    private void GoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoButtonActionPerformed
         disease=(String) DiseaseList.getSelectedItem();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        
        int i=JOptionPane.showConfirmDialog(null, "Should we Process on the following information");
        if(i==0)
        {
            try {
                Connection connection=ConnectionProviderHealthKeeper.getCon();
                Statement statement=connection.createStatement();
                statement.executeUpdate("insert into history (Name, Disease, Date) values ('"+ getUserName() +"' , '"+disease+"' , '"+(User.date)+"' )");
                statement.executeUpdate("insert into user (Name, Age, Disease, Symptoms, Date ) values ('"+getUserName()+"', '"+AgeList.getSelectedItem()+"', '"+DiseaseList.getSelectedItem()+"', '"+Symptoms.getSelectedItem()+"','"+User.date+"')");
//                setAge((int)AgeList.getSelectedItem());
            } catch (Exception e) {
                System.out.println(e);
                
            }
            this.dispose();
            Result1 openWindow=new Result1();
            openWindow.setVisible(true);
        }
        
    }//GEN-LAST:event_GoButtonActionPerformed
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
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JComboBox<String> AgeList;
    private javax.swing.JLabel DiseaseLabel;
    private javax.swing.JComboBox<String> DiseaseList;
    private javax.swing.JButton GoButton;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MaseehaLabel;
    private javax.swing.JLabel SelectedDiseaseLabel;
    private javax.swing.JLabel SelectedSymptomLabel;
    private javax.swing.JComboBox<String> Symptoms;
    private javax.swing.JLabel SymptomsLabel;
    private javax.swing.JLabel UserNameHeaderLabel;
    private javax.swing.JLabel VitalSignsLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
