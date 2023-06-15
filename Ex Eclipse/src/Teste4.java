import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField textField_2;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JLabel lblDigiteO_2;
	private JLabel lblDigiteO_3;
	private JTextField textField_3;
	private JButton btnSubtrao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste4 frame = new Teste4();
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
	public Teste4() {
		setTitle("Quarta e Quinto Programa - Jo\u00E3o Piva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtN1 = new JTextField();
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		
		JLabel lblDigiteO = new JLabel("Digite o 1\u00B0 n\u00FAmero");
		
		JLabel lblDigiteO_1 = new JLabel("Digite o 2\u00B0 n\u00FAmero");
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.control);
		textField_2.setText(" +");
		textField_2.setColumns(10);
		
		JButton btnResultado = new JButton("Soma");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Num1, Num2, Soma ;
				
				Num1 = Integer.parseInt(txtN1.getText());
				
				Num2 = Integer.parseInt(txtN2.getText());
				
				Soma = Num1 + Num2 ;
				
				JOptionPane.showMessageDialog(null, "Essa soma é igual a " + Soma);
			}
		});
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		
		lblDigiteO_2 = new JLabel("Digite o 1\u00B0 n\u00FAmero");
		
		lblDigiteO_3 = new JLabel("Digite o 2\u00B0 n\u00FAmero");
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.control);
		textField_3.setText(" -");
		textField_3.setColumns(10);
		
		btnSubtrao = new JButton("Subtra\u00E7\u00E3o");
		btnSubtrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Num1, Num2, Subtracao ;
				
				Num1 = Integer.parseInt(txtNum1.getText());
				
				Num2 = Integer.parseInt(txtNum2.getText());
				
				Subtracao = Num1 - Num2 ;
				
				JOptionPane.showMessageDialog(null, "Essa subtração é igual a " + Subtracao);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtNum1, Alignment.LEADING)
								.addComponent(lblDigiteO, Alignment.LEADING)
								.addComponent(txtN1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(43)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(46)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
						.addComponent(lblDigiteO_2))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDigiteO_3)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtNum2)
							.addComponent(lblDigiteO_1, Alignment.TRAILING)
							.addComponent(txtN2, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
					.addGap(59))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(177)
					.addComponent(btnResultado)
					.addContainerGap(188, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(168)
					.addComponent(btnSubtrao)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteO)
						.addComponent(lblDigiteO_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtN1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtN2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnResultado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDigiteO_2)
						.addComponent(lblDigiteO_3))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnSubtrao)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
