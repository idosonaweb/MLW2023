import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMercadoria;
	private JTextField txtCompra;
	private JTextField txtVenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste6 frame = new Teste6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMercadoria = new JLabel("Mercadoria");
		lblMercadoria.setBounds(174, 31, 53, 14);
		
		txtMercadoria = new JTextField();
		txtMercadoria.setBounds(156, 51, 86, 20);
		txtMercadoria.setColumns(10);
		
		JLabel lblPreoCompra = new JLabel("Pre\u00E7o Compra");
		lblPreoCompra.setBounds(165, 89, 67, 14);
		
		txtCompra = new JTextField();
		txtCompra.setBounds(156, 109, 86, 20);
		txtCompra.setColumns(10);
		
		JLabel lblPreoVenda = new JLabel("Pre\u00E7o Venda");
		lblPreoVenda.setBounds(166, 140, 60, 14);
		
		txtVenda = new JTextField();
		txtVenda.setBounds(156, 160, 86, 20);
		txtVenda.setColumns(10);
		
		JButton btnLucroprejuzo = new JButton("Lucro/Preju\u00EDzo");
		btnLucroprejuzo.setBounds(144, 222, 113, 23);
		btnLucroprejuzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Num_Compra, Num_Venda, Calculo ;
				
				Num_Compra = Integer.parseInt(txtCompra.getText());
				
				Num_Venda = Integer.parseInt(txtVenda.getText());
				
				Calculo = Num_Venda - Num_Compra ;
				
				if(Calculo < 0)
				{
					JOptionPane.showMessageDialog(null, "Você teve um prejuízo de R$" + Calculo + ",00 com a venda do(a) " + txtMercadoria.getText());
				}
				else
				{
					if(Calculo > 0)
					{
						JOptionPane.showMessageDialog(null, "Você teve um lucro de R$" + Calculo + ",00 com a venda do(a) " + txtMercadoria.getText());
					}
				}
			}
		});
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBounds(378, 233, 51, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);// Comando para sair
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnLucroprejuzo);
		contentPane.add(btnNewButton);
		contentPane.add(lblMercadoria);
		contentPane.add(lblPreoCompra);
		contentPane.add(txtCompra);
		contentPane.add(txtMercadoria);
		contentPane.add(lblPreoVenda);
		contentPane.add(txtVenda);
	}

}
