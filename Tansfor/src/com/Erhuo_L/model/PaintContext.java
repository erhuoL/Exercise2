package com.Erhuo_L.model;

import java.awt.*;

public class PaintContext {
	public final Graphics g;
	public final String loc;
	public PaintContext(Graphics g, String loc){
		this.g = g;
		this.loc = loc;
	}
}
