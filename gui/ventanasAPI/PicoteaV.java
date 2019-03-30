package ventanasAPI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JButton;

import org.json.JSONObject;

import modelo.LoginRegistro;
import modelo.Picotea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PicoteaV extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblPicotea;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PicoteaV frame = new PicoteaV();
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
	public PicoteaV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 430);
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
			panel.setBounds(0, 0, 897, 576);
			panel.setLayout(null);
			panel.add(getLabel_1());
			panel.add(getLabel_2());
			panel.add(getLabel_1_1());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLabel_1() {
		if (lblPicotea == null) {
			lblPicotea = new JLabel("PICOTEA");
			lblPicotea.setForeground(Color.WHITE);
			lblPicotea.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 33));
			lblPicotea.setBounds(199, 11, 276, 43);
		}
		return lblPicotea;
	}
	private JLabel getLabel_2() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon(PicoteaV.class.getResource("/VentanasAPI/ppp.PNG")));
			label.setBounds(72, 85, 511, 79);
		}
		return label;
	}
	private JLabel getLabel_1_1() {
		if (lblNewLabel == null) {
			String Descri=null;
			JSONObject re=Picotea.getInstance().verPicotea();
			for(int i = 0 ; i < re.length() ; i++){
				Descri = " "+" "+re.get("descripcion").toString();
			}
			
			lblNewLabel = new JLabel(Descri);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(72, 213, 511, 43);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Entrar");
			btnNewButton.setBackground(Color.BLACK);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login g=new Login();
					g.setVisible(true);
				}
			});
			btnNewButton.setBounds(344, 329, 97, 33);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Registrarse");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Registro r=new Registro();
					r.setVisible(true);
				}
			});
			btnNewButton_1.setBackground(Color.BLACK);
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setBounds(493, 329, 104, 33);
		}
		return btnNewButton_1;
	}
}
