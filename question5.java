
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countPrime=0; //計算出線PrimeNumber的次數，後面用來換行
		boolean primeFlag = true; //計算用來確認是否為質數
		
		for(int i = 2 ; i<=1000; i ++) //1一定不為質數，故從2開始做起
		{
			primeFlag = true; //預設為primeFlag = true
			for( int j = 2 ; j<= (i/2) ;j++) //用迴圈去找有無值可以整除i
			{
				
				if(i % j == 0  ) //有可以整除的狀況會運行下面的block
				{
					primeFlag = false; //更改primeFlag為false
					break; //跳離迴圈
				}
				
			}
			if(primeFlag) //如果primeFlag為true
			{
				System.out.printf("%4d",i); //列印出
				countPrime++; //增加計算質數的數目
				if(countPrime % 10 == 0) //countPrime到達10個，進行換行
					System.out.println();
			}
				
		}
	}

}
