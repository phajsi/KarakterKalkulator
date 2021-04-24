package calculator.fxui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

import calculator.model.CalculatorLogic;

public class CalculatorController {
	
	@FXML Text snitt;
	@FXML Button beregnBtn, lagreBtn;
	@FXML TextField navn;
	@FXML TextField kar1, kar2, kar3, kar4, kar5, kar6, kar7, kar8;
	@FXML TextField fag1, fag2, fag3, fag4, fag5, fag6, fag7, fag8;	
	
    public void handleField(ActionEvent e){
//      field.setOnAction(event -> {
//    	  nameList.setText(field.getText());
//      });
    }
    
    public void handleGrade(ActionEvent e){
 	  
  	  
      beregnBtn.setOnAction(event -> {
    	  String grade = kar1.getText();
    	  snitt.setText("Ditt snitt er: "+CalculatorLogic.convertGrade(grade));
    	  System.out.println("button pressed");
    	  System.out.println(CalculatorLogic.convertGrade(grade));
    	  //System.out.println(kar1.);
      });
    }

}
