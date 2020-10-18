import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//Complete
public class promote {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File("promote.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));
		int sil = 0;
		int gol = 0;
		int pla = 0;
		int bb = s.nextInt();
		int ba = s.nextInt();
		int sb = s.nextInt();
		int sa = s.nextInt();
		int gb = s.nextInt();
		int ga = s.nextInt();
		int pb = s.nextInt();
		int pa = s.nextInt();
		sil = pa - pb + ga - gb + sa - sb;
		gol = pa - pb + ga - gb;
		pla = pa - pb;
		pw.println(sil);
		pw.println(gol);
		pw.println(pla);
		pw.close();
		s.close();
				
	}
}
