import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      for(int x=1; x<= n; x++)
      {
        for(int y=1; y<= x; y++)
        {
          System.out.print(x);
        } 
        System.out.println();
      }
	}
}