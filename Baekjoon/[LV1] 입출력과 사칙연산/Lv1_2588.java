import java.util.Scanner;

public class Lv1_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int one;
		one = B%10;
		int ten;
		ten = (B/10)%10;
		int hundred;
		hundred = (B/100)%10;
		System.out.println(A*one);
		System.out.println(A*ten);
		System.out.println(A*hundred);
		System.out.println(A*B);
	}
}