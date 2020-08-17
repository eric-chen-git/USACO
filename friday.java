/* 
ID: eric.c11
LANG: JAVA
PROB: friday
*/ 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class friday {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friday.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int n = Integer.parseInt(br.readLine());
		int yearend = 1899 + n;
		int yearstart = 1900;
		int day = 0;
		int [] arr = {0, 0, 0, 0, 0, 0, 0};
		int count = 13;
		for(int i = yearstart; i <= yearend; i++) {
			if(i % 400 == 0) {
				for(int k = 1; k <= 12; k++) {
					day = count%7;
					switch(k) {
					case 1:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						break;
					case 2:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=29;
							 break;
						 case 1:
							 arr[0]++;
							 count+=29;
							 break;
						 case 2:
							 arr[1]++;
							 count+=29;
							 break;
						 case 3:
							 arr[2]++;
							 count+=29;
							 break;
						 case 4:
							 arr[3]++;
							 count+=29;
							 break;
						 case 5:
							 arr[4]++;
							 count+=29;
							 break;
						 case 6:
							 arr[5]++;
							 count+=29;
							 break;
						}
						break;
					case 3:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 4:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 5:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
					     	 break;
						 case 1:
							 arr[0]++;
							 count+=31;
					     	 break;
						 case 2:
							 arr[1]++;
							 count+=31;
					     	 break;
						 case 3:
							 arr[2]++;
							 count+=31;
					     	 break;
						 case 4:
							 arr[3]++;
							 count+=31;
					     	 break;
						 case 5:
							 arr[4]++;
							 count+=31;
					     	 break;
						 case 6:
							 arr[5]++;
					         count+=31;
					     	 break;
						}
						 break;
					case 6:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 7:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 8:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 9:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 10	:
						 
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 11:
						 
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 12:
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
						 
					}
				}
			}else if(i % 100 != 0 && i % 4 == 0){
				for(int k = 1; k <= 12; k++) {
					day = count%7;
					switch(k) {
					case 1:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						break;
					case 2:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=29;
							 break;
						 case 1:
							 arr[0]++;
							 count+=29;
							 break;
						 case 2:
							 arr[1]++;
							 count+=29;
							 break;
						 case 3:
							 arr[2]++;
							 count+=29;
							 break;
						 case 4:
							 arr[3]++;
							 count+=29;
							 break;
						 case 5:
							 arr[4]++;
							 count+=29;
							 break;
						 case 6:
							 arr[5]++;
							 count+=29;
							 break;
						}
						break;
					case 3:	 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 4:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 5:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
					     	 break;
						 case 1:
							 arr[0]++;
							 count+=31;
					     	 break;
						 case 2:
							 arr[1]++;
							 count+=31;
					     	 break;
						 case 3:
							 arr[2]++;
							 count+=31;
					     	 break;
						 case 4:
							 arr[3]++;
							 count+=31;
					     	 break;
						 case 5:
							 arr[4]++;
							 count+=31;
					     	 break;
						 case 6:
							 arr[5]++;
					         count+=31;
					     	 break;
						}
						 break;
					case 6:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 7:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 8:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 9:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 10	: 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 11:
						 
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 12:
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
						 
					}
				}
			}else{
				for(int k = 1; k <= 12; k++) {
					day = count%7;
					switch(k) {
					case 1:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						break;
					case 2:
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=28;
							 break;
						 case 1:
							 arr[0]++;
							 count+=28;
							 break;
						 case 2:
							 arr[1]++;
							 count+=28;
							 break;
						 case 3:
							 arr[2]++;
							 count+=28;
							 break;
						 case 4:
							 arr[3]++;
							 count+=28;
							 break;
						 case 5:
							 arr[4]++;
							 count+=28;
							 break;
						 case 6:
							 arr[5]++;
							 count+=28;
							 break;
						}
						break;
					case 3:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 4:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 5:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
					     	 break;
						 case 1:
							 arr[0]++;
							 count+=31;
					     	 break;
						 case 2:
							 arr[1]++;
							 count+=31;
					     	 break;
						 case 3:
							 arr[2]++;
							 count+=31;
					     	 break;
						 case 4:
							 arr[3]++;
							 count+=31;
					     	 break;
						 case 5:
							 arr[4]++;
							 count+=31;
					     	 break;
						 case 6:
							 arr[5]++;
					         count+=31;
					     	 break;
						}
						 break;
					case 6:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}
						 break;
					case 7:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 8:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 9:
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 10	:
						 
						 
						 switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					case 11:
						 
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=30;
							 break;
						 case 1:
							 arr[0]++;
							 count+=30;
							 break;
						 case 2:
							 arr[1]++;
							 count+=30;
							 break;
						 case 3:
							 arr[2]++;
							 count+=30;
							 break;
						 case 4:
							 arr[3]++;
							 count+=30;
							 break;
						 case 5:
							 arr[4]++;
							 count+=30;
							 break;
						 case 6:
							 arr[5]++;
							 count+=30;
							 break;
						}	
						 break;
					case 12:
						switch(day){
						 case 0:
							 arr[6]++;
							 count+=31;
							 break;
						 case 1:
							 arr[0]++;
							 count+=31;
							 break;
						 case 2:
							 arr[1]++;
							 count+=31;
							 break;
						 case 3:
							 arr[2]++;
							 count+=31;
							 break;
						 case 4:
							 arr[3]++;
							 count+=31;
							 break;
						 case 5:
							 arr[4]++;
							 count+=31;
							 break;
						 case 6:
							 arr[5]++;
							 count+=31;
							 break;
						}
						 break;
					}
				} 	
			}
		}
		pw.println(arr[5] + " " + arr[6] + " " +  arr[0] + " " +  arr[1] + " " +  arr[2] + " " +  arr[3] + " " +  arr[4]);
		pw.close();
		br.close();
	}
	
}
