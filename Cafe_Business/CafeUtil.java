import java.util.ArrayList;
class CafeUtil {
// adds all numbers up to 10 1+1+2+1+2+3
  public int getStreakGoal() {
    int sum = 0;
    for (int i = 1; i <= 10; i = i+1) {
      sum = sum + i;
    }
    return sum;
  }

// adds all items on list
  double getOrderTotal(double[] prices) {
    double total = 0;
    for (int i =0; i < prices.length; i++) {
    total = total + prices[i];
    }
    return total;
  }

// displays all names on an array list
  void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.printf("%s %s\n", i, menuItems.get(i));
    }
  }

  public void addCustomer(ArrayList<String> customers) {
    System.out.println("Enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello " + userName);
    System.out.printf("There are %s people in front of you", customers.size());
    customers.add(userName);
  }
}
