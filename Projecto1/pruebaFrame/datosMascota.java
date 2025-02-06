package pruebaFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class datosMascota extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datosMascota frame = new datosMascota();
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
	public datosMascota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos la Mascota", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 9, 0)));
		panel.setBounds(6, 6, 438, 92);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(6, 26, 61, 16);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(84, 21, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Raza");
		lblNewLabel_1.setBounds(226, 26, 61, 16);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(270, 22, 130, 27);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setBounds(6, 62, 61, 16);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 59, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tamaño");
		lblNewLabel_3.setBounds(226, 62, 61, 16);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(280, 57, 130, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Observaciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 9, 0)));
		panel_1.setBounds(6, 103, 438, 117);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 19, 426, 92);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setIcon(new ImageIcon(datosMascota.class.getResource("/img/aceptar.png")));
		btnNewButton.setBounds(287, 232, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.setIcon(new ImageIcon(datosMascota.class.getResource("/img/casa (1).png")));
		btnInicio.setBounds(29, 232, 117, 29);
		contentPane.add(btnInicio);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(datosMascota.class.getResource("/img/escoba.png")));
		btnLimpiar.setBounds(158, 232, 117, 29);
		contentPane.add(btnLimpiar);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textArea.setText("");
			}
		});
	}
}
