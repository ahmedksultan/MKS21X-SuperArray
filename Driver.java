public class Driver {
     public static void main(String[] args) {
          System.out.println();
          //SA0 = ((test)) empty list, size 10
          SuperArray SA0 = new SuperArray();
          System.out.println(SA0.toString()); //[]
          System.out.println(SA0.toStringDebug()); //[null x10]
          System.out.println();
          //SA1 = list, size 10
          SuperArray SA1 = new SuperArray();
          SA1.add("zero");
          SA1.add("one");
          System.out.println(SA1.toString()); //[zero, one]
          System.out.println(SA1.toStringDebug()); //[zero, one, null x8]
          System.out.println(SA1.get(1)); //one
          System.out.println(SA1.set(1, "fortnite")); //one
          System.out.println(SA1.get(1)); //fortnite
          System.out.println(SA1.toString());
          System.out.println();
          //SA2 = list, size 10 but overflow
          SuperArray SA2 = new SuperArray();
          for ( int i = 0; i < 10; i++ ) {
               SA2.add(i + "");
          }
          System.out.println(SA2.toString());//[0, 1, 2... 9]
          System.out.println(SA2.toStringDebug());//[0, 1, 2... 9]
          SA2.add("no");
          System.out.println(SA2.toString());//[0, 1, 2... 9]
          for ( int i = 0; i < 10; i++ ) {
               SA2.add(i + 10 + "");
          }
          System.out.println(SA2.toStringDebug());
     }
}
