package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class santa_1 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("santa_road");

		Scanner sc = new Scanner(file);

		String line = sc.nextLine();

		
		int floor = 0;

		sc.close();

		for (int i = 0; i < line.length(); i++) {

			if (line.charAt(i) == '(') {

				floor++;
				
				

			} else if (line.charAt(i) == ')') {

				floor--;

			}

		}

		System.out.println("—умма равна " + floor);
	}

	// System.out.println(" —умма скобок в строке равна - " + sum);
}


		
		// int a = "(";	// означает, что он должен подн€тьс€ на один этаж  +1,  a=1
		// int b = ")";	// означает, что он должен спуститьс€ на один этаж -1,	b=-1
		
		//	(())и ()()   	оба привод€т к значению 0. (2*a +2*b) = 0
		
		// ((( и (()(()(	оба привод€т к значению 3.  3*a = 3  и 5*a + 2*b = 3
		
		//	))(((((			также приводит к значению 3. 5*a + 2*b = 3
		
		// ()) и ))(        оба привод€т к значению -1. a + 2*b = -1  и 2*b + a = -1
		
		//	))) и )())())   оба привод€т к значению -3. 3*b = -3   и 5*b + 2*a = 3
		
		
		
