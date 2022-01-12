import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrameTable extends JFrame {
	public FrameTable() {
		super("Filmes");
		ContatoDAO dao = new ContatoDAO();
		FilmeTableModel  tableModel = new FilmeTableModel(DAO);
		JTable table = new JTable (tableModel);
		JScrollPane scroll= new JScrollPane();
		scroll.setViewportView(table);
		add(table);
		setSize(300,250);
	}

}
