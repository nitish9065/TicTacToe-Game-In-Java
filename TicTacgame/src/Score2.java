package TicTacgame.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score2 extends JFrame implements ActionListener{

    protected static  JLabel l1;
    Score2(String username, int score){

        setTitle("Score Board ");
        setBounds(550, 150, 400, 550);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Projects/Swing/Quiz/src/simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel();

       l1.setIcon(i3);
     //   l1.setIcon(new ImageIcon(getClass().getResource("x.gif")));
     //   l1.setIcon(new ImageIcon(getClass().getResource("o.gif")));
     //   l1.setIcon(new ImageIcon(getClass().getResource("draw.gif")));
        l1.setBounds(50, 60, 300, 300);
        add(l1);
        
        JLabel l2 = new JLabel(username+"  Thanks for Playing...");
        l2.setForeground(Color.white);
        l2.setBounds(45, 10, 350, 30);
        l2.setFont(new Font("HP Simplified Jpan", Font.PLAIN, 20));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(90, 390, 230, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setFont(new Font("HP Simplified Jpan", Font.BOLD, 16));
        b1.setFocusable(false);
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.red);
        b1.addActionListener(this);
        
        b1.setBounds(120, 440, 120, 30);
        add(b1);

        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        dispose();
        TicTac tt = new TicTac();
        tt.score=0;	tt.b1.setText("");tt.b2.setText("");
        tt.b3.setText("");tt.b4.setText("");tt.b5.setText("");
        tt.b6.setText("");tt.b7.setText("");tt.b8.setText("");
        tt.b9.setText("");tt.over=0;tt.str="X";
        tt.score=0;
        tt.frmTicTacToe.setVisible(true);



    }
    
//    public static void main(String[] args){
//        new Score2("", 0).setVisible(true);
//    }
}
