
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class modeloPacientes {
    
    Queue<Pacientes>  ListaPacientes = new LinkedList();
     
     public void MedicoPacientePrimero(String Apellido, String Nombre)
    {
        Pacientes newPaciente = new Pacientes(Apellido, Nombre);
        this.ListaPacientes.add(newPaciente);
    }
     
    public Queue ListarPacientes ()
    {
        return this.ListaPacientes;
    }
     
    public void EliminarPaciente()
    {

        this.ListarPacientes().poll();

    }
            
}
