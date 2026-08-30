# Array Element Occurrence

**Question ID:** `6615799d5028dc4e9d00120c`

## Description

Design a program that reads an array of N integer values and prints the occurrence of all elements in the array.

## Input Format

The first line contains a single integer N, the number of elements in the array.

The second line contains N space-separated integers representing the elements of the array.

## Output Format

For each unique element in the array, print the element followed by a colon and the number of occurrences of that element in the array. Each element and its count should be printed on a new line in the order that element first appears in the array.

## Sample Cases

### Sample Case 1

**Input**
```text
7
1 2 3 2 4 3 5
```

**Output**
```text
1:1
2:2
3:2
4:1
5:1
```

### Sample Case 2

**Input**
```text
10
4 5 9 11 9 4 8 15 8 6
```

**Output**
```text
4:2
5:1
9:2
11:1
8:2
15:1
6:1
```

### Sample Case 3

**Input**
```text
5
10 10 10 10 10
```

**Output**
```text
10:5
```

### Sample Case 4

**Input**
```text
8
-1 2 -1 3 2 4 3 5
```

**Output**
```text
-1:2
2:2
3:2
4:1
5:1
```

### Sample Case 5

**Input**
```text
4
1000 2000 3000 4000
```

**Output**
```text
1000:1
2000:1
3000:1
4000:1
```

### Sample Case 6

**Input**
```text
6
1 1 2 2 3 3
```

**Output**
```text
1:2
2:2
3:2
```

### Sample Case 7

**Input**
```text
9
9 8 7 9 8 7 6 5 4
```

**Output**
```text
9:2
8:2
7:2
6:1
5:1
4:1
```

---

**Submitted at:** 2026-08-30 18:08:23Z
