public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean creditCheck = creditsEarned > creditsToGraduate;
    System.out.println(creditCheck);
    double creditsAfterSeminar = creditsOfSeminar + creditsEarned;
    boolean creditCheckSecond = creditsToGraduate<creditsAfterSeminar;
    System.out.println(creditCheckSecond);
	}
}