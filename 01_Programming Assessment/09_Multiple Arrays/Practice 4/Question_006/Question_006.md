# Merge Sorted Order

**Question ID:** `662a06bdae2286cdf8de5515`

## Description

You are given two sorted arrays, A and B. Your task is to merge the two arrays while ensuring that array A remains sorted, and array B contains the remaining elements that couldn't fit into A. Additionally, the inputs include two space-separated integers, p and q, which represent the sizes of the merged arrays A and B after the merge operation. Specifically:

- p: The number of elements that should be in array A after merging.

- q: The number of elements that should be in array B after merging.

After merging, array A will contain the first p smallest elements from both arrays A and B combined, in sorted order. The remaining elements will go into array B, also in sorted order.

## Input Format

The first line contains two space-separated integers n and m, the size of both arrays A and B.

The second line contains n space-separated integers A[i].

The third line contains m space-separated integers B[i].

Fourth line contains two space-separated integers p and q respectively.

## Output Format

Two merged arrays A and B with elements of A maintaining the sorted order, and B containing the remaining elements.

## Sample Cases

### Sample Case 1

**Input**
```text
5 4
1 3 5 7 9
2 4 6 8
5 4
```

**Output**
```text
1 2 3 4 5
6 7 8 9
```

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-10-15 14:09:36Z
