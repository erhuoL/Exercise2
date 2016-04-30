package com.Erhuo_L.Paint;

import java.awt.Rectangle;

import javax.swing.JFrame;

import com.Erhuo_L.model.*;

public class Test4 {

	public static void main(String[] args) {
		PaintContext ctx = null;
		PicHolder t = new PicHolder();
		t.setSrc("C:\\Users\\erhuo1\\Desktop\\Study\\1.jpg");
		TextHolder t2 = new TextHolder();
		t2.setText("C:\\Users\\erhuo1\\Desktop\\Study\\2.jpg");
		VertDiv vd = new VertDiv();
		vd.setInterval(4);
		vd.setWeights(new int[] { 2, 1 });
		vd.setParts(new Layout[] { t, t2 });
		vd.paint(ctx, new Rectangle(0, 0, 1000, 600));
	}

}
