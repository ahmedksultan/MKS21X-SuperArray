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
               resize();
               data[size] = e;
               size += 1;
               return true;
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
               return "ERROR...value out of range!";
          }
          else {
               return "Value @ index" + i + ": " + data[i];
          }
     }
     public String set(int i, String e) {
          if (i < 0 || i >= size()) {
               return "ERROR...value out of range!";
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
          newArray = new String[size*2 + 1];
          for (int i = 0; i < data.length; i++) {
               newArray[i] = data[i];
          }
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
     public void add(int idx, String e) {
          if (size == data.length) {
               resize();
               size += 1;
          }
          for (int i = size - 1; i >= idx; i--) {
               data[i+1] = data[i];
          }
          data[idx] = e;
     }
     public String remove(int idx) {
          if (idx >= size || idx < 0) {
               System.out.println("ERROR...index out of range!");
               return null;
          }
          String r = get(idx);
          for (int i = idx; i < size - 1; i++) {
               data[i] = data[i+1];
          }
          data[size - 1] = null;
          size = size - 1;
          return "Removing: " + r;
     }
     public boolean remove(String e) {
          remove(indexOf(e));
          return contains(e);
     }
}
