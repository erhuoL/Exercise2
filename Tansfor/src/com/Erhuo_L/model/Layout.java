package com.Erhuo_L.model;

import java.awt.*;

import javax.swing.JPanel;

public abstract class Layout {
	public abstract void paint(PaintContext context, Rectangle rect );
	public abstract void pp(String indent);
	public void pp() {
		pp("");
	}
	protected static final String TAB = "    ";
}
