package simple._1108;

public class Solution {
    public String defangIPaddr(String address) {
        String tmp="[.]";
        String ans="";
        for(int i=0;i<address.length();i++){
            if (address.charAt(i)!='.')
                ans+=address.charAt(i);
            else
                ans+=tmp;
        }
        return ans;
    }
}
