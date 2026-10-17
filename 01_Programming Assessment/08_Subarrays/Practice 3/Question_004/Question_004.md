# K-Size Subarrays with Difference M

**Question ID:** `6619f68c5028dc4e9db65128`

## Description

Find subarrays of size K with difference M between max and min element.

## Input Format

The first line contains two integers N and K, representing the size of the array and the subarray size K respectively. The second line contains a single integer M, representing the target difference. The third line contains N space-separated integers denoting the elements of the array.

## Output Format

Print each subarray of size K where the difference between the maximum and minimum element is M, in a new line. Each element of the subarray should be separated by a space. If no such subarrays exist, print "None".

## Sample Cases

### Sample Case 1

**Input**
```text
5 3
2
1 3 5 7 9
```

**Output**
```text
None
```

### Sample Case 2

**Input**
```text
4 2
3
2 5 8 11
```

**Output**
```text
2 5
5 8
8 11
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-17 13:40:15Z
