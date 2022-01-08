public class Solution {
    public int solve(ArrayList<Integer> A) {
        long prefix[] = new long[A.size()];
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i=0;i<A.size();i++)
        {
            prefix[i] = i-1 < 0 ? A.get(i) : prefix[i-1] + A.get(i);
            map.put(prefix[i],i);
        }
        
        for(int i=0; i< prefix.length;i++)
        {
            if(prefix[i] == 0)
            {
                return 1;
            }

            if(map.containsKey(prefix[i]))
            {
                int index = map.get(prefix[i]);
                if(index > i)
                {
                  return 1;
                }
            }
        }
        return 0;
    }
}
