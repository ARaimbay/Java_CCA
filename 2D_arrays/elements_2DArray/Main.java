public class Main {
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};
    int retrievedInt = intMatrix[0][3];
    System.out.println(retrievedInt);
    int middleValue = intMatrix[1][2];
    System.out.println(3 * middleValue);
  }
}