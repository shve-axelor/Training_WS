import static java.lang.System.out;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface abc{
	int def(int a,int b);
	
	default void shubh()
	{
		System.out.println("I am Shubh Vegada");
	}
	
	static void vegada()
	{
		System.out.println("I studied from MSU");
	}
	
}

public class example2 implements abc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc add=(a,b) -> (a+b);
		System.out.println(add.def(100, 200));

		
		List<String> l1= new ArrayList<String>();
		l1.add("Shubh");
		l1.add("Parth");
		l1.add("Prerak Sir");
		
		l1.forEach((n)-> System.out.println(n));
		
	//	ActionListener al8 = e -> System.out.println(e.getActionCommand());
		
		abc a1 = (a,b) -> (a+b) ;
		
		abc a2 = new example2();
		System.out.println(a1.def(20, 30));
		a2.shubh();
		
	}

	@Override
	public int def(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}