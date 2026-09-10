# Occurrences of Repeated Elements

## Description

<p>Given a sorted array of integers, print the number of occurrences of only the repeated elements.</p>

## Input Format

<p>First line contains an integer n representing the size of the array. Second line contains n space separated integers values.</p>

## Output Format

<p>Print the count of occurrences of each repeated element in the array, separated by space. If there are no repeated elements, print -1.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
10
1 2 2 3 3 4 5 5 5 6
```

**Output**
```text
2 - 2
3 - 2
5 - 3
```


### Sample Case 2

**Input**
```text
10
-3 -3 -2 -2 -1 -1 0 0 1 1
```

**Output**
```text
-3 - 2
-2 - 2
-1 - 2
0 - 2
1 - 2
```


### Sample Case 3

**Input**
```text
a878dc4ebf048434df4b2d:8f183e62ea273b26503ff1997ba804d0:becacbf62aa765ad0dd3bd3e7c6126e7
```

**Output**
```text
ebc5a62171:5e1326a6c09798ce20dbaa6dfe9de3fc:48c810d420f40e53c71f29f903b3a845
```


### Sample Case 4

**Input**
```text
8a0f745ce89f208665aba1c68209971d:077a4b09921232f609e8a0cf4c58e4a2:3b6fe3a09ec64e94a47583bc020a6401
```

**Output**
```text
4fdd34f74926:ef4851af7dc12b4ab64d0868a021bbb4:6d78a200198a437131b7d6d335bcc384
```


### Sample Case 5

**Input**
```text
7f1696676f27e5d5637ed1:49a46f8e0638aa4fb214e703610db97b:47858a806df465eaac969144959e4339
```

**Output**
```text
bbb6:9bd95d5c019f186a8f8ff95fe2e17691:6c45d7f55bd14eba4d3946b01f43fb2d
```


### Sample Case 6

**Input**
```text
47aa03f66eee30e648c3f78ec8172e2b69:6f5fb2ac6d661e5608cbba1d6e458831:b2486e8d05faa759ba2d09a90d0369c3
```

**Output**
```text
580b:478330399feee1668196ddbc2bcf0a89:62468df12ea403fc67cd4f7c014ddb59
```


### Sample Case 7

**Input**
```text
a19cf7d330f729ec02e362:5dbf4e133a126bff75a46d9cac580acb:e337aef1cc57ac02a1d2908527e9ab59
```

**Output**
```text
f908028004:c84da6507587929cde69bfea634c256c:0c96cbade26b2fe9c4e1697bd4dfcc96
```

