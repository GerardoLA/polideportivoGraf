package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.ActividadModelo;
import vista.ActividadFormulario;

public class ControladorActividad implements ActionListener,MouseListener{
	private ActividadFormulario actividadForm;
	private ActividadModelo actividadMod;
	
	public ControladorActividad(ActividadFormulario actividadFormulario) {
		
		actividadForm = actividadFormulario;
		actividadFormulario.getBtnBuscar().addActionListener(this);
		actividadFormulario.getBtnEliminar().addActionListener(this);
		actividadFormulario.getBtnModificar().addActionListener(this);
	}
	
	public ControladorActividad(ActividadModelo actividadMod,ActividadFormulario actividadForm) {
		this.actividadForm =actividadForm;
		this.actividadMod=actividadMod;
	}
	
	public void inicializar() {
		actividadForm.setTitle("FormularioActividad");
		actividadForm.setLocationRelativeTo(null);
		actividadForm.setVisible(false);
		actividadMod.conectar();
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
