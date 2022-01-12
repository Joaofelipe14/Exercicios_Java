import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Teste{
	public static Connection conn;
	public static void createTable() {
		String sql = "CREATE TABLE filme( " +
			 "produtora varchar(30), ano varchar(30), " +
			 "nome varchar(30) )";
		PreparedStatement stmt;
		try {
				 stmt= conn.prepareStatement(sql);
				 stmt.execute();
				 stmt.close();
	}   catch (SQLException e) {
			 e.printStackTrace(); // caso ja tenha criado, cai aqui
} }
		public static void main(String []args) {
			FilmeDAO dao = new FilmeDAO();
			//dao.adicionaFilme(new Filme ("Velozes e furiosos 9", "Universal", "2020"));
			List<Filme> filmes = dao.recupera();
			for (Filme filme : filmes) {
			System.out.println(filme); }	
			
	}
	/*public static void insereFilme() {
		String sql = "INSERT INTO filme(nome,produtora, ano) VALUES(?,?, ?)";
		PreparedStatement stmt;
		 try {
			 stmt = conn.prepareStatement(sql);
			 stmt.setString(1, "VINGADORES");
			 stmt.setString(2, "MARVEL");
			 stmt.setString(3, "2000");
			 stmt.execute();
			 stmt.close();
			 System.out.print("inserido");
		}catch (SQLException e) {
			e.printStackTrace();
		 }
	}*/
	/*public static void printFilme() {
		String sql = "select * from filme";
		 try {
			 PreparedStatement stmt =conn.prepareStatement(sql);
			 ResultSet rs = stmt.executeQuery();
		 while (rs.next()) {
			 System.out.println("Nome:"+rs.getString("nome"));
			 System.out.println("Produtora:"+rs.getString("produtora"));
			 System.out.println("Ano:"+rs.getString("ano"));
 }
		 stmt.close();
		 } catch (SQLException u) {
			 throw new RuntimeException(u);
			 }
	}

		/*String url = "jdbc:derby:filme;create=true";
		
		try {
		 conn = DriverManager.getConnection(url);
		 System.out.println("conectado");
		 	//createTable();
			//insereFilme();
		 	printFilme(); 	
		}catch(SQLException e) {
			 e.printStackTrace();
		 }*/
}
