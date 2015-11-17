import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int biggestNum = 0,compareNum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i<5 ; i++){
			compareNum = input.nextInt();
			if(compareNum>biggestNum)
				biggestNum = compareNum;
		}
		System.out.println(biggestNum);
		input.close();
	}

}
