package Menu;

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

public class Cadastrar_Peca_Importada extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCusto;
	private JTextField txtLucro;
	private JTextField txtImporta;
	private JTextField txtFrete;
	
	Peca_Importada PI = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Peca_Importada frame = new Cadastrar_Peca_Importada();
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
	public Cadastrar_Peca_Importada() {
		setTitle("Cadastrar Pe\u00E7a importada");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblCusto = new JLabel("Custo");
		
		txtCusto = new JTextField();
		txtCusto.setColumns(10);
		
		JLabel lblLucro = new JLabel("Lucro");
		
		txtLucro = new JTextField();
		txtLucro.setColumns(10);
		
		JLabel lblTaxaDeImportao = new JLabel("Taxa de Importa\u00E7\u00E3o");
		
		txtImporta = new JTextField();
		txtImporta.setColumns(10);
		
		JLabel lblTaxaDeFrete = new JLabel("Taxa de Frete");
		
		txtFrete = new JTextField();
		txtFrete.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(PI == null)
				{
					PI = new Peca_Importada ();
					
					PI.setNome(txtNome.getText());
				
					PI.setCusto(Double.parseDouble(txtCusto.getText()));
					
					PI.setLucro(Double.parseDouble(txtLucro.getText()));
					
					PI.setTaxa_Importacao(Double.parseDouble(txtImporta.getText()));
					
					PI.setTaxa_Frete(Double.parseDouble(txtFrete.getText()));
					
					JOptionPane.showMessageDialog(null, "Peça Importada cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Peça Importada já cadastrada");
				}
				
			}
		});
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(PI == null) 
				{	
					JOptionPane.showMessageDialog(null, "Peça Importada ainda não cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, PI.Exibir() + "\n\n" + "Preço Total:  R$" + String.format("%.2f", (PI.getCusto() + PI.getLucro()) + PI.Calcular_Preco()));
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtFrete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTaxaDeImportao)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblCusto)
										.addContainerGap())
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNome)
												.addContainerGap())
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblLucro)
													.addComponent(txtLucro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(txtImporta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblTaxaDeFrete))
												.addPreferredGap(ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
													.addComponent(btnExibir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(66)))))))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCusto)
					.addGap(5)
					.addComponent(txtCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCadastrar)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLucro)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtLucro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTaxaDeImportao)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(15)
							.addComponent(btnExibir))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtImporta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTaxaDeFrete)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtFrete, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
