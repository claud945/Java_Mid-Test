import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入高中三年的平均成績");
		int averageNum = input.nextInt();
		
		if(averageNum>=90){
			System.out.println("恭喜你獲得市長獎");
		}else if(averageNum>=85)
			System.out.println("恭喜你獲得區長獎");
		else if(averageNum>=80)
			System.out.println("恭喜你獲得家長會長獎");
		
		input.close();
	}

}
