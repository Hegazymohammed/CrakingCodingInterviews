package array.range;

import java.util.TreeMap;

public class PrefixSum {

    public static void prefix(int[]array){
        for (int index = 1; index <array.length ; index++)
                array[index]+=array[index-1];

    }

    public static void sufix(int[]array){
        for (int index = array.length-2; index >0 ; index--) {
                array[index]+=array[index+1];
        }
    }

    public static int Query(int startIndex,int endIndex,int []array){
                    if(startIndex<0||endIndex<0)
                        return -1;
                    if(startIndex==0)
                        return array[endIndex];
                    else
                        return array[endIndex]-array[startIndex-1];
    }
    public static int subarraySum(int[] nums, int k) {
        //O(n)
        int length=nums.length;
        int result=0;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        map.put(0,1);
        int sum=0;
        for (int index = 0; index < length; index++) {
                sum+=nums[index];
                int key= sum-k;
                if(map.containsKey(key))
                    result+=map.get(key);
                map.put(sum,map.getOrDefault(sum,0)+1);
        }


       return result;

    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,-1,0},0));

    }
}
