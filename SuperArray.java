public class SuperArray {
     private String[] data;
     private int size;
     public SuperArray() {
          size = 0;
          data = new String[10];
     }
     public void clear() {
          size = 0;
     }
     public int size() {
          return size;
     }
     public boolean isEmpty() {
          return ( size == 0 );
     }
     public boolean add(String e) {
          if ( size < data.length ) {
               data[size] = e;
               size += 1;
               return true;
          }
          else {
               return false;
          }
     }
     public String toString() {
          String result = "[";
          if (data[0] != null) {
               for (int i = 0; i < size - 1; i++) {
                    result = result + data[i] + ", ";
               }
                    result = result + data[size - 1] + "]";
          }
          else {
               result = result + "]";
          }
          return result + " // SIZE:" + size;
     }
     public String toStringDebug() {
          String result = "[";
          for (int i = 0; i < data.length - 1; i++) {
               result = result + data[i] + ", ";
          }
          result = result + data[data.length - 1] + "]";
          return result + " // SIZE:" + size;
     }
     public String get(int i) {
          if (i < 0 || i >= size()) {
               return null;
          }
          else {
               return "Value @ index" + i + ": " + data[i];
          }
     }
     public String set(int i, String e) {
          if (i < 0 || i >= size()) {
               return null;
          }
          else {
               String r = data[i];
               data[i] = e;
               return "Replaced: " + r + " // with: " + e;
          }
     }
}
