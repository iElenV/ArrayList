
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        ArrayList arr = new ArrayList(12);
        arr.Add(1);
        arr.Add(1);
        arr.Add(1);
        arr.Add(new int[]{1, 2,3});
        System.out.println( "Длина массива " + arr.Count);
        for (int i = 0; i < arr.Count; i++) {
            System.out.println(arr.Get(i));

        }
    }
}