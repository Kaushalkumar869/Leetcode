class Solution {
    public int compress(char[] chars) {
        int count = 0;
        int i =0;
        int j = 0;
        String ans = "";
        while(j<chars.length){
            if(chars[i]==chars[j]){
                count++;
                j++;
            }
            else{
                if(count>1){
                    ans+=""+chars[i]+count;
                }
                else ans+=""+chars[i]; 
                count = 0;
                i=j;
            }
        }
        if(count>1){
            ans+=""+chars[i]+count;
        }
        else ans+=""+chars[i];
        for(int k=0;k<ans.length();k++){
            chars[k] = ans.charAt(k);
        }
        return ans.length();
    }
}