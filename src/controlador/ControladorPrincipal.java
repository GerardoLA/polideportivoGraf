package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ActividadModelo;
import modelo.InscripcionModelo;
import modelo.UsuarioModelo;
import vista.ActividadFormulario;
import vista.InscripcionFormulario;
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
			
		}if(e.getSource() == frmPrincipal.btnActividades){
			vista.ActividadFormulario actForm = new ActividadFormulario(frmPrincipal,true);
			ActividadModelo actividadMod = new ActividadModelo();
			ControladorActividad actContr = new ControladorActividad(actividadMod,actForm);
			actContr.inicializar();
			actForm.setVisible(true);
			
		}if(e.getSource() ==frmPrincipal.btnInscripciones) {
			vista.InscripcionFormulario insForm = new InscripcionFormulario(frmPrincipal,true);
			InscripcionModelo inscripcionMod = new InscripcionModelo();
			ControladorInscripcion insContr = new ControladorInscripcion(inscripcionMod,insForm);
			insContr.inicializar();
			insForm.setVisible(true);
		}
		
	}
	
	



	

	
	
	
}
