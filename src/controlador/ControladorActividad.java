package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import modelo.Actividad;
import modelo.ActividadModelo;
import vista.ActividadFormulario;

public class ControladorActividad implements ActionListener,MouseListener{
	private ActividadFormulario actividadForm;
	private ActividadModelo actividadMod;
	
	
	
	public ControladorActividad(ActividadModelo actividadMod,ActividadFormulario actividadForm) {
		this.actividadForm =actividadForm;
		this.actividadMod=actividadMod;
		
		this.actividadForm.btnBuscar.addActionListener(this);
		this.actividadForm.btnModificar.addActionListener(this);
		this.actividadForm.btnEliminar.addActionListener(this);
		
	}
	
	public void inicializar() {
		actividadForm.setTitle("FormularioActividad");
		actividadForm.setLocationRelativeTo(null);
		actividadForm.setVisible(false);
		actividadMod.conectar();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == actividadForm.btnBuscar) {
			int id = Integer.parseInt(actividadForm.IdText.getText());
			actividadMod.conectar();
			Actividad actividad = actividadMod.getActividad(id);
			if(actividad != null) {
				actividadForm.meterDatos(actividad);
				
			}else {
				JOptionPane.showMessageDialog(actividadForm, "Error en la busqueda..no existe","Error",JOptionPane.ERROR_MESSAGE);
			}actividadMod.cerrar();
		}if(e.getSource() == actividadForm.btnModificar) {
			Actividad actividad = actividadForm.getDatosActividad();
			if(actividadMod.modificar(actividad)) {
				JOptionPane.showMessageDialog(actividadForm, "Actividad modificada","ok",JOptionPane.INFORMATION_MESSAGE);
				actividadForm.limpiar();
			}else {
				JOptionPane.showMessageDialog(actividadForm, "Error al modificar","Error",JOptionPane.ERROR_MESSAGE);
			}actividadMod.cerrar();
			
		}if(e.getSource() == actividadForm.btnEliminar) {
		Actividad actividad=actividadForm.getDatosActividad();
		if(actividadMod.eliminar(actividad)) {
			JOptionPane.showMessageDialog(actividadForm, "Actividad eliminada","ok",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(actividadForm, "Fallo en la eliminacion","Error",JOptionPane.ERROR_MESSAGE);
		}
		}
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

	

}
