import java.util.*;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i=0;
		while(true)
		{
			
			System.out.println("Please Enter FirstNum");
			 i = input.nextInt(); //��J�ȥ�J�ܼ�i
			if(i == 0) //��J0 �����j��
				break;

			System.out.println("Please Enter SecNum");
			int j = input.nextInt(); //��J�ȥ�J�ܼ�j
			
			int gcd =1; //���]��
			for(int k =1 ; k<=i || k<=j;k++) //�qK = 1�}�l�䤽�]��
			{
				if(i%k==0 && j%k==0) //��k�i�H�㰣i�åB�]�i�H�㰣j,k�N�O�L�̪����]��
					gcd = k; //�Nk�s�J���]�ƪ��ܼƸ�
			}
			System.out.printf("%d��%d���̤j���]�Ƭ�%d \n ",i,j,gcd);
			for(int printStar=0; printStar<20 ;printStar ++) //�����
				System.out.printf("%1c",'*');
			System.out.println();
	
		}input.close();
	}

}
