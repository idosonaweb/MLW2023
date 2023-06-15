package Prova;

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
import java.awt.Font;

public class Pe_Grande_Calcados extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtNumeracao;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pe_Grande_Calcados frame = new Pe_Grande_Calcados();
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
	public Pe_Grande_Calcados() {
		setTitle("P\u00E9 Grande Cal\u00E7ados - Jo\u00E3o Pedro Piva ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMarca = new JLabel("Marca");
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		JLabel lblNumerao = new JLabel("Numera\u00E7\u00E3o");
		
		txtNumeracao = new JTextField();
		txtNumeracao.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		JLabel lblR = new JLabel("R$");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calcados_Joao_Piva C1 = new Calcados_Joao_Piva();
				
				C1.calcular_Preco_Vista();
				
				C1.Preco = Double.parseDouble(txtPreco.getText());
				
				C1.Numeracao = Integer.parseInt(txtNumeracao.getText());
				
				C1.Marca = txtMarca.getText();
				
				C1.Modelo = txtModelo.getText();
				
				JOptionPane.showMessageDialog(null, C1.mostrar_Dados());
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNumerao)
							.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
							.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(54))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblR)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblPreo)
								.addComponent(txtNumeracao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblModelo)
								.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMarca))
							.addContainerGap(262, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblMarca)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblModelo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumerao)
						.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNumeracao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPreo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblR)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
