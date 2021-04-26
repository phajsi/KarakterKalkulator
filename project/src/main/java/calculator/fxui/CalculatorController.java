package calculator.fxui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

import calculator.model.Calculator;
import calculator.fxui.TextFileIO;

public class CalculatorController {
	
	@FXML Text snitt;
	@FXML Button beregnBtn, lagreBtn, slettBtn, hentHistorikkBtn;
	@FXML TextField navn;
	@FXML TextField kar1, kar2, kar3, kar4, kar5, kar6, kar7, kar8;
	@FXML TextField fag1, fag2, fag3, fag4, fag5, fag6, fag7, fag8;	
	@FXML TextArea historikk;
	
	Calculator calc = new Calculator();
	TextFileIO file = new TextFileIO();
	
	private void retrieveGrades() {	  
	  List<String> list = new ArrayList<String>();
	  list.add(kar1.getText());
	  list.add(kar2.getText());
	  list.add(kar3.getText());
	  list.add(kar4.getText());
	  list.add(kar5.getText());
	  list.add(kar6.getText());
	  list.add(kar7.getText());
	  list.add(kar8.getText());
	  

	  Alert errorAlert = new Alert(AlertType.ERROR);
	  errorAlert.setContentText("Karakterene må være store bokstaver mellom A-F");
	  for (String grade : list) {
		  if(!grade.matches("^$|[A-E]")) {
			  errorAlert.show();
			  throw new IllegalArgumentException("Karakteren "+ grade +" er ikke akseptert");
		  }
	}
	  calc.setListGrades(list);
	}
	
    public void handleGrade(){
      retrieveGrades();
	  calc.setAverage(calc.calculateAvg(calc.getListGrades()));
	  snitt.setText(String.valueOf(calc.getAverage()));
   }
    
    public void handleShowHistory() {
		String content = file.read();
		historikk.setText(content);
    }
    
    public void handleClearHistory() {
		file.clear(false);
		historikk.setText("");
    }
    
    private void clearFields() {
    	snitt.setText("");
		navn.setText("");
		kar1.setText("");
		kar2.setText("");
		kar3.setText("");
		kar4.setText("");
		kar5.setText("");
		kar6.setText("");
		kar7.setText("");
		kar8.setText("");
		
		fag1.setText("");
		fag2.setText("");
		fag3.setText("");
		fag4.setText("");
		fag5.setText("");
		fag6.setText("");
		fag7.setText("");
		fag8.setText("");
    }
    
    public void handleSaveButton() {
		String name = navn.getText();
		String snittStr = snitt.getText();
		file.write(name, snittStr);
		clearFields();		
    } 
}
