package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;import javax.swing.JTextField;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.UsuarioFormulario;

public class ControladorUsuario implements ActionListener,MouseListener{
	private UsuarioFormulario usuarioForm;
	private UsuarioModelo usuarioMod;
	
	public ControladorUsuario(UsuarioFormulario usuarioFormulario) {
		usuarioForm = usuarioFormulario;
		usuarioForm.getBtnBuscar().addActionListener(this);
		usuarioForm.getBtnEliminar().addActionListener(this);
		usuarioForm.getBtnGuardar().addActionListener(this);
		usuarioForm.getBtnModificar().addActionListener(this);
	}
	
	public ControladorUsuario(UsuarioModelo usuarioMod, UsuarioFormulario usuarioForm) {
		this.usuarioForm=usuarioForm;
		this.usuarioMod=usuarioMod;
	}

	public void inicializar() {
		usuarioForm.setTitle("UsuarioFormulario");
		usuarioForm.setLocationRelativeTo(null);
		usuarioForm.setVisible(false);
		usuarioMod.conectar();
		
	
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == usuarioForm.getBtnBuscar()) {
			UsuarioModelo usuMod = new UsuarioModelo();
			
			Usuario usuario = usuMod.getUsuario(Integer.parseInt(usuarioForm.getIdUsuarioText().getText()));
//			usuarioForm.setNombreUsuarioText(JTextField);
//			DniUsuarioText.setText(usuario.getDni());
//			CodigoUsuarioText.setText(usuario.getCodigo());
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

