package ex04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	  public static List<String> findPermutations(String str) {

	    List<String> permutations = new ArrayList<>();

	    if (str == null || str.length() == 0) {
	      return permutations;
	    }

	    permutations.add(str);

	    for (int i = 0; i < str.length(); i++) {
	      String before = str.substring(0, i);
	      String after = str.substring(i + 1);
	      String remainder = before + after;
	      permutations.addAll(findPermutations(remainder));
	    }

	    Collections.sort(permutations);
	    return permutations;
	  }

	  public static void main(String[] args) {
	    
	    String str = "abc";
	    List<String> result = findPermutations(str);

	    System.out.println(result);

	  }

	}

