import java.util.*;

public class question7 {

	public static void main(String args[]){
	
	Scanner input  = new Scanner(System.in);
	for(int i = 1 ; i < 7 ; i++)
		
	{	System.out.println("�o�O�z��J����"+i+"��");
		System.out.println("�п�J�~��");
		int leapYear = input.nextInt();
		if(leapYear % 400 == 0 || (leapYear % 4 == 0 && leapYear % 100 !=0) )
			System.out.printf("%4d�O�|�~ \n",leapYear);
		else 
			System.out.printf("%4d���O�|�~ \n",leapYear);
	}
	
	input.close();
	}
	
}
