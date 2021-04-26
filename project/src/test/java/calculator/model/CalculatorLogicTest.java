package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.fxui.CalculatorApp;
import calculator.model.CalculatorLogic;


public class CalculatorLogicTest {
	
	Calculator cal = new Calculator();
	
	//private static CalculatorLogic cl;
	//CalculatorApp app = new CalculatorApp();
	
	@Test                                               
    @DisplayName("Letters should be correct numbers")
	public void testConvertGrade() {
		//double ex_v = 5.0;
		//1double a_v = cl.convertGrade("A");
		//Assertions.assertEquals(5.0, cal.getGrade("A"), "A should be 5");
		
	}
	
	

}
