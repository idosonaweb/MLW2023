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

public class Cadastrar_Carro extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtCapacidade;
	private JTextField txtPreco;
	private JTextField txtQuilometragem;
	
	Carro C1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Carro frame = new Cadastrar_Carro();
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
	public Cadastrar_Carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		
		JLabel lblCapacidade = new JLabel("Capacidade");
		
		txtCapacidade = new JTextField();
		txtCapacidade.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel lblQuilometragem = new JLabel("Quilometragem");
		
		txtQuilometragem = new JTextField();
		txtQuilometragem.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(C1 == null)
				{
					C1 = new Carro () ;
					
					C1.setDescricao(txtDescricao.getText());
					
					C1.setCapacidade(Integer.parseInt(txtCapacidade.getText()));
					
					C1.setPreco(Double.parseDouble(txtPreco.getText()));
					
					C1.setQuilometragem(Double.parseDouble(txtQuilometragem.getText()));
					
					JOptionPane.showMessageDialog(null, "Carro cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Carro já cadastrado");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(C1 == null)
				{
					JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Carro\n\n"
							 + "Descrição:  " + C1.getDescricao() + "\n"
							 + "Capacidade:  " + C1.getCapacidade() + " pessoas" + "\n"
							 + "Preço:  R$" + String.format("%.2f", C1.getPreco()) + "\n"
							 + "Quilometragem:  " + String.format("%.0f", C1.getQuilometragem()) + " km");
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCapacidade)
						.addComponent(txtQuilometragem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuilometragem)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreo)
						.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescrio))
					.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCadastrar)
						.addComponent(btnImprimir))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblDescrio)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCapacidade)
						.addComponent(btnCadastrar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCapacidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPreo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblQuilometragem))
						.addComponent(btnImprimir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtQuilometragem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
