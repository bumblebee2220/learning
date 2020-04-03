package maytinh;
import java.util.Scanner;

public class phep_tru {
	public int aNumber, bNumber;
		
	int pheptru() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		aNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		bNumber = scanner.nextInt();
		System.out.println("Nhập phép toán (-): ");
		return aNumber - bNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        phep_tru p = new phep_tru();
        System.out.println(p.pheptru());
     
       


            

	}
}

