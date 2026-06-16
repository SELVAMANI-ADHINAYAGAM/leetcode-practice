class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String f=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(f)!=0){
                f=f.substring(0,f.length()-1);
            }
        }
        return f;
    }
}