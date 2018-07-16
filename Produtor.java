package implementacao4;

import java.io.DataOutputStream;
import java.io.PipedOutputStream;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class Produtor extends Thread
{
	private DataOutputStream out;
	private Random rand = null;
	
	public Produtor(PipedOutputStream os)
	{
		this.out = new DataOutputStream(os);
		this.rand = new Random();
	}
	
	public void run()
	{
		int num = 0;
		while(true)
		{
			try
			{
				num = this.rand.nextInt(1000);
				this.out.writeInt(num);
				System.out.println("Numero gerado: " + num);
				
				sleep(num);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
