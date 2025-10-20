class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int max=0; int left=0;
        for(int right=0;right<s.length();right++){
            char ch2 = s.charAt(right);
            map.put(ch2,map.getOrDefault(ch2,0)+1);
            
            while(map.get(ch2)>1){
                char ch1=s.charAt(left);
                map.put(ch1,map.get(ch1)-1);
                
                if(map.get(ch1)==0)map.remove(ch1);

                left++;
                
            }
            max=Math.max(max,right-left+1);
        }

        return max;
    }
}