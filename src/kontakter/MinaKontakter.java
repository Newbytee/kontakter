package kontakter;

import java.util.ArrayList;
import sparare.Sparare;

public class MinaKontakter extends javax.swing.JFrame {
    
    String name;
    String surname;
    String phoneNumber;
    Kontakt contact;
    
    //ArrayList<Kontakt> list = new ArrayList<>();
    ArrayList<Kontakt> list;

    public MinaKontakter() {
        
        initComponents();
        
        list = (ArrayList<Kontakt>)Sparare.ladda("kontakter.xml");
        
        if (list == null) {
            
            list = new ArrayList<>();
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inmatning_pnl = new javax.swing.JPanel();
        fnamn_lbl = new javax.swing.JLabel();
        enamn_lbl = new javax.swing.JLabel();
        tfn_lbl = new javax.swing.JLabel();
        fnamn_txf = new javax.swing.JTextField();
        enamn_txf = new javax.swing.JTextField();
        tfn_txf = new javax.swing.JTextField();
        läggtill_btn = new javax.swing.JButton();
        info_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultat_txa = new javax.swing.JTextArea();
        sök_pnl = new javax.swing.JPanel();
        sökF_lbl = new javax.swing.JLabel();
        sökF_txf = new javax.swing.JTextField();
        sökE_lbl = new javax.swing.JLabel();
        sökE_txf = new javax.swing.JTextField();
        sökFE_btn = new javax.swing.JButton();
        alla_lbl = new javax.swing.JLabel();
        fnamn_rbtn = new javax.swing.JRadioButton();
        enamn_rbtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inmatning_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kontaktuppgifter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        fnamn_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnamn_lbl.setText("Förnamn:");

        enamn_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enamn_lbl.setText("Efternamn:");

        tfn_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfn_lbl.setText("Telefonnr:");

        läggtill_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        läggtill_btn.setText("Lägg till");
        läggtill_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggtill_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inmatning_pnlLayout = new javax.swing.GroupLayout(inmatning_pnl);
        inmatning_pnl.setLayout(inmatning_pnlLayout);
        inmatning_pnlLayout.setHorizontalGroup(
            inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inmatning_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inmatning_pnlLayout.createSequentialGroup()
                        .addComponent(enamn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enamn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(läggtill_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inmatning_pnlLayout.createSequentialGroup()
                        .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inmatning_pnlLayout.createSequentialGroup()
                                .addComponent(tfn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inmatning_pnlLayout.createSequentialGroup()
                                .addComponent(fnamn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fnamn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inmatning_pnlLayout.setVerticalGroup(
            inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inmatning_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnamn_lbl)
                    .addComponent(fnamn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inmatning_pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enamn_lbl)
                            .addComponent(enamn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(inmatning_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfn_lbl)
                            .addComponent(tfn_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inmatning_pnlLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(läggtill_btn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        info_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        resultat_txa.setColumns(20);
        resultat_txa.setRows(5);
        jScrollPane1.setViewportView(resultat_txa);

        javax.swing.GroupLayout info_pnlLayout = new javax.swing.GroupLayout(info_pnl);
        info_pnl.setLayout(info_pnlLayout);
        info_pnlLayout.setHorizontalGroup(
            info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        info_pnlLayout.setVerticalGroup(
            info_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_pnlLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sök_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sök och visa ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        sökF_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sökF_lbl.setText("Sök på förnamn:");

        sökF_txf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökF_txfActionPerformed(evt);
            }
        });

        sökE_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sökE_lbl.setText("Sök på efternamn:");

        sökE_txf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökE_txfActionPerformed(evt);
            }
        });

        sökFE_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sökFE_btn.setText("Sök på för- och efternamn");
        sökFE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökFE_btnActionPerformed(evt);
            }
        });

        alla_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alla_lbl.setText("Visa alla kontakter");

        fnamn_rbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        fnamn_rbtn.setText("Förnamn först");
        fnamn_rbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fnamn_rbtnItemStateChanged(evt);
            }
        });

