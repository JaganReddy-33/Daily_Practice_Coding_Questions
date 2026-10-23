# Multiples of K Subarrays

**Question ID:** `661a03a2f51c6d596baa45b0`

## Description

Find and print all subarrays where all elements are multiples of a given integer K. Each qualifying subarray should be printed in a new line as a sequence of space-separated integers. If there are no such subarrays, print 'None'.

## Input Format

The first line contains two integers N and K, representing the size of the array and the integer K, respectively. The second line contains N space-separated integers, the elements of the array.

## Output Format

For each subarray where all elements are multiples of K, print the subarray as space-separated integers. If no qualifying subarrays exist, print 'None'.

## Sample Cases

### Sample Case 1

**Input**
```text
5 2
2 4 6 8 10
```

**Output**
```text
2
4
6
8
10
2 4
4 6
6 8
8 10
2 4 6
4 6 8
6 8 10
2 4 6 8
4 6 8 10
2 4 6 8 10
```

### Sample Case 2

**Input**
```text
4 3
3 6 9 12
```

**Output**
```text
3
6
9
12
3 6
6 9
9 12
3 6 9
6 9 12
3 6 9 12
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-23 13:51:40Z
