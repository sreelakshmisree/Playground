import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int temp,rem,sum=0,i,fact;
      Scanner in =new Scanner(System.in);
      int num=in.nextInt();
      temp=num;
      while(temp>0)
      {
        fact=1;
      i=1;
      rem=temp%10;
      while(i<=rem)
      {
        fact=fact*i;
        i++;
      }
        sum=sum+fact;
        temp=temp/10;
      }
      if(num==sum){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
	}
}