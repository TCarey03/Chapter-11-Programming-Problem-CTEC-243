## Phase 1 Journal

**Question: How do you think the swap() method may be useful in future phases?**

The swap() method will be useful in future phases because sorting algorithms need to move numbers into the correct positions. Selection Sort will use swapping to move the smallest number into place. It can also help with other sorting algorithms that rearrange elements in an array.

---------

## Phase 2 Journal

**Question: In Selection Sort, does the number of comparisons change if the array is already sorted? Why or why not?**

No, the number of comparisons does not change if the array is already sorted. Selection Sort still searches through the entire unsorted portion of the array during every pass to find the smallest value. This means it has O(N²) time complexity even when the array is already sorted.

---------

## Phase 3 Journal

**Question: Merge Sort requires an auxiliary array. Based on our discussion of Space Complexity, what is the primary drawback of using Merge Sort over Selection Sort when working with extremely limited RAM?**

The main drawback of Merge Sort is that it requires extra memory to store temporary values while sorting. Selection Sort sorts the original array without needing another large array. When RAM is extremely limited, Selection Sort may be a better choice because it uses less additional memory, even though it is slower.

---------

## Phase 4 Journal

**Question: Compare your results. Did the O(N²) algorithm grow at the rate you expected based on Big O notation? Is measuring time directly a consistent measurement of complexity? Additionally, what bugs or unexpected behaviors did you catch during validation, and how did the AI tutor’s feedback help you improve your code?**

Selection Sort grew much slower in performance as the array size increased because it has O(N²) time complexity. Merge Sort was much faster with larger arrays because it has O(N log N) time complexity.

Measuring time directly is not always consistent because computer speed and other running processes can affect the results. Counting comparisons can give a better understanding of an algorithm's efficiency.

During validation, I tested already sorted arrays, reverse-sorted arrays, and arrays containing identical numbers. Both sorting algorithms correctly handled these cases.

The AI tutor helped me review my code and understand the importance of testing edge cases and checking for errors in my sorting methods.