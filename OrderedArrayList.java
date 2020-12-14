import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public boolean add(T element) {
    super.add(element) ;
    for (int i=0; i<size(); i++) {
      if (get(size()-1).compareTo(get(i)) < 0) {
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
    // gets sorted anyways, index placed does not matter?
  }

  public T set(int index, T element) {
    for (int i=0; i<size(); i++) {
      if (get(size()-1).compareTo(get(i)) < 0) {
        T temp = get(i) ;
        remove(i) ;
        super.add(temp) ;
        i-- ;
      }
    }
    T result = get(index) ;
    remove(index) ;
    add(element) ;
    return result ;
  }

  public OrderedArrayList() {
    super() ;
  }

  public OrderedArrayList(int initialCapacity) {
    super(initialCapacity) ;
  }

}