        enamn_rbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        enamn_rbtn.setText("Efternamn först");
        enamn_rbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                enamn_rbtnItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout sök_pnlLayout = new javax.swing.GroupLayout(sök_pnl);
        sök_pnl.setLayout(sök_pnlLayout);
        sök_pnlLayout.setHorizontalGroup(
            sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sök_pnlLayout.createSequentialGroup()
                .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sök_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sökE_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(sökF_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sökF_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sökE_txf, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sök_pnlLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(sökFE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sök_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alla_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnamn_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enamn_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sök_pnlLayout.setVerticalGroup(
            sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sök_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sökF_lbl)
                    .addComponent(sökF_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sökE_txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sökE_lbl))
                .addGap(18, 18, 18)
                .addComponent(sökFE_btn)
                .addGap(18, 18, 18)
                .addGroup(sök_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alla_lbl)
                    .addComponent(fnamn_rbtn)
                    .addComponent(enamn_rbtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inmatning_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sök_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inmatning_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sök_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void läggtill_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggtill_btnActionPerformed
        
        name = fnamn_txf.getText();
        surname = enamn_txf.getText();
        phoneNumber = tfn_txf.getText();
        contact = new Kontakt(name, surname, phoneNumber);
        list.add(contact);
        
        Sparare.spara(list, "kontakter.xml");
        fnamn_txf.setText("");
        enamn_txf.setText("");
        tfn_txf.setText("");
        
    }//GEN-LAST:event_läggtill_btnActionPerformed

    private void fnamn_rbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fnamn_rbtnItemStateChanged
        
        resultat_txa.setText("");
        
        if (fnamn_rbtn.isSelected()) {
            
            enamn_rbtn.setSelected(false);
            
            for (int i = 0; i < list.size(); i++) {
                
                contact = list.get(i);
                resultat_txa.append(contact.getName() + "\t" + contact.getSurname() + "\t\t" + contact.getPhoneNumber() + "\n");
                
            }
            
        }
        
    }//GEN-LAST:event_fnamn_rbtnItemStateChanged

    private void enamn_rbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_enamn_rbtnItemStateChanged
        
        resultat_txa.setText("");
        
        if (enamn_rbtn.isSelected()) {
            
            fnamn_rbtn.setSelected(false);
            
            for (int i = 0; i < list.size(); i++) {
                
                contact = list.get(i);
                resultat_txa.append(contact.getSurname() + "\t" + contact.getName() + "\t\t" + contact.getPhoneNumber() + "\n");
                
            }
            
        }
        
    }//GEN-LAST:event_enamn_rbtnItemStateChanged

    private void sökF_txfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökF_txfActionPerformed
        
        name = sökF_txf.getText();
        resultat_txa.setText("");
        
        for (int i = 0; i < list.size(); i++) {
            
            contact = list.get(i);
            
            if (contact.getName().equals(name)) {
                
                resultat_txa.append(contact.getName() + "\t" + contact.getSurname() + "\t" + contact.getPhoneNumber() + "\n");
                
            }
            
        }
        
        sökF_txf.setText("");
        
    }//GEN-LAST:event_sökF_txfActionPerformed

    private void sökE_txfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökE_txfActionPerformed
        
        surname = sökE_txf.getText();
        resultat_txa.setText("");
        
        for (int i = 0; i < list.size(); i++) {
            
            contact = list.get(i);
            
            if (contact.getSurname().equals(surname)) {
                
                resultat_txa.append(contact.getSurname() + "\t" + contact.getName() + "\t" + contact.getPhoneNumber());
                
            }
            
        }
        
        sökE_txf.setText("");
        
    }//GEN-LAST:event_sökE_txfActionPerformed

    private void sökFE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökFE_btnActionPerformed
        
        name = sökF_txf.getText();
        surname = sökE_txf.getText();
        resultat_txa.setText("");
        
        for (int i = 0; i < list.size(); i++) {
            
            contact = list.get(i);
            
            if (contact.getName().equals(name) && contact.getSurname().equals(surname)) {
                
                resultat_txa.append(contact.getName() + "\t" + contact.getSurname() + "\t" + contact.getPhoneNumber() + "\n");
                
            }
            
        }
        
        sökF_txf.setText("");
        sökE_txf.setText("");
        
    }//GEN-LAST:event_sökFE_btnActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MinaKontakter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinaKontakter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinaKontakter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinaKontakter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinaKontakter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alla_lbl;
    private javax.swing.JLabel enamn_lbl;
    private javax.swing.JRadioButton enamn_rbtn;
    private javax.swing.JTextField enamn_txf;
    private javax.swing.JLabel fnamn_lbl;
    private javax.swing.JRadioButton fnamn_rbtn;
    private javax.swing.JTextField fnamn_txf;
    private javax.swing.JPanel info_pnl;
    private javax.swing.JPanel inmatning_pnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton läggtill_btn;
    private javax.swing.JTextArea resultat_txa;
    private javax.swing.JLabel sökE_lbl;
    private javax.swing.JTextField sökE_txf;
    private javax.swing.JButton sökFE_btn;
    private javax.swing.JLabel sökF_lbl;
    private javax.swing.JTextField sökF_txf;
    private javax.swing.JPanel sök_pnl;
    private javax.swing.JLabel tfn_lbl;
    private javax.swing.JTextField tfn_txf;
    // End of variables declaration//GEN-END:variables
}
