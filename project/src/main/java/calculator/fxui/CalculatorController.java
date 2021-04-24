package calculator.fxui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

import calculator.model.CalculatorLogic;
import calculator.fxui.TextFileIO;

public class CalculatorController {
	
	@FXML Text snitt;
	@FXML Button beregnBtn, lagreBtn, slettBtn, hentHistorikkBtn;
	@FXML TextField navn;
	@FXML TextField kar1, kar2, kar3, kar4, kar5, kar6, kar7, kar8;
	@FXML TextField fag1, fag2, fag3, fag4, fag5, fag6, fag7, fag8;	
	@FXML TextArea historikk;
	
    public void handleGrade(){
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

      
	  double avg = CalculatorLogic.calculateAvg(list);
	  snitt.setText(String.valueOf(avg));

   }
    
    public void handleShowHistory() {
		String content = TextFileIO.read();
		historikk.setText(content);
    }
    
    public void handleClearHistory() {
		TextFileIO.clear(false);
		historikk.setText("");
    }
    
    public void handleSaveButton() {
		String name = navn.getText();
		String snittStr = snitt.getText();
		TextFileIO.write(name, snittStr);
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
    

}
