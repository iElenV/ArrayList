public class ArrayList
{
    private int [] _array;
    public int Count;
    private  int _size;


    public ArrayList() {
        _array = new int[10];
        Count = 0;

    }
    public ArrayList(int element) {
        _array = new int[10];
        _array [0] = element;
        Count = 1;
    }

    public ArrayList(int [] elements) {
        _array = new int [(int) ( elements.length*1.5)];
        System.arraycopy(elements, 0, _array,0, elements.length);
        Count = elements.length;
    }
    public  int Get (int index)
    {
        if (index<0 || index >=Count) {
            throw new IndexOutOfBoundsException( "Bad Index");
        }
    return _array[index];
    }

    public void Add (int element)
    {

  if (Count >= _array.length)
  {
      IncreaseLength(1);
  }
  _array [Count] = element;
  Count++;
    }



    private void IncreaseLength (int elementCount)
    {
        int newLength = (int)((_array.length + elementCount)*1.5);
        int [] newArr = new int [newLength];
        System.arraycopy(_array, 0, newArr,0,_array.length);
        _array =newArr;

    }

}
