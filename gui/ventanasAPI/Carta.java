package ventanasAPI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Carta {

	private JFrame frame;
	private JLabel bebida1;
	private JLabel bebida2;
	private JLabel bebida3;
	private JLabel lblPrecioUnidad;
	private JLabel pb1;
	private JLabel pb2;
	private JLabel pb3;
	private JLabel label_3;
	private JLabel comida1;
	private JLabel comida2;
	private JLabel comida3;
	private JLabel pc1;
	private JLabel pc2;
	private JLabel pc3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carta window = new Carta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Carta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 711, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCarta = new JLabel("CARTA");
		lblCarta.setForeground(Color.WHITE);
		lblCarta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCarta.setBounds(291, 4, 135, 37);
		frame.getContentPane().add(lblCarta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Carta.class.getResource("/ventanasAPI/icon.png")));
		btnNewButton.setBounds(624, 4, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setForeground(Color.WHITE);
		lblBebidas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBebidas.setBounds(52, 49, 69, 20);
		frame.getContentPane().add(lblBebidas);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(367, 85, 32, 26);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(367, 127, 32, 26);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(367, 169, 32, 26);
		frame.getContentPane().add(spinner_2);
		
		JLabel lblComida = new JLabel("Comida");
		lblComida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblComida.setForeground(Color.WHITE);
		lblComida.setBounds(52, 232, 69, 20);
		frame.getContentPane().add(lblComida);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(367, 268, 32, 26);
		frame.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(367, 310, 32, 26);
		frame.getContentPane().add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(367, 352, 32, 26);
		frame.getContentPane().add(spinner_5);
		
		JButton btnResumen = new JButton("Resumen");
		btnResumen.setBackground(SystemColor.desktop);
		btnResumen.setForeground(SystemColor.text);
		btnResumen.setBounds(494, 336, 146, 44);
		frame.getContentPane().add(btnResumen);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Carta.class.getResource("/ventanasAPI/450_1000.jpg")));
		lblNewLabel.setBounds(457, 85, 183, 174);
		frame.getContentPane().add(lblNewLabel);
		
		bebida1 = new JLabel("Caf\u00E9");
		bebida1.setForeground(SystemColor.text);
		bebida1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		bebida1.setBounds(15, 85, 146, 26);
		frame.getContentPane().add(bebida1);
		
		bebida2 = new JLabel("T\u00E9");
		bebida2.setForeground(Color.WHITE);
		bebida2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		bebida2.setBounds(15, 127, 146, 26);
		frame.getContentPane().add(bebida2);
		
		bebida3 = new JLabel("Vino");
		bebida3.setForeground(Color.WHITE);
		bebida3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		bebida3.setBounds(15, 172, 146, 26);
		frame.getContentPane().add(bebida3);
		
		lblPrecioUnidad = new JLabel("Precio Unidad");
		lblPrecioUnidad.setForeground(Color.WHITE);
		lblPrecioUnidad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPrecioUnidad.setBounds(188, 49, 146, 20);
		frame.getContentPane().add(lblPrecioUnidad);
		
		pb1 = new JLabel("1,50\u20AC");
		pb1.setForeground(Color.WHITE);
		pb1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pb1.setBounds(188, 85, 146, 26);
		frame.getContentPane().add(pb1);
		
		pb2 = new JLabel("1,50\u20AC");
		pb2.setForeground(Color.WHITE);
		pb2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pb2.setBounds(188, 127, 146, 26);
		frame.getContentPane().add(pb2);
		
		pb3 = new JLabel("2\u20AC");
		pb3.setForeground(Color.WHITE);
		pb3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pb3.setBounds(188, 172, 146, 26);
		frame.getContentPane().add(pb3);
		
		label_3 = new JLabel("Precio Unidad");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label_3.setBounds(188, 232, 146, 20);
		frame.getContentPane().add(label_3);
		
		comida1 = new JLabel("Pincho tortilla");
		comida1.setForeground(Color.WHITE);
		comida1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		comida1.setBounds(15, 268, 146, 26);
		frame.getContentPane().add(comida1);
		
		comida2 = new JLabel("Sandwich mixto");
		comida2.setForeground(Color.WHITE);
		comida2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		comida2.setBounds(15, 310, 146, 26);
		frame.getContentPane().add(comida2);
		
		comida3 = new JLabel("Bravas");
		comida3.setForeground(Color.WHITE);
		comida3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		comida3.setBounds(15, 355, 146, 26);
		frame.getContentPane().add(comida3);
		
		pc1 = new JLabel("1,50\u20AC");
		pc1.setForeground(Color.WHITE);
		pc1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pc1.setBounds(188, 271, 146, 26);
		frame.getContentPane().add(pc1);
		
		pc2 = new JLabel("3\u20AC");
		pc2.setForeground(Color.WHITE);
		pc2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pc2.setBounds(188, 313, 146, 26);
		frame.getContentPane().add(pc2);
		
		pc3 = new JLabel("3,5\u20AC");
		pc3.setForeground(Color.WHITE);
		pc3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		pc3.setBounds(188, 355, 146, 26);
		frame.getContentPane().add(pc3);
	}

}
