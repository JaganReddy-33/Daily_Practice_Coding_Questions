# Ascending Deduplication

## Description

Remove duplicate integers from a given array and output the remaining integers in ascending order.

## Input Format

The first line contains a single integer n, indicating the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.

## Output Format

A single line outputting the integers of the array in ascending order after removing duplicates, separated by space.

## Sample Cases

### Sample Case 1

**Input**
```text
7
1 2 3 2 4 3 5
```

**Output**
```text
1 2 3 4 5
```


### Sample Case 2

**Input**
```text
10
4 5 9 11 9 4 8 15 8 6
```

**Output**
```text
4 5 6 8 9 11 15
```


### Sample Case 3

**Input**
```text
20eeb12aec95411bbb52404b2670bba5:872eab4e08459fd736733facbe5ac0b1:dad573ccb9e04fe3c55884c94d33b581
```

**Output**
```text
7a93:d5c7a3249e70d9436add1fb4825024c0:d4e955813bed04f341d0bcf4bad4c695
```


### Sample Case 4

**Input**
```text
522150c9b9a66cdf53f9a45c608909c143a7a9:c11afb6beffbc9f7bb0778f0a9230bed:958a7bb9dcbc5c20a40ee2cfb8e736da
```

**Output**
```text
7d7e48d6a38427d8fa1b:433443bdf989c2e992d7508008b8d7ca:8e84eb49f9f5669e9ba43377f59893b1
```


### Sample Case 5

**Input**
```text
d3da679fc648de1011073f6935047c481f617b2e8f:87599994aa245d39d4e0a0076e41e0e6:d554a59d95e23a20cc1b6ff95b31384a
```

**Output**
```text
3c014f6bf1f11230fe4dc57949d9906f83783f:47da0070d9ce9745426539339c1b7872:9bea791ab1d1231b0ccfde107c7a82d3
```


### Sample Case 6

**Input**
```text
4d3b38c86eee6f69aa6e360c09:20c2585885f94ad1f7bfe6ca2a5526d6:2143d37ea6d42931b20d33720d560713
```

**Output**
```text
42bba7411d:df209229d1023a92daf00f2f3b37a17c:d30d0170fd137665808b8cdcd918643e
```


### Sample Case 7

**Input**
```text
3a5e275a2166061ef27483d012973403146df3:36b09e758ff78578baed11538b9e0207:1c2016d9ad827b31ed232bca80782d21
```

**Output**
```text
f929e9839a1b85e803510a:8360185a8dde16f4936074875dfea6d6:a6497dafdef5905bfcd21e65f734a194
```

