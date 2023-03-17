
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class modeloPacientes {
    
     Queue<Pacientes>  ListaPacientes = new LinkedList();
     
     public void MedicoPaciente1(String Apellido, String Nombre)
    {
        Pacientes nuevoCliente = new Pacientes(Apellido, Nombre);
        this.ListaPacientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado Agregado A La Lista 1");
    }
     
    public void MedicoPaciente2(String Apellido, String Nombre)
    {
        Pacientes nuevoCliente = new Pacientes(Apellido, Nombre);
        this.ListaPacientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado Agregado A La Lista 2");
    }
     
     public Queue ListarPacientes ()
    {
        return this.ListaPacientes;
    }
     
}
