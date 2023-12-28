[7,9,1,1,1,3]                 keep these test case in mind while solving this problem
[3,6,10,1,8,9,9,8,9]
​
Example 1:
Input: nums = [1,2,3]
Output: true
​
Example 2:
Input: nums = [2,1,3,4]
Output: false
​
Example 3:
Input: nums = [3,4,5,1,2]
Output: true
​
observation :-
1.  we have to think arr1= [3,4,5]  arr2= [1,2] both are different sorted arrays and stored in single.
2.  in sorted array all values are lessthen for its next values .
3.  arr1[all values] > arr2[ all values]
4.  if we think both as single array [3,4,**5**,**1**,2] in this complete array there is a single point where arr[i]>arr[i+1]. this point when we are comparing arr1[last] with arr2[start] beacuse  arr1[all values] > arr2[ all values].
​
to check :-
1. both the arrays are sorted ? else return false.
2. arr1[all values] > arr2[ all values]? else return false.
​
​
​
​