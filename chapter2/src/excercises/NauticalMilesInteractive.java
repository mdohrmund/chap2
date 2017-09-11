package excercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numberofKMinNM = 1.852;
		double numberofMinNM = 1.150779;
        double numberofNM = 0;
        double Mconversion, Kconversion;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many nautical miles do you have?");
        numberofNM = input.nextInt();
        
        
        
        Kconversion = numberofKMinNM * numberofNM;
        Mconversion = numberofMinNM * numberofNM;
        
        System.out.println("Number of kilometers from " + numberofNM + " is " + Kconversion + ". Number of miles converted is " 
        + Mconversion + ".");

        
	}
		
		

}
