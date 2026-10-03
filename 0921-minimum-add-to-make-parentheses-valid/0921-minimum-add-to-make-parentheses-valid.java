class Solution {
    public int minAddToMakeValid(String s) {
        // int count = 0;
        // int oc = 0;
        // int j = 0;
        // while(j<s.length()){
        // for(int j = 0;j<s.length();i++){
        //     char ch = s.charAt(j);
        //     if(ch=='('){
        //         oc++;
        //         count++;
        //     }
        // }
        // return count;

        int i = 0;
        int ans = 0;
        int count = 0;
        while(i<s.length()){
            if(s.charAt(i)=='(') count++;
            else{
                if(count>0) count--;
                else ans++;
            }
            i++;
        }
        return ans + count;
    }
}