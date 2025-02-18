SentinelSort

SentinelSort is a custom sorting algorithm that works similar to SelectionSort. 
The algorithm works by repeatedly finding the smallest element of the unsorted, original array then copying it into a new array of the same length. 
The original element is then replaced with a sentinel value (INTEGER.MAX_VALUE in this case), ensuring it is skipped over in future iterations.

This sorting algorithm definitely isn't efficient, running at O(n^2) time, and it is an out-of-place solution. However, this algorithm is easy to implement and understand.

In this project, the algorithm is implemented in Java, with a test array in the main method to demonstrate its functionality.
