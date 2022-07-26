public class Counter {

  long count = 0;

  public void inc() {
      synchronized (this) {
          count++;
      }
  }

  public long getCount() {
      return count;
  }
}