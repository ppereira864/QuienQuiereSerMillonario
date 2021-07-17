package millonario;


import java.applet.AudioClip;
import javax.swing.JOptionPane;



/**
 *
 * @author PEREIRA PEDRO
 * @author ACOSTA JACKELINE
 */

public class ventana1 extends javax.swing.JFrame {
    
    
    static int guardarjugador;
    static boolean cerrojo=true;
            
    public ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnguardardatos.setVisible(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbnombre = new javax.swing.JLabel();
        txtcamponombre = new javax.swing.JTextField();
        botlistoparajugar = new javax.swing.JButton();
        jlbcedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnintrucciones = new javax.swing.JButton();
        btnguardardatos = new javax.swing.JButton();
        jagador1 = new javax.swing.JButton();
        jugador2 = new javax.swing.JButton();
        jugador3 = new javax.swing.JButton();
        jugador4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbnombre.setBackground(new java.awt.Color(0, 0, 204));
        jlbnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbnombre.setText("INGRESE NOMBRE Y APELLIDO:");
        jlbnombre.setOpaque(true);
        getContentPane().add(jlbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 360, -1, 25));

        txtcamponombre.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(txtcamponombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 360, 163, -1));

        botlistoparajugar.setBackground(new java.awt.Color(0, 0, 204));
        botlistoparajugar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botlistoparajugar.setForeground(new java.awt.Color(255, 255, 255));
        botlistoparajugar.setText("! LISTO PARA JUGAR ¡");
        botlistoparajugar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botlistoparajugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botlistoparajugarMouseClicked(evt);
            }
        });
        getContentPane().add(botlistoparajugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 222, 46));

        jlbcedula.setBackground(new java.awt.Color(0, 51, 204));
        jlbcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbcedula.setForeground(new java.awt.Color(255, 255, 255));
        jlbcedula.setText("INGRESE CEDULA:");
        jlbcedula.setOpaque(true);
        getContentPane().add(jlbcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 390, 140, 20));

        txtcedula.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 390, 163, -1));

        jLabel4.setAlignmentY(0.9F);
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        btnsalir.setBackground(new java.awt.Color(0, 0, 204));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("SALIR");
        btnsalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 70, 40));

        btnintrucciones.setBackground(new java.awt.Color(0, 0, 204));
        btnintrucciones.setForeground(new java.awt.Color(255, 255, 255));
        btnintrucciones.setText("INTRUCCIONES");
        btnintrucciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnintrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnintruccionesMouseClicked(evt);
            }
        });
        getContentPane().add(btnintrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        btnguardardatos.setBackground(new java.awt.Color(0, 0, 204));
        btnguardardatos.setForeground(new java.awt.Color(255, 255, 255));
        btnguardardatos.setText("GUARDAR DATOS");
        btnguardardatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnguardardatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardardatosMouseClicked(evt);
            }
        });
        getContentPane().add(btnguardardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 115, 50));

        jagador1.setBackground(new java.awt.Color(0, 0, 204));
        jagador1.setForeground(new java.awt.Color(255, 255, 255));
        jagador1.setText("1 JUGADOR");
        jagador1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jagador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jagador1MouseClicked(evt);
            }
        });
        getContentPane().add(jagador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 101, 37));

        jugador2.setBackground(new java.awt.Color(0, 0, 204));
        jugador2.setForeground(new java.awt.Color(255, 255, 255));
        jugador2.setText("2 JUGADORES");
        jugador2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugador2MouseClicked(evt);
            }
        });
        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, 101, 37));

        jugador3.setBackground(new java.awt.Color(0, 0, 204));
        jugador3.setForeground(new java.awt.Color(255, 255, 255));
        jugador3.setText("3 JUGADORES");
        jugador3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jugador3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugador3MouseClicked(evt);
            }
        });
        getContentPane().add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 101, 37));

        jugador4.setBackground(new java.awt.Color(0, 0, 204));
        jugador4.setForeground(new java.awt.Color(255, 255, 255));
        jugador4.setText("4 JUGADORES");
        jugador4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jugador4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugador4MouseClicked(evt);
            }
        });
        getContentPane().add(jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 216, 101, 37));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5 JUGADORES");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 259, 101, 38));

        btn0.setBackground(new java.awt.Color(0, 0, 153));
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0 JUGADORES");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/millonario/ldqqsm.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botlistoparajugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botlistoparajugarMouseClicked
        
        if(guardarjugador==5){
        ventana2 ir = new ventana2();
        ir.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_botlistoparajugarMouseClicked

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
       
        dispose();
        
    }//GEN-LAST:event_btnsalirMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
    }//GEN-LAST:event_formWindowActivated

    private void btnintruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnintruccionesMouseClicked
        
        JOptionPane.showMessageDialog(null,"ESTE JUEGO CONSISTE EN GANAR\n"
                + "LA MENTE MAS RAPIDA PARA ENTRAR AL PODIO \n"
                + "POR UNA SERIES DE PREGUNTAS CON CIERTA DIFICULTAD\n"
                + "EL BLOQUE DE PREGUNTAS DE LA MENTE MAS RAPIDA\n"
                + "SE DEBE CLIQUEAR LAS OPCIONES Y DARLES ENVIARLAS. ");
    }//GEN-LAST:event_btnintruccionesMouseClicked

    private void btnguardardatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardardatosMouseClicked
       
        if(Millonario.cuantosjugaran<guardarjugador){
        try {
            String nombre=txtcamponombre.getText();
            int cedula=Integer.parseInt(txtcedula.getText());
            
            Persona p = new Persona(nombre,cedula);
            JOptionPane.showMessageDialog(this, p.toString());
            limpiarcampos();
            
            Millonario.crearchivo(p,"H",null);
            Millonario.cuantosjugaran++;
            
        } catch (Exception e) {
         JOptionPane.showMessageDialog(this,"Datos no valido...");   
        }
        }else{
            if(guardarjugador<=5){
                for(int i=Millonario.cuantosjugaran;i<5;i++){
                    
                    AgenteTonto agent=new AgenteTonto();
                    Millonario.crearchivo(null,"A",agent);
                    JOptionPane.showMessageDialog(this, agent.toString());
                    guardarjugador++;
            }
            }
        }
    }//GEN-LAST:event_btnguardardatosMouseClicked

    private void jagador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jagador1MouseClicked
        
        btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=1; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio JUGADOR ingreses Datos "
                + "\nrequeridos para jugar....");
        }
        
    }//GEN-LAST:event_jagador1MouseClicked

    private void jugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador2MouseClicked
        
        btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=2; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio 2 JUGADORES ingreses Datos "
                + "\nrequeridos para jugar....");
        }
        
    }//GEN-LAST:event_jugador2MouseClicked

    private void jugador3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador3MouseClicked
        
        btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=3; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio 3 JUGADORES ingreses Datos "
                + "\nrequeridos para jugar....");
        }
        
    }//GEN-LAST:event_jugador3MouseClicked

    private void jugador4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugador4MouseClicked
        
        btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=4; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio 4 JUGADORES ingreses Datos "
                + "requeridos para jugar....");
        }
    }//GEN-LAST:event_jugador4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=5; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio 5 JUGADORES ingreses Datos "
                + "requeridos para jugar....");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
       
       btnguardardatos.setVisible(true);
        if(cerrojo){
        guardarjugador=0; cerrojo=false;
        JOptionPane.showMessageDialog(this,"Ya eligio 0 JUGADORES ingreses Datos "
                + "\nrequeridos para jugar....");
        }
        
    }//GEN-LAST:event_btn0MouseClicked

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botlistoparajugar;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnguardardatos;
    private javax.swing.JButton btnintrucciones;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jagador1;
    private javax.swing.JLabel jlbcedula;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JButton jugador2;
    private javax.swing.JButton jugador3;
    private javax.swing.JButton jugador4;
    private javax.swing.JTextField txtcamponombre;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables

    private void limpiarcampos() {
        this.txtcamponombre.setText("");
        this.txtcedula.setText("");
    }
    
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }

    private void reproducir() {
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip
        (getClass().getResource("/millonario/bienvenidoaqqsm.wav"));
        sonido.play();
    }

}
