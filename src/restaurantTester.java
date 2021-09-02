public class restaurantTester {
  public static void main (String[]args) {
    Restaurant r1 = new Restaurant("McDonalds", 5 , 12.99, true);
    System.out.println(r1);
    Restaurant r = new Restaurant("Burger King", 3 , 8.99, true);
    System.out.println(r.compareTo(r1));
    System.out.println(r.equals(r1));
  }
}