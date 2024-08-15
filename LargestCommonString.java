//Largest common string
class Solution {
    public String largestCommonString(String str1, String str2) {
        String res = "";
        String f, l;
        if(str2.length() > str1.length()) {
            f=str2;
            l=str1;
        } else {
            f=str1;
            l=str2;
        }

        int i=0, j=0, k=1;
        String token="";
        while(i+k<=l.length() && i<f.length()) {
            token = l.substring(i,i+k);
            j=l.indexOf(token);
            if(j>-1) {
                res=token;
                k++;
            } else {
                i++;
            }
        }

        return res;
    }
}
