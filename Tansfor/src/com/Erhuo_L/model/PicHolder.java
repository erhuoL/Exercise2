package com.Erhuo_L.model;

import java.awt.*;
import java.io.File;

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
    	String path = new File(src).isAbsolute()
    			? src : context.loc + File.separator + src;
    	System.out.format("DrawPic '%s' in (%d, %d, %d, %d)\n", path, rect.x, rect.y, rect.width, rect.height);
    	
    	Graphics g = context.g;
    	ImageIcon icon = new ImageIcon(path);
		if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
			Image img = icon.getImage();
			g.drawImage(img, rect.x, rect.y, rect.width, rect.height, null);
		}
	}

	@Override
	public void pp(String indent) {
		System.out.println(indent + "- PicHolder");
		System.out.println(indent + TAB + "- [src] " + src);
	}
}
