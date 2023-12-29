observation;-
1. this is fix First unique element comes on 0th Index and Second  on 1th Index and so on ->.
2. with the help of Unique element last Index we can found how many of Unique elements are in the array.
Approach ;-
1. take two pointers left=0 and right=0.
2. "rigth" pointer to iterate to the whole array and find the unique elements in array . "left" pointer to point the position of next Unique Elmenet store in array.
3. Compair right Index by its next Index (arr[right] != arr[right+1]). if they are not equal means they arr[right] element is unique. So, store this element on left position or Index and increase the value of left and rigth. else ,(arr[right] = = arr[right+1]) they are not unique so increase the value of right to find the unique element.
4. we have to take care of last unique element in array.
5. the  number of (unique elements in array) == (index of last element +1).
6. why + 1? Because array index start from 0.