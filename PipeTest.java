package implementacao4;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutionException;

public class PipeTest 
{

	public static void main(String[] args) 
	{
		try
		{
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream in = new PipedInputStream(out);
			
			Produtor produtor = new Produtor(out);
			Consumidor consumidor = new Consumidor(in);
			
			produtor.start();
			consumidor.start();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
