package FrontEnd;


import FrontEnd.ConnectionProviderHealthKeeper;
import FrontEnd.UserData;
import static FrontEnd.UserData.disease;
import static FrontEnd.UserData.symptom;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Result1 extends javax.swing.JFrame {
    boolean Love=false;
    boolean Like=false;
 /*   boolean Dislike=false;
 
    public  void setRestrictionsTextArea(String text)
            {   RestrictionsTextArea.setText(text);}
    public String getRestrictionsTextArea()
    {   return RestrictionsTextArea.getText();}
   */ 
    public Result1() {
        initComponents();
      
        
    /*get text from the UserData and set it to the lables*/
        RestrictionsTextAreaLabel.setText(UserData.getUserName()+" Should Avoid the following");
        DiseaseLabel.setText(UserData.disease);
        SymptomLabel.setText(UserData.symptom);
//        setRestrictionsTextArea(getRestrictionsTextArea());

            System.out.println("inside constructor");

    try {
                Connection connection = ConnectionProviderHealthKeeper.getCon();
                Statement statement = connection.createStatement();
                   ResultSet rs=statement.executeQuery("Select * from edit Where Disease = '"+UserData.disease+"' AND Symptom = '"+UserData.symptom+"' ");
                  while(rs.next())
                          {
                              System.out.println("inside while");
                              if(rs.getString("Disease").equalsIgnoreCase(UserData.disease) && rs.getString("Symptom").equalsIgnoreCase(UserData.symptom));
                              {
                                 
                                  RestrictionsTextArea.setText(rs.getString("Restrictions"));
                                  AdviceTextArea.setText(rs.getString("Advice"));
                                  
                                  break;
                                  
                              }
                                
                          }
                                 rs.close();
                                 connection.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
    /*set the Icon of the Disease label*/
    
        switch(UserData.disease)
          {
              case "Fever" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fever.png"));       DiseaseLabel.setText(disease);}
              case "Flu" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\flu.png"));                   DiseaseLabel.setText(disease);}
              case "Cough" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cough.png"));             DiseaseLabel.setText(disease);}
              case "Headache" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\headache.png"));    DiseaseLabel.setText(disease);}
              case "Common cold" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\CommonCold.png"));    DiseaseLabel.setText(disease);}
              case "Stomach ache" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Stomach.png")); DiseaseLabel.setText(disease);}
              case "Body Pain" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyPain.png"));      DiseaseLabel.setText(disease);}
              case "Acidity" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Acidity.png"));          DiseaseLabel.setText(disease);}
              case "Skin Burn" ->{  DiseaseLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SkinBurn.png"));     DiseaseLabel.setText(disease);}
          }
        
//    Set the Icon of the symptom label
      switch(UserData.symptom)
          {
              case "High Body Temperature"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\HighBodyTemp.png")); SymptomLabel.setText(symptom);}
              case "Sweating"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Sweating.png")); SymptomLabel.setText(symptom);}
              case "Headache"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\headache.png"));SymptomLabel.setText(symptom);}
              case "Muscels ache"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyPain.png"));SymptomLabel.setText(symptom);}
              case "Fatigue"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fatigue.png"));SymptomLabel.setText(symptom);}
              case "Fever"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Fever.png"));SymptomLabel.setText(symptom);}
              case "Dry Cough"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\DryCough.png"));SymptomLabel.setText(symptom);}
              case "Wet Cough"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\WetCough.png"));SymptomLabel.setText(symptom);}
              case "Sore Throat"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SoreThroat.png"));SymptomLabel.setText(symptom);}
              case "A dull or sharp pain in the head"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\DullSharpPain.png"));SymptomLabel.setText(symptom);}
              case "Pressure or tightness in forehead"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Pressure.png"));SymptomLabel.setText(symptom);}
              case "Pressure or tightness in back of head"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Tightness.png"));SymptomLabel.setText(symptom);}
              case "Senstivity to light or sound"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Senstivity.png"));SymptomLabel.setText(symptom);}
              case "diziness or nausea"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Diziness.png"));SymptomLabel.setText(symptom);}
              case "Cramping"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cramping.png"));SymptomLabel.setText(symptom);}
              case "Dull ache"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\DullAche.png"));SymptomLabel.setText(symptom);}
              case "Burning sensation"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Burning.png"));SymptomLabel.setText(symptom);}
              case "Vomiting"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Vomiting.png"));SymptomLabel.setText(symptom);}
              case "Diarrhea"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Diarrhea.png"));SymptomLabel.setText(symptom);}
              case "Bloating"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Bloating.png"));SymptomLabel.setText(symptom);}
              case "Indigestion"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Indigestion.png"));SymptomLabel.setText(symptom);}
              case "Runny or Stuffy nose"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Runny.png"));SymptomLabel.setText(symptom);}
              case "Sneezing"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Sneezing.png"));SymptomLabel.setText(symptom);}
              case "Sore throat"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\SoreThroat.png"));SymptomLabel.setText(symptom);}
              case "Cough"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Cough.png"));SymptomLabel.setText(symptom);}
              case "Body aches"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\BodyAches.png"));SymptomLabel.setText(symptom);}
              case "Joint Pane"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\JointPane.png"));SymptomLabel.setText(symptom);}
//              case "Regurgitation"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Regurgitation.png"));SymptomLabel.setText(symptom);}
              case "Chest Pain"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\ChestPain.png"));SymptomLabel.setText(symptom);}
              case "Redness"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Redness.png"));SymptomLabel.setText(symptom);}
              case "Swelling"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Swelling.png"));SymptomLabel.setText(symptom);}
              case "Blistering"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Blistering.png"));SymptomLabel.setText(symptom);}
              case "Peeling"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Peeling.png"));SymptomLabel.setText(symptom);}
              case "Scarring"->    {SymptomLabel.setIcon(new ImageIcon("src\\Pics\\icons\\Scarring.png"));SymptomLabel.setText(symptom);}
              
          }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        RestrictionsTextAreaLabel = new javax.swing.JLabel();
        DiseaseLabel = new javax.swing.JLabel();
        SymptomLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RestrictionsTextArea = new javax.swing.JTextArea();
        AdviceTextAreaLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AdviceTextArea = new javax.swing.JTextArea();
        TextLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(0, 0, 0));
        MainPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RestrictionsTextAreaLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        RestrictionsTextAreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        RestrictionsTextAreaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestrictionsTextAreaLabel.setText("Restrictions");
        RestrictionsTextAreaLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MainPanel.add(RestrictionsTextAreaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 350, 50));

        DiseaseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        DiseaseLabel.setForeground(new java.awt.Color(255, 255, 255));
        DiseaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiseaseLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MainPanel.add(DiseaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 266, 50));

        SymptomLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SymptomLabel.setForeground(new java.awt.Color(255, 255, 255));
        SymptomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SymptomLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MainPanel.add(SymptomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 390, 50));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Disease");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 50));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Symptoms");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 50));

        RestrictionsTextArea.setColumns(20);
        RestrictionsTextArea.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        RestrictionsTextArea.setRows(5);
        jScrollPane1.setViewportView(RestrictionsTextArea);

        MainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 1050, 140));

        AdviceTextAreaLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AdviceTextAreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdviceTextAreaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdviceTextAreaLabel.setText("Advice");
        AdviceTextAreaLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MainPanel.add(AdviceTextAreaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 350, 50));

        AdviceTextArea.setColumns(20);
        AdviceTextArea.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        AdviceTextArea.setRows(5);
        AdviceTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(AdviceTextArea);

        MainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 1050, 140));

        TextLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        TextLabel.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel.add(TextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 525, 550, 80));

        jPanel1.setBackground(new java.awt.Color(145, 182, 228));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/no.png"))); // NOI18N
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/icons/left-arrow-in-circular-button-black-symbol.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consequence");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
         setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.dispose();
        new UserData().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Result1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AdviceTextArea;
    private javax.swing.JLabel AdviceTextAreaLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel DiseaseLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextArea RestrictionsTextArea;
    private javax.swing.JLabel RestrictionsTextAreaLabel;
    private javax.swing.JLabel SymptomLabel;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
