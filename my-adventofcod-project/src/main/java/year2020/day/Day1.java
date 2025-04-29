package year2020.day;

import java.io.File;
import java.util.List;

import year2020.BaseDay;

public class Day1 extends BaseDay{

	@Override
	public String partOne(File inputFile) {
		List<Integer>  listInts = scanInputFields(inputFile);
		for (int a : listInts) {
			for (int b : listInts) {
				if (a != b && a + b == 2020) {
		            return String.valueOf(a * b);
		        }
		    }
		}
		return null;
		
	}

	@Override
	public String partTwo(File inputFile) {
		List<Integer>  listInts = scanInputFields(inputFile);
		for (int a : listInts) {
			for (int b : listInts) {
				for (int c : listInts) {
					if (a != b && b != c && a + b + c == 2020) {
			            return String.valueOf(a * b *c);
			          }
				}
		    }
		    
		
		}
		return null;
	}
}
