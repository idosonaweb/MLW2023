import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste5 frame = new Teste5();
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
	public Teste5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtN1 = new JTextField();
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		
		JLabel lblDigite = new JLabel("Digite um n\u00FAmero real:");
		
		JLabel lblDigiteOutroNmero = new JLabel("Digite outro n\u00FAmero real:");
		
		JLabel lblResultado = new JLabel("RESULTADO");
		
		JLabel lblMedia = new JLabel("");
		
		JButton btnCalcularMdia = new JButton("Calcular M\u00E9dia");
		btnCalcularMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Num1, Num2, Media ;
				
				Num1 = Double.parseDouble(txtN1.getText());
				
				Num2 = Double.parseDouble(txtN2.getText());
				
				Media = (Num1 + Num2) / 2 ;
				
				lblMedia.setText(String.format("%.2f", Media));
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(168)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtN2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtN1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDigiteOutroNmero)
								.addComponent(lblDigite, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCalcularMdia, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
					.addGap(150))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(181)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblMedia))
						.addComponent(lblResultado))
					.addContainerGap(180, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(lblDigite)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtN1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDigiteOutroNmero)
					.addGap(4)
					.addComponent(txtN2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(lblResultado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMedia)
					.addGap(30)
					.addComponent(btnCalcularMdia)
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
