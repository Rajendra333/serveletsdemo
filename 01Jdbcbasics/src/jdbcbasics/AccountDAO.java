package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
	
		
		try( Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Raja@4290");
			Statement statment=connection.createStatement();
			ResultSet rs=statment.executeQuery("select * from account");){
			
		while(rs.next()) {
		int accountno=rs.getInt(1);
		String firstname=rs.getString(2);
		String lastname=rs.getString(3);
		int bal=rs.getInt(4);
		
		System.out.println(accountno+"|"+firstname+"|"+lastname+"|"+bal);
				}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
			
		}
	}

}
