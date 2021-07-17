package millonario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author PEREIRA
 */
public class Millonario {
    
    public static String jugador;
    public static int[ ] vet=new int[5];
    public static int MMR=0;
    public static int acum=0;
    public static int ronda=1;
    public static int iterar=5;
    public static int cuantosjugaran=0;
    ///////// Archivos del juego
    public static final String nomArchPers="archivoJugador.txt";
    public static final String archPregMenRap="preguntaMenteRapida.txt";
    public static final String archTimeJugaMMR="guardarTiempodDMMR.txt";
    public static final String archPregQQSM="preguntasQQSM.txt";
    ////////// para comprobar comidines
    public static Boolean cincuenta=true;
    public static Boolean llamar=true;
    public static Boolean audiencia=true;
    /////////////////  jugadores que ya jugaron
     public static String j1="",j2="",j3="",j4="",j5="";
     public static int[ ] jugadorpasado = new int[5];

    public static void main(String[] args) {
        ////////////////////////////
        
        for(int i=0;i<5;i++){ ///// Carga mis preguntas para la RMR
            vet[i]=3;
        }
        //////////////////////////
        ventana1 inicio=new ventana1();/////comienza el juego
        inicio.setVisible(true);
        /////////////////////// 
        
    }
    
    
    public static void crearchivo(Persona p,String HoA,AgenteTonto agent){
       
        try {
            BufferedWriter archivobw =new BufferedWriter(new FileWriter(nomArchPers,true));
            PrintWriter agregar=new PrintWriter(archivobw);
            
            if("H".equals(HoA)){
             agregar.println(p.getNombreapellido());
             agregar.println(p.getCedula());   
             agregar.close();
            }
            if("A".equals(HoA)){
             agregar.println(agent.getNombre());
             agregar.println(agent.getCedula());   
             agregar.close();
            }
            
        } catch (java.io.IOException ioex) {
        }
            
            
    }
   
    
    public static boolean aleatorio(){
        Random cerrojo=new Random();
        int aux;
        aux=cerrojo.nextInt(5);
        
        if(aux==3){
            return true;
        }else
            return false;
    }
    
    public static int time(){
        
        Random ale=new Random();
        return(ale.nextInt(20));
    }
}