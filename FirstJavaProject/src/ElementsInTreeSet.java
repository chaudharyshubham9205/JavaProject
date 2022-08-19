import java.util.TreeSet;
public class ElementsInTreeSet {
	  public static void main(String[] args) {
	  TreeSet<String> tree_set = new TreeSet<String>();
	  tree_set.add("Yellow");
	  tree_set.add("Black");
	  tree_set.add("Pink");
	  tree_set.add("White");
	  tree_set.add("Green");
	  tree_set.add("Red");
	  // Print the tree list
	  for (String element : tree_set) {
	    System.out.println(element);
	    }
	 }
}

