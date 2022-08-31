import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static int[] solution(int[] data, int n){


        LinkedHashMap<Integer, Integer> hold = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<data.length; i++){
            if(!hold.containsKey(data[i])){
                hold.put(data[i], 1);
            }
            else {
                hold.put(data[i], hold.get(data[i])+1);
            }
        }
        for(Integer i: hold.keySet()){
            System.out.println("This is "+i);
        }

        System.out.println(list);
        int[] res = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return res;
    }


    public static void main(String[] args) {
        int[] data = {4, 2, 2, 3, 3, 3, 1, 5, 5};
        int n = 1;
        int[] test = solution(data, n);

        for(int i: test)
            System.out.println(i);

    }
}
