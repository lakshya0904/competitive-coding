// https://www.interviewbit.com/problems/container-with-most-water/

public class Solution {
    public int maxArea(int[] a) {
        if(a==null || a.length==1)
            return 0;
        int max=Integer.MIN_VALUE;
        // for(int i=0; i<a.length-1; ++i){
        //     for(int j=i+1; j<a.length; ++j){
        //         max=Math.max(max,(j-i)*Math.min(a[i],a[j]) );
        //     }
        // }
        // return max;
        //better solution then brute force??
        //chk solution below...
        
        int l=0, r=a.length-1;
        while(l<r){
            max=Math.max(max,(r-l)*Math.min(a[l],a[r]) );
            if(a[l]<a[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
