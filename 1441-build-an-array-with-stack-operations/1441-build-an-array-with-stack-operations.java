class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> ss = new Stack< >();
        int i = 1;
        int j = 0;
        while(j<target.length){
            if(i==target[j]){
                ss.push("Push");
                j++;
                i++;
            }
            else{
                ss.push("Push");
                ss.push("Pop");
                i++;
            }
        }
        return ss;
    }
}