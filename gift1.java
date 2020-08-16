/* 
ID: eric.c11
LANG: JAVA
PROB: gift1
*/ 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class gift1 {
	public static void main(String[]args) throws IOException {
		Scanner s = new Scanner(new File("gift1.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out	")));
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();	
		ArrayList<String> store = new ArrayList<String>();
		ArrayList<Integer> store2 = new ArrayList<Integer>();
		while(s.hasNext()) {
			if(s.hasNextInt()) {
				list2.add(s.nextInt());
			}else {
				list.add(s.next());
			}
		}
		for(int i = 0; i < list2.get(0); i++) {
			store.add(list.get(i));
			store2.add(0);
		}
		int p = list2.get(0);
		int c1 = -1;
		int c2 =  0;
		for(int i = 1; i < (list2.size() - 1)/2 + 1; i++) {
			int a = list2.get(c1+=2);
			int b = list2.get(c2+=2);
			String person = list.get(p);
			int gift = 0; 	
			int value = 0;
			if(b != 0) {
				gift = a/b;
				value = a%b;
			}
			int ind = 0;
			int index = 0;
			for(int k = 0; k < store.size(); k++) {
				if(store.get(k).equals(person)) {
					ind = k;
				}
			}
			store2.set(ind, store2.get(ind) - a + value);
			for(int j = 0; j < b; j++) {
				p++;
				for(int z = 0; z < store.size(); z++) {
					if(store.get(z).equals(list.get(p))) {
						index = z;
					}
				}
				store2.set(index, store2.get(index) + gift);
			}
			
			p++;
		}
		for(int i = 0; i < store.size(); i++) {
			pw.println(store.get(i) + " " + store2.get(i));
		}
		pw.close();
		s.close();
		
		
	}
}
