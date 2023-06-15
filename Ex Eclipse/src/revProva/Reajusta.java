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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reajusta extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reajusta frame = new Reajusta();
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
	public Reajusta() {
		setTitle("Reajuste Salarial - Jo\u00E3o Pedro Piva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		
		JComboBox cmbCargo = new JComboBox();
		cmbCargo.setModel(new DefaultComboBoxModel(new String[] {"Gerente", "Vendedor", "Entregador", "Auxiliar Adm."}));
		
		JButton btnReajustarSalrio = new JButton("Reajustar Sal\u00E1rio");
		btnReajustarSalrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funcionario F1 = new Funcionario ();
				
				F1.Salario = Double.parseDouble(txtSalario.getText());
				
				F1.Nome = txtNome.getText();
				
				if(F1.Salario >= 8000)
				{
					JOptionPane.showMessageDialog(null, "Salário acima do valor permitido");
				}
				else
				{
					if(F1.Salario < 8000)
					{
						F1.Reajustar_Salario();
						
						JOptionPane.showMessageDialog(null, "Nome: " + F1.Nome + "\n"
								+ "Cargo: " + cmbCargo.getSelectedItem().toString() + "\n"
								+ "Salário: R$ " + F1.Salario + "0" + "\n"
								+ "Salário Reajustado: R$" + F1.Sal_Reajustado + "0");
					}
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCargo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSalrio)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(138, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(138, Short.MAX_VALUE)
					.addComponent(btnReajustarSalrio, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(130))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSalrio)
						.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCargo)
						.addComponent(cmbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addComponent(btnReajustarSalrio)
					.addGap(36))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
