package assesment2;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hmap = new HashMap<>();
        int n = sc.nextInt();
       
        for(int i = 1; i <= n; i++)
        {
            String name = sc.nextLine();
            int phone_no = sc.nextInt();
            sc.nextLine();
            hmap.put(name, phone_no);
        }
       
        while(sc.hasNext())
        {  
        	String str = sc.nextLine();
            try
            {
                int out = hmap.get(str);
                System.out.println(str + " = " + out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
	}
}

