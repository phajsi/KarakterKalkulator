package calculator.fxui;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileSupport implements ITextFileIO{

		
		public void write(String navn, String snitt) {
			try {
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("log/grades.txt", true));
		    	
				bw.write(navn + ":" + snitt + "\n");
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		
		public void clear(boolean clear) {
			try {
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("log/grades.txt", clear));
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}

		public String read() {
			String info = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader("log/grades.txt"));
				int s;
				while ((s = br.read()) != -1) {
			        char character = (char) s;
			        info += character;
				}
				br.close();
			}catch (IOException e) {
				e.addSuppressed(e);
			}
			return info;
		}

	}
