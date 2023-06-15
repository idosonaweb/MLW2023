package Ex1 ;

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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar_Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar_Funcionario frame = new Cadastrar_Funcionario();
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
	public Cadastrar_Funcionario() {
		setTitle("Cadastrar Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblDependentes = new JLabel("Dependentes:");
		
		JRadioButton rdbSim = new JRadioButton("Sim");
		buttonGroup.add(rdbSim);
		
		JRadioButton rdbNao = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbNao);
		
		JLabel lblSexo = new JLabel("Sexo:");
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		cmbSexo.setToolTipText("");
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				Funcionario F1 = new Funcionario ();
				
				F1.Nome = txtNome.getText();
				
				if(rdbSim.isSelected())
				{
					F1.Dependentes = "Sim" ;
				}
				else
				{
					if(rdbNao.isSelected())
					{
						F1.Dependentes = "Não" ; 
					}
				}
				
				F1.Sexo = cmbSexo.getSelectedItem().toString();
				
				JOptionPane.showMessageDialog(null, "Dados do funcionário\n"
						+ "Nome: " + F1.Nome + "\n"
						+ "Dependentes:  " + F1.Dependentes + "\n"
						+ "Sexo: " + F1.Sexo + "\n");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(161)
					.addComponent(btnMostrar)
					.addContainerGap(194, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(69)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDependentes)
								.addComponent(lblNome))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(cmbSexo, 0, 155, Short.MAX_VALUE)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addGap(15)
										.addComponent(rdbSim)
										.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
										.addComponent(rdbNao)
										.addGap(18))))
							.addGap(96))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSexo)
							.addContainerGap(327, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDependentes)
						.addComponent(rdbSim)
						.addComponent(rdbNao))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSexo)
						.addComponent(cmbSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addComponent(btnMostrar)
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
