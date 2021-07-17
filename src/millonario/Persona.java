package millonario;


/**
 *
 * @author PEREIRA
 * @author ACOSTA
 */
public class Persona {
    
   private String nombreapellido;
   private int cedula;

    public Persona() {
    }

    public Persona(String nombreapellido, int cedula) {
        this.nombreapellido = nombreapellido;
        this.cedula = cedula;
    }

    public String getNombreapellido() {
        return nombreapellido;
    }

    public void setNombreapellido(String nombreapellido) {
        this.nombreapellido = nombreapellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nombre y apellido : "+this.nombreapellido+
                "\nCedula : "+this.cedula;
                }
        
    }
