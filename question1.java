import java.util.*;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//�s�W��J�u��\
		int num1 = input.nextInt();//��J�ƭȨ�Num1
		int num2 = input.nextInt();//��J�ƭȨ�Num2
		int num3 = input.nextInt();//��J�ƭȨ�Num3
		/*��������*/
		int total = num1 + num2 + num3 ; //�`�M
		double average = total /3;  //������
		System.out.println("�Ĥ@�Ӽ�:"+num1);
		System.out.println("�ĤG�Ӽ�:"+num2);
		System.out.println("�ĤT�Ӽ�:"+num3);
		System.out.println("�`�M��" + total);
		System.out.println("�����ƭȬ�" + average);
		input.close();
	}

}
