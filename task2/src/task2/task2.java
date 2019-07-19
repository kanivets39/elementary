package task2;

import java.io.*;
import java.util.*;

public class task2 {

	public static void main(String[] args) throws IOException {

		String answer;
		Scanner in = new Scanner(System.in);
		Envelope envelope1 = new Envelope();
		Envelope envelope2 = new Envelope();
		EnvelopeComparator comparator = new EnvelopeComparator();
		while (true) {

			System.out.print("Input side A for the first envelope: ");
			try {
				envelope1.setA(in.nextFloat());
			} catch (InputMismatchException ex) {
				System.out.println("Incorrect input. Try again!");
			}
			System.out.print("Input side B for the first envelope: ");
			try {
				envelope1.setB(in.nextFloat());
			} catch (InputMismatchException ex) {
				System.out.println("Incorrect input. Try again!");
			}
			System.out.print("Input side A for the second envelope: ");
			try {
				envelope2.setA(in.nextFloat());
			} catch (InputMismatchException ex) {
				System.out.println("Incorrect input. Try again!");
			}
			System.out.print("Input side B for the second envelope: ");
			try {
				envelope2.setB(in.nextFloat());
			} catch (InputMismatchException ex) {
				System.out.println("Incorrect input. Try again!");
			}

			comparator.compare(envelope1, envelope2);

			System.out.println("Do you want to repeat?(y/yes)");
			answer = in.next();
			if (answer.compareToIgnoreCase("y") == 0 | answer.compareToIgnoreCase("yes") == 0) {
				continue;
			} else {
				break;
			}
		}
		in.close();

	}

}
