package millonario;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import static millonario.Millonario.nomArchPers;
import sun.applet.Main;

/**
 *
 * @author PEREIRA
 */
public class ventana2 extends javax.swing.JFrame {

     private  String respcorrecta;
     private final boolean sigue=true;
     private final boolean sigue2=true;
     private boolean fin=true;
     private String valor="";
    
    public ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtjugadorhumano = new javax.swing.JLabel();
        txtrespuesta = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        txtpregunta = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENTE MAS RAPIDA");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 27));

        txtjugadorhumano.setBackground(new java.awt.Color(0, 0, 204));
        txtjugadorhumano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtjugadorhumano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtjugadorhumano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtjugadorhumano.setOpaque(true);
        getContentPane().add(txtjugadorhumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 135, 47));
        getContentPane().add(txtrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 30));

        borrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        borrar.setText("BORRAR");
        borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 90, 30));

        btnenviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnenviar.setText("ENVIAR");
        btnenviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnenviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnenviarMouseClicked(evt);
            }
        });
        getContentPane().add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, 30));

        txtpregunta.setBackground(new java.awt.Color(51, 51, 255));
        txtpregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        txtpregunta.setOpaque(true);
        getContentPane().add(txtpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 101, 438, 86));

        txtA.setEditable(false);
        txtA.setBackground(new java.awt.Color(51, 51, 255));
        txtA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 177, 32));

        txtC.setEditable(false);
        txtC.setBackground(new java.awt.Color(51, 51, 255));
        txtC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 177, 32));

        txtB.setEditable(false);
        txtB.setBackground(new java.awt.Color(51, 51, 255));
        txtB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 177, 32));

        txtD.setEditable(false);
        txtD.setBackground(new java.awt.Color(51, 51, 255));
        txtD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 177, 32));

        btnA.setBackground(new java.awt.Color(0, 0, 204));
        btnA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnA.setText("A");
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAMouseClicked(evt);
            }
        });
        getContentPane().add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 30));

        btnB.setBackground(new java.awt.Color(0, 0, 204));
        btnB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnB.setText("B");
        btnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBMouseClicked(evt);
            }
        });
        getContentPane().add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 30));

        btnC.setBackground(new java.awt.Color(0, 0, 204));
        btnC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnC.setText("C");
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCMouseClicked(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 30));

        btnD.setBackground(new java.awt.Color(0, 0, 204));
        btnD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnD.setText("D");
        btnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDMouseClicked(evt);
            }
        });
        getContentPane().add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/millonario/quien-quiere-ser-millonario.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked

        valor="";
        txtrespuesta.setText(valor);
    }//GEN-LAST:event_borrarMouseClicked

    private void btnenviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviarMouseClicked

        if(sigue2){
   AgenteTonto agent=new AgenteTonto();
            String respAT; respAT="CDAB";
            mensaje2(" AgenteT dijo : "+respAT);
            if(respAT.equals(respcorrecta)){ guardartiempo(txtjugadorhumano.getText()); }
            
                Millonario.acum=Millonario.acum+1;
                dispose();
                ventana2 ir = new ventana2();
                ir.setVisible(true); 
            
           
        }
       
       if( Millonario.acum==4){
            buscarGanador();
            Millonario.ronda++;
            Millonario.iterar--;
            Millonario.acum=0;
            new jugando().setVisible(true);
             dispose();
           
        }
    }//GEN-LAST:event_btnenviarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        
                
            txtjugadorhumano.setText(buscarJugYMostrarlo());
            mostrapregyresp();
            
        
        

    }//GEN-LAST:event_formWindowActivated

    private void btnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseClicked
        
        valor+="A";
        txtrespuesta.setText(valor);
    }//GEN-LAST:event_btnAMouseClicked

    private void btnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseClicked
        
        valor+="B";
        txtrespuesta.setText(valor);
    }//GEN-LAST:event_btnBMouseClicked

    private void btnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseClicked
        
       valor+="C";
        txtrespuesta.setText(valor); 
    }//GEN-LAST:event_btnCMouseClicked

    private void btnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseClicked
       
      valor+="D";
        txtrespuesta.setText(valor);  
    }//GEN-LAST:event_btnDMouseClicked

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JLabel txtjugadorhumano;
    private javax.swing.JLabel txtpregunta;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables

private String buscarJugYMostrarlo() {
        
            try {
            FileReader archivofr = new FileReader(Millonario.nomArchPers);
            BufferedReader acceder = new BufferedReader(archivofr);
            String entrando,nombre,cedula; int xx=0;
            
            while((entrando = acceder.readLine()) != null){
            nombre=entrando;
            entrando = acceder.readLine();
            cedula=entrando;
            if(Millonario.acum==xx){
                return(nombre);
            }
            xx++;
            }
            acceder.close();
            
            }
            catch(java.io.IOException ioex) {}
            
            return ("no hay jugador");
    }

   
    
    private void mostrapregyresp() {
        try {
            // acceder archivos de articulos para ingresarles 
            //al archivo de arrticulos de supermercado 1
            FileReader archivofr = new FileReader(Millonario.archPregMenRap);
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
               
               if(Millonario.vet[Millonario.MMR]==Integer.parseInt(item)){
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
    
    private void guardartiempo(String nomb){
        try {
            BufferedWriter archivobw =new BufferedWriter(new FileWriter(Millonario.archTimeJugaMMR, true));
            PrintWriter agregar=new PrintWriter(archivobw);
           
             agregar.println(nomb);
             agregar.println("time:");
             agregar.println(Millonario.time());   
             agregar.close();
            
        } catch (java.io.IOException ioex) {
        }
    }

    private void buscarGanador() {
        fin=false;
    try {
            FileReader archivofr = new FileReader(Millonario.archTimeJugaMMR);
            BufferedReader acceder = new BufferedReader(archivofr);
            String entrando,nombre,auxnombre = null;
            int tiempo,comp=30,comp2=0;
            
            while((entrando = acceder.readLine()) != null){
            nombre=entrando;
            entrando = acceder.readLine();
            entrando = acceder.readLine(); tiempo=Integer.parseInt(entrando);
            
            if(tiempo<comp){
                comp=tiempo; auxnombre=nombre; 
                if(Millonario.ronda==1){Millonario.j1=auxnombre;}
                if(Millonario.ronda==2){Millonario.j2=auxnombre;}
                if(Millonario.ronda==3){Millonario.j3=auxnombre;}
                if(Millonario.ronda==4){Millonario.j4=auxnombre;}
                if(Millonario.ronda==5){Millonario.j5=auxnombre;}
            }
            else{
                if(tiempo<comp2){ }
            }
            
            }
            acceder.close();
            
            mensaje(auxnombre,comp);
            }
            catch(java.io.IOException ioex) {}
            
            
    }
    
    private void mensaje(String nombre ,int time){
        JOptionPane.showMessageDialog(null,"Ganador: "+nombre+" con "+time+" Segundos");
    }
    
    private void mensaje2(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    private void reproducir() {
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip
        (getClass().getResource("/millonario/detinmarin.wav"));
        sonido.play();
    }
}
