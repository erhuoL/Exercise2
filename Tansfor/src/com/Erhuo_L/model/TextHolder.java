package com.Erhuo_L.model;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextHolder extends Layout{
	private  String text;
	private  String font;
	private  int    size;

	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getText() {
		return text;
	}
	public String Text() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public void paint(PaintContext context, Rectangle rect){
    	System.out.format("DrawText '%s' in (%d, %d, %d, %d)\n", text, rect.x, rect.y, rect.width, rect.height);
    	
    	JLabel label = new JLabel(text);
    	JFrame p1 = new JFrame();
   	 
	 	p1.getContentPane().add(label);
	 
	 	p1.setBounds(rect.x, rect.y, rect.width, rect.height);
	 	p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	p1.setVisible(true);
    	
    	
    }
	
	@Override
	public void pp(String indent) {
		System.out.println(indent + "- TextHolder");
		System.out.println(indent + TAB + "- [text] " + text);
	}
}
