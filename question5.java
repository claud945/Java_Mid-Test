
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countPrime=0; //�p��X�uPrimeNumber�����ơA�᭱�ΨӴ���
		boolean primeFlag = true; //�p��ΨӽT�{�O�_�����
		
		for(int i = 2 ; i<=1000; i ++) //1�@�w������ơA�G�q2�}�l���_
		{
			primeFlag = true; //�w�]��primeFlag = true
			for( int j = 2 ; j<= (i/2) ;j++) //�ΰj��h�䦳�L�ȥi�H�㰣i
			{
				
				if(i % j == 0  ) //���i�H�㰣�����p�|�B��U����block
				{
					primeFlag = false; //���primeFlag��false
					break; //�����j��
				}
				
			}
			if(primeFlag) //�p�GprimeFlag��true
			{
				System.out.printf("%4d",i); //�C�L�X
				countPrime++; //�W�[�p���ƪ��ƥ�
				if(countPrime % 10 == 0) //countPrime��F10�ӡA�i�洫��
					System.out.println();
			}
				
		}
	}

}
