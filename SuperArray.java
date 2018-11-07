public class SuperArray {
     private String[] data;
     private int size;
     /* PHASE 1 */
     public SuperArray() {
          size = 0;
          data = new String[10];
     }
     public SuperArray(int initSize) {
          if ( initSize < 0 ) {
               throw new IllegalArgumentException("ERROR - SuperArray can't have a negative size value");
          }
          data = new String[initSize];
          size = 0;
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
          return result;
     }
     public String toStringDebug() {
          String result = "[";
          if (data.length == 0) {
               return "[]";
          }
          for (int i = 0; i < data.length - 1; i++) {
               result = result + data[i] + ", ";
          }
          result = result + data[data.length - 1] + "]";
          return result;
     }
     public String get(int i) {
          if (i < 0 || i >= size()) {
               throw new IndexOutOfBoundsException("ERROR - index out of bounds");
          }
          else {
               return data[i];
          }
     }
     public String set(int i, String e) {
          if (i < 0 || i >= size()) {
               throw new IndexOutOfBoundsException("ERROR - index out of bounds");
          }
          else {
               String r = data[i];
               data[i] = e;
               return r;
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
          for (int i = 0; i < size; i++) {
               if (data[i].equals(target)) {
                    result = true;
               }
          }
          return result;
     }
     public int indexOf(String target) {
          for (int i = 0; i < size; i++) {
               if (data[i].equals(target)) {
                    return i;
               }
          }
          return (-1);
     }
     public int lastIndexOf(String target) {
          int result = -1;
          for (int i = 0; i < size; i++) {
               if (data[i].equals(target)) {
                    result = i;
               }
          }
          return result;
     }
     public void add(int idx, String e) {
          if (idx > size || idx < 0) {
               throw new IndexOutOfBoundsException("ERROR - index out of bounds");
          }
          if (size == data.length) {
               resize();
          }
          for (int i = idx; i < size; i++) {
               data[i+1] = data[i];
          }
          size += 1;
          data[idx] = e;
     }
     public String remove(int idx) {
          if (idx > size || idx < 0) {
               throw new IndexOutOfBoundsException("ERROR - index out of bounds");
          }
          String r = get(idx);
          for (int i = idx; i < size - 1; i++) {
               data[i] = data[i+1];
          }
          size = size - 1;
          return r;
     }
     public boolean remove(String e) {
          remove(indexOf(e));
          return contains(e);
     }
}
