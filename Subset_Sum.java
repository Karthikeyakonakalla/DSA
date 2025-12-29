import java.util.ArrayList;
import java.util.List;

public class Subset_Sum {
    public static void main(String[] args) {
        // we have to print all the individual subsets sum
        int[] arr={5,2,1};
        List<Integer> result=new ArrayList<>();
        printAll(arr,result,0,0);
        System.out.println(result   );

    }
   static  void printAll(int[] arr, List<Integer> list, int ind,int sum)
    {
        if(ind==arr.length)
        {
            list.add(sum);
            return;
        }
        sum+=arr[ind];
        printAll(arr,list,ind+1,sum);
        sum-=arr[ind];
        printAll(arr,list,ind+1,sum);


    }
}
