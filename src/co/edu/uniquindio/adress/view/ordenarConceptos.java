package co.edu.uniquindio.adress.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ordenarConceptos extends JFrame {

	 public ordenarConceptos() {
	        
	        initComponents();
	        question.setText(p.getPregunta(posicion));
	        String[] a = r.setRespuestas(posicion);
	        /*buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
	        opc1.getItems().addAll("","","","");
	        opc1.setJComboBox(a[0]);//JComboBox<String>
	        opc2.setText(a[1]);
	        opc3.setText(a[2]);
	        opc4.setText(a[3]);*/
	       // opc1.requestFocus();
	        int num=opc1.getItemCount();
	        System.out.println(num);
	        regresar.setEnabled(false);
	        terminarExamen.setEnabled(false);
	    }  


	    int posicion = 0;
	    Respuestas r = new Respuestas();
	    Preguntas p = new Preguntas();
	    Object[] select = {"","","","",""};
	    
	   @SuppressWarnings("unlock") 
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        question = new javax.swing.JLabel();
	        terminarExamen = new javax.swing.JButton();
	        avanzar = new javax.swing.JButton();
	        regresar = new javax.swing.JButton();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        opc1 = new javax.swing.JComboBox<>();
	        jComboBox2 = new javax.swing.JComboBox<>();
	        jComboBox3 = new javax.swing.JComboBox<>();
	        jComboBox4 = new javax.swing.JComboBox<>();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Examen"));
	        jPanel1.setName("Examen"); // NOI18N

	        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        jLabel1.setText("Pregunta de opcion multiple");

	        question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        question.setText("¿Pregunta 1?");

	        terminarExamen.setText("Terminar Examen");
	        terminarExamen.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                terminarExamenActionPerformed(evt);
	            }
	        });

	        avanzar.setText("Avanzar >>");
	        avanzar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                avanzarActionPerformed(evt);
	            }
	        });

	        regresar.setText("<< Regresar");
	        regresar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                regresarActionPerformed(evt);
	            }
	        });

	        jLabel2.setText("A)");

	        jLabel3.setText("B)");

	        jLabel4.setText("C)");

	        jLabel5.setText("D)");

	        opc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
	        opc1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                opc1ActionPerformed(evt);
	            }
	        });

	        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jComboBox2ActionPerformed(evt);
	            }
	        });

	        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

	        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(terminarExamen, javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                .addComponent(regresar)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(avanzar))))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel1)
	                                    .addComponent(question))
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGap(0, 0, Short.MAX_VALUE)
	                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGroup(jPanel1Layout.createSequentialGroup()
	                                        .addGap(18, 18, 18)
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(jLabel5)
	                                            .addComponent(jLabel2)
	                                            .addComponent(jLabel4)
	                                            .addComponent(jLabel3))
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
	                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                            .addComponent(opc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                                .addGap(432, 432, 432)))))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(question)
	                .addGap(47, 47, 47)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(21, 21, 21)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel5)
	                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(avanzar)
	                    .addComponent(regresar))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(terminarExamen)
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGap(48, 48, 48))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed

	        if(posicion == 3){
	            avanzar.setEnabled(false);
	            terminarExamen.setEnabled(true);
	        }
	        
	        if(posicion < 5){
	            regresar.setEnabled(true);
	            posicion++;
	            question.setText(p.getPregunta(posicion));
	            String[] a = r.setRespuestas(posicion);
	            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
	 
	            /*opc1.setText(a[0]);
	            opc2.setText(a[1]);
	            opc3.setText(a[2]);
	            opc4.setText(a[3]);*/
	            
	             
	            opc1.requestFocus();
	        }else{
	            Toolkit.getDefaultToolkit().beep();
	        }
	        System.out.println("safgdhfgfd");
	            
	        
	    }//GEN-LAST:event_avanzarActionPerformed

	    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
	       
	            
	        
	        
	        if(posicion == 0){
	            regresar.setEnabled(false);
	        }
	        
	        if(posicion > -1){
	            posicion--;
	            avanzar.setEnabled(true);
	            question.setText(p.getPregunta(posicion));
	            String[] a = r.setRespuestas(posicion);
	            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
	           /* opc1.setText(a[0]);
	            opc2.setText(a[1]);
	            opc3.setText(a[2]);
	            opc4.setText(a[3]);*/
	            opc1.requestFocus();
	        }else{
	            Toolkit.getDefaultToolkit().beep();
	        }
	    }//GEN-LAST:event_regresarActionPerformed

	    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed
	        
	        int calificacion = 0;
	        
	        for(int i = 0; i < 5; i++){
	            if(select[i].equals(r.getRespuesta(i))){
	                calificacion = calificacion + 1;
	            }
	        }
	        
	        calificacion = calificacion * 2;
	        
	      
	        
	        JOptionPane.showMessageDialog(null, "Tu calificacion es " +  calificacion);
	        
	    }//GEN-LAST:event_terminarExamenActionPerformed

	    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_opc1ActionPerformed

	    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_jComboBox2ActionPerformed

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton avanzar;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JComboBox<String> jComboBox2;
	    private javax.swing.JComboBox<String> jComboBox3;
	    private javax.swing.JComboBox<String> jComboBox4;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JComboBox<String> opc1;
	    private javax.swing.JLabel question;
	    private javax.swing.JButton regresar;
	    private javax.swing.JButton terminarExamen;
	    // End of variables declaration//GEN-END:variables
}
