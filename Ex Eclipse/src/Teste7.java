import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Teste7 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste7 frame = new Teste7();
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
	public Teste7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDigiteONmero = new JLabel("Digite o n\u00FAmero do m\u00EAs");
		lblDigiteONmero.setForeground(Color.BLACK);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		
		JLabel lblFrase = new JLabel("");
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Num_Mes ;
				
				Num_Mes = Integer.parseInt(txtMes.getText());
	
				String Resp ;
				
				switch (Num_Mes)
				{
					case 1: 
						
					Resp = " Janeiro" ;
					
					break;
					
					case 2: 
						
					Resp = " Fevereiro" ;
						
					break;
						
					case 3: 
						
					Resp = " Março" ;
						
					break;
						
					case 4: 
						
					Resp = " Abril" ;
						
					break;
						
					case 5: 
						
					Resp = " Maio" ;
						
					break;
						
					case 6: 
						
					Resp = " Junho" ;
						
					break;
						
					case 7: 
						
					Resp = " Julho" ;
						
					break;
					
					case 8: 
						
					Resp = " Agosto" ;
						
					break;
					
					case 9: 
						
					Resp = " Setembro" ;
						
					break;
						
					case 10: 
						
					Resp = " Outubro" ;
						
					break;
						
					case 11: 
						
					Resp = " Novembro" ;
						
					break;
						
					case 12: 
						
					Resp = " Dezembro" ;
						
					break;
						
					default:
						
					Resp = "Mês inválido!";	
				}
				
				lblFrase.setText("O mês correspondente é " + Resp);
			}
		});
		
		lblFrase.setForeground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(137)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblDigiteONmero, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnExibir, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(86, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(97, Short.MAX_VALUE)
					.addComponent(lblFrase, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addGap(71))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDigiteONmero)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(lblFrase, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addComponent(btnExibir)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
