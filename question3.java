
public class question3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oddString = "",evenString= "";
		int countOdd=0,countEven=0;
		
		for(int i = 0 ; i < 100 ; i ++)
		{
			int getRandomNum = (int)(Math.random()*1000);
			if(getRandomNum % 2 == 0)
			{
				countEven++;
				evenString = evenString + getRandomNum + " ";
				if(countEven % 10 == 0)
					evenString = evenString  + '\n' ;
			}
			else{
				countOdd++;
				oddString = oddString + getRandomNum + " ";
				if(countOdd % 10 == 0)
					oddString = oddString + '\n';
			}
		}
		System.out.print(oddString);
		System.out.println();
		System.out.println();
		System.out.print(evenString);
		
		}

	}


