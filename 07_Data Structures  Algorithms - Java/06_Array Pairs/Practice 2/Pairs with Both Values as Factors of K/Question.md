# Pairs with Both Values as Factors of K

## Description

Given an array of integers with a size of N, print all the pairs where both the first and second value are factors of K.

## Input Format

The input consists of:
- The first line contains an integer N, the size of the array.
- The second line contains N space-separated integers, representing the elements of the array.
- The third line contains an integer K.

## Output Format

Print all the pairs where both the first and second value are factors of K, each pair in a separate line. If there are no such pairs, print "No pairs found".

## Sample Cases

### Sample Case 1

**Input**
```text
5
2 3 4 5 6
12
```

**Output**
```text
2 3
2 4
2 6
3 4
3 6
4 6
```


### Sample Case 2

**Input**
```text
a843463b5099b1e005fa523a:39d4549c7dab8d4e0f6295f38a8823e7:bfe55a430d7793e081b8331467edea31
```

**Output**
```text
11f529:e909c66b5ccb5bef403521063ecda0d1:44c433fe94f21656fb611551cc0ee51e
```


### Sample Case 3

**Input**
```text
023ee5fa30ada9a1c25d:bf26825491cc787b281172edf7b3d358:ce85418cd36221fd98168347daea071e
```

**Output**
```text
6fbcf4:885316a3ffacaffdd0240726ac1593cd:bfc8f12b987497c5688fdf8af15aba50
```


### Sample Case 4

**Input**
```text
182027e227df4c016cb0d7be1b029b9bf7:3c75e7bc403a34cfae3406f886ff1d54:4bf1e231d12aad5b51c64976ba2e21c0
```

**Output**
```text
ecc52b:760fe4fe69dc9125ea21bf763516cd68:a6372b3fd8edb6382167e4ad1f90b4a8
```


### Sample Case 5

**Input**
```text
6d1492431e0f2759fd9372f4ccad:9c8878474d1fa9642d7442ec853f453f:4f43e45176bf57972846172b133e233c
```

**Output**
```text
2bb7987ceecef780c55d93a11f8685652b9c5a7bc89f95:e048fe951af201dab646d04b6f3a36a3:8e333cfe34dee9cfeee0e26a42eb3582
```


### Sample Case 6

**Input**
```text
15e0a91e5d86db62d2ea8214ddb67ca21f8dd415e70937:52f7287284058533adde633d32777da1:d1f23a2150143c953976a171f8cd8e96
```

**Output**
```text
7e3fe5422747ce5f08e5eb5e4211a9ec21bf16cff07592b79c9637567b3c4a761573629038424e4c3a594e6d2550fee01f928e9c000a2a8ec008f5b5fb3288a2d508d6b029:cb51f9b1093530de50b0bcad3725d289:fd4c1e5298831ff18708d28d9f86670d
```

