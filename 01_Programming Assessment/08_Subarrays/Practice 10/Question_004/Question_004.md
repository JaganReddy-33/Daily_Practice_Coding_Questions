# All K-Product Subarrays

**Question ID:** `661bc231f51c6d596b3a5ca8`

## Description

Given an array of integers, an integer K, and an integer M, your task is to find and print all subarrays whose length is greater than M and whose product is exactly equal to K. A subarray is defined as a contiguous part of the array. Print each qualifying subarray in a new line as a sequence of space-separated integers. If there are no such subarrays, print 'None'.

## Input Format

The first line contains three integers N, K, and M, representing the size of the array, the target product K, and the integer M, respectively. The second line contains N space-separated integers, the elements of the array.

## Output Format

For each subarray with length greater than M whose product is equal to K, print the subarray in a new line as a sequence of space-separated integers. If no such subarrays exist, print 'None'.

## Sample Cases

### Sample Case 1

**Input**
```text
5 24 2
2 3 4 2 1
```

**Output**
```text
2 3 4
3 4 2
3 4 2 1
```

### Sample Case 2

**Input**
```text
4 120 1
5 4 6 1
```

**Output**
```text
5 4 6
5 4 6 1
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-24 13:52:56Z
