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

public class Ex extends JFrame {

	private JPanel txt;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex frame = new Ex();
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
	public Ex() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		txt = new JPanel();
		txt.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txt);
		
		JLabel lblDigiteUmNmero = new JLabel("Digite um n\u00FAmero:");
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		
		JLabel lblDigiteOutroNmero = new JLabel("Digite outro n\u00FAmero:");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Num1, Num2;
				
				Ex1 C1 = new Ex1 ();
				
				Num1 = Integer.parseInt(txtNum1.getText());
				
				Num2 = Integer.parseInt(txtNum2.getText());
				
				JOptionPane.showMessageDialog(null, "Resultado 1:  " + C1.Calculo(Num1) + "\nResultado 2:  " + C1.Calculo(Num1, Num2));
			}
		});
		GroupLayout gl_txt = new GroupLayout(txt);
		gl_txt.setHorizontalGroup(
			gl_txt.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_txt.createSequentialGroup()
					.addGap(172)
					.addGroup(gl_txt.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblDigiteOutroNmero, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtNum2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNum1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDigiteUmNmero, Alignment.LEADING))
					.addContainerGap(153, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_txt.createSequentialGroup()
					.addContainerGap(144, Short.MAX_VALUE)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
		);
		gl_txt.setVerticalGroup(
			gl_txt.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_txt.createSequentialGroup()
					.addGap(38)
					.addComponent(lblDigiteUmNmero)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblDigiteOutroNmero)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNum2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(btnCalcular)
					.addGap(28))
		);
		txt.setLayout(gl_txt);
	}
}
