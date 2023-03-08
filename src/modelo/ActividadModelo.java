package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import controlador.Conector;

public class ActividadModelo extends Conector{
	PreparedStatement pst;
	
	public void modificarDias_semana(int id, String dias_semana) {
		super.conectar();
		try {
			pst = con.prepareStatement("UPDATE actividades SET dias_semana=? where id=?");
			pst.setString(1, dias_semana);
			pst.setInt(2, id);
			pst.executeUpdate();
			
			super.con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
