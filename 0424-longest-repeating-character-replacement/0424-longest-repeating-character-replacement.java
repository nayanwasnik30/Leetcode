class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();

        int left=0; int ans=0;
        for(int right=0;right<s.length();right++){
            char ch1=s.charAt(right);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            int win=right-left+1;
            int maxf=maxfreq(map);
            while(win-maxf>k){
                char ch2=s.charAt(left);
                map.put(ch2,map.getOrDefault(ch2,0)-1);
                if(map.get(ch2)==0)map.remove(ch2);
                left++;
                win=right-left+1;
            }
            ans=Math.max(ans,right-left+1);
        }

        return ans;
    }
    public int maxfreq(HashMap<Character, Integer> map) {
    int max = Integer.MIN_VALUE;
    for (int value : map.values()) {
        max = Math.max(max, value);
    }
    return max;
    }
}