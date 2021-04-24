package calculator.model;

import java.util.Arrays;
import java.util.List;

public class CalculatorLogic {

	
	public static double calculateAvg(List<String> listGrades) {
		double sum = 0.0;
		int length = 0;
		for (String grade : listGrades) {
			if(grade.matches("^[A-E]")) {
				double gradeDouble = convertGrade(grade);	
				sum += gradeDouble;
				length++;
			}
			
		}
		return sum/length;
	}
	
	public static double convertGrade(String grade) {
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
	
	public static void main(String[] args) {
		String test = "876";
		System.out.println(convertGrade(test));
		List<String> list = Arrays.asList("A","A","C","Cbn","hjhvj");
		System.out.println(calculateAvg(list));
	}
}
