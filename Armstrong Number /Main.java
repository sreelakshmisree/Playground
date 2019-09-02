import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int res=0;
      while(n>0)
      {
        int rem=n%10;
        n=n/10;
       res=res+(rem*rem*rem);
      
      }
      if(res==temp)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}