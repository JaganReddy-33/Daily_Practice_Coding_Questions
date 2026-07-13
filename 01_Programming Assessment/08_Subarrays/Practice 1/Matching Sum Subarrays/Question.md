# Matching Sum Subarrays

## Description

Find and print all subarrays of size K with sum M.

## Input Format

The first line contains two space-separated integers K and M. The second line contains a single integer N, the size of the array. The third line contains N space-separated integers denoting the elements of the array.

## Output Format

Print each subarray of size K with a sum equal to M in a new line. Each element of the subarray should be separated by a space. If no such subarrays exist, print "None".

## Sample Cases

### Sample Case 1

**Input**
```text
3 6
5
1 2 3 4 5
```

**Output**
```text
1 2 3
```


### Sample Case 2

**Input**
```text
2 8
4
4 4 4 4
```

**Output**
```text
4 4 
4 4 
4 4
```


### Sample Case 3

**Input**
```text
1d3abe1f5ccdbe086ceca2:607db12aea35110b0c25727eb062a35a:c30bbf32739ff7fc1343984f68772f62
```

**Output**
```text
6c347ad3b2:29868c019bf5793e2215ad0fdcf49ff4:eb76cc51eb0d760bd29785c995335cb1
```


### Sample Case 4

**Input**
```text
77ce700d229ab954b8709e9e73b7fb:11efd8eddb51161f6d340a3cda4a780b:e998aa38ba2d88b30b47cc6250c3fa01
```

**Output**
```text
a9a2abda0c:de3c9c207bbc276b4ae0fc6488cfecd4:325172a29e672e521fae8f1d85f12f37
```


### Sample Case 5

**Input**
```text
cb4b82081418dd2a277c69de64d72f8f3477:81a42ad0da9bf86f25571a370cc1daa5:ea1f706879f1c320e1e68e285a4898ed
```

**Output**
```text
38f4733839e78e764b:bf9e4dea41cca6f6d1ee09cfea67bf75:a365d5f3e06646f783ab20be453d7ce1
```


### Sample Case 6

**Input**
```text
ee9a04f77ef379bdd83960938afa60:7eff3fdb4a5933068b2aac9c7f60aeb7:7efe4c0a6dd4c175b6c8530f70892491
```

**Output**
```text
277e7e:cc9305774b8ad68d85fe3f972e1912bf:5630a4f6625a05c113fb11a7a938c847
```


### Sample Case 7

**Input**
```text
deffa287c4357925e3c800a54c89ce04:a8ca12085996f93558b5f8442b64ffb7:79ca2a401e39e5e951c3a379910ad484
```

**Output**
```text
38e19cd4e12fd4:daf4e3193119947e9f531ef93d50ad08:d46a78558d56e81318c72261672d98f7
```

