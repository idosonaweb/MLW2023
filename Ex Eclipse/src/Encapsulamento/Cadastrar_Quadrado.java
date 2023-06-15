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

public class Cadastrar_Quadrado extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado;
	
	Quadrado Q1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Quadrado frame = new Cadastrar_Quadrado();
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
	public Cadastrar_Quadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLado = new JLabel("Lado");
		
		txtLado = new JTextField();
		txtLado.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Q1 == null)
				{
					Q1 = new Quadrado ();
					
					Q1.setLado(Double.parseDouble(txtLado.getText()));
					
					JOptionPane.showMessageDialog(null, "Lado cadastrado!!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Lado já cadastrado!!");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Q1 == null)
				{
					JOptionPane.showMessageDialog(null, "Lado ainda não cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Área do Quadrado:  " + Q1.Calcular_Area() + " m²");
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLado)
						.addComponent(txtLado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(275, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(265, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnImprimir)
						.addComponent(btnCadastrar))
					.addGap(62))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addComponent(btnCadastrar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtLado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimir)
					.addContainerGap(83, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
