package ddt.data.importer;

import java.util.Arrays;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class ArgumentEngine {

	public static String directory;

	public ArgumentEngine(String[] args) throws ArgumentParserException {
		System.out.println(Arrays.asList(args).toString());
		ArgumentParser parser = ArgumentParsers.newFor("ArgumentEngine").build();
		parser.addArgument("-d", "--directory").required(true)
		.dest("theDirectory").type(String.class).help("Specify the directory that contains the data files to process.");
//	    try {
//	        System.out.println(parser.parseArgs(args));
//	    } catch (ArgumentParserException e) {
//	        parser.handleError(e);
//	    }
	    
		Namespace ns = parser.parseArgs(args);
		directory = ns.get("theDirectory");
		

	}
}
