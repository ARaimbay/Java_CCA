public class Loops {
	public static void main(String[] args) {
	  int[][] binary = {
      {0, 1, 0, 1},
      {1, 1, 1, 0},
      {1, 0, 0, 1},
      {1, 0, 1, 0}
    };
		int onesCount = 0;
		
    for(int[] row : binary){
      for(int i: row){
        onesCount += i;
      }
    }
    System.out.println(onesCount);

    String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};	
    
		int i = 0;
    int j = 0;

		//System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");

	}
}