
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*�Ĥ@�D*/
		System.out.println("�Ĥ@�D");
		for (int i = 0 ; i <= 10 ; i ++)
		{
			for (int j = 1 ; j <10 ; j++){
				if(i==0 ||i ==10) //�C�L�P�P
				{
					System.out.printf("%3c",'*');
					continue;
				}
				
				
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
	
	/*�ĤG�D*/
	System.out.println("�ĤG�D");
	
	for(int i = 1 ; i<12; i++){
		
		for(int j = 1 ; j <= i ; j++)
		{
			System.out.printf("%4d",i*j);
		}
		System.out.println();
			
	}

	}
}
