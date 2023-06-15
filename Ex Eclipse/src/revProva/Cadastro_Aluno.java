package revProva;

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
import java.awt.Color;

public class Cadastro_Aluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Aluno frame = new Cadastro_Aluno();
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
	public Cadastro_Aluno() {
		setTitle("Cadastro Aluno - Jo\u00E3o Pedro Piva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		
		JLabel lblNota4 = new JLabel("Nota 4:");
		
		txtNota4 = new JTextField();
		txtNota4.setColumns(10);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setForeground(Color.RED);
		
		JButton btnCalcular = new JButton("Calcular m\u00E9dia");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Estudante E1 = new Estudante ();
				
				E1.Nota1 = Double.parseDouble(txtNota1.getText());
				
				E1.Nota2 = Double.parseDouble(txtNota2.getText());
				
				E1.Nota3 = Double.parseDouble(txtNota3.getText());
				
				E1.Nota4 = Double.parseDouble(txtNota4.getText());
							
				E1.Calcular_Media();
				
				lblMedia.setText("Média: " + E1.Media);
				
				if(E1.Media >= 6)
				{
					JOptionPane.showMessageDialog(null, "APROVADO");
				}
				else
				{
					if(E1.Media < 6 && E1.Media >= 3)
					{
						JOptionPane.showMessageDialog(null, "EXAME");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "REPROVADO");
					}
				}
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(103)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNota2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addComponent(btnCalcular)
							.addGap(28))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNota4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNota4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNota3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNota3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNota1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNome)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(143, Short.MAX_VALUE))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(204, Short.MAX_VALUE)
					.addComponent(lblMedia)
					.addGap(174))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota1)
						.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota2)
						.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCalcular))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota3)
						.addComponent(txtNota3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNota4)
						.addComponent(txtNota4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblMedia)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
