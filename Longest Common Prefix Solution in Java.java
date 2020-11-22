class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String res="";
        if(strs.length==0 || strs == null) return res  ;
        res = strs[0];
        
        for(int i=1;i<strs.length;i++){
            int j=0;    
            while(j<strs[i].length()&& j< res.length() && strs[i].charAt(j)==res.charAt(j)){
                j++;
            }
            if(j==0){
                res="";
                return res;
            }
            res = res.substring(0,j);   
        }
        return res;
        
    }
}