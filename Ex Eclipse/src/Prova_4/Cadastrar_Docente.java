package Prova_4;

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

public class Cadastrar_Docente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSal;
	private JTextField txtTitulacao;
	private JTextField txtAdicional;
	
	Docente D1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Docente frame = new Cadastrar_Docente();
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
	public Cadastrar_Docente() {
		setTitle("Cadastrar Docente - Jo\u00E3o Piva");
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
		
		JLabel lblTitulao = new JLabel("Titula\u00E7\u00E3o");
		
		txtTitulacao = new JTextField();
		txtTitulacao.setColumns(10);
		
		JLabel lblAdicionalPorNvel = new JLabel("Adicional por N\u00EDvel");
		
		txtAdicional = new JTextField();
		txtAdicional.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(D1 == null)
				{
					D1 = new Docente ();
					
					D1.setNome(txtNome.getText());
					
					D1.setSalario(Double.parseDouble(txtSal.getText()));
			
					D1.setTitulacao(txtTitulacao.getText());
				
					D1.setAdicional_Nivel(Double.parseDouble(txtAdicional.getText()));
					
					JOptionPane.showMessageDialog(null, "Docente cadastrado(a)");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Docente já cadastrado(a)");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(D1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Docente ainda não cadastrado(a)");
				}
				else
				{
					JOptionPane.showMessageDialog(null, D1.Imprimir_Dados());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSalrio)
						.addComponent(txtAdicional, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAdicionalPorNvel)
						.addComponent(txtTitulacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitulao)
						.addComponent(txtSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(67, Short.MAX_VALUE))
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
							.addComponent(lblTitulao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTitulacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblAdicionalPorNvel))
						.addComponent(btnImprimir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAdicional, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}