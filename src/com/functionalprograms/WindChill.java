package com.functionalprograms;

public class WindChill {
		public static void main(String[] args) {

			System.out.println(" ------- Welcome to WindChill program -------");
			
			double windchilltemp;
			//get Command-line arguments
			double t = Double.parseDouble(args[0]);         // t for temperature
			double v = Double.parseDouble(args[1]);         // v for velocity of wind (mph) 
			
			if ( (t > 50) || (v > 120) || (v < 3))					// if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 
																	// then the formula is not valid. 
			{
				windchilltemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

				System.out.println(" Wind Chill Temperature : "+windchilltemp);
			}
		}

}
