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

public class Cadastrar_Bola extends JFrame {

	private JPanel contentPane;
	private JTextField txtCor;
	private JTextField txtMaterial;
	private JTextField txtCircun;
	
	Bola B1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Bola frame = new Cadastrar_Bola();
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
	public Cadastrar_Bola() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCor = new JLabel("Cor");
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		
		JLabel lblMaterial = new JLabel("Material");
		
		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		
		JLabel lblCircunferncia = new JLabel("Circunfer\u00EAncia");
		
		txtCircun = new JTextField();
		txtCircun.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(B1 == null)
				{
					B1 = new Bola ();
					
					B1.setCor(txtCor.getText());
					B1.setMaterial(txtMaterial.getText());
					B1.setCircunferencia(Double.parseDouble(txtCircun.getText()));
					
					JOptionPane.showMessageDialog(null, "Bola cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "A bola já cadastrada");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(B1 == null)
				{
					JOptionPane.showMessageDialog(null, "Bola ainda não cadastrada");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cor:  " + B1.getCor() + "\n" + "Material:  " + B1.getMaterial() + "\n" + "Circunferência:  " + B1.getCircunferencia());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMaterial)
						.addComponent(txtCircun, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCircunferncia)
						.addComponent(txtMaterial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCor))
					.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCadastrar)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblMaterial)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtMaterial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCircunferncia)
						.addComponent(btnImprimir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCircun, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
