import java.util.Scanner;
public class Hello2030
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 System.out.println("2�ڸ��� ������ �Է��ϼ���(10~99����)>>");
	 int jumsu = scan.nextInt();
	 
	 if (jumsu % 11 == 0)
	 {
		 System.out.println(" YES ! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�. ");
	 }
	 else
	 {
		 System.out.println(" NO ! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
	 }
	}
}
	
