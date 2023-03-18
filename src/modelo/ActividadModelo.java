package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public boolean modificar (Actividad actividad) {
		super.conectar();
		try {
			pst=con.prepareStatement("UPDATE actividades set nombre=?,fecha_inicio=?,dias_semana=?,horas=?,max_participantes=?,precio=? where id=?");
			pst.setString(1, actividad.getNombre());
			pst.setDate(2,new Date(actividad.getFecha_inicio().getTime()));
			pst.setString(3, actividad.getDias_semana());
			pst.setInt(4, actividad.getHoras());
			pst.setInt(5, actividad.getMax_participantes());
			pst.setDouble(6, actividad.getPrecio());
			pst.setInt(7, actividad.getId());
			pst.execute();
			super.cerrar();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pst.setDate(3, new Date(prestamo.getFecha().getTime())
		
		return false;
	}
	public boolean eliminar(Actividad actividad) {
		super.conectar();
		try {
			pst=con.prepareStatement("DELETE from actividades where id=?");
			pst.setInt(1, actividad.getId());
			pst.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
		
	public Actividad getActividad(int id) {
		super.conectar();
		Actividad actividad=new Actividad();
		try {
			pst= con.prepareStatement("SELECT* FROM actividades where id=?");
			pst.setInt(1, id);
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			actividad.setId(resultado.getInt("id"));
			actividad.setNombre(resultado.getString("nombre"));
			actividad.setFecha_inicio(resultado.getDate("fecha_inicio"));
			actividad.setDias_semana(resultado.getString("dias_semana"));
			actividad.setHoras(resultado.getInt("horas"));
			actividad.setMax_participantes(resultado.getInt("max_participantes"));
			actividad.setPrecio(resultado.getDouble("precio"));
			super.cerrar();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return actividad;
	}
}
