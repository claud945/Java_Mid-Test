import java.util.*;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//穝糤块ㄣ\
		int num1 = input.nextInt();//块计Num1
		int num2 = input.nextInt();//块计Num2
		int num3 = input.nextInt();//块计Num3
		/*キА计*/
		int total = num1 + num2 + num3 ; //羆㎝
		double average = total /3;  //キА计
		System.out.println("材计:"+num1);
		System.out.println("材计:"+num2);
		System.out.println("材计:"+num3);
		System.out.println("羆㎝" + total);
		System.out.println("キА计" + average);
		input.close();
	}

}
