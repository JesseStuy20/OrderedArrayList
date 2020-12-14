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
  }

}
