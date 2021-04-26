package calculator.fxui;

public interface ITextFileIO {
	
	public void write(String navn, String snitt);
	
	public void clear(boolean clear);
	
	public String read();

}
