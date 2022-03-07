package assesment2;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		 	
		Scanner sc = new Scanner(System.in);
	    int size = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> list = new ArrayList<>();
	       
	    for(int i = 0; i < size; i++){
	    	list.add(sc.nextInt());
	    }
	        
	    int n = sc.nextInt();
	    sc.nextLine();
	        
	    for(int i = 0; i < n; i++){
	    	String str = sc.nextLine();
	        
	    	if(str.equals("Insert")){
	    		String[] insert = sc.nextLine().split(" ");
	        	list.add(Integer.parseInt(insert[0]),Integer.parseInt(insert[1]));
	        	}
	    	
	    	else if(str.equals("Delete")){
	    		int remove = Integer.parseInt(sc.nextLine());
	    		list.remove(remove);
	    		}
	    	}
	    
	    for(Integer num : list){
	    	System.out.print(num + " ");
	    }
	}
}