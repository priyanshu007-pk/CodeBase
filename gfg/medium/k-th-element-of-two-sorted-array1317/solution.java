class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n= a.length+b.length;
        int c[] =new int[n];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        Arrays.sort(c);
        int ans =c[k-1];
        return ans;
    }
}