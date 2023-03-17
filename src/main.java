
import Controladores.controllerPacientes;
import Modelos.modeloPacientes;
import Vistas.frmPacientes;


public class main {


    public static void main(String[] args) {
        frmPacientes VistaListas = new frmPacientes(null, true);
        modeloPacientes modeloVistas = new modeloPacientes();
        controllerPacientes controladorLista = new controllerPacientes(VistaListas, modeloVistas);
    }
    
}
