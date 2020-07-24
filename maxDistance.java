// https://www.interviewbit.com/problems/max-distance/

// Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {
        
        int n=a.size();
        int[] leftmin=new int[n];
        int[] rightmax=new int[n];
        leftmin[0]=a.get(0);
        rightmax[n-1]=a.get(n-1);
        for(int i=1; i<n; ++i)
            leftmin[i]=Math.min(leftmin[i-1],a.get(i));
        for(int i=n-2; i>=0; --i)
            rightmax[i]=Math.max(rightmax[i+1],a.get(i));
        int i=0, j=0;
        int ans=Integer.MIN_VALUE;
        while(j<n && i<n){
            if(leftmin[i]<=rightmax[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else
                i++;
        }
        return ans;
    }
} 
