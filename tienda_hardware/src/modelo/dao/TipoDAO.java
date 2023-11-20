package modelo.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import modelo.data.Tipo;
import modelo.data.nombre_tipo;

public class TipoDAO {

	private static Connection connection;
	
	public static void insertarUnTipo(Tipo tipo) {
		Conexion con =new Conexion();
		
		connection=con.getJdbcConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "insert into tipo(NOMBRE_TIPO2) values('"+tipo.getNOMBRE()+"')";
			
			boolean rowInserted=statement.executeUpdate(sql) > 0;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static boolean deleteTipo(int id) {
		
		Conexion con= new Conexion();
		
		boolean rowDeleted=false;
		
		connection=con.getJdbcConnection();
		
		try {
			Statement statement= connection.createStatement();
			
			String sql="delete from marcar where ID_tipo"+id;
			rowDeleted=statement.executeUpdate(sql) > 0;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowDeleted;
		
				}
	
	
	public static List<Tipo> seleccionarMarcas(){
		List<Tipo> Tipos= new ArrayList<Tipo>();
		ResultSet rs;
		Conexion con =new Conexion();
		connection= con.getJdbcConnection();	
		try {
			Statement statement = connection.createStatement();
		    String sql= "select ID_tipo, NOMBRE_TIPO2 from marcas";
			rs=statement.executeQuery(sql);
			while(rs.next()) {
				
				Tipos.add(new Tipo(rs.getInt(1), rs.getString("NOMBRE_TIPO2")));
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
		return Tipos;
	}
	
	
	public static int isTipoInBD(nombre_tipo nombre) {
		
		List <Tipo> Tipos=new ArrayList<Tipo>();
		
		ResultSet rs;
		
		int ID_tipo=0;
		
		Conexion con= new Conexion();
		connection=con.getJdbcConnection();
		
		Statement statement= connection.createStatement();
		String sql= "select ID_tipo from tipo where NOMBRE_TIPO2= '"+nombre+"'";
		
		rs=statement.executeQuery(sql);
		if(rs.next()) {
			ID_tipo=rs.getInt(1);
		}
		
		return ID_tipo;
		
	}
}
