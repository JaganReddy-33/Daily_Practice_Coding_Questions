# Even Difference Subarrays

**Question ID:** `6619f64cf51c6d596ba8c531`

## Description

Find all subarrays with even difference between maximum and minimum element.

## Input Format

The first line contains a single integer N, representing the size of the array. The second line contains N space-separated integers denoting the elements of the array.

## Output Format

Print each subarray where the difference between the maximum and minimum element is an even number, in a new line. Each element of the subarray should be separated by a space. If no such subarrays exist, print "None".

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 3 5 7 9
```

**Output**
```text
1
3
5
7
9
1 3
3 5
5 7
7 9
1 3 5
3 5 7
5 7 9
1 3 5 7
3 5 7 9
1 3 5 7 9
```

### Sample Case 2

**Input**
```text
4
2 4 6 8
```

**Output**
```text
2
4
6
8
2 4
4 6
6 8
2 4 6
4 6 8
2 4 6 8
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-17 13:39:44Z
