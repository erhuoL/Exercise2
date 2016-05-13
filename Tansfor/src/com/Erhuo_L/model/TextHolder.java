package com.Erhuo_L.model;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

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
    	
    	Graphics g = context.g;
    	// http://stackoverflow.com/questions/14284754/java-center-text-in-rectangle
        FontMetrics fm = g.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(text, g);
        
        int x = rect.x + (rect.width - (int) r.getWidth()) / 2;
        int y = rect.y + (rect.height - (int) r.getHeight()) / 2 + fm.getAscent();
        
		g.drawString(text, x, y);
    }
	
	@Override
	public void pp(String indent) {
		System.out.println(indent + "- TextHolder");
		System.out.println(indent + TAB + "- [text] " + text);
	}
}
