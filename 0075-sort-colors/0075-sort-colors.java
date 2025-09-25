class Solution {
    public void sortColors(int[] nums) {
    ArrayList<Integer> zeroR= new ArrayList<>();
     ArrayList<Integer> oneW= new ArrayList<>();
      ArrayList<Integer> twoB= new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zeroR.add(nums[i]);
        }else if(nums[i]==1){
            oneW.add(nums[i]);
        }else if(nums[i]==2){
            twoB.add(nums[i]);
        }
    }
    ArrayList<Integer> list= new ArrayList<>();
    for(int i=0;i<zeroR.size();i++){
        list.add(zeroR.get(i));
    }for(int i=0;i<oneW.size();i++){
        list.add(oneW.get(i));
    }for(int i=0;i<twoB.size();i++){
        list.add(twoB.get(i));
    }
    for(int i=0;i<nums.length;i++){
       nums[i]=list.get(i);
    }

    }
}