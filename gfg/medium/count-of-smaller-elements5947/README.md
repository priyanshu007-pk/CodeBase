# count-of-smaller-elements5947

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T19:49:13.565Z  

```java

class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count =0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=x){
                count+=1;
            }
            
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1)