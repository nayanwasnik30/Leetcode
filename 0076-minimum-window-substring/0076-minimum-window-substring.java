class Solution {
    public String minWindow(String s, String t) {
        //small string in HashMap
        HashMap<Character,Integer> tmap= new HashMap<>();
        HashMap<Character,Integer> smap= new HashMap<>();
        for(int i=0;i<t.length();i++){
           char ch=t.charAt(i);
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        int left=0; int min=Integer.MAX_VALUE;
        int matchcount=0; int start=0;
        for(int right=0;right<s.length();right++){
           char ch=s.charAt(right);
           int fr=smap.getOrDefault(ch,0)+1;
           smap.put(ch,fr); // added char one-by-one
           
           if(fr==tmap.getOrDefault(ch,0)){
                matchcount++;
           }
           //exclude char when matchcount values exceeed 
           while(matchcount>=tmap.size()){
            if(right-left<min){
                start=left;
                min=right-left+1;
            }
            char chl=s.charAt(left);
            int freq=smap.get(chl)-1;
            smap.put(chl,freq);
            if(freq+1 == tmap.getOrDefault(chl,0)){
                matchcount--;
            }
            left++;
           }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start,min+start);
    }
}