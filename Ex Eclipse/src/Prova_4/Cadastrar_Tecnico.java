package Prova_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Menu.Novo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar_Tecnico extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSal;
	private JTextField txtFuncao;
	private JTextField txtVHE;
	
	Tecnico T1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Tecnico frame = new Cadastrar_Tecnico();
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
	public Cadastrar_Tecnico() {
		setTitle("Cadastrar T\u00E9cnico - Jo\u00E3o Piva");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		
		txtSal = new JTextField();
		txtSal.setColumns(10);
		
		JLabel lblFunção = new JLabel("Fun\u00E7\u00E3o");
		
		txtFuncao = new JTextField();
		txtFuncao.setColumns(10);
		
		JLabel lblValorHoraExtra_1 = new JLabel("Valor Hora Extra");
		
		txtVHE = new JTextField();
		txtVHE.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(T1 == null)
				{
					T1 = new Tecnico ();
					
					T1.setNome(txtNome.getText());
					
					T1.setSalario(Double.parseDouble(txtSal.getText()));
					
					T1.setFuncao(txtFuncao.getText());
					
					T1.setValorH_Extra(Double.parseDouble(txtVHE.getText()));
					
					JOptionPane.showMessageDialog(null, "Técnico cadastrado(a)");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Técnico já cadastrado(a)");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(T1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Técnico ainda não cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, T1.Imprimir_Dados());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtVHE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFuncao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFunção)
						.addComponent(txtSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSalrio)
								.addComponent(lblValorHoraExtra_1))
							.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(78))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSalrio)
						.addComponent(btnCadastrar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblFunção)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFuncao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblValorHoraExtra_1))
						.addComponent(btnImprimir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtVHE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
