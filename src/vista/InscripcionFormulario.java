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
	public JPanel contentPane;
	public JTextField IdActividadText;
	public JTextField IdUsuarioText;
	public JTextField IdActividadtextField;
	JButton btnVerUsuarios;
	JButton btnEliminar;




	public InscripcionFormulario(JFrame padre,boolean modal ) {
		super(padre, modal);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 553, 364);
		 contentPane = new JPanel();
		 contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdInscripcion = new JLabel("ID INSCRIPCION:");
		lblIdInscripcion.setBounds(56, 65, 85, 14);
		contentPane.add(lblIdInscripcion);
		
		IdActividadText = new JTextField();
		IdActividadText.setBounds(160, 62, 73, 20);
		contentPane.add(IdActividadText);
		IdActividadText.setColumns(10);
		
		JLabel lbIdUsuario = new JLabel("ID USUARIO :");
		lbIdUsuario.setBounds(56, 108, 73, 14);
		contentPane.add(lbIdUsuario);
		
		IdUsuarioText = new JTextField();
		IdUsuarioText.setBounds(160, 105, 73, 20);
		contentPane.add(IdUsuarioText);
		IdUsuarioText.setColumns(10);
		
		JLabel lblIdActividad = new JLabel("ID ACTIVIDAD:");
		lblIdActividad.setBounds(56, 155, 73, 14);
		contentPane.add(lblIdActividad);
		
		IdActividadtextField = new JTextField();
		IdActividadtextField.setBounds(160, 152, 73, 20);
		contentPane.add(IdActividadtextField);
		IdActividadtextField.setColumns(10);
		
		btnVerUsuarios = new JButton("VER USUARIOS ");
		btnVerUsuarios.setBounds(288, 61, 121, 23);
		contentPane.add(btnVerUsuarios);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(288, 104, 89, 23);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(Color.GRAY));
		scrollPane.setBounds(265, 165, 262, 149);
		contentPane.add(scrollPane);

}
}
