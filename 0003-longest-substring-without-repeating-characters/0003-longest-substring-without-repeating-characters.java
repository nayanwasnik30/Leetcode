class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left=0; int max=0;
        for(int right=0;right<s.length();right++){
            char ch1=s.charAt(right);
            map.put(ch1,map.getOrDefault(ch1,0)+1);

            while(map.get(ch1)>1){
                char ch2=s.charAt(left);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0)map.remove(ch2);
                left++;
            }
            max=Math.max(max,right-left+1);
        }

        return max;
    }
}