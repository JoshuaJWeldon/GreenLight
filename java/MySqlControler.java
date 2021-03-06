package greenlight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlControler extends DatabaseController{
	
	Connection connection;
	
	public MySqlControler(){
		
		String host     = "jdbc:mysql://173.194.252.106:3306";
		String user     = "root";
		String password = "StrongHtr&7";
		
		String sql = "use greenlight";
		
		try{
	
			connection = DriverManager.getConnection(host,user,password);
			connection.createStatement().executeQuery(sql);
		}
		catch(SQLException e){System.err.println("DatabaseControler.DatabaseControler could not connect to database");}
		
	}
	

	public boolean insert(String table, String[] columns, String[] values){
		
		String sql = "insert into " + table +" (";
		
		for(String column: columns)
			sql += column + ",";
		
		sql = sql.substring(0, sql.length() - 1) + ") values (";
		
		for(String value: values)
			sql += value + ",";
		
		sql = sql.substring(0, sql.length() - 1) + ")";
		
		try {connection.createStatement().execute(sql);} 
		catch (SQLException e) {System.err.println("MySqlController.insert: error for \"" + sql + "\"");return false;}
		
		return true;
		
	}
}
