
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a�D
		System.out.println("A�D�G");
		for(int i = 1 ; i< 6 ; i ++)
		{
			for(int j = 1 ; j <= i ; j++)
				System.out.print('*');
			System.out.println();
		}
		
		//b�D
		System.out.println("B�D�G");
		
		for(int i = 0 ; i < 4; i ++){
			for(int j = 0 ; j <4 ; j++)
				System.out.print('$');
		System.out.println();}
		
		//c�D
		System.out.println("C�D�G");
		
		for(int i = 0 ;i < 9 ; i++)
		{if(i<9/2){
			for(int j = 0 ; j<=i ; j++)
				System.out.print('*');
			System.out.println();}
		else{
			for(int j = 0;j<Math.abs(i-9);j++) //Math.abs�����
				System.out.print('*');
			System.out.println();}
		}
		//d�D
		System.out.println("D�D�G");
		
		int  height = 9; //����
		int  starNum = 5; //�P�P��
		
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
