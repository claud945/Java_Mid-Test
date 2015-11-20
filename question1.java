import java.util.*;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();//
		int num2 = input.nextInt();//
		int num3 = input.nextInt();//块
		/*計算*/
		int total = num1 + num2 + num3 ; //總和
		double average = total /3.;  //キА计
		System.out.println("數值2:"+num1);
		System.out.println("數值2:"+num2);
		System.out.println("數值3:"+num3);
		System.out.println("總和" + total);
		System.out.println("平均值" + average);
		input.close();
	}

}
