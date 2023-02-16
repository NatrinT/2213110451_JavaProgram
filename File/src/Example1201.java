import java.io.*;
import java.util.*;

public class Example1201 {
	public static void main(String[] args) throws IOException{
		File file = new File("MemberLogin.txt");
		Scanner read = new Scanner(file);
		while(read.hasNext()) {
			String name = read.next();
			read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(name+"\t("+email+")");
		}
		read.close();
	}
}
