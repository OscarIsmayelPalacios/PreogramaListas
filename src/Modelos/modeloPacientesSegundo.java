
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
        JOptionPane.showMessageDialog(null, "Paciente Agregado Agregado A La Lista 2");
    }

     public Queue ListarPacientes ()
    {
        return this.ListaPacientes;
    }
     
    public void EliminarPaciente()
    {
        this.ListaPacientes.poll();
        
    }
}
