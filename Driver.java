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
          System.out.println();
     }
}
