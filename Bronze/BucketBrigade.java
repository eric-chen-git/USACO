import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BucketBrigade {
	public static void main(String[]args) throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));
		//BufferedReader br = new BufferedReader(new FileReader("buckets.in"));
		Scanner s = new Scanner(new File("buckets.in"));
		
		int Bx = 0;	
		int By = 0;
		int Rx = 0;
		int Ry = 0;
		int Lx = 0;
		int Ly = 0;
		
		int res = 0;
		
		for(int i = 0; i < 10; i++) {
			String str = s.next();
			for(int j = 0; j < 10; j++) {
				char c = str.charAt(j);	
				if(c == 'B') {
					By = i+1;
					Bx = j+1;
				}else if(c == 'R') {
					Ry = i+1;
					Rx = j+1;
				}else if(c == 'L') {
					Ly = i+1;
					Lx = j+1;
				}
			}
		}
		
		boolean x = false;
		boolean y = false;
		if((Rx < Bx && Rx < Lx) || (Rx > Bx && Rx > Lx)) {
			x = true;
		}else if((Ry < By && Ry < Ly) || (Ry > By && Ry > Ly)) {
			y = true;
		}
		if(Rx == Bx && Rx == Lx && y == false) {
			res = Math.abs(Lx - Bx) + Math.abs(Ly - By) + 1;
		}else if(Ry == By && Ry == Ly && x == false) {
			res = Math.abs(Lx - Bx) + Math.abs(Ly - By) + 1; 
		}else {
			res = Math.abs(Lx - Bx) + Math.abs(Ly - By) - 1; 
		}
		pw.println(res);
		pw.close();
		s.close();
		
	}
}
