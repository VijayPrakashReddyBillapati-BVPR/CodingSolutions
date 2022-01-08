public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int prefix[] = new int[A.size()];
        ArrayList<Integer> sub =  new ArrayList<Integer>();
        int start =0, end =-1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<A.size();i++)
        {
            prefix[i] = i-1 < 0 ? A.get(i) : prefix[i-1] + A.get(i);
            map.put(prefix[i],i);
        }
        
        for(int i=0; i< prefix.length;i++)
        {
            if(prefix[i] == 0)
            {
                start =0;
                end = i;
            }

            if(map.containsKey(prefix[i]))
            {
                int index = map.get(prefix[i]);
                if(index > i)
                {
                  if((index - i) > (end - start+1))
                    {
                        start = i+1;
                        end = index;
                    }
                }
            }
        }
        for(int i = start; i<= end ;i++)
        {
                sub.add(A.get(i));
        }
        return sub;
        
    }
}
