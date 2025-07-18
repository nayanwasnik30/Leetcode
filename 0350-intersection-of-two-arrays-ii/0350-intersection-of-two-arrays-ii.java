class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer> freq= new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            freq.put(nums1[i],freq.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> inter = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(freq.containsKey(nums2[i])==true && freq.get(nums2[i])>0){
                inter.add(nums2[i]);
                freq.put(nums2[i],freq.getOrDefault(nums2[i],0)-1);
            }
        }
        int [] arr= new int [inter.size()];
        for(int i=0;i<inter.size();i++){
            arr[i]=inter.get(i);
        }
        return arr;
    }
}