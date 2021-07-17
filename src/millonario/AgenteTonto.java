
package millonario;

import java.util.Random;

/**
 *@author JACKELINNE ACOSTA
 * @author PEREIRA
 */
public class AgenteTonto {
    String nombre="AGENTE AT";
    String cedula="12345678";

    public AgenteTonto() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
    
    public String respuestaDTparaMMR(){
        
        Random aleat=new Random();
        int valor,acum=0;
        String resp="";  
        boolean listo1=true,listo2=true,listo3=true,listo4=true;
        
        do{
        valor=aleat.nextInt(25);
        if( (valor==15)&&(listo1) ){ resp+="A"; acum++; listo1=false; }
        if( (valor==8)&&(listo2) ){ resp+="C"; acum++; listo2=false; }
        if( (valor==22)&&(listo3) ){ resp+="D"; acum++; listo3=false; }
        if( (valor==19)&&(listo4) ){ resp+="B"; acum++; listo4=false; }
        }while(acum<4);
        return resp;
    }
    
    public String respuestaDTparaQQSM(){
        
        Random aleat=new Random();
        int valor,acum=0,posible1=0,posible2=0,posible3=0,posible4=0;
        String resp1="",resp2="",resp3="",resp4="";  
        
        do{
        valor=aleat.nextInt(25);
        if(valor==12){ resp1="A"; acum++; posible1++; }
        if(valor==8){ resp2="C"; acum++; posible2++; }
        if(valor==22){ resp3="D"; acum++; posible3++; }
        if(valor==19){ resp4="B"; acum++; posible4++; }
        }while(acum<300);
        
        if((posible1>posible2)&&(posible1>posible3)&&(posible1>posible4))
        {  return resp1;  }
        if((posible2>posible1)&&(posible2>posible3)&&(posible2>posible4))
        {  return resp2; }
        if((posible3>posible1)&&(posible3>posible2)&&(posible3>posible4))
        {  return resp3; }
        if((posible4>posible1)&&(posible4>posible2)&&(posible4>posible3))
        {  return resp4; }
        
        return "B";
    }

    @Override
    public String toString() {return "Nombre y apellido : "+this.nombre+
                "\nCedula : "+this.cedula;
                }
    
    
    
}
