public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> commom =  new ArrayList<Integer>();
        for(Integer val: A)
        {
            if(map.containsKey(val))
            {
                map.put(val,map.get(val) + 1);
            }else
                map.put(val,1);
        }

        for(Integer val: B)
        {
            if(map.containsKey(val))
            {
                if(map.get(val) > 0)
                {
                    commom.add(val);
                    map.put(val,map.get(val) - 1);
                }
            }
        }
        return commom;
    }
}
