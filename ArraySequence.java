import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  public ArraySequence(int [] other){
    data = other;
  }
}
