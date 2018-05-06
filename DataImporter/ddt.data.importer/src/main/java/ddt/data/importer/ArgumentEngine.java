package ddt.data.importer;

import java.util.Arrays;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

public class ArgumentEngine {

	public static String directory;
	public static boolean runImport;
	public static boolean runHTML;

	public ArgumentEngine(String[] args) throws ArgumentParserException {
		System.out.println(Arrays.asList(args).toString());
		ArgumentParser parser = ArgumentParsers.newFor("ArgumentEngine").build();

		parser.addArgument("-i", "--import").type(Boolean.class).dest("import").help("Run the import tool against the defined directory");
		parser.addArgument("-h", "--html").type(Boolean.class).dest("html").help("Run the html extraction tool against the defined directory");
		parser.addArgument("-d", "--directory").required(true)
		.dest("theDirectory").type(String.class).help("Specify the directory that contains the data files to process.");

		Namespace ns = parser.parseArgs(args);
		directory = ns.get("theDirectory");
		runImport = ns.getBoolean("import");
		runHTML = ns.getBoolean("html");

	}
}
