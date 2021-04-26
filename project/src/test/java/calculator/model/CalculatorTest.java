package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	private static Calculator calc;
	
	static List<String> list = new ArrayList<>();

	
    @BeforeAll     
    @DisplayName("SetUp")
    public static void setUp() throws Exception {
        calc = new Calculator();
        list.add("A");
        list.add("B");
        calc.setListGrades(list);
        calc.setAverage(5.0);
    }
    
    @Test
    @DisplayName("Test get and set average")
    void testGetAvarage() {
    	assertEquals(5.0, calc.getAverage(), "should be equal (5.0 = 5.0)");
    	calc.setAverage(3.0);
    	assertNotEquals(4.0, calc.getAverage(), "should not be equal (4.0 != 3.0)" );
    	assertNotEquals("C", calc.getAverage(), "should not be equal (C != 3.0)" );

    }
    
    @Test
    @DisplayName("Test get and set gradeList")
    void testGetGradeList() {
    	assertEquals(list, calc.getListGrades(), "should be equal");
    	//calc.getListGrades();
    	Calculator calc2 = new Calculator();
    	assertNotEquals(list, calc2.getListGrades(), "should not be equal" );
    	calc2.setListGrades(list);
    	assertEquals(list, calc2.getListGrades(), "should be equal");
    	list.clear();
    	assertNotEquals(calc2, calc.getListGrades(), "should not be equal" );


    }

}
