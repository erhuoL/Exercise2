package com.Erhuo_L.model;

import java.awt.Rectangle;

import com.Erhuo_L.model.Div;

public class VertDiv extends Div{
	public void paint(PaintContext context, Rectangle rect) {
		int totalWeight = 0;
		for (int w : weights) {
			totalWeight += w;
		}
		int availableHeight = rect.height - (weights.length - 1) * interval;
		int x = rect.x;
		int y = rect.y;
		
		for (int i = 0; i < weights.length; i++) {
			Rectangle subRect = new Rectangle(x, y, rect.width, availableHeight * weights[i] / totalWeight);
            y += subRect.height;
            y += interval;
            parts[i].paint(context, subRect);
		}
    }
}
