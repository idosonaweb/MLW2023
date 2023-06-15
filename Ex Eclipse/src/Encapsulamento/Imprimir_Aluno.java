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

public class Imprimir_Aluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	
	Aluno A1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imprimir_Aluno frame = new Imprimir_Aluno();
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
	public Imprimir_Aluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota1");
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		
		JLabel lblNota_1 = new JLabel("Nota2");
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(A1 == null)
				{
					A1 = new Aluno ();
					
					A1.setNome(txtNome.getText());
					
					A1.setNota1(Double.parseDouble(txtNota1.getText()));
					
					A1.setNota2(Double.parseDouble(txtNota2.getText()));
					
					JOptionPane.showMessageDialog(null, A1.Imprimir_Dados());
				}
				else
				{
					JOptionPane.showMessageDialog(null, A1.Imprimir_Dados());
				}
			}
		});
		
		JButton btnCalcularMdia = new JButton("Calcular M\u00E9dia");
		btnCalcularMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(A1 == null)
				{
					JOptionPane.showMessageDialog(null, "Dados não inseridos!!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Média:  " + A1.Calcular_Media());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNota)
						.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNota_1)
						.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCalcularMdia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNota))
						.addComponent(btnImprimir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota_1)
						.addComponent(btnCalcularMdia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
