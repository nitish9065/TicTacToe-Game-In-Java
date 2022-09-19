package TicTacgame.src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JProgressBar;
import java.awt.Font;

public class TicTacSplash {

	protected static  JFrame frame;
	protected static JProgressBar progressBar;
	protected static JLabel number;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TicTacSplash window = new TicTacSplash();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public TicTacSplash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(550, 150, 370, 540);
//		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 370, 540);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.YELLOW));
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(new Rectangle(6, 6, 358, 530));
		l1.setIcon(new ImageIcon(getClass().getResource("ticsplash.png")));
		panel.add(l1);

		JPanel p2 = new JPanel();
		p2.setBackground(new Color(25, 25, 112));
//	p2.setBackground(new Color(0,0,0,0));
		p2.setBounds(6, 6, 360, 530);
		panel.add(p2);
		p2.setLayout(null);
		
	    progressBar = new JProgressBar();
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 17));
		progressBar.setBackground(new Color(255, 0, 0));
		progressBar.setForeground(new Color(255, 255, 0));
		progressBar.setBounds(43, 462, 277, 17);
		p2.add(progressBar);
		
	    number = new JLabel("");
	    number.setBackground(Color.black);
		number.setForeground(Color.white);
		number.setFont(new Font("Arial",Font.BOLD,18));
		number.setBounds(148, 424, 53, 29);
		p2.add(number);
//		
//		JLabel l2 = new JLabel("");
//		l2.setForeground(Color.WHITE);
//		l2.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\tic.gif"));
//		l2.setBackground(new Color(0,0,0,0));
//		l2.setBounds(35, 277, 300, 243);
//		p2.add(l2);

		frame.getContentPane().add(panel);

	}
}
