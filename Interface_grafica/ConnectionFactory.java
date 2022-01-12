import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		String url = "jdbc:filme:agenda;create=true";
		try {
		 return DriverManager.getConnection(url);
		 }
		 catch(SQLException excecao) {
		 throw new RuntimeException(excecao);
		 }
		 }
		public ConnectionFactory() {
		@SuppressWarnings("unused")
		Connection connection = new
			ConnectionFactory().getConnection();
			
} }

