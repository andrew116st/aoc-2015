package DAY_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class box_2 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/eclipse-workspace/adventofcode_2015/paper_2.txt");
		List<String> dm = parseFileToStringList(file);
		// System.out.println(hh);

		int lengthFull = 0;
		

		for (String temp : dm) {
			String[] array = temp.split("x");

			int length = Integer.parseInt(array[0]);
			int width = Integer.parseInt(array[1]);
			int height = Integer.parseInt(array[2]);

			int volume = length * width * height;
			int perimeterMin = Math.min(2*(length + width), Math.min(2*(width + height), 2*(height + length)));
			lengthFull = lengthFull + (volume + perimeterMin);
		}
		System.out.println("LengthFull - " + lengthFull);
	}

	public static List<String> parseFileToStringList(File file) throws IOException {

		List<String> dimensions = new ArrayList<String>();

		Scanner sc;

		try {
			sc = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.out.println("File_Not_Found");

			throw new IOException();
		}

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			dimensions.add(line);
		}
		sc.close();

		return dimensions;

	}

}
