package calculator.model;

import java.util.List;

import java.util.ArrayList;

public class Calculator extends CalculatorLogic {
	
	private List<String> listGrades = new ArrayList<>();
	private double average;
	
	public void setListGrades(List<String> list) {
		this.listGrades = list;
	}
	
	public List<String> getListGrades(){
		return this.listGrades;
	}	
	
    public String findGrades(String text) {
        for (String grade : listGrades) {
            if (grade.equals(text)) {
                return grade;
            }
        }
        return null;
    }

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
}
