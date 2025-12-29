package Recursion1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Another Way to Think 🧠
//Binary recursion:
//
//You ask:
//        “Take this element or not?”
//
//For-loop recursion:
//
//You ask:
//        “Which element should I take next?”

public class Subset2
{
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current=new ArrayList<>();
        PrintUniqueSubsets(arr,result,0,current);
        System.out.println(result);


    }
    static void PrintUniqueSubsets(int[] arr, List<List<Integer>> result, int ind, List<Integer> list)
    {
        result.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1])
             continue;
            list.add(arr[i]);
            PrintUniqueSubsets(arr, result, i+1, list);
            list.remove(list.size()-1);

        }
    }
}
