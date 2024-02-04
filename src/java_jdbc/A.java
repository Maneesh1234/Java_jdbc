package java_jdbc;
import java.sql.*;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name : ");
			String name =sc.next();
			System.out.println("Enter your email : ");
			String email=sc.next();
			
			//Connect to database 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Maneesh@123");
			//System.out.println(con);
			
			//Writing sql queries
			Statement stmt = con.createStatement();
			//stmt.executeUpdate("insert into registration values('sanu', 'sanu@gmail.com')");
			
			stmt.executeUpdate("insert into registration values('"+name+"', '"+email+"')");
			
			//stmt.executeUpdate("delete from registration where email= 'sanu@gmail.com'");
			
			//stmt.executeUpdate("update registration set name='Maneesh Kumar' where email= 'maneesh@gmail.com'");
			
//			ResultSet result = stmt.executeQuery("select * FROM registration ");
//			while (result.next()) {
//				System.out.print(result.getString(1)+" ");
//				System.out.print(result.getString(2));
//				System.out.println();
//			}
			
			//close the connection
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}	}
}
