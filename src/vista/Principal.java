package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame{
	
	private JPanel contentPane;
	public JButton btnUsuarios;
	public JButton btnActividades;
	public JButton btnInscripciones;
	
	
	
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnUsuarios = new JButton("GESTOR USUARIOS");
		btnUsuarios.setBounds(157, 64, 176, 23);
		getContentPane().add(btnUsuarios);
		contentPane.add(btnUsuarios);
		
		btnActividades = new JButton("GESTOR ACTIVIDADES");
		btnActividades.setBounds(157, 141, 176, 23);
		getContentPane().add(btnActividades);
		contentPane.add(btnActividades);
		
		btnInscripciones = new JButton("GESTOR INSCRIPCIONES");
		btnInscripciones.setBounds(157, 228, 176, 23);
		getContentPane().add(btnInscripciones);
		contentPane.add(btnInscripciones);
		
	
	

}



	public JButton getBtnUsuarios() {
		return btnUsuarios;
	}



	public JButton getBtnActividades() {
		return btnActividades;
	}



	public JButton getBtnInscripciones() {
		return btnInscripciones;
	}



	
}