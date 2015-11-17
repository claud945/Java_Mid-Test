import java.util.*;

public class question7 {

	public static void main(String args[]){
	
	Scanner input  = new Scanner(System.in);
	for(int i = 1 ; i < 7 ; i++)
		
	{	System.out.println("這是您輸入的第"+i+"次");
		System.out.println("請輸入年份");
		int leapYear = input.nextInt();
		if(leapYear % 400 == 0 || (leapYear % 4 == 0 && leapYear % 100 !=0) )
			System.out.printf("%4d是閏年 \n",leapYear);
		else 
			System.out.printf("%4d不是閏年 \n",leapYear);
	}
	
	input.close();
	}
	
}
