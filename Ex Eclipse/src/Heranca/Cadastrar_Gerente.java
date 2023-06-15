package Heranca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Encapsulamento.Mercadorias;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar_Gerente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtSal;
	private JTextField txtSenha;
	private JTextField txtNum_Fun_Geren;
	
	Gerente G1 = null ;
	
	Gerente G2 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Gerente frame = new Cadastrar_Gerente();
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
	public Cadastrar_Gerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		
		txtSal = new JTextField();
		txtSal.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		
		JLabel lblNmeroDeFuncionrio = new JLabel("N\u00FAmero de Funcion\u00E1rio Gerenciado");
		
		txtNum_Fun_Geren = new JTextField();
		txtNum_Fun_Geren.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(G1 == null)
				{
					G1 = new Gerente ();
					
					G1.setNome(txtNome.getText());
					
					G1.setIdade(Integer.parseInt(txtIdade.getText()));
					
					G1.setSalario(Double.parseDouble(txtSal.getText()));
					
					G1.setSenha(txtSenha.getText());
					
					G1.setNum_Funcionarios_Gerenciados(Integer.parseInt(txtNum_Fun_Geren.getText()));
					
					JOptionPane.showMessageDialog(null, "1° Gerente cadastrado");
				}
				else
				{
					if(G2 == null)
					{
						G2 = new Gerente ();
						
						G2.setNome(txtNome.getText());
						
						G2.setIdade(Integer.parseInt(txtIdade.getText()));
						
						G2.setSalario(Double.parseDouble(txtSal.getText()));
						
						G2.setSenha(txtSenha.getText());
						
						G2.setNum_Funcionarios_Gerenciados(Integer.parseInt(txtNum_Fun_Geren.getText()));
						
						JOptionPane.showMessageDialog(null, "2° Gerente cadastrado");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Gerentes já cadastrados");
					}
				}
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText("");
				
				txtIdade.setText("");
				
				txtSal.setText("");
				
				txtSenha.setText("");
				
				txtNum_Fun_Geren.setText("");
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(G1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Gerentes ainda não cadastrados");
				}
				else
				{
					if(G2 == null)
					{
							JOptionPane.showMessageDialog(null, "1° Gerente\n" +  "\nNome:  " + G1.getNome() + "\n" + "Idade:  " + G1.getIdade() + "\n" + 
							"Salário:  R$" + String.format("%.2f", G1.getSalario()) + "\n"
							+ "Senha:  " + G1.getSenha() + "\n" + "Número de Fun. Gereciados:  " + G1.getNum_Funcionarios_Gerenciados());
					}
					else
					{
						if(G1.getSalario() > G2.getSalario())
						{
							JOptionPane.showMessageDialog(null, "1° Gerente\n" +  "\nNome:  " + G1.getNome() + "\n" + "Idade:  " + G1.getIdade() + "\n" + 
									"Salário:  R$" + String.format("%.2f", G1.getSalario()) + "\n"
									+ "Senha:  " + G1.getSenha() + "\n" + "Número de Fun. Gereciados:  " + G1.getNum_Funcionarios_Gerenciados());
						}
						else
						{
							if(G2.getSalario() > G1.getSalario())
							{
								JOptionPane.showMessageDialog(null, "2° Gerente\n" +  "\nNome:  " + G2.getNome() + "\n" + "Idade:  " + G2.getIdade() + "\n" + 
										"Salário:  R$" + String.format("%.2f", G2.getSalario()) + "\n"
										+ "Senha:  " + G2.getSenha() + "\n" + "Número de Fun. Gereciados:  " + G2.getNum_Funcionarios_Gerenciados());
							}
						}
					}
					
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtNum_Fun_Geren, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblSalrio)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIdade)
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
												.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSenha)
												.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNmeroDeFuncionrio))
											.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnLimpar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addContainerGap(50, Short.MAX_VALUE))))))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(btnCadastrar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblIdade)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSalrio)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(btnLimpar)
							.addGap(32)
							.addComponent(btnImprimir))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSenha)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNmeroDeFuncionrio)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNum_Fun_Geren, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
