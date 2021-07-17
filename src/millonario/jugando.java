package millonario;

import java.applet.AudioClip;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author PEREIRA
 */
public class jugando extends javax.swing.JFrame {

     static  String respcorrecta="";
     static boolean correcto=true; 
     static  String jugadorQQSM;
     static int item=1;
     
    /**
     * Creates new form jugando
     */
    public jugando() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         if((correcto)&&(item<=15)){
            txtjugadorhumano.setText(Millonario.j1);
            btncincuenta.setVisible(Millonario.cincuenta);
            btnllamar.setVisible(Millonario.llamar);
            
            mostrapregyresp();
            escalapremio();
         }
    
         if(item==15){
             mensaje(" ha ganado Quien Quiere ser millonario\n "
                     + "se lleva 500000 BSF");
         }
         
        
    }
    
    static public void setquienjuega(String jugador){
        //jugadorQQSM=jugador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtpregunta = new javax.swing.JLabel();
        txtjugadorhumano = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        btncincuenta = new javax.swing.JButton();
        btnllamar = new javax.swing.JButton();
        btnaudiencia = new javax.swing.JButton();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        nivel1 = new javax.swing.JTextField();
        nivel2 = new javax.swing.JTextField();
        nivel3 = new javax.swing.JTextField();
        nivel4 = new javax.swing.JTextField();
        nivel5 = new javax.swing.JTextField();
        nivel6 = new javax.swing.JTextField();
        nivel7 = new javax.swing.JTextField();
        nivel8 = new javax.swing.JTextField();
        nivel9 = new javax.swing.JTextField();
        nivel10 = new javax.swing.JTextField();
        nivel11 = new javax.swing.JTextField();
        nivel12 = new javax.swing.JTextField();
        nivel13 = new javax.swing.JTextField();
        nivel14 = new javax.swing.JTextField();
        nivel15 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUIEN QUIERE SER MILLONARIO");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        txtpregunta.setBackground(new java.awt.Color(51, 51, 255));
        txtpregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        txtpregunta.setOpaque(true);
        getContentPane().add(txtpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 810, 116));

        txtjugadorhumano.setBackground(new java.awt.Color(0, 0, 204));
        txtjugadorhumano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtjugadorhumano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtjugadorhumano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtjugadorhumano.setOpaque(true);
        getContentPane().add(txtjugadorhumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 352, 228, 40));

        txtD.setEditable(false);
        txtD.setBackground(new java.awt.Color(51, 51, 255));
        txtD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 250, 40));

        txtC.setEditable(false);
        txtC.setBackground(new java.awt.Color(51, 51, 255));
        txtC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 270, 40));

        txtA.setEditable(false);
        txtA.setBackground(new java.awt.Color(51, 51, 255));
        txtA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 222, 270, 40));

        txtB.setEditable(false);
        txtB.setBackground(new java.awt.Color(51, 51, 255));
        txtB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 250, 40));

        btncincuenta.setBackground(new java.awt.Color(51, 51, 255));
        btncincuenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncincuenta.setText("50-50");
        btncincuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncincuentaMouseClicked(evt);
            }
        });
        getContentPane().add(btncincuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 70, 40));

        btnllamar.setBackground(new java.awt.Color(51, 51, 255));
        btnllamar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnllamar.setText("llamar");
        btnllamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnllamarMouseClicked(evt);
            }
        });
        getContentPane().add(btnllamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, 40));

        btnaudiencia.setBackground(new java.awt.Color(51, 51, 255));
        btnaudiencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnaudiencia.setText("audiencia");
        btnaudiencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaudienciaMouseClicked(evt);
            }
        });
        getContentPane().add(btnaudiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 100, 40));

        A.setBackground(new java.awt.Color(51, 51, 255));
        A.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 222, 50, 40));

        B.setBackground(new java.awt.Color(51, 51, 255));
        B.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 222, 50, 40));

        C.setBackground(new java.awt.Color(51, 51, 255));
        C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 50, 40));

        D.setBackground(new java.awt.Color(51, 51, 255));
        D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 50, 40));

        nivel1.setEditable(false);
        nivel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel1.setText("1");
        nivel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 382, 35, -1));

        nivel2.setEditable(false);
        nivel2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel2.setText("2");
        nivel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 358, 35, -1));

        nivel3.setEditable(false);
        nivel3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel3.setText("3");
        nivel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 334, 35, -1));

        nivel4.setEditable(false);
        nivel4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel4.setText("4");
        nivel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 35, -1));

        nivel5.setEditable(false);
        nivel5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel5.setText("5");
        nivel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 35, -1));

        nivel6.setEditable(false);
        nivel6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel6.setText("6");
        nivel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 262, 35, -1));

        nivel7.setEditable(false);
        nivel7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel7.setText("7");
        nivel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 238, 35, -1));

        nivel8.setEditable(false);
        nivel8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel8.setText("8");
        nivel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 35, -1));

        nivel9.setEditable(false);
        nivel9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel9.setText("9");
        nivel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 35, -1));

        nivel10.setEditable(false);
        nivel10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel10.setText("10");
        nivel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, 35, -1));

        nivel11.setEditable(false);
        nivel11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel11.setText("11");
        nivel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 35, -1));

        nivel12.setEditable(false);
        nivel12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel12.setText("12");
        nivel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 35, -1));

        nivel13.setEditable(false);
        nivel13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel13.setText("13");
        nivel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 35, -1));

        nivel14.setEditable(false);
        nivel14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel14.setText("14");
        nivel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 35, -1));

        nivel15.setEditable(false);
        nivel15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nivel15.setText("15");
        nivel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(nivel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 35, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/millonario/quien-quiere-ser-millonario.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 640, 320));

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 870, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
      
        if(B.getText().equals(respcorrecta)){
            reproducira();
        correcto=true; item++;  new jugando().setVisible(true); dispose();
        }else{
            reproducirb();
            mensaje("perdio lo siento");
            Millonario.cincuenta=true; Millonario.audiencia=true;
            Millonario.llamar=true; item=1;
            new ventana2().setVisible(true);
            dispose();
        }       
        
    }//GEN-LAST:event_BMouseClicked

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        
        
        if(A.getText().equals(respcorrecta)){
            reproducira();
        correcto=true; item++;  new jugando().setVisible(true); dispose();
        }else{
            reproducirb();
            mensaje("perdio lo siento");
            Millonario.cincuenta=true; Millonario.audiencia=true;
            Millonario.llamar=true; item=1;
            mensaje("perdio lo siento");
            new ventana2().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_AMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        
        
        if(C.getText().equals(respcorrecta)){
            reproducira();
        correcto=true; item++;  new jugando().setVisible(true); dispose();
        
        }else{
            reproducirb();
            mensaje("perdio lo siento");
            Millonario.cincuenta=true; Millonario.audiencia=true;
            Millonario.llamar=true; item=1;
            mensaje("perdio lo siento");
            new ventana2().setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        
        
        if(D.getText().equals(respcorrecta)){
            reproducira();
        correcto=true; item++;  new jugando().setVisible(true); dispose();
        }else{
            reproducirb();
            mensaje("perdio lo siento");
            Millonario.cincuenta=true; Millonario.audiencia=true;
            Millonario.llamar=true; item=1;
            mensaje("perdio lo siento");
            new ventana2().setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_DMouseClicked

    private void btncincuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncincuentaMouseClicked
        
        Random x=new Random();
        boolean ela=true,elb=true,elc=true,eld=true;
        int cont=1,elim1;
        do{
            elim1=x.nextInt(8);
            
            if((elim1==3)&&(ela)){
                if(!(respcorrecta.equals("A"))&&(cont<=2))
                { cont++; txtA.setText(""); ela=false; }
            }
            if((elim1==5)&&(elb)){
                if(!(respcorrecta.equals("B"))&&(cont<=2))
                { cont++; txtB.setText(""); elb=false; }
            }
            if((elim1==2)&&(elc)){
                if(!(respcorrecta.equals("C"))&&(cont<=2))
                { cont++; txtC.setText(""); elc=false; }
            }
            if((elim1==3)&&(eld)){
                if(!(respcorrecta.equals("D"))&&(cont<=2))
                { cont++; txtD.setText(""); eld=false; }
            }
            
        }while(cont<=2);
        Millonario.cincuenta=false;
        btncincuenta.setVisible(Millonario.cincuenta);
    }//GEN-LAST:event_btncincuentaMouseClicked

    private void btnllamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnllamarMouseClicked
        
        Random x=new Random();
        int cont=1,elim1;
        
        do{
            elim1=x.nextInt(10);
            
            if(elim1>5)
            { JOptionPane.showMessageDialog(null,
             " la respuesta es "+respcorrecta); cont++; }
            
            if(elim1==4){
            if(!(respcorrecta.equals("A"))&&(cont<2)&&(!txtA.getText().equals("")))
            { JOptionPane.showMessageDialog(null,
             "Bueno deduciendo la hipotenusa creo es A"); cont++; } }
            if(elim1==8){
            if(!(respcorrecta.equals("B"))&&(cont<2)&&(!txtB.getText().equals("")))
            { JOptionPane.showMessageDialog(null,
             "Bueno segun el pokemon legendario es la  B"); cont++; } }
            if(elim1==2){
            if(!(respcorrecta.equals("C"))&&(cont<2)&&(!txtC.getText().equals("")))
            { JOptionPane.showMessageDialog(null,
             "Me vas a volver loco es la C"); cont++; } }
            if(elim1==4){
            if(!(respcorrecta.equals("A"))&&(cont<2)&&(!txtD.getText().equals("")))
            { JOptionPane.showMessageDialog(null,
             "Segun messi en el barcelona es la D"); cont++; } }
            
        }while(cont<2);
        
        Millonario.llamar=false;
        btnllamar.setVisible(Millonario.llamar);
    }//GEN-LAST:event_btnllamarMouseClicked

    private void btnaudienciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaudienciaMouseClicked
        
        Random ale=new Random();
        int valor=ale.nextInt(5);
        if(valor==1){
        JOptionPane.showMessageDialog(null,
             "Segun la audiencia es  A la con el 60 %\n"
                     + "y la b con un 25 %\n"
                     + "la c con un 10\n"
                     + "y la d con 5%");
        }
        if(valor==2){
        JOptionPane.showMessageDialog(null,
             "Segun la audiencia es  A la con el 60 %\n"
                     + "y la b con un 25 %\n"
                     + "la c con un 10\n"
                     + "y la d con 5%");
        }
        if(valor==3){
        JOptionPane.showMessageDialog(null,
             "Segun la audiencia es  A la con el 60 %\n"
                     + "y la b con un 25 %\n"
                     + "la c con un 10\n"
                     + "y la d con 5%");
        }
        if(valor==4){
        JOptionPane.showMessageDialog(null,
             "Segun la audiencia es  A la con el 20 %\n"
                     + "y la b con un 40 %\n"
                     + "la c con un 20\n"
                     + "y la d con 2%");
        }
        if(valor==0){
        JOptionPane.showMessageDialog(null,
             "Segun la audiencia es  A la con el 40 %\n"
                     + "y la b con un 25 %\n"
                     + "la c con un 25%\n"
                     + "y la d con 10%");
        }
        Millonario.audiencia=false;
        btnaudiencia.setVisible(Millonario.audiencia);
    }//GEN-LAST:event_btnaudienciaMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jugando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jugando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jugando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jugando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jugando().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton btnaudiencia;
    private javax.swing.JButton btncincuenta;
    private javax.swing.JButton btnllamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nivel1;
    private javax.swing.JTextField nivel10;
    private javax.swing.JTextField nivel11;
    private javax.swing.JTextField nivel12;
    private javax.swing.JTextField nivel13;
    private javax.swing.JTextField nivel14;
    private javax.swing.JTextField nivel15;
    private javax.swing.JTextField nivel2;
    private javax.swing.JTextField nivel3;
    private javax.swing.JTextField nivel4;
    private javax.swing.JTextField nivel5;
    private javax.swing.JTextField nivel6;
    private javax.swing.JTextField nivel7;
    private javax.swing.JTextField nivel8;
    private javax.swing.JTextField nivel9;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JLabel txtjugadorhumano;
    private javax.swing.JLabel txtpregunta;
    // End of variables declaration//GEN-END:variables

    private void escalapremio(){
        if((correcto)&&(item==1)){nivel1.setBackground(Color.RED); 
           
        }else
            {nivel1.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==2)){nivel2.setBackground(Color.RED); 
         mensaje(" se lleva 300 BSF");
        }else
        {nivel2.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==3)){nivel3.setBackground(Color.RED); 
        mensaje(" se lleva 600 BSF");
        }else
        {nivel3.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==4)){nivel4.setBackground(Color.RED); 
        mensaje(" se lleva 1000 BSF");
        }else
        {nivel4.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==5)){nivel5.setBackground(Color.RED); 
        mensaje(" se lleva 1500 BSF");
        }else
        {nivel5.setBackground(Color.YELLOW); }
        
        if((correcto)&&(item==6)){nivel6.setBackground(Color.RED); 
        mensaje(" se lleva 2000 BSF");
        }else
        {nivel6.setBackground(Color.WHITE); }
        if((correcto)&&(item==7)){nivel7.setBackground(Color.RED); 
        mensaje(" se lleva 2500 BSF");
        }else
        {nivel7.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==8)){nivel8.setBackground(Color.RED); 
        mensaje(" se lleva 5000 BSF");
        }else
        {nivel8.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==9)){nivel9.setBackground(Color.RED); 
        mensaje(" se lleva 8000 BSF");
        }else
        {nivel9.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==10)){nivel10.setBackground(Color.RED); 
        mensaje(" se lleva 10000 BSF");
        }else
        {nivel10.setBackground(Color.YELLOW); }
        
        if((correcto)&&(item==11)){nivel11.setBackground(Color.RED); 
        mensaje(" se lleva 15000 BSF");
        }else
        {nivel11.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==12)){nivel12.setBackground(Color.RED); 
        mensaje(" se lleva 20000 BSF");
        }else
        {nivel12.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==13)){nivel13.setBackground(Color.RED); 
        mensaje(" se lleva 60000 BSF");
        }else
        {nivel13.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==14)){nivel14.setBackground(Color.RED); 
        mensaje(" se lleva 150000 BSF");
        }else
        {nivel14.setBackground(Color.WHITE); }
        
        if((correcto)&&(item==15)){nivel15.setBackground(Color.RED); 
        mensaje(" se lleva 250000 BSF");
        }else
        {nivel15.setBackground(Color.YELLOW); }
    }
    
    private void mostrapregyresp() {
        try {
            // acceder archivos de articulos para ingresarles 
            //al archivo de arrticulos de supermercado 1
            FileReader archivofr = new FileReader(Millonario.archPregQQSM);
            BufferedReader acceder = new BufferedReader(archivofr);
            
            String entrando,item,pregunta,a,b,c,d,resp;
            

            while((entrando = acceder.readLine()) != null)
           {
               
               item=entrando;
               entrando = acceder.readLine(); pregunta=entrando;
               entrando = acceder.readLine(); a=entrando;
               entrando = acceder.readLine(); b=entrando;
               entrando = acceder.readLine(); c=entrando;
               entrando = acceder.readLine(); d=entrando;
               entrando = acceder.readLine(); resp=entrando;
               
               if(Millonario.aleatorio()){
               txtpregunta.setText(pregunta);
               txtA.setText(a); txtB.setText(b);
               txtC.setText(c); txtD.setText(d);
               respcorrecta=resp;
               }
            }
            acceder.close();//cierra archivo
        } catch (java.io.IOException ioex) {
        }
        
    }
    
    private void reproducira() {
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip
        (getClass().getResource("/millonario/respcorrecta.wav"));
        sonido.play();
    }
    
    private void reproducirb() {
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip
        (getClass().getResource("/millonario/respincorrecta.wav"));
        sonido.play();
    }
    
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
}
