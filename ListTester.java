public class ListTester {

  public static void main(String[] args) {
    NoNullArrayList<String> a = new NoNullArrayList<String>() ;
    try {
      a.add(null) ;
    }
    catch(IllegalArgumentException e) {
      System.out.println("Element cannot be null") ;
    }
    System.out.println(a.add("uno")) ;
    System.out.println(a.add("dos")) ;
    System.out.println(a.add("tres")) ;
    OrderedArrayList<Integer> b = new OrderedArrayList<Integer>() ;
    try {
      b.add(null) ;
    }
    catch(IllegalArgumentException e) {
      System.out.println("Element cannot be null") ;
    }
    System.out.println(b.add(1)) ;
    System.out.println(b.add(45)) ;
    System.out.println(b.add(-41)) ;
    System.out.println(b.add(0)) ;
    System.out.println(b.add(18)) ;
    System.out.println(b.toString()) ;
  }

}
