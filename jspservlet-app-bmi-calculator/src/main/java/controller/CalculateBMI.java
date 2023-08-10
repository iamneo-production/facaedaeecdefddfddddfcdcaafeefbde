package controller;

public class CalculateBMI {

	//Enter the code here....
	
		public static double calculate(double height, double weight) {
			double b =(weight) / (height * height);
			double d=Math.round(b*Math.pow(10, 2))/Math.pow(10,2);
			return d;
		}
		
		public static String description(double B) {
			if (B < 18.5) {
				return "Under Weight";
			} else if (B >= 18.5 && B< 24.9) {
				return "Normal";
			} else if (B >= 25 && B < 29.9) {
				return "Over Weight";
			} else if (B >= 30 && B < 34.9) {
				return "Obese";
			} else {
				return "Extremely Obese";
			}
		}
	
	
}
