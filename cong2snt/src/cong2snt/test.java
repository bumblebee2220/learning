package test3;
import java.util.*;
public class phep_cong {

	private int so1, so2;
	double cong() {
		
		System.out.println("Enter number 1: ");
		Scanner kb = new Scanner(System.in);
		so1 = kb.nextInt();
		System.out.println("Enter number 2: ");
		so2 = kb.nextInt();
		return so1 + so2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		phep_cong c = new phep_cong();
		System.out.println(c.cong());
	}

}
