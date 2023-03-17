
package Modelos;


public class Pacientes {
   
     String Apellido;
     String Nombre;

    public Pacientes(String Apellido, String Nombre) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
