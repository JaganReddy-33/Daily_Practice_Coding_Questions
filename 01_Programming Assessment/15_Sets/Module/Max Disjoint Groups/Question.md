# Max Disjoint Groups

## Description

You are given an array consisting of N integers. Your task is to determine the maximum number of disjoint subarrays (referred to as "groups") that can be formed, where each group contains at least one repeating element. A disjoint group is a contiguous subarray, and no element can belong to more than one group.

- A group is defined as a contiguous subarray that contains at least one element that appears more than once within that subarray.

- Disjoint groups cannot overlap. This means that each element of the array can be part of only one group.

- The goal is to find the maximum number of such disjoint groups in the array.

## Input Format

The first line contains a single integer N, the number of elements in the array.

The second line contains N space-separated integers, the elements of the array.

## Output Format

Output a single integer representing the maximum number of disjoint groups that can be formed, where each group contains at least one repeating element.

Explanation:

Input:

10

1 2 3 2 1 4 5 6 5 4

Output:

2

First group: The subarray [1, 2, 3, 2] has a repeating element 2, so this is considered a valid group.

Second group: The subarray [4, 5, 6, 5] has a repeating element 5, so this forms another valid group.

The remaining elements [4] do not form a valid group as there are no repeating elements.

Therefore, the maximum number of disjoint groups is 2.

## Sample Cases

### Sample Case 1

**Input**
```text
7
1 2 3 2 4 5 4
```

**Output**
```text
2
```

### Sample Case 2

**Input**
```text
10
1 2 3 4 5 6 7 8 9 10
```

**Output**
```text
0
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-08-29 18:07:17Z
