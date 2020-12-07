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

  public void reset(){
    current = start;
  }

  public int length(){
    return end - start + 1;
  }
  public boolean hasNext(){
    return (end - current) >= 0;
  }

  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException("No Next Value");
    }
    current++;
    return current - 1;
  }
}
