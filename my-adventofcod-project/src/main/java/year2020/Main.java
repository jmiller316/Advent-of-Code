package year2020;

import java.io.File;
import java.util.logging.Logger;

import year2020.constants.WhatToRunEnum;
import year2020.day.Day1;

public class Main {
	static Logger logger = Logger.getLogger(Main.class.getName());
	// Controls which day + inputs are ran
	final static BaseDay currentDay = new Day1();
	final static File sampleInput = new File("src/main/resources/inputs/day1/sample.txt");
	final static File personalInput = new File("src/main/resources/inputs/day1/personal.txt");
	
		
	public static void main(String[] args) throws Exception {
		
		// Controls what to run
		final WhatToRunEnum choice = WhatToRunEnum.BOTH_PARTS;
		final boolean onlyPersonalInput = false;

		runningLogic(choice, onlyPersonalInput);
		
	}
	
	private static  void runningLogic(final WhatToRunEnum choice, final boolean onlyPersonalInput) {
		if (choice == WhatToRunEnum.PART_ONE || choice == WhatToRunEnum.BOTH_PARTS) {
			if (!onlyPersonalInput) {
				logger.info("Part 1 - Sample Input");
				logger.info(currentDay.partOne(sampleInput));
			}
			else {
				logger.info("Part 1 - Personal Input");
				logger.info(currentDay.partOne(personalInput));
			}
		}
		
		if (choice == WhatToRunEnum.PART_TWO || choice == WhatToRunEnum.BOTH_PARTS) {
			if (!onlyPersonalInput) {
				logger.info("Part 2 - Sample Input");
				logger.info(currentDay.partTwo(sampleInput));
			}
			else {
				logger.info("Part 2 - Personal Input");
				logger.info(currentDay.partTwo(personalInput));
			}
		}
			
	}


}
