package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.UsuarioModelo;
import vista.Principal;
import vista.UsuarioFormulario;

public class ControladorPrincipal implements ActionListener{
	private Principal frmPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		frmPrincipal = principal;
		frmPrincipal.btnUsuarios.addActionListener(this);
		frmPrincipal.btnActividades.addActionListener(this);
		frmPrincipal.btnInscripciones.addActionListener(this);
	}
	
	public void inicializar() {
		frmPrincipal.setTitle("Desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frmPrincipal.btnUsuarios) {
			vista.UsuarioFormulario usuarioForm = new UsuarioFormulario(frmPrincipal,true);
			UsuarioModelo usuarioMod = new UsuarioModelo();
			ControladorUsuario usuarioContr = new ControladorUsuario(usuarioMod,usuarioForm);
			usuarioContr.inicializar();
			usuarioForm.setVisible(true);
		}
		
	}



	

	
	
	
}
