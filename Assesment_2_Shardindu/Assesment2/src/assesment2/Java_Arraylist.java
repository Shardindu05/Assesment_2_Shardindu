package assesment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Java_Arraylist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(n);
		
		for(int i = 0; i < n; i++) {
			 int num = sc.nextInt();
			 ArrayList<Integer> l1 = new ArrayList<Integer>();
			
			 for(int j = 0; j < num; j++) {
				 l1.add(sc.nextInt());
			 }
			 list.add(l1);
		}
		
		int p = sc.nextInt();
		for(int i = 0; i < p; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;	
			
			if(y > (list.get(x).size()) - 1) {
				System.out.println("ERROR!");
			}
			
			else {
				System.out.println(list.get(x).get(y));
			}
		}
	}
}
