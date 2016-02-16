//Lucy Song 260517932

public class ParseDigits {
  public static void main(String[] args) {
    int x=Integer.parseInt(args[0]); //input integer
    
    //parse digits - since divided ints are rounded down, this will yield the digit
    int tenthousands = x/10000;
    int thousands = (x - tenthousands*10000)/1000;
    int hundreds = (x - tenthousands*10000 - thousands*1000)/100;
    int tens = (x - tenthousands*10000 - thousands*1000 - hundreds*100)/10;
    int ones = (x - tenthousands*10000 - thousands*1000 - hundreds*100 - tens*10);
    
    
    //calculating sum and product
    int sum = tenthousands+thousands+hundreds+tens+ones;
    int product = tenthousands*thousands*hundreds*tens*ones;
    
    System.out.println("The sum of the digits is " + sum);
    System.out.println("The product of the digits is " + product);
    
    if (sum>product) {
      System.out.println("The sum is larger than the product");
    }
    else if (product>sum) {
      System.out.println("The product is larger than the sum");
    }
  }
}