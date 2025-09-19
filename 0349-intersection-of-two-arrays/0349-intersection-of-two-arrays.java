class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])==true){
                arr.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int arr1 []= new int [arr.size()];
        for(int i=0;i<arr.size();i++){
           arr1[i]=arr.get(i);
        }
        return arr1;
    }
}