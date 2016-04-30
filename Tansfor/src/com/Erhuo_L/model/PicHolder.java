package com.Erhuo_L.model;

import java.awt.*;

import javax.swing.*;

public class PicHolder extends Layout{
	private  String src;
	
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	
    public void paint(PaintContext context, Rectangle rect) {
    	System.out.format("DrawPic '%s' in (%d, %d, %d, %d)\n", src, rect.x, rect.y, rect.width, rect.height);
    	
    	 ImageIcon image = new ImageIcon(src);
    	 	image.setImage(image.getImage().getScaledInstance(rect.width,rect.height,Image.SCALE_DEFAULT));
    	 	JLabel label = new JLabel(image);
    	 	JFrame p1 = new JFrame();
    	 
    	 	p1.getContentPane().add(label);
    	 
    	 	p1.setBounds(rect.x, rect.y, rect.width, rect.height);
    	 	p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 	p1.setVisible(true);
	}

	@Override
	public void pp(String indent) {
		System.out.println(indent + "- PicHolder");
		System.out.println(indent + TAB + "- [src] " + src);
	}
}
