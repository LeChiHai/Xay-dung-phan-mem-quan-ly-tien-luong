package DoAnJava1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class GiaoDienCSAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienCSAdmin frame = new GiaoDienCSAdmin();
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
	public GiaoDienCSAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 39, 49);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(48, 5, 5, 5);
		panel.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel(" manv");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 39, 13);
		panel.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(48, 10, 94, 49);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("tennv");
		lblNewLabel_1.setBounds(25, 10, 57, 13);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(141, 10, 83, 49);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("luongcoban");
		lblNewLabel_2.setBounds(10, 10, 73, 13);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(223, 10, 77, 49);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("  songay");
		lblNewLabel_3.setBounds(10, 10, 57, 13);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(298, 10, 60, 49);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel(" phucap");
		lblNewLabel_4.setBounds(10, 10, 45, 13);
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(356, 10, 71, 49);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("tongluong");
		lblNewLabel_5.setBounds(10, 10, 61, 13);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(426, 10, 60, 49);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("  ghichu");
		lblNewLabel_6.setBounds(10, 10, 45, 13);
		panel_6.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("khenthuong");
		btnNewButton.setBounds(547, 121, 106, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("phat");
		btnNewButton_1.setBounds(547, 161, 106, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("logout");
		btnNewButton_2.setBounds(547, 203, 106, 33);
		contentPane.add(btnNewButton_2);
		
		table = new JTable();
		table.setBounds(10, 10, 476, 243);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 237, 439, 16);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(465, 58, 21, 195);
		contentPane.add(scrollPane_1);
	}
}
