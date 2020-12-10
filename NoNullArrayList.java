import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Value cannot be null") ;
      }
    super.add(element) ;
    return true ;
    }

}
