public class Solution {
    public int solve(ArrayList<Integer> A) {
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         int returnVal=-1;
        for(Integer val: A)
        {
            if(map.containsKey(val))
            {
                map.put(val,map.get(val) + 1);
            }else
                map.put(val,1);
        }

        for(Integer val: A)
        {
            if(map.containsKey(val))
            {
                if(map.get(val) > 1)
                {
                    returnVal = val;
                    break;
                }
            }
        }
        return returnVal;
    }
}
