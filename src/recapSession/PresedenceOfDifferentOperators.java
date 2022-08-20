package recapSession;

public class PresedenceOfDifferentOperators {
   public static void main(String[] args) {


      int B = 9;
      int C = 3;
      boolean bl = B + 2 == 3 * C || !true && C < B / 3;
      //  11==9             ||  false &&3<3;
      // false || true && false
      boolean bl2 =false || true && false;// false
      System.out.println(bl2);
      System.out.println(bl);
      System.out.println("5"+9*7);
   }
}