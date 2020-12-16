import java.util.ArrayList;
import java.util.Collections;

public class Interpolation {
    ArrayList<Integer> list;

    public Interpolation(ArrayList<Integer> list) {
        this.list = list;
    }

    public void search(int x)
    {
        Collections.sort(list);

        int low = 0, high = (list.size() - 1);

        while (low <= high && x >= list.get(low) && x <= list.get(high))
        {

            if (low == high)
            {
                if (list.get(low) == x){
                    System.out.println("Failed to find the target.");
                    break;
                }
            }

            int mid = low + (((high-low) / (list.get(high)-list.get(low))) * (x - list.get(low)));

            if (list.get(mid) == x){
                System.out.println("Success! target has been found with index of: " + mid);
                break;
            }
            else {
                if (list.get(mid) < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
