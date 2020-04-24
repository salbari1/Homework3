import java.io.*; 
public class ferryboat
	
	
{ 
	double dydx(double x, double y) 
	{ 
		double h1 = y/x;
		double h2 = x/7777;
		double h3 = Math.pow(x,2)/Math.pow(7777,2);
		double W = 56 * (h2 - h3);
		double h4 = Math.pow(x,2)+Math.pow(y,2);
		double h5 = Math.sqrt(h4);
		double h6 = (x*21)/h5; // values for speed = 7,14,21 
		double ODE = h1 - (W/h6);
		
		return ODE; 
	} 
	
	// Finds value of y for a given x using step size h 
	// and initial value y0 at x0. 
	double rungeKutta(double x0, double y0, double x, double h) 
	{ 
		ferryboat d1 = new ferryboat(); 
		// Count number of iterations using step size or 
		// step height h 
		int n = (int)((x - x0) / h); 

		double k1, k2, k3, k4; 

		// Iterate for number of iterations 
		double y = y0; 
		for (int i = 1; i <= n; i++) 
		{ 
			// Apply Runge Kutta Formulas to find 
			// next value of y 
			k1 = h * (d1.dydx(x0, y)); 
			k2 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k1)); 
			k3 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k2)); 
			k4 = h * (d1.dydx(x0 + h, y + k3)); 

			// Update next value of y 
			y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4); 
			
			// Update next value of x 
			x0 = x0 + h; 
		} 
		return y; 
	} 
	
	public static void main(String args[]) 
	{ 
		ferryboat d2 = new ferryboat(); 
		for (double a = 7777; a>=0; a= a-7) {
		double x0 = 7777;
		double y = 0;
		double x = a;
		double h = -0.01; 
		//System.out.print("\nThe value of y at x at y(");
		//System.out.printf("%.2f %n ",a);
		System.out.print(d2.rungeKutta(x0, y, x, h)); 
		System.out.println("");
		}

	} 
} 

