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

		System.out.println("����� ����� " + floor);
	}

	// System.out.println(" ����� ������ � ������ ����� - " + sum);
}


		
		// int a = "(";	// ��������, ��� �� ������ ��������� �� ���� ����  +1,  a=1
		// int b = ")";	// ��������, ��� �� ������ ���������� �� ���� ���� -1,	b=-1
		
		//	(())� ()()   	��� �������� � �������� 0. (2*a +2*b) = 0
		
		// ((( � (()(()(	��� �������� � �������� 3.  3*a = 3  � 5*a + 2*b = 3
		
		//	))(((((			����� �������� � �������� 3. 5*a + 2*b = 3
		
		// ()) � ))(        ��� �������� � �������� -1. a + 2*b = -1  � 2*b + a = -1
		
		//	))) � )())())   ��� �������� � �������� -3. 3*b = -3   � 5*b + 2*a = 3
		
		
		
