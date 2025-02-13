package pruebaFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 265, 450, 62);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Doctores");
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/img/doctor.png")));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Personal");
		btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("/img/personal.png")));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setIcon(new ImageIcon(Menu.class.getResource("/img/cerrar-sesion (1).png")));
		btnNewButton_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		});
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 200, 450, 62);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNuevaConsulta = new JButton("Nueva Consulta");
		btnNuevaConsulta.setIcon(new ImageIcon(Menu.class.getResource("/img/consulta.png")));
		btnNuevaConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNuevaConsulta);
		
		JButton btnNewButton_1_1 = new JButton("Clientes");
		btnNewButton_1_1.setIcon(new ImageIcon(Menu.class.getResource("/img/cliente.png")));
		btnNewButton_1_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        datos frame = new datos();
		        frame.setVisible(true);
				dispose();
		    }
		});
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Mascotas");
		btnNewButton_2_1.setIcon(new ImageIcon(Menu.class.getResource("/img/mascota.png")));
		btnNewButton_2_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        datosMascota frame = new datosMascota();
		        frame.setVisible(true);
				dispose();
		    }
		});
		panel_1.add(btnNewButton_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 4, 0));
		panel_2.setBounds(0, 0, 450, 38);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("VETERINARIA \"JA\"");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/img/Veterinaria.png")));
		lblNewLabel_1.setBounds(0, 35, 450, 166);
		contentPane.add(lblNewLabel_1);
	}
}
