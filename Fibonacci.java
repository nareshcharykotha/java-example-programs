class Fibonacci {
  public static void main(String args[]) {
   int low = 1,high =1;

    System.out.println(low);
     while(high<1000) {
       System.out.println(high);
       high = low + high;
       low = high - low;
      }
    }
 }