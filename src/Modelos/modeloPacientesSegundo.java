
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class modeloPacientesSegundo {
    
    Queue<Pacientes>  ListaPacientes = new LinkedList();

         public void MedicoPacienteSegundo(String Apellido, String Nombre)
    {
        Pacientes nuevoPaciente = new Pacientes(Apellido, Nombre);
        this.ListaPacientes.add(nuevoPaciente);
        
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
