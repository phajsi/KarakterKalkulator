package calculator.model;

import java.util.List;

public class CalculatorLogic {

	public double calculateAvg(List<String> listGrades) throws Exception {
		double sum = 0.0;
		int length = 0;
		double avg;
		double roundedAvg;
		for (String grade : listGrades) {
			if(!grade.matches("^$|[A-F]")) {
				throw new Exception("Karakteren er ikke gyldig");
			}else {
				double gradeDouble = convertGrade(grade);	
				sum += gradeDouble;
				if (grade!="F" && grade!="") {
					length++;
				}
			}
			
		}
		avg = sum/length;
		roundedAvg = (double)Math.round(avg * 100d) / 100d;
		return roundedAvg;

	}
	
	private double convertGrade(String grade) {
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
		case "":
			return 0.0;
		default: 
			throw new IllegalArgumentException("Karakteren er ikke gyldig");
		}
	}
	
}
