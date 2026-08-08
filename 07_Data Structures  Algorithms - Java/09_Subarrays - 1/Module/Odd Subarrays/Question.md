# Odd Subarrays

## Description

<p>Print all possible subarrays of odd size.</p>

## Input Format

<p>The first line contains a single integer n, representing the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.</p>

## Output Format

<p>Print all the possible subarrays of size odd, separated by a space.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 2 3 4 5
```

**Output**
```text
1 
2 
3 
4 
5 
1 2 3 
2 3 4 
3 4 5 
1 2 3 4 5
```


### Sample Case 2

**Input**
```text
4
-1 -2 -3 -4
```

**Output**
```text
-1 
-2 
-3 
-4 
-1 -2 -3 
-2 -3 -4
```


### Sample Case 3

**Input**
```text
f8a92ab1ce0c76df70d3d0:7eb69503a1564e002a582e19c213c313:b5c53b2b2ba29d75632c2c8f629f7467
```

**Output**
```text
bcebd25a8bd902f160a103526cc450bdb52cfa18a15ca5f71ebe249a93217f04aeb82f77ab9fe2d644e5728185cc07:440743bcd89c520a65df6c0b4a8c02d4:6ecf94c89bbe70f2fecb6e9f4c3b41be
```


### Sample Case 4

**Input**
```text
f53ef372d71db87b93e9e8a9d2:0188d52b008411806b6619201878e7a0:e6d5008f8cf0c5c44be25586be380891
```

**Output**
```text
aca9f8ba6e3f02b90e9a3ab0a2157ac1dfdd6dd469692039dc1eda7a2d80cbc8a8ff9d86:662cf1f0fe2826eb1db1ea658018e364:82a9d54ade2a6f421bdc987c3a5f6f3b
```


### Sample Case 5

**Input**
```text
a763d0042589f4:6c3f452f9e01961a2ed0e1ef7701225f:b2445afaa4643101ab748847ee620d66
```

**Output**
```text
0e0761732afe7f4095c943786d66660d:e4c8c3337690736648f6b028cee6aacc:cf31e70e9df016db000d4cfdfd6b1e72
```


### Sample Case 6

**Input**
```text
7dde4c308cd4b5744c961fdfad:acf55d6d7c8636f08c5e8eaf31e5d4d5:7d2304ddda6d1eefd36681a85e2b70c3
```

**Output**
```text
b79d7e4503fe96e0a68b900ee93945b69ed0206f7f176d8d435eb5536454149c5a2f65f0ff7612e3d3703a09aaac5c9112b8e618fe0f026d004658d4f53ebb96d19387f2:3d0135a3c39989df7f05aa9f7a99ca1e:7fca49ae99e89abe541d2b0a7dcf473a
```


### Sample Case 7

**Input**
```text
e8cde900dd18a457dc7fe69b534c2c114f02b661eaa55c:2783cfb06ddbea55aac29e065c3c5477:1f4288432011e1c23934053f68a0452e
```

**Output**
```text
ab3d7980dc7590fe352f9622ac496b873a01ff63af629743f3ae03f555eefaa24e6c3fe08935b65da13148efe1e63589e729c43ddacba4e9013dc29df1c2782aa62dd17036a8abf560501717f17397e073d5bf4ee6b57a661a9a10330b9cde2afac2bd165ba8b056cf0c2768e5da48b275637ceff12f7dede3d86bd66766e8e7cb044e5fb45ae42ffb3eec2ea285463f263a618eaff580575b42dbcce8a33e9550b99f6ab03aaeddf7e6304371411ca407d54f8554765423bc:1e7a5fb4c0afc98fb81424cfc5ab8683:c14673cfae52ad5634680e288953e089
```

