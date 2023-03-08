package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.Conector;

public class InscripcionModelo extends Conector{
	PreparedStatement pst;
	
	public void eliminarUsuario(int id_actividad,int id_usuario) {
		super.conectar();
		try {
			pst = con.prepareStatement("DELETE from inscripciones WHERE id_actividad=? and id_usuario=?");
			pst.setInt(1, id_actividad);
			pst.setInt(2, id_usuario);
			pst.execute();
			
			System.out.println("Usuario eliminado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
	

