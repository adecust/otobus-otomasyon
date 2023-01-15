
package proje;

import java.sql.*;

public class Connect {
    
    ResultSet result = null;
	Connection conn=null;
	public Connect() {}
	
	public Connection connDb() {
		try {
			conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projeveri","root","");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	} 
}
