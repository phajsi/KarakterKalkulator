package calculator.model;

import java.util.List;

public class CalculatorLogic {

	
	public static double calculateAvg(List<String> listGrades) {
		double sum = 0.0;
		int length = 0;
		double avg;
		double roundedAvg;
		for (String grade : listGrades) {
			if(grade.matches("^[A-E]")) {
				double gradeDouble = convertGrade(grade);	
				sum += gradeDouble;
				length++;
			}
			
		}
		avg = sum/length;
		roundedAvg = (double)Math.round(avg * 100d) / 100d;
		return roundedAvg;
	}
	
	private static double convertGrade(String grade) {
		switch(grade){
		case "A": 
			return 5.0;
		case "B": 
			return 4.0;
		case "C": 
			return 3.0;
		case "D": 
			return 2.0;
		case "E": 
			return 1.0;
		case "F": 
			return 0.0;
		default: 
			return 0.0;
		}
	}
	
}
