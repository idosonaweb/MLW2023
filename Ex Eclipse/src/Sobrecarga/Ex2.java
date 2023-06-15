package Sobrecarga;

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

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtPeso1;
	private JTextField txtPeso2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDigiteUmaNota = new JLabel("Digite uma nota:");
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		
		JLabel lblDigiteOutraNota = new JLabel("Digite outra nota:");
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		
		JLabel lblDigiteSeuPeso = new JLabel("Digite seu peso:");
		
		txtPeso1 = new JTextField();
		txtPeso1.setColumns(10);
		
		JLabel lblDigiteSeuPeso_1 = new JLabel("Digite seu peso:");
		
		txtPeso2 = new JTextField();
		txtPeso2.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Nota1, Nota2 ; 
				
				int Peso1, Peso2 ;
				
				Ex_2 E1 = new Ex_2 ();
				
				Nota1 = Integer.parseInt(txtNota1.getText());
				
				Nota2 = Integer.parseInt(txtNota2.getText());
				
				Peso1 = Integer.parseInt(txtPeso1.getText());
				
				Peso2 = Integer.parseInt(txtPeso2.getText());
				
				JOptionPane.showMessageDialog(null, "Média Aritmetica :  " + E1.calcularMedia(Nota1, Nota2) + "\nmédia Ponderada 2:  " + E1.calcularMedia(Nota1, Nota2, Peso1, Peso2));
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDigiteUmaNota)
								.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDigiteOutraNota)))
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDigiteSeuPeso_1)
								.addComponent(txtPeso1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDigiteSeuPeso)
								.addComponent(txtPeso2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(133)
							.addComponent(btnCalcular)))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteUmaNota)
						.addComponent(lblDigiteSeuPeso))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPeso1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteOutraNota)
						.addComponent(lblDigiteSeuPeso_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPeso2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
					.addComponent(btnCalcular)
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
