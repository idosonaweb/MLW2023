package Encapsulamento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar_Mercadorias extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome1;
	private JTextField txtNome2;
	private JTextField txtPreco1;
	private JTextField txtQtd1;
	private JTextField txtPreco2;
	private JTextField txtQtd2;
	
	Mercadorias M1 = null ;
	
	Mercadorias M2 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Mercadorias frame = new Cadastrar_Mercadorias();
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
	public Cadastrar_Mercadorias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		JLabel lblMercadoria = new JLabel("1\u00AA Mercadoria");
		
		JLabel lblMercadoria_1 = new JLabel("2\u00AA Mercadoria");
		
		JLabel lblNome_1 = new JLabel("Nome");
		
		txtNome1 = new JTextField();
		txtNome1.setColumns(10);
		
		txtNome2 = new JTextField();
		txtNome2.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		JLabel lblPreo_1 = new JLabel("Pre\u00E7o");
		
		txtPreco1 = new JTextField();
		txtPreco1.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		
		txtQtd1 = new JTextField();
		txtQtd1.setColumns(10);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		
		JLabel lblQuantidade_1 = new JLabel("Quantidade");
		
		txtQtd2 = new JTextField();
		txtQtd2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(M1 == null)
				{
					M1 = new Mercadorias ();
					
					M1.setNome(txtNome1.getText());
					
					M1.setPreco(Double.parseDouble(txtPreco1.getText()));
					
					M1.setQuantidade(Integer.parseInt(txtQtd1.getText()));
					
					JOptionPane.showMessageDialog(null, "Mercadoria 1 cadastrada");
				}
				else
				{
					if(M2 == null)
					{
						M2 = new Mercadorias ();
						
						M2.setNome(txtNome2.getText());
						
						M2.setPreco(Double.parseDouble(txtPreco2.getText()));
						
						M2.setQuantidade(Integer.parseInt(txtQtd2.getText()));
						
						JOptionPane.showMessageDialog(null, "Mercadorias cadastradas");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Mercadorias já cadastradas");
					}
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(M1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Mercadorias ainda não cadastradas");
				}
				else
				{
					if(M2 == null)
					{
							JOptionPane.showMessageDialog(null, "1ª Mercadoria\n" +  "\nNome:  " + M1.getNome() + "\n" + "Preço:  R$" + String.format("%.2f", M1.getPreco()) + "\n"
							+ "Quantidade:  " + M1.getQuantidade() + "\n" + "Total Estoque:  R$" + String.format("%.2f", M1.getPreco() * M1.getQuantidade()));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "1ª Mercadoria\n" +  "\nNome:  " + M1.getNome() + "\n" + "Preço:  R$" + String.format("%.2f", M1.getPreco()) + "\n"
								+ "Quantidade:  " + M1.getQuantidade() + "\n" + "Total Estoque:  R$" + String.format("%.2f", M1.getPreco() * M1.getQuantidade())
								+ "\n\n2ª Mercadoria\n" +  "\nNome:  " + M2.getNome() + "\n" + "Preço:  R$" + String.format("%.2f", M2.getPreco()) + "\n"
								+ "Quantidade:  " + M2.getQuantidade() + "\n" + "Total Estoque:  R$" + String.format("%.2f",M2.getPreco() * M2.getQuantidade())
								+ "\n\nEstoque Final:  R$" + String.format("%.2f",((M1.getPreco() * M1.getQuantidade()) + (M2.getPreco() * M2.getQuantidade()))));
					}
					
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(49)
					.addComponent(lblMercadoria)
					.addPreferredGap(ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
					.addComponent(lblMercadoria_1)
					.addGap(65))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
					.addComponent(lblNome_1)
					.addGap(83))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(lblQuantidade))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(lblPreo)))
					.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblQuantidade_1)
							.addGap(64))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPreo_1)
							.addGap(82))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(107))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNome1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPreco1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtQtd1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtQtd2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPreco2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNome2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(54))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMercadoria)
						.addComponent(lblMercadoria_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblNome_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreo)
						.addComponent(lblPreo_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPreco1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPreco2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(lblQuantidade_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtQtd1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQtd2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnImprimir))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
