package Menu;

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

public class Cadastrar_Velho extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnd;
	private JTextField txtPreco;
	private JTextField txtDes;
	
	Velho V1 = null ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Velho frame = new Cadastrar_Velho();
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
	public Cadastrar_Velho() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		
		txtEnd = new JTextField();
		txtEnd.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto");
		
		txtDes = new JTextField();
		txtDes.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(V1 == null)
				{
					V1 = new Velho ();
					
					V1.setEndereco(txtEnd.getText());
					
					V1.setPreco(Double.parseDouble(txtPreco.getText()));
					
					V1.setDesconto(Double.parseDouble(txtDes.getText()));
					
					JOptionPane.showMessageDialog(null, "Imóvel Velho cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Imóvel Velho já cadastrado");
				}
			}
		});
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(V1 == null) 
				{	
					JOptionPane.showMessageDialog(null, "Imóvel Velho ainda não cadastrado");
				}
				else
				{
					JOptionPane.showMessageDialog(null, V1.Imprime_Dados());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPreo)
						.addComponent(txtDes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDesconto)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEndereo))
					.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCadastrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addComponent(lblEndereo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblPreo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDesconto))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(87)
							.addComponent(btnCadastrar)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnImprimir)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
