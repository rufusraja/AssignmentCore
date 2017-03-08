import java.util.ArrayList;
import java.util.Arrays;

public class abc {
	    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if (num == null || num.length == 0) {
	            return result;
	        }
	         
	        Arrays.sort(num);
	         
	        combinationSumHelper(num, target, 0, 0, new ArrayList<Integer>(), result);
	         
	        return result;
	    }
	     
	    private void combinationSumHelper(int[] num, int target, int start, int sum, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {
	        if (sum == target) {
	            result.add(new ArrayList<Integer>(curr));
	            return;
	        }
	         
	        if (sum > target) {
	            return;
	        }
	         
	        for (int i = start; i < num.length; i++) {
	            if (i != start && num[i - 1] == num[i]) {
	                continue;
	            }
	            if ((sum + num[i]) > target) {
	                break;
	            } 
	             
	            sum += num[i];
	            curr.add(num[i]);
	             
	            combinationSumHelper(num, target, i + 1, sum, curr, result);
	             
	            sum -= num[i];
	            curr.remove(curr.size() - 1);
	        }
	    }
	}