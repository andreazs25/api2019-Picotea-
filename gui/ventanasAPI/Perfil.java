package ventanasAPI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import modelo.LoginRegistro;
import modelo.Resumen;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblPicotea;
	private JLabel lblC;
	private JButton btnSalir;
	private JLabel lblBienvenido;
	private JLabel lblNewLabel;
	private JButton btnPedidos;
	private JButton btnResumen;
	private JLabel lblCategoria;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JButton btnVerMiCuenta;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 381);
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
			panel.setBounds(0, 0, 514, 343);
			panel.setLayout(null);
			panel.add(getLblPicotea());
			panel.add(getLblC());
			panel.add(getBtnSalir());
			panel.add(getLblBienvenido());
			panel.add(getLblNewLabel());
			panel.add(getBtnPedidos());
			panel.add(getBtnResumen());
			panel.add(getLblCategoria());
			panel.add(getBtnNewButton());
			panel.add(getLblNewLabel_1());
			panel.add(getBtnVerMiCuenta());
		}
		return panel;
	}
	private JLabel getLblPicotea() {
		if (lblPicotea == null) {
			lblPicotea = new JLabel("Picotea:");
			lblPicotea.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			lblPicotea.setForeground(Color.WHITE);
			lblPicotea.setBounds(80, 61, 93, 22);
		}
		return lblPicotea;
	}
	private JLabel getLblC() {
		if (lblC == null) {
			lblC = new JLabel("T\u00E9rminos,Condiciones,Privacidad");
			lblC.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					LoginRegistro.getInstance().abrirNavegador("https://edgarandresblog.wordpress.com/2019/03/29/picotea-politica-de-privacidad/");
					
				}
			});
			lblC.setBackground(Color.WHITE);
			lblC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			lblC.setForeground(Color.CYAN);
			lblC.setBounds(174, 64, 239, 19);
		}
		return lblC;
	}
	private JButton getBtnSalir() {
		if (btnSalir == null) {
			btnSalir = new JButton("Salir");
			btnSalir.setBackground(Color.BLACK);
			btnSalir.setForeground(Color.WHITE);
			btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnSalir.setBounds(174, 94, 93, 33);
		}
		return btnSalir;
	}
	private JLabel getLblBienvenido() {
		if (lblBienvenido == null) {
			lblBienvenido = new JLabel("Bienvenido:");
			lblBienvenido.setForeground(Color.WHITE);
			lblBienvenido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			lblBienvenido.setBounds(46, 150, 107, 22);
		}
		return lblBienvenido;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("aki un emaill");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(181, 152, 164, 20);
		}
		return lblNewLabel;
	}
	private JButton getBtnPedidos() {
		if (btnPedidos == null) {
			btnPedidos = new JButton("Pedidos");
			btnPedidos.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//no tengo la interfaz
				}
			});
			btnPedidos.setBackground(Color.BLACK);
			btnPedidos.setForeground(Color.WHITE);
			btnPedidos.setBounds(178, 183, 89, 30);
		}
		return btnPedidos;
	}
	private JButton getBtnResumen() {
		if (btnResumen == null) {
			btnResumen = new JButton("Resumen");
			btnResumen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					ResumenV r=new ResumenV();
					r.setVisible(true);
				}
			});
			btnResumen.setBackground(Color.BLACK);
			btnResumen.setForeground(Color.WHITE);
			btnResumen.setBounds(178, 227, 89, 33);
		}
		return btnResumen;
	}
	private JLabel getLblCategoria() {
		if (lblCategoria == null) {
			lblCategoria = new JLabel("Categor\u00EDa:");
			lblCategoria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			lblCategoria.setForeground(Color.WHITE);
			lblCategoria.setBounds(55, 281, 98, 22);
		}
		return lblCategoria;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Bares");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Bares b=new Bares();
					//no me da la opcion de llmar a la ventana de ivan
					
					
				
					
				}
			});
			btnNewButton.setBackground(Color.BLACK);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(178, 277, 89, 33);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(Perfil.class.getResource("/ventanasAPI/calabacin.png")));
			lblNewLabel_1.setBounds(314, 185, 164, 88);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnVerMiCuenta() {
		if (btnVerMiCuenta == null) {
			btnVerMiCuenta = new JButton("Ver mi Cuenta");
			btnVerMiCuenta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					LoginRegistro.getInstance().verLogin();
				}
			});
			btnVerMiCuenta.setBackground(Color.BLACK);
			btnVerMiCuenta.setForeground(Color.WHITE);
			btnVerMiCuenta.setBounds(304, 153, 127, 23);
		}
		return btnVerMiCuenta;
	}
}
