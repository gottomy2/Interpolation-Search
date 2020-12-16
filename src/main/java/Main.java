import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5,9,22,31,78,51,321,589,21,91,501,502,503,505};
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(arr));
        Interpolation interpolation = new Interpolation(list);
        interpolation.search(91);
    }
}
