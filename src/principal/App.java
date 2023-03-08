package principal;

import controlador.ControladorPrincipal;
import vista.Principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal frmPrincipal = new Principal();
		ControladorPrincipal principalContr= new ControladorPrincipal(frmPrincipal);
		principalContr.inicializar();
		frmPrincipal.setVisible(true);

	}

}
