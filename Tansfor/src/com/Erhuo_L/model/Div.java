package com.Erhuo_L.model;

import java.awt.Rectangle;
import java.util.Arrays;


public abstract class Div extends Layout{
	protected int [] weights;
	protected int interval;
	protected Layout [] parts ;

	public int[] getWeights() {
		return weights;
	}
	public void setWeights(int[] weights) {
		this.weights = weights;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	public Layout[] getParts() {
		return parts;
	}
	public void setParts(Layout[] parts) {
		this.parts = parts;
	}
	
	
	@Override
	public void pp(String indent) {
		PaintContext ctx = null;
		String tag = (this instanceof HorzDiv) ? "HorzDiv" : "VertDiv";
		System.out.println(indent + "- " + tag);
		System.out.println(indent + TAB + "- [weights] " + Arrays.toString(weights));
		System.out.println(indent + TAB + "- [interval] " + interval);
		System.out.println(indent + TAB + "- [parts]");
		for (Layout o : parts) {
			o.pp(indent + TAB + TAB);
		}
		
		if(tag == "VertDiv"){
			VertDiv vd = new VertDiv();
			vd.setInterval(interval);
			vd.setWeights(weights);
			vd.setParts(parts);
			vd.paint(ctx, new Rectangle(0, 0, 1000, 600));
		}
	}
}
