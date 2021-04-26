package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.fxui.CalculatorApp;
import calculator.model.CalculatorLogic;


public class CalculatorLogicTest {
	
	private static Calculator calc;

	static List<String> list = new ArrayList<>();
	
    @BeforeAll                                         
    public static void setUp() throws Exception {
        calc = new Calculator();

    }

	
	@Test                                               
    @DisplayName("Letters should be correct numbers")
	public void testConvertGrade() {
        list.add("A");
		assertEquals(5.0, calc.calculateAvg(list), "A should be 5.0");
		list.clear();
		list.add("B");
		assertEquals(4.0, calc.calculateAvg(list), "B should be 4.0");
		list.clear();
		list.add("C");
		assertEquals(3.0, calc.calculateAvg(list), "C should be 3.0");
		list.clear();
		list.add("D");
		assertEquals(2.0, calc.calculateAvg(list), "D should be 2.0");
		list.clear();
		list.add("E");
		assertEquals(1.0, calc.calculateAvg(list), "E should be 1.0");
		list.clear();
		list.add("F");
		assertEquals(0.0, calc.calculateAvg(list), "F should be 0.0");
		list.clear();
		list.add("any");
		assertEquals(0.0, calc.calculateAvg(list), "anything should be 0.0");
		list.clear();
		list.add("a");
		assertEquals(0.0, calc.calculateAvg(list), "a should be 0.0");
		list.clear();
	}
	
	@Test
	@DisplayName("Calculating average with 2 decimal ")
	public void testCalculateAvg(){
		List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		assertEquals(3.0, calc.calculateAvg(list2), "List2 should be 2.6" );
		
		List<String> list3 = new ArrayList<>(Arrays.asList("F", "F", "F", "F", "F"));
		assertEquals(0.0, calc.calculateAvg(list3), "List3 should be 0.0" );
		
		List<String> list4 = new ArrayList<>(Arrays.asList("A", "A"));
		assertEquals(5.0, calc.calculateAvg(list4), "List4 should be 5.0" );
		
		List<String> list5 = new ArrayList<>(Arrays.asList("B", "C","B+", "C", "c", "hello", "A"));
		assertEquals(3.75, calc.calculateAvg(list5), "List5 should be 3.75" );
	}

}
