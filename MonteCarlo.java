import java.util.Random;


public class MonteCarlo {
	
	
	public static boolean Intersect(double top,double bottom){
		
		if (top >= 1 || bottom <= 0)
		return true;
		
		else
		return false;
		//checks to see if it is touching the line or not 
	}

	public static void main(String[] args) {
		double h = 0;
		for (double a = 0; a <= 198444444; a++) {
			double theta = (int) (Math.random() * 89 + 1); //angle of the line
			double y = Math.random() ; // the middle point of the line 
			double radian = Math.toRadians(theta); //angle in terms of radian so we can do calculations
			double delta = .5 * Math.sin(theta); //get the distance of the line opposite to the needle
			double top = y + delta; //value of the top
			double bottom = y - delta; // value of the bottom
			
			if (Intersect(top,bottom)== true){ //checks if the top exceeds a value of 1 or bottom of 0
				h= h+1;  //checks how many times it hits the line
			}
			
		}
		System.out.print(198444444/h); //the total number of drops divided by the # of intersections
		// should be close to pi 
	}

}
