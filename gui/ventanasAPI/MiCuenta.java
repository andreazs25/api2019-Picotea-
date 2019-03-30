package ventanasAPI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MiCuenta extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblNewLabel_1;
	private JLabel lblTelefono;
	private JLabel label;
	private JLabel lblEmail;
	private JLabel lblFooemailcom;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiCuenta frame = new MiCuenta();
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
	public MiCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(10, 0, 414, 261);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNombre());
			panel.add(getLblNewLabel_1());
			panel.add(getLblTelefono());
			panel.add(getLabel());
			panel.add(getLblEmail());
			panel.add(getLblFooemailcom());
			panel.add(getLabel_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("MiCuenta");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(137, 22, 128, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombre.setForeground(Color.WHITE);
			lblNombre.setBounds(170, 67, 79, 14);
		}
		return lblNombre;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("yo mismo");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(259, 67, 65, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblTelefono() {
		if (lblTelefono == null) {
			lblTelefono = new JLabel("Telefono:");
			lblTelefono.setForeground(Color.WHITE);
			lblTelefono.setBounds(170, 106, 65, 14);
		}
		return lblTelefono;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("99887799");
			label.setForeground(Color.WHITE);
			label.setBounds(259, 106, 93, 14);
		}
		return label;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email:");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setBounds(170, 152, 79, 14);
		}
		return lblEmail;
	}
	private JLabel getLblFooemailcom() {
		if (lblFooemailcom == null) {
			lblFooemailcom = new JLabel("foo@email.com");
			lblFooemailcom.setForeground(Color.WHITE);
			lblFooemailcom.setBounds(259, 152, 107, 14);
		}
		return lblFooemailcom;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(MiCuenta.class.getResource("/ventanasAPI/Windows Live Messenger 2011 v15.4.3002.0810 Beta (Espa\u00F1ol).png")));
			label_1.setBounds(23, 54, 114, 138);
		}
		return label_1;
	}
}
