package Part2;

import java.util.ArrayList;
import java.util.List;

public class DrawCircle {

	public ResultType getParameters(boolean[][] gridColor) {
		// TODO Auto-generated method stub
		List<Coordinate> blues = new ArrayList<>();
		for (int i = 1; i < 21; i++) {
			for (int j = 1; j < 21; j++) {
				if (gridColor[i-1][j-1]) {
					blues.add(new Coordinate(30 * i + 5, 30 * j + 5));
				}
			}
		}
		
		/*
	    double minX = Double.MAX_VALUE;
	    double minY = Double.MAX_VALUE; 
	    double maxX = Double.MIN_VALUE;
	    double maxY = Double.MIN_VALUE;
		double midX = 0;
		double midY = 0;
		*/
		
		// get the approximate center of the circle
		int sumX = 0;
		int sumY = 0;
		for (Coordinate c: blues) {
			sumX += c.x;
			sumY += c.y;
		}
		int midX = sumX / blues.size();
		int midY = sumY / blues.size();
		
		// get the approximate radius
		int sumR = 0;
		int centerPoints = 0;
		for (Coordinate c: blues) {
			if (c.x == midX && c.y == midY) {
				centerPoints++;
				continue;
			}
			sumR += (int) Math.hypot(c.x - midX, c.y - midY);
		}
		int radius = sumR / (blues.size() - centerPoints);
		
		return new ResultType(midX, midY, radius * 2, radius * 2);
	}
	
}
