package co.edu.uniquindio.adress.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class falsoVerdadero extends JFrame {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public falsoVerdadero() {
	        initComponents();
	        question.setText(p.getPregunta(posicion));
	        String[] a = r.setRespuestas(posicion);
	        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
	        //opc1.setText(a[0]);
	        //opc2.setText(a[1]);
	        opc3.setText(a[2]);
	        opc4.setText(a[3]);
	        //opc1.requestFocus();
	        regresar.setEnabled(false);
	        terminarExamen.setEnabled(false);
	    }


	    int posicion = 0;
	    Respuestas r = new Respuestas();
	    Preguntas p = new Preguntas();
	    Object[] select = {"","","","",""};
	    
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        question = new javax.swing.JLabel();
	        opc3 = new javax.swing.JRadioButton();
	        opc4 = new javax.swing.JRadioButton();
	        terminarExamen = new javax.swing.JButton();
	        avanzar = new javax.swing.JButton();
	        regresar = new javax.swing.JButton();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Examen"));
	        jPanel1.setName("Examen"); // NOI18N

	        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        jLabel1.setText("Preguntas falso o verdadero ");

	        question.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        question.setText("¿Pregunta 1?");

	        buttonGroup1.add(opc3);
	        opc3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                opc3ActionPerformed(evt);
	            }
	        });

	        buttonGroup1.add(opc4);
	        opc4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                opc4ActionPerformed(evt);
	            }
	        });

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

	        jLabel2.setText("Falso");

	        jLabel3.setText("Verdadero");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel1)
	                                    .addComponent(question))
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addGap(24, 24, 24)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                    .addComponent(opc3)
	                                    .addComponent(opc4))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jLabel2)
	                                    .addComponent(jLabel3))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE))))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGap(0, 511, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(terminarExamen, javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                .addComponent(regresar)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(avanzar)))))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jLabel1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(question)
	                        .addGap(27, 27, 27)
	                        .addComponent(opc3))
	                    .addComponent(jLabel2))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(opc4)
	                    .addComponent(jLabel3))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
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
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
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
	            //opc1.setText(a[0]);
	            //opc2.setText(a[1]);
	            opc3.setText(a[2]);
	            opc4.setText(a[3]);
	            //opc1.requestFocus();
	        }else{
	            Toolkit.getDefaultToolkit().beep();
	        }
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
	            //opc1.setText(a[0]);
	            //opc2.setText(a[1]);
	            opc3.setText(a[2]);
	            opc4.setText(a[3]);
	            //opc1.requestFocus();
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

	    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
	        select[posicion] = opc3.getLabel();
	    }//GEN-LAST:event_opc3ActionPerformed

	    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
	        select[posicion] = opc4.getLabel();
	    }//GEN-LAST:event_opc4ActionPerformed

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton avanzar;
	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JRadioButton opc3;
	    private javax.swing.JRadioButton opc4;
	    private javax.swing.JLabel question;
	    private javax.swing.JButton regresar;
	    private javax.swing.JButton terminarExamen;
	    // End of variables declaration//GEN-END:variables

}
