public class SuperArray {
     private String[] data;
     private int size;
     /* PHASE 1 */
     public SuperArray() {
          size = 0;
          data = new String[10];
     }
     public void clear() {
          size = 0;
          String[] newdata;
          newdata = new String[10];
          data = newdata;
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
     /* PHASE 2 */
     private void resize() {
          String[] newArray;
          newArray = new String[size*2];
          for (int i = 0; i < data.length; i++) {
               newArray[i] = data[i];
          }
          size = size*2;
          data = newArray;
     }
     /* PHASE 3 */
     public boolean contains(String target) {
          boolean result = false;
          for (int i = 0; i < data.length; i++) {
               if (data[i].equals(target)) {
                    result = true;
               }
          }
          return result;
     }
     public int indexOf(String target) {
          for (int i = 0; i < data.length; i++) {
               if (data[i].equals(target)) {
                    return i;
               }
          }
          return (-1);
     }
     public int lastIndexOf(String target) {
          int result = -1;
          for (int i = 0; i < data.length; i++) {
               if (data[i].equals(target)) {
                    result = i;
               }
          }
          return result;
     }
}
