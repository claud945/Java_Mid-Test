import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�����T�~���������Z");
		int averageNum = input.nextInt();
		
		if(averageNum>=90){
			System.out.println("���ߧA��o������");
		}else if(averageNum>=85)
			System.out.println("���ߧA��o�Ϫ���");
		else if(averageNum>=80)
			System.out.println("���ߧA��o�a���|����");
		
		input.close();
	}

}
