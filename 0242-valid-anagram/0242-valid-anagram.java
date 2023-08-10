class Solution {
    public boolean isAnagram(String c1, String c2) {
//         // if(s.length() != t.length()){
//         //     return false;
//         // }
//         HashMap<Character,Long> map1 = new HashMap<>();
//         HashMap<Character,Long> map2 = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char ele=s.charAt(i);
//             if(map1.containsKey(ele)==true){
//                 map1.put(ele,map1.get(ele)+1);
//             }
//             else{
//                 map1.put(ele,(int)1);
//             }
            
//         }
//          for(int i=0;i<t.length();i++){
//             char ele=t.charAt(i);
//             if(map2.containsKey(ele)==true){
//                 map2.put(ele,map2.get(ele)+1);
//             }
//             else{
//                 map2.put(ele,(int)1);
//             }
//         }
        
//         if(map1.size() != map2.size()){
//             return false;
//         }
//         for(Character ele:map1.keySet()){
//             if(map2.containsKey(ele)==true){
//                 if(map2.get(ele)==map1.get(ele)){
//                     continue;
//                 }
//                 else{
//                    return  false;
//                 }
//             }
//             else{
//               return  false;
//             }
//         }
//         return true;
//     }
        if(c1.length()!=c2.length()){
            return false;
        }
        char[] sArray=c1.toCharArray();
        char[] tArray=c2.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray,tArray);
    }
}