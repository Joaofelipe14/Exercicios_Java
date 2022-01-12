
public class Filme {
	public Filme () {
		
	}
	public Filme(String nome, String produtora, String ano) {
		super();
		this.nome = nome;
		this.produtora = produtora;
		this.ano = ano;
	}
	private String nome;
	private String produtora;
	private String ano;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", produtora=" + produtora + ", ano=" + ano + "]";
	}
}
