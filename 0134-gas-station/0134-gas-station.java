class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel=0; int def=0; int start=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                start=i+1;
                def=def+Math.abs(fuel);
                fuel=0;
            }
        }

        if(fuel>=def) return start;
        return -1;
    }
}