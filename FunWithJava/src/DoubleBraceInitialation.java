import java.util.HashSet;
import java.util.Set;

public class DoubleBraceInitialation {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>() {
			{
				add("one");
				add("two");
				add("three");
			}
		};

		System.out.println("set=" + set.toString());

	}

}
