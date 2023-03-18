package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.InscripcionModelo;
import vista.InscripcionFormulario;

public class ControladorInscripcion implements ActionListener, MouseListener{
	private InscripcionFormulario formularioInscripcion;
	private InscripcionModelo inscripcionMod;
	
	
	public ControladorInscripcion(InscripcionModelo inscripcionMod,InscripcionFormulario formularioInscripcion) {
		
		this.formularioInscripcion=formularioInscripcion;
		this.inscripcionMod=inscripcionMod;}
	
	
	
	public void inicializar() {
		formularioInscripcion.setTitle("Formulario de inscripciones");
		formularioInscripcion.setLocationRelativeTo(null);
		formularioInscripcion.setVisible(false);
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
