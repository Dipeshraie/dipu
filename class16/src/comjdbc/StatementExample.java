package comjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver="com.mysql.cj.jdbc.Driver";
	String dbUrl="jdbc:mysql://localhost:3308/mydb";
	String username="root";
	String password="root";
	Class.forName(driver);
	Product=new Product("mug","china","coffee mug",450.22,true);
	Connection con=DriverManager.getConnection(dbUrl,username,password);
	System.out.println("Connected to the database.....");
	String query ="insert into product (name,manufacturer,description,price,instock)"+
	"values('fan','Usha','ceiling fan',2300.99,false)";
	String query="insert into product (name,manufacturer,description,price,instock)"+
	"values('"+p.name
	+"','"+p.manufacurer
	+"','"+p.descripion
	+"','"+p.price
	+"','"+p.instock")";
	System.out.println(query);
	
	Statement stm=con.createStatement();
	stm.executeUpdate(query);
	con.close();
}

}
