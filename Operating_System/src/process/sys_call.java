package process;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class sys_call
{
	public static void sys_call1(String x) 
	{
		try 
		{
			Scanner sc = new Scanner(new File(x));
			while(sc.hasNextLine()) 
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
    public static void sys_call2(String filename, String input) 
    {
		try
		{
			FileWriter h = new FileWriter(filename);
			h.write(input);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
    public static void sys_call3(String data)
    {
    	System.out.println(data);
    }
	public synchronized static String input(String x) 
	{
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		return x;
	}
}
