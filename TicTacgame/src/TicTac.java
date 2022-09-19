package TicTacgame.src;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTac {

	protected static JFrame frmTicTacToe;
	protected static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	protected static String str = "X";
	protected static int over =0, score=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TicTacSplash ss = new TicTacSplash();
		TicTacSplash.frame.setVisible(true);
		int x;
		try {
			for(x=0; x<=100;x++) {
				TicTacSplash.progressBar.setValue(x);
				Thread.sleep(50);
				TicTacSplash.number.setText(Integer.toString(x)+" %");

				if(x==100) {
					TicTacSplash.frame.dispose();
					TicTac window = new TicTac();
					window.frmTicTacToe.setVisible(true);
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public TicTac() {
		initialize();
		ChooseText();
		Winnercheck();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void ChooseText() {
		
		if(str.equalsIgnoreCase("O")){
			str= "X";
		}
		else
			str= "O";
	}
	private void Winnercheck() {

		        if ((b1.getText() == "X") && (b2.getText() == "X") && (b3.getText() == "X")) {
					score+=100;
					xWins();

		        }
		        else if ((b1.getText() == "X") && (b5.getText() == "X") && (b9.getText() == "X")) {
					score+=100;
		            xWins();

		        }
		        else if ((b1.getText() == "X") && (b4.getText() == "X") && (b7.getText() == "X")) {
					score+=100;
		        	xWins();

		        }
		        else if ((b2.getText() == "X") && (b5.getText() == "X") && (b8.getText() == "X")) {
					score+=100;
		            xWins();

		        }
		        else if ((b3.getText() == "X") && (b5.getText() == "X") && (b7.getText() == "X")) {
					score+=100;
		            xWins();

		        }
		        else if ((b3.getText() == "X") && (b6.getText() == "X") && (b9.getText() == "X")) {
					score+=100;
		            xWins();

		        }
		       else if ((b4.getText() == "X") && (b5.getText() == "X") && (b6.getText() == "X")) {
					score+=100;
		            xWins();

		        }
		       else if ((b7.getText() == "X") && (b8.getText() == "X") && (b9.getText() == "X")) {
					score+=100;
		            xWins();

		        }

		        else if ((b1.getText() == "O") && (b2.getText() == "O") && (b3.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if ((b1.getText() == "O") && (b4.getText() == "O") && (b7.getText() == "O")) {
					score+=100;
		        	oWins();

		        }
		        else if ((b1.getText() == "O") && (b5.getText() == "O") && (b9.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if ((b2.getText() == "O") && (b5.getText() == "O") && (b8.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if ((b3.getText() == "O") && (b5.getText() == "O") && (b7.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if ((b3.getText() == "O") && (b6.getText() == "O") && (b9.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if ((b4.getText() == "O") && (b5.getText() == "O") && (b6.getText() == "O")) {
					score+=100;
		            oWins();

		        } else if ((b7.getText() == "O") && (b8.getText() == "O") && (b9.getText() == "O")) {
					score+=100;
		            oWins();

		        }
		        else if (over == 9) {
					score =0;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					tie();
		        }

	}
//    public void gameOver(String s){
//
//        Object[] option={"Restart","Exit"};
//        int n=JOptionPane.showOptionDialog(frmTicTacToe, "Game Over\n"+s,"Game Over",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[0]);
//        if(n==0){
//        	frmTicTacToe.setVisible(false);
//            new TicTac();
//        	b1.setText("");b2.setText("");b3.setText("");b4.setText("");b5.setText("");b6.setText("");b7.setText("");b8.setText("");b9.setText("");over=0;str="O";
//            frmTicTacToe.setVisible(true);
//        }
//        else{
//            frmTicTacToe.dispose();
//        }
//
//    }
		    private void xWins() {

		try{
			Thread.sleep(2000);
		}
		catch (Exception ev){
			ev.printStackTrace();
		}
		     frmTicTacToe.setVisible(false);
		      Score2 ss = new Score2("X Wins",score);
	          Score2.l1.setIcon(new ImageIcon(getClass().getResource("x.gif")));
	          ss.setVisible(true);

		    }
		    private void oWins() {

				try{
					Thread.sleep(2000);
				}
				catch (Exception ev){
					ev.printStackTrace();
				}
				frmTicTacToe.setVisible(false);
				Score2 ss = new Score2("O Wins",score);
				Score2.l1.setIcon(new ImageIcon(getClass().getResource("o.gif")));
				ss.setVisible(true);

//		        gameOver("O Wins");
		    }
		    private void tie() {
				try{
					Thread.sleep(2000);
				}
				catch (Exception ev){
					ev.printStackTrace();
				}
				frmTicTacToe.setVisible(false);
				Score2 ss = new Score2("MATCH TIE ",score);
				Score2.l1.setIcon(new ImageIcon(getClass().getResource("draw.gif")));
				ss.setVisible(true);
//		    	gameOver("MATCH TIE");
		    }

	private void initialize() {

		frmTicTacToe = new JFrame();
		frmTicTacToe.setForeground(Color.RED);
		frmTicTacToe.setFont(new Font("HP Simplified Jpan", Font.BOLD, 18));
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.getContentPane().setBackground(Color.BLACK);
		frmTicTacToe.setBackground(Color.BLACK);
	//	frame.setUndecorated(true);
		frmTicTacToe.setBounds(550, 150, 390, 545);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Image icon =Toolkit.getDefaultToolkit().getImage("E:\\Java Programs\\TicTacgame\\src\\tic2.jpg");

		frmTicTacToe.setIconImage(icon);

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		frmTicTacToe.getContentPane().add(p1, BorderLayout.CENTER);
		p1.setLayout(null);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLACK);
		p2.setBounds(8, 10, 361, 62);
		p1.add(p2);
		p2.setLayout(new BorderLayout(0, 0));
		
		JLabel l1 = new JLabel("Tic Tac Toe");
		l1.setBorder(new LineBorder(Color.WHITE, 3, true));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("HP Simplified", Font.BOLD, 35));
		l1.setForeground(Color.WHITE);
		l1.setBackground(Color.BLACK);
		p2.add(l1, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.YELLOW);
		p3.setBounds(8, 91, 359, 331);
		p1.add(p3);
		p3.setLayout(new GridLayout(3, 3, 5, 5));
		
	    b1 = new JButton("");
		b1.setFocusPainted(true);
		b1.setFocusable(false);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getText()=="") {
				   b1.setText(str);
				   over++;

				if(str.equalsIgnoreCase("O")) {
					b1.setForeground(Color.yellow);
				}
				else {
					b1.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();

			}
		});
		b1.setBackground(Color.BLACK);
		b1.setFont(new Font("Ink Free", Font.BOLD, 73));
		b1.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b1);
		
		 b2 = new JButton("");
		b2.setFocusPainted(true);
		b2.setFocusable(false);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText()=="") {
				b2.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b2.setForeground(Color.yellow);
				
				}
				else {
					b2.setForeground(Color.red);
				}
				}

				Winnercheck();
				ChooseText();


			}
		});
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Ink Free", Font.BOLD, 73));
		b2.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b2);
		
		b3 = new JButton("");
		b3.setFocusPainted(true);
		b3.setFocusable(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b3.getText()=="") {
				b3.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b3.setForeground(Color.yellow);
				}
				else {
					b3.setForeground(Color.red);
			         	}
				}
				Winnercheck();
				ChooseText();


			}
		});
		b3.setBackground(Color.BLACK);
		b3.setFont(new Font("Ink Free", Font.BOLD, 73));
		b3.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b3);
		
		b4 = new JButton("");
		b4.setFocusPainted(true);
		b4.setFocusable(false);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b4.getText()=="") {
				b4.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b4.setForeground(Color.yellow);

				}
				else {
					b4.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();


			}
		});
		b4.setBackground(Color.BLACK);
		b4.setFont(new Font("Ink Free", Font.BOLD, 73));
		b4.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b4);
		
		b5 = new JButton("");
		b5.setFocusPainted(true);
		b5.setFocusable(false);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b5.getText()=="") {
				b5.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b5.setForeground(Color.yellow);

				}
				else {
					b5.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();


			}
		});
		b5.setBackground(Color.BLACK);
		b5.setFont(new Font("Ink Free", Font.BOLD, 73));
		b5.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b5.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b5);
		
	    b6 = new JButton("");
		b6.setFocusPainted(true);
		b6.setFocusable(false);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b6.getText()=="") {
				b6.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b6.setForeground(Color.yellow);

				}
				else {
					b6.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();


			}
		});
		b6.setBackground(Color.BLACK);
		b6.setFont(new Font("Ink Free", Font.BOLD, 73));
		b6.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b6.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b6);
		
		b7 = new JButton("");
		b7.setFocusPainted(true);
		b7.setFocusable(false);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b7.getText()=="") {
				b7.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b7.setForeground(Color.yellow);
				}
				else {
					b7.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();


			}
		});
		b7.setBackground(Color.BLACK);
		b7.setFont(new Font("Ink Free", Font.BOLD, 73));
		b7.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b7.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b7);
		
		b8 = new JButton("");
		b8.setFocusPainted(true);
		b8.setFocusable(false);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b8.getText()=="") {
				b8.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b8.setForeground(Color.yellow);

				}
				else {
					b8.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();


			}
		});		
		b8.setBackground(Color.BLACK);
		b8.setFont(new Font("Ink Free", Font.BOLD, 73));
		b8.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b8.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b8.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b8);
		
		b9 = new JButton("");
		b9.setFocusPainted(true);
		b9.setFocusable(false);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b9.getText()=="") {
				b9.setText(str);
				   over++;
				if(str.equalsIgnoreCase("O")) {
					b9.setForeground(Color.yellow);

				}
				else {
					b9.setForeground(Color.red);
				}
				}
				Winnercheck();
				ChooseText();

			}
		});
		b9.setBackground(Color.BLACK);
		b9.setFont(new Font("Ink Free", Font.BOLD, 73));
		b9.setBorder(new LineBorder(Color.MAGENTA, 8, true));
		b9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		b9.setAlignmentX(Component.RIGHT_ALIGNMENT);
		p3.add(b9);
		
		JButton reset = new JButton("Reset");
		reset.setFocusPainted(false);
		reset.setFocusable(false);
		reset.setContentAreaFilled(false);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText("");b2.setText("");b3.setText("");b4.setText("");b5.setText("");b6.setText("");b7.setText("");b8.setText(""); b9.setText("");over=0;score=0;str="X";
			}
		});
		reset.setBorder(new LineBorder(Color.RED, 9, true));
		reset.setForeground(Color.WHITE);
		reset.setFont(new Font("HP Simplified", Font.BOLD, 24));
		reset.setBackground(Color.RED);
		reset.setBounds(110, 432, 153, 43);
		p1.add(reset);
		
	}
	
}
