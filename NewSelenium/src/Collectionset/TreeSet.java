package Collectionset;

public class TreeSet {

	public static void main(String[] args) {

		java.util.TreeSet<Integer> treesetex = new java.util.TreeSet<Integer>();

		// Using the add() method
		treesetex.add(2);
		treesetex.add(4);
		treesetex.add(6);
		System.out.println("TreeSet: " + treesetex);

		// output:
		// TreeSet: [2, 4, 6]

		java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
		numbers.add(1);
		System.out.println("TreeSet: " + numbers);

		// output:
		// TreeSet: [2, 4, 6]
		// TreeSet: [1]

		numbers.addAll(treesetex);
		System.out.println("TreeSet: " + numbers);
		// output:
		// TreeSet: [2, 4, 6]
		// TreeSet: [1]
		// TreeSet: [1, 2, 4, 6]

	}

}
