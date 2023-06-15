package revProva;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversao_Moedas extends JFrame {

	private JPanel contentPane;
	private JTextField txtReais;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversao_Moedas frame = new Conversao_Moedas();
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
	public Conversao_Moedas() {
		setTitle("Convers\u00E3o de Moedas - Jo\u00E3o Pedro Piva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblValor = new JLabel("Valor para ser convertido (em reais)");
		
		JLabel lblR = new JLabel("R$");
		
		txtReais = new JTextField();
		txtReais.setColumns(10);
		
		JLabel lblConversoEm = new JLabel("Convers\u00E3o em:");
		
		JRadioButton rdbEuro = new JRadioButton("Euro");
		buttonGroup.add(rdbEuro);
		
		JRadioButton rdbDolar = new JRadioButton("D\u00F3lar");
		buttonGroup.add(rdbDolar);
		
		JRadioButton rdbLibra = new JRadioButton("Libra");
		buttonGroup.add(rdbLibra);
		
		JLabel lblValorConvertido = new JLabel("");
		lblValorConvertido.setForeground(Color.BLUE);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Moeda M1 = new Moeda ();
				
				M1.Valor_Reais = Double.parseDouble(txtReais.getText());
				
				if(rdbEuro.isSelected())
				{
					M1.Nome = "Euro" ;
					
					M1.Calcular_Conversao();
					
					lblValorConvertido.setText("Valor Convertido: €" + String.format("%.2f", M1.Valor_Convertido));
				}
				else
				{
					if(rdbDolar.isSelected())
					{
						M1.Nome = "Dólar" ;
						
						M1.Calcular_Conversao();
						
						lblValorConvertido.setText("Valor Convertido: US$" + String.format("%.2f", M1.Valor_Convertido));
					}
					else
					{
						if(rdbLibra.isSelected())
						{
							M1.Nome = "Libra" ;
							
							M1.Calcular_Conversao();
							
							lblValorConvertido.setText("Valor Convertido: £" + String.format("%.2f", M1.Valor_Convertido));
						}
					}
				}
				
			
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbEuro)
							.addGap(18)
							.addComponent(rdbDolar)
							.addGap(18)
							.addComponent(rdbLibra))
						.addComponent(lblConversoEm)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblR)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtReais))
						.addComponent(lblValor)
						.addComponent(lblValorConvertido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(200, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(177, Short.MAX_VALUE)
					.addComponent(btnCalcular)
					.addGap(158))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblValor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblR)
						.addComponent(txtReais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(lblConversoEm)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbEuro)
						.addComponent(rdbDolar)
						.addComponent(rdbLibra))
					.addGap(18)
					.addComponent(lblValorConvertido)
					.addGap(18)
					.addComponent(btnCalcular)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
