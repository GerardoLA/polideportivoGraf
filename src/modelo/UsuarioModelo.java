package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.Conector;

public class UsuarioModelo extends Conector{
	PreparedStatement pst;
	
	public void insertarUsuario(Usuario usuario) {
		super.conectar();
		
		try {
			pst = con.prepareStatement("INSERT INTO usuarios (nombre_apellido,dni, codigo)VALUES(?,?,?)");
			
			pst.setString(1, usuario.getNombre_apellido());
			pst.setString(2, usuario.getDni());
			pst.setString(3, usuario.getCodigo());
			
			pst.execute();
			super.con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Usuario getUsuario(String dni) {
		super.conectar();
		Usuario usuario= new Usuario();
		try {
			pst= con.prepareStatement("SELECT * FROM usuarios WHERE dni =?");
			pst.setString(1, usuario.getDni());
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}return usuario;
		
	}
	
	
	

}
