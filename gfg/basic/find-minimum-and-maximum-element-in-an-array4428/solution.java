class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int a= Integer.MIN_VALUE;
        int b= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
            }
            if(arr[i]<b){
                b=arr[i];
            }
            
        }
        list.add(b);
        list.add(a);
        return list;
    }
}
