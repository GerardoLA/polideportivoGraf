package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActividadFormulario extends JDialog{
	private JPanel contentPane;
	public JTextField IdText;
	public JTextField NombreText;
	public JTextField FechaInicioText;
	public JTextField DiasText;
	public JTextField MaxParticText;
	public JTextField PrecioText;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnEliminar;
	private JButton btnSalir;
	
	public ActividadFormulario(JFrame padre,boolean modal ) {
		super(padre, modal);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 553, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(45, 34, 46, 14);
		contentPane.add(lblId);
		
		IdText = new JTextField();
		IdText.setBounds(163, 31, 164, 20);
		contentPane.add(IdText);
		IdText.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(45, 73, 56, 14);
		contentPane.add(lblNombre);
		
		NombreText = new JTextField();
		NombreText.setBounds(163, 70, 164, 20);
		contentPane.add(NombreText);
		NombreText.setColumns(10);
		
		JLabel lblFeInicio = new JLabel("Fecha_inicio:");
		lblFeInicio.setBounds(45, 117, 68, 14);
		contentPane.add(lblFeInicio);
		
		FechaInicioText = new JTextField();
		FechaInicioText.setBounds(163, 114, 164, 20);
		contentPane.add(FechaInicioText);
		FechaInicioText.setColumns(10);
		
		JLabel lblDiasSemana = new JLabel("DiasSemana:");
		lblDiasSemana.setBounds(45, 160, 68, 14);
		contentPane.add(lblDiasSemana);
		
		DiasText = new JTextField();
		DiasText.setBounds(163, 157, 164, 20);
		contentPane.add(DiasText);
		DiasText.setColumns(10);
		
		JLabel lblMaxPartic = new JLabel("MaxPartic:");
		lblMaxPartic.setBounds(45, 204, 68, 17);
		contentPane.add(lblMaxPartic);
		
		MaxParticText = new JTextField();
		MaxParticText.setBounds(163, 201, 156, 20);
		contentPane.add(MaxParticText);
		MaxParticText.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(45, 245, 46, 14);
		contentPane.add(lblPrecio);
		
		PrecioText = new JTextField();
		PrecioText.setBounds(163, 242, 156, 20);
		contentPane.add(PrecioText);
		PrecioText.setColumns(10);
		
		btnBuscar = new JButton("BUSCAR/CARGAR");
		btnBuscar.setBounds(375, 69, 119, 23);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(375, 141, 119, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(375, 216, 119, 23);
		contentPane.add(btnEliminar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnSalir.setBounds(375, 268, 89, 23);
		contentPane.add(btnSalir);
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	
	public JButton getBtnModificar() {
		return btnModificar;
	}

	

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	
}
