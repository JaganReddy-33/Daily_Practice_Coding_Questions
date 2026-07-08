# Even Subarrays

## Description

<p>Print all possible subarrays of even size.</p>

## Input Format

<p>The first line contains a single integer n, representing the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.</p>

## Output Format

<p>Print all the possible subarrays of size even, separated by a space. If no such subarrays exist, print "None".</p>

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 2 3 4 5
```

**Output**
```text
1 2 
2 3 
3 4 
4 5 
1 2 3 4 
2 3 4 5
```


### Sample Case 2

**Input**
```text
4
-1 -2 -3 -4
```

**Output**
```text
-1 -2
-2 -3
-3 -4
-1 -2 -3 -4
```


### Sample Case 3

**Input**
```text
a8b92658b81d648ad428ff:343c00835f1d80e99ef7434db0f40abd:925bb3bec3ea30b104b0bb11e40b5079
```

**Output**
```text
7121ef804d65964351b5262129668c1cbbbb9e148c30bb17364aca286016507b69d14420b254:fb2e66afffe7b098d15a0a9978ab2a8d:f4bff7028b6711fd518923d689b414d5
```


### Sample Case 4

**Input**
```text
a84396ba96d62321faa4127c36:4dd9efb5a9b378438404c4bf2ec0d54c:96bad9ebdff9c2e233adf3a7e21e62a8
```

**Output**
```text
81a5bfa19b17dd33dcfdb8b9feef98a72a0e70675cb2a34eaa321cad184a:74d0ded85e77e1de0b4ef7763b8d6b37:15b56dbb77f6a3872bd1dfa5e38d0ef5
```


### Sample Case 5

**Input**
```text
c50b1265d5bd56:ea6bdd0243ec95c122a5f8f731764fee:8ade0534569a6183a048272af0e72dfc
```

**Output**
```text
3dd9b598cb50a7e0:5d81c1a699f4b061409b50f96d15969b:494412b397e416b074b344943bde17f3
```


### Sample Case 6

**Input**
```text
28fb5b:41ff9f562340c3da528aa7994c41bd54:f8ccc3f45a4ea9efb473eb075f95eedc
```

**Output**
```text
7ee7322111:8aa9763ae79e35025a306fe0ffb8c0f6:20d82d201c6cee9a5f925843e5891816
```


### Sample Case 7

**Input**
```text
4e338d264cf3543f09acebaf6607f28d69ed50bd98398c:c2cb7299a53222b6fed6398c6b747518:ff8602e316db982bb9e0b9b8c91a5d41
```

**Output**
```text
ba7f441befa072012c182c72bcc1b01add1734e400dcba9668e740d07feb94533467b765c31d20da03d4eea43009275e991673136081328e3946f95007235504484695f9d34a1b1ab3c8e6e3bab5c3981cfe1c773333526c9e5de3d910f1aa48b0e76d85851457de3b0850b1d6ef3f8d01f982f8fa6c73c34067a150334f4a613569a1d4145113cc167f799d99d80d3743ada4b4b0ec6cc7df2b46740fd1f303eb497ea024b7f6800f89809789b17c47565eb281:6abd4eb4558b7f9c5d8acc61d8e39d90:c094f2950351f0aab59b30a3937ed528
```

