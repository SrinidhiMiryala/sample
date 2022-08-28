package DatabaseConnection;


	import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
	import java.sql.Statement;

	public class Select {
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jnit";
			String username="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,username,password);
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from wipro");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("salary")+" "+rs.getString("branch")+" ");
			}
			
} 
	}