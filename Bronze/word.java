import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class word {
	public static void main(String[]args) throws IOException {
		Scanner s = new Scanner(new File("word.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
		int size = s.nextInt();
		int max = s.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		while(s.hasNext()) {
			list.add(s.next());
		}
		String t = list.get(0);
		int count = 0;
		for(int i = 1; i < size; i++) {
			if((t + list.get(i)).length() - count <= max) {
				t = t + " " + list.get(i);
				count++;	
				if(i == size - 1) {
					pw.println(t);
				}
			}else {
				pw.println(t);
				t = list.get(i);
				count = 0;
				if(i == size - 1) {
					pw.println(t);
				}
			}
		}
	
		pw.close();
		s.close();
	}
}
