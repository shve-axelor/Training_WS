import java.util.*;
import java.util.stream.Stream;

//It contains example of java stream API for bulk data operations on collections
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		{
			l1.add(i);
		}
		
		Stream<Integer> sequentialStream = l1.stream();
		Stream<Integer> parallelStream = l1.parallelStream();
		
		Stream<Integer> highnums = sequentialStream.filter(p -> p > 90);
		highnums.forEach(p -> System.out.println("high numbers"+p));
		
		parallelStream.forEach(p -> System.out.println("all numbers "+ p));

	}

}