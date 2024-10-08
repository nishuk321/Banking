import java.sql.*;
public class conn {
	Connection c;
	Statement s;
conn()
{
	try {
		//Class.forName(com.mysql.cj.jdbc.Driver);
		c=DriverManager.getConnection("jdbc:mysql:///bankmanagmentsystem","root","Nishu803213@");
		s=c.createStatement();
	}
	catch(Exception e)
	{
		System.out.println();
	}
	
	
}
public static PreparedStatement prepareStatement(String query) {
	// TODO Auto-generated method stub
	return null;
}
}
