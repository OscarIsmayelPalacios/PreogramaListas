
import Controladores.controllerPacientes;
import Modelos.modeloPacientes;
import Modelos.modeloPacientesSegundo;
import Vistas.frmPacientes;
import Vistas.frmVistaMedico1;
import Vistas.frmVistaMedicos2;


public class main {


    public static void main(String[] args) {
        frmPacientes VistaPacientes = new frmPacientes(null, true);
        frmVistaMedico1 VistaMedico1 = new frmVistaMedico1(null, true);
        frmVistaMedicos2 VistaMedico2 = new frmVistaMedicos2(null, true);
        modeloPacientes modeloVistas = new modeloPacientes();
        modeloPacientesSegundo modeloSegundoVistas = new modeloPacientesSegundo();
        
        controllerPacientes controladorLista = new controllerPacientes(VistaPacientes, VistaMedico1, VistaMedico2,
                modeloVistas, modeloSegundoVistas);
    }
    
}
