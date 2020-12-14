import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public boolean add(T element) {
    super.add(element) ;
    for (int i=0; i<size(); i++) {
      if (get(i).compareTo(get(size())) != 0) {
        T temp = get(i) ;
        remove(i) ;
        super.add(temp) ;
        i-- ;
      }
    }
    return true ;
  }

  public void add(int index, T element) {
    add(element) ;
    // gets sorted anyways, index placed does not matter
  }

}