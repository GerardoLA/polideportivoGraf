package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Usuario;
import modelo.UsuarioModelo;
import vista.UsuarioFormulario;

public class ControladorUsuario implements ActionListener,MouseListener{
	private vista.UsuarioFormulario usuarioForm;
	private UsuarioModelo usuarioMod;
	
//	public ControladorUsuario(UsuarioFormulario usuarioFormulario) {
//		usuarioForm = usuarioFormulario;
//		
////		usuarioForm.getBtnEliminar().addActionListener(this);
////		usuarioForm.getBtnGuardar().addActionListener(this);
////		usuarioForm.getBtnModificar().addActionListener(this);
//	}
	
	public ControladorUsuario(UsuarioModelo usuarioMod, UsuarioFormulario usuarioForm) {
		this.usuarioMod = usuarioMod;
		this.usuarioForm = usuarioForm;
		
		this.usuarioForm.btnBuscar.addActionListener(this);
		this.usuarioForm.btnModificar.addActionListener(this);
		this.usuarioForm.btnGuardar.addActionListener(this);
		this.usuarioForm.btnEliminar.addActionListener(this);
	}

	public void inicializar() {
		usuarioForm.setTitle("UsuarioFormulario");
		usuarioForm.setLocationRelativeTo(null);
		usuarioForm.setVisible(false);
		usuarioMod.conectar();
		
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == usuarioForm.btnGuardar) {
			
			Usuario usuario =usuarioForm.getDatosUsuario();
			usuarioMod.conectar();
			if(usuarioMod.insertarUsuario(usuario)) {
				JOptionPane.showMessageDialog(usuarioForm, "Usuario Guardado", "ok",JOptionPane.INFORMATION_MESSAGE);
				usuarioForm.limpiar();	
			}else {
				JOptionPane.showMessageDialog(usuarioForm, "Error en el registro","Error",JOptionPane.INFORMATION_MESSAGE);
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

