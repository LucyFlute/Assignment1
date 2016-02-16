//Lucy Song 260517932


public class Marking {
  public static void main(String[] args) {
    /* testing
    printMaximum(93, 92);
    printMaximum(5, 5);
    System.out.println(finalGrade(28, 4, 18, 30));
    System.out.println(finalGrade(28, 4, 16, 38));
    System.out.println(maximum(5, 11));
    */
  }
  
  public static int finalGrade (int a, int q, int m, int f) {
    return (a + q + (int)maximum(m, f/2) + f); //adds all grades
  }
  
  //prints which double is larger
  public static void printMaximum (double num1, double num2) {
    if (num1 < num2) {
      System.out.println(num2 + " is larger than " + num1);
    } else if (num2 < num1) {
      System.out.println(num1 + " is larger than " + num2);
    }
    else {
      System.out.println(num1 + " and " + num2 + " are the same number");
    }
  }
  
  //returns the larger double
  public static double maximum (double num1, double num2) {
    if (num1 < num2) {
      return num2;
    } else {
      return num1;
    }
  }
}