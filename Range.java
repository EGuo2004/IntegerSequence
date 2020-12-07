import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  
  public Range(int start,  int end){
    if (start > end) {
      throw new IllegalArgumentException("Start can not be greater than end");
    }
    this.start = start;
    this.end = end;
    current = start;
  }
}
