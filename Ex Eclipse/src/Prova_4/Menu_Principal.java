package Prova_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Principal frame = new Menu_Principal();
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
	public Menu_Principal() {
		setTitle("Menu Principal - Jo\u00E3o Piva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFuncionrio = new JMenu("Funcion\u00E1rio");
		menuBar.add(mnFuncionrio);
		
		JMenuItem mntmTcnico = new JMenuItem("T\u00E9cnico");
		mntmTcnico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Cadastrar_Tecnico frame = new Cadastrar_Tecnico();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		mnFuncionrio.add(mntmTcnico);
		
		JMenuItem mntmDocente = new JMenuItem("Docente");
		mntmDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Cadastrar_Docente frame = new Cadastrar_Docente();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		mnFuncionrio.add(mntmDocente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
