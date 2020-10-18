import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teleportation {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
		Scanner s = new Scanner(new File("teleport.in"));
		
		int a = s.nextInt();
		int b = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		
	
		int work = 0;
		if(Math.abs(a - b) < (Math.abs(a - y) + Math.abs(b - x)) && Math.abs(a - b) <(Math.abs(a - x) + Math.abs(b - y))) {
			work += Math.abs(a-b);
		}else if((Math.abs(a - y) + Math.abs(b - x)) < (Math.abs(a - x) + Math.abs(b - y))) {
			work += Math.abs(a-y);
			work += Math.abs(b-x);
		}else {
			work += Math.abs(a-x);
			work += Math.abs(b-y);
		}
		pw.println(work);
		pw.close();
		s.close();	
	
		
		
	}
}	
