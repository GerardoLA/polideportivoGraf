package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class InscripcionFormulario extends JDialog{
	private JPanel contentPane;
	private JTextField IdActividadText;
	private JTextField IdUsuarioText;
	private JTextField textField;
	JButton btnVerUsuarios;
	JButton btnEliminar;

	
	public JButton getBtnVerUsuarios() {
		return btnVerUsuarios;
	}



	public JButton getBtnEliminar() {
		return btnEliminar;
	}



	public InscripcionFormulario(JFrame padre,boolean modal ) {
		super(padre, modal);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 553, 364);
		 contentPane = new JPanel();
		 contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(56, 65, 46, 14);
		contentPane.add(lblId);
		
		IdActividadText = new JTextField();
		IdActividadText.setBounds(148, 62, 73, 20);
		contentPane.add(IdActividadText);
		IdActividadText.setColumns(10);
		
		JLabel lbIdUsuario = new JLabel("ID USUARIO :");
		lbIdUsuario.setBounds(56, 108, 73, 14);
		contentPane.add(lbIdUsuario);
		
		IdUsuarioText = new JTextField();
		IdUsuarioText.setBounds(148, 105, 73, 20);
		contentPane.add(IdUsuarioText);
		IdUsuarioText.setColumns(10);
		
		JLabel lblIdActividad = new JLabel("ID ACTIVIDAD:");
		lblIdActividad.setBounds(56, 155, 73, 14);
		contentPane.add(lblIdActividad);
		
		textField = new JTextField();
		textField.setBounds(148, 152, 73, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnVerUsuarios = new JButton("VER USUARIOS ");
		btnVerUsuarios.setBounds(373, 65, 121, 23);
		contentPane.add(btnVerUsuarios);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(373, 108, 89, 23);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.GRAY));
		scrollPane.setBounds(265, 165, 262, 149);
		contentPane.add(scrollPane);

}
}
