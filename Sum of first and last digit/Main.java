import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
      int f_digit=n;
      while(f_digit>=10)
      {
        f_digit=f_digit/10;
      }
      int l_digit=n%10;
      int sum=f_digit+l_digit;
      System.out.println(sum);
 
	}
}
