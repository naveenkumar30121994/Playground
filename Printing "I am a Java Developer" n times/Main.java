import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner S  = new Scanner(System.in);
	    int n = S.nextInt();
        // Initialize count as 1
	   int count = 1;
        // Repeat print statement till count value reaches the n
		while(count <= n)
		{
		    System.out.println("I am a Java Developer");
            // Increse count by one step
		    count = count + 1;
		}
    }
}