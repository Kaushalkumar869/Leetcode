class Solution {
    public boolean isPerfectSquare(int num) {

       long start = 0;
       long end = num;
       while(start<=end){
        long mid = start+(end-start)/2;
        long sq = mid * mid;
        if(sq==num){
            return true;
        }
        else if(sq>num){
            end= mid-1;
        }
        else{
            start = mid+1;
        }
       }
       return false;
    }
}