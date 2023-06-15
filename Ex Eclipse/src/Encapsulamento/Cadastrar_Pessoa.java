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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar_Pessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	
	Pessoa P1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Pessoa frame = new Cadastrar_Pessoa();
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
	public Cadastrar_Pessoa() {
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
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(P1 == null)
				{
					P1 = new Pessoa ();
					
					P1.setNome(txtNome.getText());
					
					P1.setIdade(Integer.parseInt(txtIdade.getText()));
					
					JOptionPane.showMessageDialog(null, "Pessoa cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Pessoa já cadastrada");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(P1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Pessoa ainda não cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Nome:  " + P1.getNome() + "\n" + "Idade:  " + P1.getIdade() + " anos");
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdade)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnImprimir)
							.addContainerGap(51, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnCadastrar)
							.addGap(69))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCadastrar))
					.addGap(18)
					.addComponent(lblIdade)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnImprimir))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
