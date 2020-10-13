import java.util.Scanner;

class AplusB {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      if (!a.equal("") && !b.equal(""))
        System.out.println(sumOfTwoDigits(a,b));
      else
        System.out.println("Please enter valid numbers");
  }

  static int sumOfTwoNumber(int num1 , int num2){
    return num1+num2;
  }

}
