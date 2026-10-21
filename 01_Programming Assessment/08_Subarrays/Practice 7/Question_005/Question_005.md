# Alternating Sign Subarrays

**Question ID:** `661a03395028dc4e9db814c8`

## Description

Given an array of integers, find and print all the subarrays where the elements alternate between positive and negative numbers. Each qualifying subarray should be printed in a new line as a sequence of space-separated integers. If there are no such subarrays, print 'None'.

## Input Format

The first line contains a single integer N, the size of the array. The second line contains N space-separated integers denoting the elements of the array.

## Output Format

Print each subarray with alternating positive and negative numbers, in a new line as space-separated integers. If no such subarrays exist, print 'None'.

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 -2 3 -4 5
```

**Output**
```text
1 -2
-2 3
3 -4
-4 5
1 -2 3
-2 3 -4
3 -4 5
1 -2 3 -4
-2 3 -4 5
1 -2 3 -4 5
```

### Sample Case 2

**Input**
```text
4
-1 2 -3 4
```

**Output**
```text
-1 2
2 -3
-3 4
-1 2 -3
2 -3 4
-1 2 -3 4
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-21 17:05:00Z
