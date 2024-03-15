import java.util.*;
import java.lang.*;
public class GuessNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int no=sc.nextInt();
		int randomNo=(int)(100*Math.random());
		System.out.println(randomNo);
		if(randomNo==no){
			System.out.println("number is same");
		}else{
			System.out.println("not");
		}
	}
}