package calculator.fxui;


import java.io.*;

public class TextFileIO {
	
	
	public static void write(String navn, String snitt) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("log/grades.txt"));
			bw.write(navn + "\n");
			bw.write(snitt  + "\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void read() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("log/grades.txt"));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		}catch (Exception e) {
			e.addSuppressed(e);
		}
	}
	

	public static void main(String[] args) {
		TextFileIO file = new TextFileIO();
		file.read();
	}

}