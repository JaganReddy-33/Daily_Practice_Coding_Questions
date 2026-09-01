# Check String for Various Characters and Calculate Needed Additions

## Description

Check whether the string contains at least one vowel, one consonant, one numeric digit, and one special character. If any character type is missing, calculate and print the count of additional characters needed to include all types.

## Input Format

A single string `s` containing characters.

## Output Format

If all required character types are present, print '0'. If any character type is missing, print the count of additional characters needed to include all types.

## Sample Cases

### Sample Case 1

**Input**
```text
Hello123!
```

**Output**
```text
0
```


### Sample Case 2

**Input**
```text
abcdef
```

**Output**
```text
2
```


### Sample Case 3

**Input**
```text
5d5cd9482b1907e377:e795e68aa8ea67d85b77964aa683e2be:d2dbca6d8ddcd71ebae69505a7dad205
```

**Output**
```text
6e:ecff7c89aa77f0da9dfe2b54d1ff05aa:62ec14cdfe32ece7a36b97708e298cff
```


### Sample Case 4

**Input**
```text
125ce2b73aa4:28eefab5abed9ec64f7fa15e43624cad:23fc9a1c9f74daa5f343335f83fdd038
```

**Output**
```text
14:16c7340b9a1f8b02e1a7195516c340f3:64f1af0025b44ef7be4913ff87f7be99
```


### Sample Case 5

**Input**
```text
3dea8f143bd0f39625:001d6391bde46cedf259a45d359a43c5:d4861347feb259ee192e5d5575d0f56d
```

**Output**
```text
b1:d2ec5c9ff87a3c7b1f96cdcc99142900:66231349949367ea2677630b275b38eb
```


### Sample Case 6

**Input**
```text
97a25ccb33733c9a:fe7753f85ee289a6ec943007c582e58b:e0fc7dbb525ac88f2d9d98e783f2769d
```

**Output**
```text
9f:08782f37428117af9599b228d89cfeba:382ee2212eb5609a3703a9020b75b0f3
```


### Sample Case 7

**Input**
```text
9ec6c5:4bb220a9a0e7db0c698276197e7830e8:103bd05b676c363a2d2c035b55a36a7b
```

**Output**
```text
97:e5c227bfe9ca62dca3cea3ea00f5f97c:a7202edd3054bf27590a694616fb1983
```

