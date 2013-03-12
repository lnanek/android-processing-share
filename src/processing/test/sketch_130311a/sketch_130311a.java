package processing.test.sketch_130311a;

import processing.core.PApplet;
import processing.core.PGraphics;

public class sketch_130311a extends PApplet {

	public void setup() {
		setup(g);
	};
	
	public void setup(PGraphics g) {

		g.smooth();
		g.noStroke();
		g.fill(255);
		g.rectMode(CENTER); // This sets all rectangles to draw from the center
							// point
	};

	public void draw() {
		draw(g);
	};

	public void draw(PGraphics g) {
		g.background(0xffFF9900);
		g.rect(width / 2, height / 2, 150, 150);
	};

	public int sketchWidth() {
		return 480;
	}

	public int sketchHeight() {
		return 800;
	}
	
}
