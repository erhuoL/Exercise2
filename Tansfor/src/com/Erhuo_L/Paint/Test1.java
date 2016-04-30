package com.Erhuo_L.Paint;

import javax.swing.*;

import java.awt.*;

public class Test1 extends JFrame{
	public Test1(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,3));
		
		for(int i = 1;i <= 9 ;i++){
			p1.add(new JButton(""+i));
		}
		
		p1.add(new JButton("" + 0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));

		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("F**K"),BorderLayout.NORTH);
		p2.add(p1 , BorderLayout.CENTER);
		
		add(p2,BorderLayout.EAST);
		add(new JButton ("F**K"));
	}
	
	public static void main(String [] asd){
		Test1 frame = new Test1();
		frame.setTitle("asd");
		frame.setSize(400,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setVisible(true);
	}
	
}

