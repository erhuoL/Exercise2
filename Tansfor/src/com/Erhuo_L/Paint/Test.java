package com.Erhuo_L.Paint;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {

 public Test() {

 int width = 100;
 int height = 100;
 
 ImageIcon image = new ImageIcon("C:\\Users\\erhuo1\\Desktop\\Study\\1.jpg");
 	image.setImage(image.getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT));
 	JLabel label = new JLabel(image);
 
 	getContentPane().add(label);
 
 	setBounds(100, 100, 200, 200);
 	setDefaultCloseOperation(EXIT_ON_CLOSE);
 	setVisible(true);
 }

 public static void main(String[] args) {
 new Test();
 }
}