import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FilmeDAO {
	public Connection conn;
	public FilmeDAO () {
		String url = "jdbc:derby:filme;create=true";
	try {
			 conn = DriverManager.getConnection(url);
			 System.out.println("conectado"); 	
		}catch(SQLException e) {
				 e.printStackTrace();
		}
	}
		public  void adicionaFilme(Filme f) {
			String sql = "INSERT INTO filme("+
					"nome,produtora, ano) VALUES(?,?, ?)";
			PreparedStatement stmt;
			 try {
				 stmt = conn.prepareStatement(sql);
				 stmt.setString(1, f.getNome());
				 stmt.setString(2, f.getProdutora());
				 stmt.setString(3, f.getAno());
				 stmt.execute();
				 stmt.close();
				 System.out.print("inserido");
			}catch (SQLException e) {
				e.printStackTrace();
				}
			 }
		 public List<Filme> recupera() {
			List<Filme> filmes = new LinkedList <Filme>();
			String sql = "select * from filme";
				 try {
					 PreparedStatement stmt =conn.prepareStatement(sql);
					 ResultSet rs = stmt.executeQuery();
			 while (rs.next()) {
				 	Filme filme = new Filme();
				 	filme.setNome(rs.getString("nome"));
				 	filme.setProdutora(rs.getString("produtora"));
				 	filme.setAno(rs.getString("ano"));
				 	filmes.add(filme);
			 }
			stmt.close();
			} catch (SQLException u) {
			 throw new RuntimeException(u);
	        }
				 return filmes;
				}
		 
}
