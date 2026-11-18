# Display the First Three Rows

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

```
DataFrame: employees
+-------------+--------+
| Column Name | Type   |
+-------------+--------+
| employee_id | int    |
| name        | object |
| department  | object |
| salary      | int    |
+-------------+--------+

```

Write a solution to display the  **first `3`** rows of this DataFrame.

 

 **Example 1:** 

```
Input:
DataFrame employees
+-------------+-----------+-----------------------+--------+
| employee_id | name      | department            | salary |
+-------------+-----------+-----------------------+--------+
| 3           | Bob       | Operations            | 48675  |
| 90          | Alice     | Sales                 | 11096  |
| 9           | Tatiana   | Engineering           | 33805  |
| 60          | Annabelle | InformationTechnology | 37678  |
| 49          | Jonathan  | HumanResources        | 23793  |
| 43          | Khaled    | Administration        | 40454  |
+-------------+-----------+-----------------------+--------+
Output:
+-------------+---------+-------------+--------+
| employee_id | name    | department  | salary |
+-------------+---------+-------------+--------+
| 3           | Bob     | Operations  | 48675  |
| 90          | Alice   | Sales       | 11096  |
| 9           | Tatiana | Engineering | 33805  |
+-------------+---------+-------------+--------+
Explanation: 
Only the first 3 rows are displayed.
```

## Solution

**Language:** Python  
**Runtime:** 297 ms (beats 29.88%)  
**Memory:** 75.2 MB (beats 5.43%)  
**Submitted:** 2026-11-18T15:44:19.519Z  

```py
import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
     return employees.head(3)
```

---

[View on LeetCode](https://leetcode.com/problems/display-the-first-three-rows/)