import java.util.*;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i=0;
		while(true)
		{
			
			System.out.println("Please Enter FirstNum");
			 i = input.nextInt(); //輸入值丟入變數i
			if(i == 0) //輸入0 跳離迴圈
				break;

			System.out.println("Please Enter SecNum");
			int j = input.nextInt(); //輸入值丟入變數j
			
			int gcd =1; //公因數
			for(int k =1 ; k<=i || k<=j;k++) //從K = 1開始找公因數
			{
				if(i%k==0 && j%k==0) //當k可以整除i並且也可以整除j,k就是他們的公因數
					gcd = k; //將k存入公因數的變數裡
			}
			System.out.printf("%d跟%d的最大公因數為%d \n ",i,j,gcd);
			for(int printStar=0; printStar<20 ;printStar ++) //分行用
				System.out.printf("%1c",'*');
			System.out.println();
	
		}input.close();
	}

}
