package chiaPT;
import java.util.Scanner;

public class ChiaPT {

	
		private int so1, so2;
		double chiaPhanTram() {
			System.out.println("Enter number 1: ");
			Scanner kb = new Scanner(System.in);
			so1 = kb.nextInt();
			System.out.println("Enter number 2: ");
			so2 = kb.nextInt();
			return so1 % so2;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ChiaPT c = new ChiaPT();
			System.out.println(c.chiaPhanTram());
		}

}

