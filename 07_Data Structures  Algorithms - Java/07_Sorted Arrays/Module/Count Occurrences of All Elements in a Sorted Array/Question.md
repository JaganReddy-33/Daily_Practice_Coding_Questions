# Count Occurrences of All Elements in a Sorted Array

## Description

<p>Count the number of occurrences for each unique element in a sorted array.</p>

## Input Format

<p>The input consists of two lines: - </p><p>The first line contains a single integer, N, representing the size of the array (1 ≤ N ≤ 10^5). </p><p>The second line contains N space-separated integers, A[1], A[2], ..., A[N], representing the elements of the array (-10^9 ≤ A[i] ≤ 10^9).</p>

## Output Format

<p>Print N lines, each containing two space-separated integers: X and Y. Here, X represents a unique element from the array, and Y represents the number of times X occurs in the array. The lines should be printed in ascending order of X.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
8
1 2 3 3 4 4 4 5
```

**Output**
```text
1 1
2 1
3 2
4 3
5 1
```


### Sample Case 2

**Input**
```text
6
1 2 3 4 5 6
```

**Output**
```text
1 1
2 1
3 1
4 1
5 1
6 1
```


### Sample Case 3

**Input**
```text
e4781c3f9df1f7f3a9eaf577d35a26b124:d3c0df643018cd9cb8f33b4654eca4d6:b92c18165022b4119918674761fc636c
```

**Output**
```text
7b67ba6659b667097a3d191a9009b36f5a5bd7:0025e54d2a53181911bba2845322ee7c:9d309099f4c77e065218948919bcaa6f
```


### Sample Case 4

**Input**
```text
3c0b046e6161f4811bc6ba7f4c:aea01656b98d21db6d1f9d134cd46cc9:259e1fbf9c4dc20d267862fccb3fe7ab
```

**Output**
```text
588ecb646e0418a6fabd427e90c8813bfec96f4eefc2d8:1d277f859c7046e2f39f0b67e12eb189:8fd3be9c9f129790b5fad99b8ea9d0cd
```


### Sample Case 5

**Input**
```text
8bb58ca38bd9483867ac931a82498858:eadaecda43902105b12023851336c2b2:8ef1af4e4fd919763597f58e5e7cd2fb
```

**Output**
```text
d3bb5a33:ada964ca8293497151100b328028516b:ba7d101bd87b94cbabf9a97ef5da56f1
```


### Sample Case 6

**Input**
```text
f3085a18645fc8bc3fdb9f821da23f37eb9ed488dbc0:34bab51ec06060b5f99ad6f48c17a1d2:d73e1016f7060c75692de47b471eb5db
```

**Output**
```text
6e38bf6423713ce8de3667e50c8870779261ac5342b12953:007e4f2c306d409e6c6feb024f67c4df:aab729dd1eae10e5f23a8821def9e338
```


### Sample Case 7

**Input**
```text
d308e936e088d8d65c:c382db3c21d1439b66b509e47eadc361:824819db7794e9714ecf5cd6b785d833
```

**Output**
```text
8fec00bcf1739b:caafd70ff2b42207f2c5b48dc493b42b:6a87d920891d500062c0187b5f85eb0e
```

