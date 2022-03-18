import java.util.Scanner;
public class Hello2030
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 System.out.println("2자리수 정수를 입력하세요(10~99사이)>>");
	 int jumsu = scan.nextInt();
	 
	 if (jumsu % 11 == 0)
	 {
		 System.out.println(" YES ! 10의 자리와 1의 자리가 같습니다. ");
	 }
	 else
	 {
		 System.out.println(" NO ! 10의 자리와 1의 자리가 같지않습니다.");
	 }
	}
}
	
