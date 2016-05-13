package com.Erhuo_L.Paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.Erhuo_L.model.Layout;
import com.Erhuo_L.model.PaintContext;
import com.Erhuo_L.model.PicHolder;
import com.Erhuo_L.model.TextHolder;

@SuppressWarnings("serial")
public class PageFrame extends JFrame {
	private Layout mLayout;
	private int mPageWidth, mPageHeight;
	private String mDir;
	
	class PagePanel extends JPanel {
		Font font = new Font("ËÎÌו", 0, 20);
		
		public PagePanel() {
			setPreferredSize(new Dimension(mPageWidth, mPageHeight));
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.setFont(font);
			g.setColor(Color.BLACK);
			
			PaintContext ctx = new PaintContext(g, mDir);
			final int PADDING = 10;
			Rectangle pageRect = new Rectangle(
					PADDING, PADDING,
					mPageWidth - PADDING * 2, mPageHeight - PADDING * 2);
			
			mLayout.paint(ctx, pageRect);
		}
	}
	
	public PageFrame(Layout layout, int width, int height, String dir) {
        mLayout = layout;
        mPageWidth = width;
        mPageHeight = height;
        mDir = dir;
        
		PagePanel panel = new PagePanel();
		add(panel);
		
		// REF: http://stackoverflow.com/questions/4118727/resize-jframe-according-to-jpanel-image-content
        pack();
        
        setTitle("Page");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
