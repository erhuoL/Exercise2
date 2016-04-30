package com.Erhuo_L.model;

import java.awt.Rectangle;

public class HorzDiv extends Div {

	@Override
	public void paint(PaintContext context, Rectangle rect) {
		int totalWeight = 0;
		for (int w : weights) {
			totalWeight += w;
		}
		int availableWidth = rect.width - (weights.length - 1) * interval;
		int x = rect.x;
		int y = rect.y;
		
		for (int i = 0; i < weights.length; i++) {
			Rectangle subRect = new Rectangle(x, y, availableWidth * weights[i] / totalWeight, rect.height);
            x += subRect.width;
            x += interval;
            parts[i].paint(context, subRect);
		}
	}

}
