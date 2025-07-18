class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            freq.put(nums1[i],freq.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> inter = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(freq.containsKey(nums2[i])==true){
                inter.add(nums2[i]);
                freq.remove(nums2[i]);
            }
        }
        int [] arr= new int [inter.size()];
        for(int i=0;i<inter.size();i++){
            arr[i]=inter.get(i);
        }
        return arr;
    }

}