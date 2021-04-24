package calculator.fxui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

import calculator.model.CalculatorLogic;
import calculator.fxui.TextFileIO;

public class CalculatorController {
	
	@FXML Text snitt;
	@FXML Button beregnBtn, lagreBtn;
	@FXML TextField navn;
	@FXML TextField kar1, kar2, kar3, kar4, kar5, kar6, kar7, kar8;
	@FXML TextField fag1, fag2, fag3, fag4, fag5, fag6, fag7, fag8;	
	
	//TextField[] gradeFields = {kar1, kar2, kar3, kar4, kar5, kar6, kar7, kar8};
    
    public void handleGrade(ActionEvent e){
	  List<String> list = new ArrayList<String>();
	  String var1 = kar1.getText();
	  list.add(var1);
	  String var2 = kar2.getText();
	  list.add(var2);
	  String var3 = kar3.getText();
	  list.add(var3);
	  String var4 = kar4.getText();
	  list.add(var4);
	  String var5 = kar5.getText();
	  list.add(var5);
	  String var6 = kar6.getText();
	  list.add(var6);
	  String var7 = kar7.getText();
	  list.add(var7);
	  String var8 = kar8.getText();
	  list.add(var8);

      beregnBtn.setOnAction(event -> {
    	  double avg = CalculatorLogic.calculateAvg(list);
    	  snitt.setText("Ditt snitt er: " + avg);
      });
    }
    
    public void handleSaveButton() {
    	lagreBtn.setOnAction(event -> {
    	String name = navn.getText();
    	String str = snitt.getText();
		TextFileIO.write(str, name);
    	});
    }
    

}
