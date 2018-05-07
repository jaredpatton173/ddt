package ddt.data.importer;

import java.util.Arrays;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class ArgumentEngine {

	public static String directory;
	public static boolean runImport = false;
	public static boolean runHTML = false;

	public ArgumentEngine(String[] args) throws ArgumentParserException {
		System.out.println(Arrays.asList(args).toString());
		ArgumentParser parser = ArgumentParsers.newFor("ArgumentEngine").build();

		parser.addArgument("-i", "--import").type(Boolean.class).dest("import").help("Run the import tool against the defined directory");
		parser.addArgument("-r", "--render-html").type(Boolean.class).dest("html").help("Run the html extraction tool against the defined directory");
		parser.addArgument("-d", "--directory").required(true)
		.dest("theDirectory").type(String.class).help("Specify the directory that contains the data files to process. Or specify a file and directory to output the HTML report to.");

		Namespace ns = parser.parseArgs(args);
		directory = ns.get("theDirectory");
		if(ns.getBoolean("import")!= null)
			runImport = ns.getBoolean("import");
		if(ns.getBoolean("html") != null)
			runHTML = ns.getBoolean("html");

	}
}
