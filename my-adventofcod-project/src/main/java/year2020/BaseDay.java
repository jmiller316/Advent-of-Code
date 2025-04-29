package year2020;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public abstract class BaseDay {
	Logger logger = Logger.getLogger(Main.class.getName());
	public abstract String partOne(File inputFile);
	public abstract String partTwo(File inputFile);
	
	protected List<Integer> scanInputFields(File inputFile) {
		List<Integer> inputInts = new LinkedList<>();
		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextInt()) {
				inputInts.add(scanner.nextInt());
			}
			scanner.close();	
			return inputInts;
		} catch (FileNotFoundException e) {
			logger.warning("File not found! " + e);
			return null;
		}
	}
}