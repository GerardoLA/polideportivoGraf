package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import modelo.Usuario;
import modelo.UsuarioModelo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioFormulario extends JDialog{
	
	private JPanel contentPane;
	public JTextField IdUsuarioText;
	public JTextField NombreUsuarioText;
	public JTextField DniUsuarioText;
	public JTextField CodigoUsuarioText;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnGuardar;
	public JButton btnSalir;
	private JButton btnLimpiar;

	

	
	public UsuarioFormulario(JFrame padre,boolean modal ) {
		super(padre, modal);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 553, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(41, 57, 53, 21);
		contentPane.add(lblId);
		
		IdUsuarioText = new JTextField();
		IdUsuarioText.setBounds(161, 57, 130, 20);
		contentPane.add(IdUsuarioText);
		IdUsuarioText.setColumns(10);
		
		
		JLabel lblNombreApellido = new JLabel("Nombre_Apellido:");
		lblNombreApellido.setBounds(41, 109, 86, 27);
		contentPane.add(lblNombreApellido);
		
		NombreUsuarioText = new JTextField();
		NombreUsuarioText.setBounds(161, 106, 130, 20);
		contentPane.add(NombreUsuarioText);
		NombreUsuarioText.setColumns(10);
		
		
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(48, 163, 46, 14);
		contentPane.add(lblDni);
		
		DniUsuarioText = new JTextField();
		DniUsuarioText.setBounds(161, 160, 130, 20);
		contentPane.add(DniUsuarioText);
		DniUsuarioText.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(41, 216, 46, 22);
		contentPane.add(lblCodigo);
		
		CodigoUsuarioText = new JTextField();
		CodigoUsuarioText.setBounds(161, 217, 130, 20);
		contentPane.add(CodigoUsuarioText);
		CodigoUsuarioText.setColumns(10);
		
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(398, 56, 103, 23);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(398, 105, 103, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(398, 154, 103, 23);
		contentPane.add(btnEliminar);
		

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(401, 216, 89, 23);
		contentPane.add(btnGuardar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setBounds(184, 266, 89, 23);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NombreUsuarioText.setText("");
				DniUsuarioText.setText("");
				IdUsuarioText.setText("");
				CodigoUsuarioText.setText("");
			}
		});
		contentPane.add(btnLimpiar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
		}
		});
		btnSalir.setBounds(398, 277, 89, 23);
		contentPane.add(btnSalir);
	}
	
	
	
	public Usuario getDatosUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(Integer.parseInt(this.IdUsuarioText.getText()));
		usuario.setNombre_apellido(this.NombreUsuarioText.getText());
		usuario.setDni(this.DniUsuarioText.getText());
		usuario.setCodigo(this.CodigoUsuarioText.getText());
		
		return usuario;
	}



	public void setIdUsuarioText(JTextField idUsuarioText) {
		IdUsuarioText = idUsuarioText;
	}



	public void setNombreUsuarioText(JTextField nombreUsuarioText) {
		NombreUsuarioText = nombreUsuarioText;
	}



	public void setDniUsuarioText(JTextField dniUsuarioText) {
		DniUsuarioText = dniUsuarioText;
	}



	public void setCodigoUsuarioText(JTextField codigoUsuarioText) {
		CodigoUsuarioText = codigoUsuarioText;
	}
	
	public void meterDatos(Usuario usuario) {
		IdUsuarioText.setText(String.valueOf(usuario.getId()));
		NombreUsuarioText.setText(usuario.getNombre_apellido());
		DniUsuarioText.setText(usuario.getDni());
		CodigoUsuarioText.setText(usuario.getCodigo());
	}
	public void limpiar() {
		IdUsuarioText.setText("");
		NombreUsuarioText.setText("");
		DniUsuarioText.setText("");
		CodigoUsuarioText.setText("");
		}
	
}
