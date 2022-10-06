package net.flo.parsing;
import java.util.Scanner;

import net.flo.parsing.Conversion;

public class Main {
	private static String romNuString;
	public static void main(String[] args) {
		
		/**
		 * convert romain number to arabic number
		 * @param romain
		 * @return int 
		 */
		
	
		// TODO Auto-generated method stub
		
System.out.println(" Please, enter your romain number");

Scanner romNum = new Scanner(System.in);
romNuString = romNum.nextLine();
romNuString.toUpperCase(); 
System.out.println("Le nombre romain"+ romNuString+ "vaut : " + Conversion.addRomNum(romNuString));
	
Test test= new Test();

test.testRom55();
test.testRom4000();
test.testRom9();
test.testRom();
	}

}
