class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        HashMap<Integer,ArrayList<Character>> map= new HashMap<>();
        
        for(Character ch:freq.keySet()){
            int f=freq.get(ch);

            if(map.containsKey(f)==false)
            map.put(f, new ArrayList<>());

            map.get(f).add(ch);
        }
        String str="";
        for(int i=s.length();i>=1;i--){
            if(map.containsKey(i)==true){
                for(Character c:map.get(i)){
                    for(int j=0;j<i;j++){
                        str=str+c;
                    }
                }
            }
        }
        return str;
    }
}