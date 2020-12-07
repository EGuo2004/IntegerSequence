import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  public ArraySequence(int [] other){
    data = other;
  }

  public ArraySequence(IntegerSequence otherseq) {
    reset();
    otherseq.reset();
    data = new int[otherseq.length()];
    while(otherseq.hasNext()) {
      data[currentIndex] = otherseq.next();
      currentIndex++;
    }
    reset();
    otherseq.reset();
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext() {
    return currentIndex !=  this.length();
  }

  public int next(){
    if(!hasNext()) {
      throw new NoSuchElementException("No Next Value");
    }
    currentIndex++;
    return data[currentIndex - 1];
  }
}
