package calculator.fxui;


import java.io.*;

public class TextFileIO {
	
	
	public static void write(String navn, String snitt) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("log/grades.txt", true));
	    	
			bw.write(navn + ":" + snitt + "\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void clear(boolean clear) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("log/grades.txt", clear));
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static String read() {
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