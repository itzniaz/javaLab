import java.util.Scanner;
public class main
{
	public static void main (String[] args)
	
	{
		Scanner inp = new Scanner(System.in);
		
		String name = inp.nextLine();
		
		name = name.trim();
		
		int track =  name.indexOf(' ');
		
		track++;
		
		
		System.out.println(name.substring(0,track)+name.substring(track,name.length()).toUpperCase());
	}
}