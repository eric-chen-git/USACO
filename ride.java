/* 
ID: eric.c11
LANG: JAVA
PROB: ride
*/ 
import java.io.*;
import java.util.*;

public class ride{
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		String a = br.readLine();
		String b = br.readLine();
		int sum = 1;
		int sum2 = 1;
		for (int i = 0; i < a.length(); i++) {
			sum *= (int) a.charAt(i) - 64;
		}
		for (int i = 0; i < b.length(); i++) {
			sum2 *= (int) b.charAt(i) - 64;
		}
		if(sum2 % 47 == sum % 47) {
			pw.println("GO");
		}else {
			pw.println("STAY");
		}
		
		br.close();	
		pw.close(); 	
		System.exit(0);
			
	}
}
