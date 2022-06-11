/*
1. Alex Miller
2. June 10 2022
3. This program takes any number of pennies and converts it to its equivalent in dollars, quarters, dimes, nickels, and pennies.
4. I believe I should recieve a 100 for this assignment as I completed everything shown on the rubric.
 */
public class CoinConverterShell {
   public static void main(String[] args) {
      description(); // calls description method
      convert(); // calls convert method
   }

   public static void description() { // provides a description of the program
      System.out.println(
            "This program takes any number of pennies and converts it to its equivalent in dollars, quarters, dimes, nickels, and pennies.");
   }

   public static void convert() { // initializes the variables pennies, dollars, quarters, dimes, and nickels and
                                  // converts pennies defined value into dollars, quarters, dimes, nickels, and
                                  // pennies
      int pennies = 769;
      int dollars;
      int quarters;
      int dimes;
      int nickels;

      dollars = pennies / 100;
      pennies = pennies % 100;
      quarters = pennies / 25;
      pennies = pennies % 25;
      dimes = pennies / 10;
      pennies = pennies % 10;
      nickels = pennies / 5;
      pennies = pennies % 5;

      // prints out our values for dollars, quarters, dimes, nickels, and pennies
      System.out.println("Dollars: " + dollars);
      System.out.println("Quarters: " + quarters);
      System.out.println("Dimes: " + dimes);
      System.out.println("Nickels: " + nickels);
      System.out.println("Pennies: " + pennies);

   }
}
