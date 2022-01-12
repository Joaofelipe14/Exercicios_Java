import java.util.List;

import javax.swing.table.AbstractTableModel;

public class FilmeTableModel extends AbstractTableModel {
	FilmeDAO dao;
	List<Filme> Filmes;
	List<String> colunas;
	
	
	public FilmeTableModel(FilmeDAO dao) {
		this.dao = dao;
		filmes = dao.recupera();
		colunas = List.of("Nome","Produtora", "Ano");
		
	}
	@Override
	public int getRowCount() {
		return filmes.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Filme filme = filmes.get(rowIndex);
		switch (columnIndex) {
		case 0: return filme.GetNome();
		case 1: return filme.GetProdutora();
		case 2: return filme.GetAno();
		}
		return null;
	}
}
