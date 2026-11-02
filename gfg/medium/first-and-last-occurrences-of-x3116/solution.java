class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list =new ArrayList<>();
        int a =Integer.MAX_VALUE;
        int b= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(b<i){
                    b=i;
                }
                if(a>i){
                    a=i;
                }
            }
        }
        if(a ==Integer.MAX_VALUE){
            a=-1;
            b=-1;
        }
        list.add(a);
        list.add(b);
        return list;
    }
}
