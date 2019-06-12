import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class example3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("src/lamda/example3.java");
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(System.out::println);
			
			Files.list(Paths.get(".")).forEach(System.out::println);
			
			List<Integer> l1 = new ArrayList<Integer>();
			l1.add(100);
			l1.add(200);
			l1.add(300);
			
			//int avg = l1.stream().average();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}