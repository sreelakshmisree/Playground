import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int no=1;
      for(int i=1;i<=n;i=i+1){
         
         System.out.println(no);
        no=no+2;
    }
      
	}
}