public class TypePromotion{
  public static void main(String[] args) {
    byte a = 10;
    byte b = 20;
    int res1 = a * b;
    System.out.println(res1);

    int x = 10;
    float y = 5.5f;
    float res2 = x + y;
    System.out.println(res2);

    char c = 'A';
    int res3 = c + 1;
    System.out.println(res3);
  }
}
