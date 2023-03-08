package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.InscripcionModelo;
import vista.InscripcionFormulario;

public class ControladorInscripcion implements ActionListener, MouseListener{
	private InscripcionFormulario inscripcionForm;
	private InscripcionModelo inscripcionMod;
	
	public ControladorInscripcion(InscripcionFormulario inscripcionFormulario) {
	inscripcionForm = inscripcionFormulario;
	inscripcionFormulario.getBtnEliminar().addActionListener(this);
	inscripcionFormulario.getBtnVerUsuarios().addActionListener(this);
	}
	
	public ControladorInscripcion(InscripcionModelo inscripcionMod,InscripcionFormulario inscripcionForm) {
		
		this.inscripcionForm=inscripcionForm;
		this.inscripcionMod=inscripcionMod;}
	
	
	
	public void inicializar() {
		inscripcionForm.setTitle("Formulario de inscripciones");
		inscripcionForm.setLocationRelativeTo(null);
		inscripcionForm.setVisible(false);
		}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
