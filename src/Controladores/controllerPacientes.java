
package Controladores;

import Modelos.Pacientes;
import Modelos.modeloPacientes;
import Modelos.modeloPacientesSegundo;
import Vistas.frmPacientes;
import Vistas.frmVistaMedico1;
import Vistas.frmVistaMedicos2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;


public class controllerPacientes implements ActionListener {
    
    frmPacientes VistaPacientes;
    frmVistaMedico1 VistaMedico1;
    frmVistaMedicos2 VistaMedico2;
    modeloPacientes ModeloPacientes;
    modeloPacientesSegundo ModeloPacientesSegundo;

    public controllerPacientes(frmPacientes VistaPacientes, frmVistaMedico1 VistaMedico1, frmVistaMedicos2 VistaMedico2, modeloPacientes ModeloPacientes, modeloPacientesSegundo ModeloPacientesSegundo) {
        this.VistaPacientes = VistaPacientes;
        this.VistaMedico1 = VistaMedico1;
        this.VistaMedico2 = VistaMedico2;
        this.ModeloPacientes = ModeloPacientes;
        this.ModeloPacientesSegundo = ModeloPacientesSegundo;
        
        this.VistaPacientes.btnAgregarMedicoPrimero.addActionListener(this);
        this.VistaPacientes.btnAgregarMedicoSegundo.addActionListener(this);
        this.VistaPacientes.btnListaMedicoPrimero.addActionListener(this);
        this.VistaPacientes.btnListaMedicoSegundo.addActionListener(this);
        
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPacientes.btnAgregarMedicoPrimero)
        {
            this.ModeloPacientes.MedicoPacientePrimero(this.VistaPacientes.txtApellido.getText(),
                    this.VistaPacientes.txtNombre.getText());
            
            Queue<Pacientes> listalocal = this.ModeloPacientes.ListarPacientes();
            
            String cadena = " ";
            for(Pacientes modeloPacientes: listalocal)
            {
                cadena = cadena + modeloPacientes.getApellido()+" "+modeloPacientes.getNombre()+"\n";
                this.VistaMedico1.txtListaMedicoPrimero.setText(cadena);   
            }
            this.VistaPacientes.txtApellido.setText(" ");
            this.VistaPacientes.txtNombre.setText(" "); 
        }
        
        if(e.getSource() == this.VistaPacientes.btnAgregarMedicoSegundo)
        {
            this.ModeloPacientesSegundo.MedicoPacienteSegundo(this.VistaPacientes.txtApellido.getText(),
                    this.VistaPacientes.txtNombre.getText());
            
            Queue<Pacientes> listalocal = this.ModeloPacientesSegundo.ListarPacientes();
            
            String cadena = " ";
            for(Pacientes modeloPacientes: listalocal)
            {
                cadena = cadena + modeloPacientes.getApellido()+" "+modeloPacientes.getNombre()+"\n";
                this.VistaMedico2.txtListaMedicoSegundo.setText(cadena);   
            }
            this.VistaPacientes.txtApellido.setText(" ");
            this.VistaPacientes.txtNombre.setText(" "); 
        }  
        
        if(e.getSource() == this.VistaPacientes.btnListaMedicoPrimero)
        {
            
            this.VistaMedico1.setLocationRelativeTo(null);
            this.VistaMedico1.setVisible(true);

        }
        
        if(e.getSource() == this.VistaPacientes.btnListaMedicoSegundo)
        {
            
            this.VistaMedico2.setLocationRelativeTo(null);
            this.VistaMedico2.setVisible(true);

        }
    }
}
