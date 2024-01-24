package FrontEnd;

import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modify extends javax.swing.JFrame {


    static String disease;
    static String symptom;
    public Modify() {
        initComponents();
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RestrictionsTextArea = new javax.swing.JTextArea();
        DiseaseLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        SymptomsLabel = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AdviceTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DiseaseList = new javax.swing.JComboBox<>();
        AgeList = new javax.swing.JComboBox<>();
        Symptoms = new javax.swing.JComboBox<>();
        SelectedDiseaseLabel = new javax.swing.JLabel();
        SelectedSymptomLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));

        SidePanel.setBackground(new java.awt.Color(67, 67, 67));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/Modify.png"))); // NOI18N

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/no.png"))); // NOI18N
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        RestrictionsTextArea.setColumns(20);
        RestrictionsTextArea.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        RestrictionsTextArea.setRows(5);
        jScrollPane1.setViewportView(RestrictionsTextArea);

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

        Add.setBackground(new java.awt.Color(255, 153, 51));
        Add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Add.setText("Add");
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        AdviceTextArea.setColumns(20);
        AdviceTextArea.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        AdviceTextArea.setRows(5);
        jScrollPane2.setViewportView(AdviceTextArea);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restrictions");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Advice");

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

        AgeList.setBackground(new java.awt.Color(255, 153, 51));
        AgeList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        AgeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        AgeList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AgeList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SelectedDiseaseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                    .addComponent(SelectedSymptomLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SymptomsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DiseaseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(AgeList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))
                    .addComponent(CloseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiseaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SymptomsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(SelectedSymptomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(SelectedDiseaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        setVisible(false);
        new Manager().setVisible(true);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void DiseaseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiseaseLabelMouseEntered
        DiseaseLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_DiseaseLabelMouseEntered

    private void DiseaseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiseaseLabelMouseExited
        DiseaseLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_DiseaseLabelMouseExited

    private void SymptomsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SymptomsLabelMouseEntered
        SymptomsLabel.setFont(new Font("Comic Sans MS",1,19) );
    }//GEN-LAST:event_SymptomsLabelMouseEntered

    private void SymptomsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SymptomsLabelMouseExited
        SymptomsLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_SymptomsLabelMouseExited

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        
        if(DiseaseList.getSelectedItem()==null)
        {   JOptionPane.showMessageDialog(null, "Disease is not selected", "Disease ", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
        else if(Symptoms.getSelectedItem()==null)
        {   JOptionPane.showMessageDialog(null, "Symptoms are not selected","Symptom ",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
        else if(RestrictionsTextArea.getText().trim().isEmpty())
        {   JOptionPane.showMessageDialog(null, "Enter the Restrictions","Restrictions",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
        else if(AgeList.getSelectedItem() == null)
        {   JOptionPane.showMessageDialog(null, "Please Select the Age","Age",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\UserNameIncorrect.png"));}
        
        if(!(DiseaseList.getSelectedItem()==null) &&  ! (Symptoms.getSelectedItem()==null) &&  ! (RestrictionsTextArea.getText().trim().isEmpty()) ) 
        {
          int i=JOptionPane.showConfirmDialog(null, "Are sure to Save the data");
          if(i==0)
          {
         try {
            Connection  connection = ConnectionProviderHealthKeeper.getCon();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into edit (Disease, Symptom, Age, Restrictions, Advice) values ('"+DiseaseList.getSelectedItem()+"' , '"+Symptoms.getSelectedItem()+"' , '"+AgeList.getSelectedItem()+"' , '"+RestrictionsTextArea.getText()+"' , '"+AdviceTextArea.getText()+"' )");
            JOptionPane.showMessageDialog(null, "Data Entered Successfully","Data Message",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src\\Pics\\icons\\LoggedIn.png"));
            RestrictionsTextArea.setText("");
            AdviceTextArea.setText("");
            } 
        catch (HeadlessException | SQLException e) 
            {System.out.println(e);}
          }
        }
        
    }//GEN-LAST:event_AddActionPerformed

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

    private void AgeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeLabelMouseExited
        AgeLabel.setFont(new Font("Comic Sans MS",1,18));
    }//GEN-LAST:event_AgeLabelMouseExited

    private void AgeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeLabelMouseEntered
        AgeLabel.setFont(new Font("Comic Sans MS",1,20));
    }//GEN-LAST:event_AgeLabelMouseEntered
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
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Modify().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextArea AdviceTextArea;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JComboBox<String> AgeList;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel DiseaseLabel;
    private javax.swing.JComboBox<String> DiseaseList;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextArea RestrictionsTextArea;
    private javax.swing.JLabel SelectedDiseaseLabel;
    private javax.swing.JLabel SelectedSymptomLabel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JComboBox<String> Symptoms;
    private javax.swing.JLabel SymptomsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
