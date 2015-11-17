import java.util.*;
public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String Word = input.nextLine();
		
		switch (Word.charAt(0)){
		
		case 'a': 
			System.out.println("該母音為a");
			break;
		case 'e':
			System.out.println("該母音為e");
			break;
		case 'i':
			System.out.println("該母音為i");
			break;
		case 'o':
			System.out.println("該母音為e");
			break;
		case 'u':
			System.out.println("該母音為e");
			break;
		}
		input.close();
	}

}
