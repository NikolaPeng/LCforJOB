import java.util.*;
public class fifteen{


public List<List<Integer>> threeSum(int[] nums) {
    //triplet：三胞胎之一
    List<List<Integer>> res = new ArrayList<>();
    //sort
    Arrays.sort(nums);
    
    for(int i=0;i<nums.length-2;i++){
        if(nums[i]>0) break;
        if(i>0 && nums[i]==nums[i-1]) continue;
        int low = i+1;
        int high = nums.length-1;
        int sum = 0 - nums[i];
        while(low<high){
            if(sum == nums[low]+nums[high]){
                res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                while(low<high && nums[low]==nums[low+1]){low++;};
                while(low<high && nums[high]==nums[high-1]){high--;};
                low++;
                high--;
            }else if(sum > nums[low]+nums[high]){
                high--;
            }else{
                low++;
            }
        }
    }
    return res;
}}
