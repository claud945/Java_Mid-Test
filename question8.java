
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a題
		System.out.println("A題：");
		for(int i = 1 ; i< 6 ; i ++)
		{
			for(int j = 1 ; j <= i ; j++)
				System.out.print('*');
			System.out.println();
		}
		
		//b題
		System.out.println("B題：");
		
		for(int i = 0 ; i < 4; i ++){
			for(int j = 0 ; j <4 ; j++)
				System.out.print('$');
		System.out.println();}
		
		//c題
		System.out.println("C題：");
		
		for(int i = 0 ;i < 9 ; i++)
		{if(i<9/2){
			for(int j = 0 ; j<=i ; j++)
				System.out.print('*');
			System.out.println();}
		else{
			for(int j = 0;j<Math.abs(i-9);j++) //Math.abs絕對值
				System.out.print('*');
			System.out.println();}
		}
		//d題
		System.out.println("D題：");
		
		int  height = 9; //高度
		int  starNum = 5; //星星數
		
		for(int i = 0 ; i < height; i++){
			
			if(i<=height/2){
				for(int j = starNum-i; j>0 ; j--)
				{
					System.out.print('*');
				}
				System.out.println();
				}
			else if(i>height/2){
				for(int j = i- starNum + 2;j>0;j--){
					System.out.print('*');
				}
				System.out.println();
			}
		}
			
		
		

	}

}
