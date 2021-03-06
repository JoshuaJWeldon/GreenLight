package greenlight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleController extends DatabaseController{
	
	Connection connection;
	
	public OracleController(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String host     = "jdbc:oracle:thin:@greenlight.cjpqabmkiryt.us-west-2.rds.amazonaws.com:1521:ORCL";
		String user     = "root";
		String password = "StrongHtr&7";
		
		try{
	
			connection = DriverManager.getConnection(host,user,password);
		}
		catch(SQLException e){System.err.println("DatabaseControler.DatabaseControler could not connect to database");}
		
	}
	

	public boolean insert(String table, String[] columns, String[] values){
		
		String sql = "insert into " + table +" (id,";
		
		for(String column: columns)
			sql += column + ",";
		
		sql = sql.substring(0, sql.length() - 1) + ") values (users_id.nextval,";
		
		for(String value: values)
			sql += value + ",";
		
		sql = sql.substring(0, sql.length() - 1) + ")";
		
		try {
			connection.createStatement().execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//catch (SQLException e) {System.err.println("MySqlController.insert: error for \"" + sql + "\"");return false;}
		
		return true;
		
	}
}
