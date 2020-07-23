//Question: https://www.interviewbit.com/problems/flip/
//You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.
//Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

//Notes: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.

public class Solution {
    public ArrayList<Integer> flip(String a) {
        int n=a.length();;
        int zero=0, one=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<n; ++i)
            if(a.charAt(i)=='1')
                one++;
        if(one==n)
            return ans;
        int cur=0;
        int start=0,L=start+1;
        int end=0,R=end+1;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; ++i){
            if(a.charAt(i)=='1'){
                cur--;
            }    
            else{
                cur++;
                if(cur>max){
                    max=cur;
                    L=start+1;
                    R=i+1;
                }
            }
            // System.out.println(cur);
            if(cur<0){
                cur=0;
                start=i+1;
            }
        }
        ans.add(L);
        ans.add(R);
        return ans;
    }
}    
