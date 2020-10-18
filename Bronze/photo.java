import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class photo {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("photo.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = s.nextInt();
		while(s.hasNextInt()) {
			list.add(s.nextInt());
		}
		int max = Collections.max(list);
		String fin = "";
		for (int i = 0; i < size; i++) {
			for(int j = 0;j < max; j++) {
				
			}
		}
	}
}
