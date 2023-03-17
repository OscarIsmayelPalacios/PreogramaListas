
package Controladores;

import Modelos.Pacientes;
import Modelos.modeloPacientes;
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
    

    public controllerPacientes(frmPacientes VistaPacientes, modeloPacientes ModeloPacientes) {
        this.VistaPacientes = VistaPacientes;
        this.ModeloPacientes = ModeloPacientes;
        
        this.VistaPacientes.btnAgregarMedico1.addActionListener(this);
        this.VistaPacientes.btnAgregarMedico2.addActionListener(this);
        this.VistaPacientes.btnListaMedico1.addActionListener(this);
        this.VistaPacientes.btnListaMedico2.addActionListener(this);
        
        this.VistaPacientes.setLocationRelativeTo(null);
        this.VistaPacientes.setVisible(true);
        
   
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPacientes.btnAgregarMedico1)
        {
            this.ModeloPacientes.MedicoPaciente1(this.VistaPacientes.txtApellido.getText(),
                    this.VistaPacientes.txtNombre.getText());
            
            Queue<Pacientes> listalocal = this.ModeloPacientes.ListarPacientes();
            
            String cadena = " ";
            for(Pacientes modeloPacientes: listalocal)
            {
                cadena = cadena + modeloPacientes.getApellido()+" "+modeloPacientes.getNombre()+"\n";
                this.VistaMedico1.txtListaMedico1.setText(cadena);   
            }
        }
        
        if(e.getSource() == this.VistaPacientes.btnAgregarMedico2)
        {
            this.ModeloPacientes.MedicoPaciente2(this.VistaPacientes.txtApellido.getText(),
                    this.VistaPacientes.txtNombre.getText());
            
            Queue<Pacientes> listalocal = this.ModeloPacientes.ListarPacientes();
            
            String cadena = " ";
            for(Pacientes modeloPacientes: listalocal)
            {
                cadena = cadena + modeloPacientes.getApellido()+" "+modeloPacientes.getNombre()+"\n";
                this.VistaMedico2.txtListaMedico2.setText(cadena);   
            }
        }   
    }
}
