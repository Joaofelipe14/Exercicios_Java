import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Finaliza implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 System.exit(1);
	}}
public class SwingOla {
		private static JTextField txtNome;
		private static JTextField txtProdutora;
		private static JTextField txtAno;
	
	    public static void main(String[] args) {
	    	JFrame frame = new JFrame ();
	    	JPanel panNome = new JPanel ();
	    	panNome.setLayout(new FlowLayout());
	    	panNome.add(new JLabel("Nome:"));
	    	txtNome = new JTextField (20);
	    	panNome.add(txtNome);
	    	JPanel panProdutora = new JPanel();
	    	panProdutora.add(new JLabel("Produtora:"));
	    	 txtProdutora = new JTextField (18);
	    	panProdutora.add(txtProdutora);
	    	JPanel panAno = new JPanel();
	    	panAno.add(new JLabel("Ano:"));
	    	txtAno = new JTextField (21);
	    	panAno.add(txtAno);	
	    	frame.setLayout(new FlowLayout());
	    	frame.setSize (300,200);
	    	frame.add(panNome);
	    	frame.add(panProdutora);
	    	frame.add(panAno);
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setVisible(true);
	    	JButton btcadastrar = new JButton ("Cadastar");
	    	btcadastrar.addActionListener((e) -> cadastrar());
	    	frame.setLayout(new FlowLayout());
	    	frame.add(btcadastrar);
	    	JButton btFechar = new JButton ("Sair");
	    	btFechar.addActionListener(new Finaliza());
	    	frame.add(btFechar);
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	frame.setVisible(true);
	    	cadastrar();
	    	
	    }
	   private static void cadastrar () {
		   System.out.println(txtNome.getText());
		   System.out.println(txtProdutora.getText());
		   System.out.println(txtAno.getText());
	   }
}


