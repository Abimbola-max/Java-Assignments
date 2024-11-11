public class IndexElement {

	public static void main(String[] args) {

		int[] arr = {32, 43, 87, 56, 90, 12,  70, 54, 34};

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int counter = 0; counter <= arr.length; counter++) {
			System.out.printf("%d%9d%n", counter, arr[counter]);
	}
}
  }
