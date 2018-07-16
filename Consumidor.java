package implementacao4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class Consumidor extends Thread
{
	private DataInputStream in;
	
	public Consumidor(PipedInputStream is)
	{
		this.in = new DataInputStream(is);
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Numero recebido: " + this.in.readInt());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
