# Max Disjoint Groups

## Description

<p>You are given an array consisting of N integers. Your task is to determine the maximum number of disjoint subarrays (referred to as "groups") that can be formed, where each group contains at least one repeating element. A disjoint group is a contiguous subarray, and no element can belong to more than one group.</p><ol><li>A group is defined as a contiguous subarray that contains at least one element that appears more than once within that subarray.</li><li>Disjoint groups cannot overlap. This means that each element of the array can be part of only one group.</li><li>The goal is to find the maximum number of such disjoint groups in the array.</li></ol>

## Input Format

<p>The first line contains a single integer N, the number of elements in the array.</p><p>The second line contains N space-separated integers, the elements of the array.</p>

## Output Format

<p>Output a single integer representing the maximum number of disjoint groups that can be formed, where each group contains at least one repeating element.</p><h4><strong>Explanation:</strong></h4><p>Input:</p><p>10</p><p>1 2 3 2 1 4 5 6 5 4</p><p>Output:</p><p>2</p><p>First group: The subarray [1, 2, 3, 2] has a repeating element 2, so this is considered a valid group.</p><p>Second group: The subarray [4, 5, 6, 5] has a repeating element 5, so this forms another valid group.</p><p>The remaining elements [4] do not form a valid group as there are no repeating elements.</p><p>Therefore, the maximum number of disjoint groups is 2.</p>

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


### Sample Case 3

**Input**
```text
577032d0bc8085bb234e0d0c11:667cf8e29b4a9aec023482583d7acfa7:8b1b9b745320666894bd07c39d09a8cd
```

**Output**
```text
28:02aadfb9964b01ea53ffe376f8638a0d:f3481c0c1d7f399880979d930e7e0159
```


### Sample Case 4

**Input**
```text
91163e7e7a44524936a4fd12f189d5d779:412cbc31d37aedc0856b476d0b3eec4c:76bc9edba56e64ed44d35e6e4450d72a
```

**Output**
```text
4e:95305996f32cc60b5361163baa053e62:ba16d58b03b6ce6e419955a83d7283ad
```


### Sample Case 5

**Input**
```text
1155e6d2af58e09c753c88:c4944d536f98b0707327d6bc3a033d1d:5a4b6b451015820c9e64e6a6aaa4d617
```

**Output**
```text
2c:4f79a6b1142f417a87729fbc9108b6da:9c0d9fc0b6935c4b7b70efa6448e7e9c
```


### Sample Case 6

**Input**
```text
ff0d863cc281e20a2a3096ddff967235e7f9bd:7adab9939ae38efdbcb7805489040320:dfdc7647419a563f19ce880e8d6c602c
```

**Output**
```text
00:ff0ac77956fc4cd7fa462c034ec0add2:c6144cbd02eff9e4d5bca8c76e10620e
```


### Sample Case 7

**Input**
```text
24c8b0d8b1af76f5c8:7a102a6ee13c14cbd13c5dad29c1ded8:6234c6a2b7556e0ffaa96677a75f9a9c
```

**Output**
```text
c0:1ae97914778b38eff716d6842a406a3f:dc56f3641b93fb18ff127c85b2b6dde2
```

