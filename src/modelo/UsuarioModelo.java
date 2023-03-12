package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.Conector;

public class UsuarioModelo extends Conector{
	PreparedStatement pst;
	
	public boolean insertarUsuario(Usuario usuario) {
		super.conectar();
		
		try {
			pst = con.prepareStatement("INSERT INTO usuarios (nombre_apellido,dni, codigo)VALUES(?,?,?)");
			
			pst.setString(1, usuario.getNombre_apellido());
			pst.setString(2, usuario.getDni());
			pst.setString(3, usuario.getCodigo());
			
			pst.execute();
			super.cerrar();
			return true;
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
		
		
			
		}public boolean modificar( Usuario usuario) {
			super.conectar();
			try {
				pst = con.prepareStatement ("UPDATE usuarios SET nombre_apellido=?, dni=?,codigo=? WHERE id=?");
				pst.setString(1, usuario.getNombre_apellido());
				pst.setString(2, usuario.getDni());
				pst.setString(3, usuario.getCodigo());
				pst.setInt(4, usuario.getId());
				pst.execute();
				super.cerrar();
				return true;
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		
	}
		
		public boolean eliminar (Usuario usuario) {
			super.conectar();
			try {
				pst=con.prepareStatement("DELETE  from usuarios where id=?");
				pst.setInt(1, usuario.getId());
				pst.execute();
				super.cerrar();
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return false;
		}
	
	public Usuario getUsuario(int id) {
		super.conectar();
		Usuario usuario= new Usuario();
		try {
			pst= con.prepareStatement("SELECT * FROM usuarios WHERE id =?");
			pst.setInt(1, usuario.getId());
			ResultSet resultado = pst.executeQuery();
			resultado.next();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre_apellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));
			super.cerrar();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}return usuario;
		
	}
	
	
	

}
