import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileIo {
	public static void main(String[] args) {

		// FileOutputStream - Write
		// FileInputStream - Read

		try 
		{
			String s="welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://gaurang.txt");
			fout.write(s.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");

	}
}
