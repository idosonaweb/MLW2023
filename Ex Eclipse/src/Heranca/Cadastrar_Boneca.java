package Heranca;

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

public class Cadastrar_Boneca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTamanho;
	private JTextField txtCabelo;
	private JTextField txtFaixaE;
	private JTextField txtPreco;
	
	Boneca B1 = null ;
	
	Boneca B2 = null ;
	
	Boneca B3 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Boneca frame = new Cadastrar_Boneca();
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
	public Cadastrar_Boneca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		
		txtTamanho = new JTextField();
		txtTamanho.setColumns(10);
		
		JLabel lblCorDoCabelo = new JLabel("Cor do cabelo");
		
		txtCabelo = new JTextField();
		txtCabelo.setColumns(10);
		
		JLabel lblFaixaEtria = new JLabel("Faixa et\u00E1ria");
		
		txtFaixaE = new JTextField();
		txtFaixaE.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(B1 == null)
				{
					B1 = new Boneca ();
					
					B1.setNome(txtNome.getText());
					
					B1.setTamanho(Double.parseDouble(txtTamanho.getText()));
					
					B1.setCor_Cabelo(txtCabelo.getText());
					
					B1.setFaixa_Etaria(txtFaixaE.getText());
					
					B1.setPreco(Double.parseDouble(txtPreco.getText()));
					
					JOptionPane.showMessageDialog(null, "1ª Boneca cadastrada");
				}
				else
				{
					if(B2 == null)
					{
						B2 = new Boneca ();
						
						B2.setNome(txtNome.getText());
						
						B2.setTamanho(Double.parseDouble(txtTamanho.getText()));
						
						B2.setCor_Cabelo(txtCabelo.getText());
						
						B2.setFaixa_Etaria(txtFaixaE.getText());
						
						B2.setPreco(Double.parseDouble(txtPreco.getText()));
						
						JOptionPane.showMessageDialog(null, "2ª Boneca cadastrada");
					}
					else
					{
						if(B3 == null)
						{
							B3 = new Boneca ();
						
							B3.setNome(txtNome.getText());
							
							B3.setTamanho(Double.parseDouble(txtTamanho.getText()));
							
							B3.setCor_Cabelo(txtCabelo.getText());
							
							B3.setFaixa_Etaria(txtFaixaE.getText());
							
							B3.setPreco(Double.parseDouble(txtPreco.getText()));
							
							JOptionPane.showMessageDialog(null, "3ª Boneca cadastrada");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Bonecas já cadastrados");
						}
					}
				}
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText("");
				
				txtTamanho.setText("");
				
				txtCabelo.setText("");
				
				txtFaixaE.setText("");
				
				txtPreco.setText("");
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Cabelo = "Preto" ;
				
				if(B1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Bonecas ainda não cadastrados");
				}
				else
				{
					if(B2 == null)
					{
							JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
							"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
							+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()));
					}
					else
					{
						if(B3 == null)
						{
							JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
									"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
									+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()) +
									
									"\n\n2ª Boneca\n" +  "\nNome:  " + B2.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B2.getTamanho()) + " cm\n" + 
									"Cor do Cabelo:  " + B2.getCor_Cabelo() + "\n"
									+ "Faixa Etária:  " + B2.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B2.getPreco()));
						}
						else
						{
							if(B1.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B1.getPreco() > 70.0)
							{
								if(B2.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B2.getPreco() > 70.0)
								{
									if(B3.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B3.getPreco() > 70.0)
									{
										JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
												"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
												+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()) +
												
												"\n\n2ª Boneca\n" +  "\nNome:  " + B2.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B2.getTamanho()) + " cm\n" + 
												"Cor do Cabelo:  " + B2.getCor_Cabelo() + "\n"
												+ "Faixa Etária:  " + B2.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B2.getPreco())
												
												+ "\n\n3ª Boneca\n" +  "\nNome:  " + B3.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B3.getTamanho()) + " cm\n" + 
												"Cor do Cabelo:  " + B3.getCor_Cabelo() + "\n"
												+ "Faixa Etária:  " + B3.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B3.getPreco()));
									}
								}
							}
							else
							{
								if(B1.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B1.getPreco() > 70.0)
								{
									if(B2.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B2.getPreco() > 70.0)
									{
										JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
												"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
												+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()) +
												
												"\n\n2ª Boneca\n" +  "\nNome:  " + B2.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B2.getTamanho()) + " cm\n" + 
												"Cor do Cabelo:  " + B2.getCor_Cabelo() + "\n"
												+ "Faixa Etária:  " + B2.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B2.getPreco()));
									}
								}
								else
								{
									if(B1.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B1.getPreco() > 70.0)
									{
										if(B3.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B3.getPreco() > 70.0)
										{
											JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
													"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
													+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()) +
													
													"\n\n3ª Boneca\n" +  "\nNome:  " + B3.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B3.getTamanho()) + " cm\n" + 
													"Cor do Cabelo:  " + B3.getCor_Cabelo() + "\n"
													+ "Faixa Etária:  " + B3.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B3.getPreco()));
										}
									}
									else
									{
										if(B2.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B2.getPreco() > 70.0)
										{
											if(B3.getCor_Cabelo().equalsIgnoreCase(Cabelo) && B3.getPreco() > 70.0)
											{
												JOptionPane.showMessageDialog(null, "2ª Boneca\n" +  "\nNome:  " + B2.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B2.getTamanho()) + " cm\n" + 
														"Cor do Cabelo:  " + B2.getCor_Cabelo() + "\n"
														+ "Faixa Etária:  " + B2.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B2.getPreco()) +
														
														"\n\n3ª Boneca\n" +  "\nNome:  " + B3.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B3.getTamanho()) + " cm\n" + 
														"Cor do Cabelo:  " + B3.getCor_Cabelo() + "\n"
														+ "Faixa Etária:  " + B3.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B3.getPreco()));
											}
										}
										else
										{
											if(B1.getCor_Cabelo().equalsIgnoreCase(Cabelo))
											{
												if(B1.getPreco() > 70.0)
												{
													JOptionPane.showMessageDialog(null, "1ª Boneca\n" +  "\nNome:  " + B1.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B1.getTamanho()) + " cm\n" + 
													"Cor do Cabelo:  " + B1.getCor_Cabelo() + "\n"
													+ "Faixa Etária:  " + B1.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B1.getPreco()));
												}
											}
											else
											{
												if(B2.getCor_Cabelo().equalsIgnoreCase(Cabelo))
												{
													if(B2.getPreco() > 70.0)
													{
														JOptionPane.showMessageDialog(null, "2ª Boneca\n" +  "\nNome:  " + B2.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B2.getTamanho()) + " cm\n" + 
														"Cor do Cabelo:  " + B2.getCor_Cabelo() + "\n"
														+ "Faixa Etária:  " + B2.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B2.getPreco()));
													}
												}
												else
												{
													if(B3.getCor_Cabelo().equalsIgnoreCase(Cabelo))
													{
														if(B3.getPreco() > 70.0)
														{
															JOptionPane.showMessageDialog(null, "3ª Boneca\n" +  "\nNome:  " + B3.getNome() + "\n" + "Tamanho:  " + String.format("%.2f", B3.getTamanho()) + " cm\n" + 
															"Cor do Cabelo:  " + B3.getCor_Cabelo() + "\n"
															+ "Faixa Etária:  " + B3.getFaixa_Etaria() + " anos\n" + "Preço:  R$" + String.format("%.2f", B3.getPreco()));
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblFaixaEtria)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblCorDoCabelo)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNome))
									.addContainerGap(314, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblTamanho)
											.addComponent(txtTamanho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtCabelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtFaixaE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblPreo))
									.addPreferredGap(ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnCadastrar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnLimpar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(50))))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTamanho)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTamanho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCorDoCabelo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(btnCadastrar)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCabelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimpar))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFaixaEtria)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFaixaE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPreo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(btnImprimir)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
