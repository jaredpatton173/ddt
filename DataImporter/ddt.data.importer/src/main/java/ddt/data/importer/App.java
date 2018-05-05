package ddt.data.importer;

import java.io.FileNotFoundException;

import net.sourceforge.argparse4j.inf.ArgumentParserException;

public class App 
{
	public static void main( String[] args ) throws IllegalStateException, FileNotFoundException, ArgumentParserException
	{
		new ArgumentEngine(args);
		
		new ImporterEngine();

	}
}
