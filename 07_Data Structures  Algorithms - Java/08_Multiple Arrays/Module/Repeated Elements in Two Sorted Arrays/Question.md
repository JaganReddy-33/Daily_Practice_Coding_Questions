# Repeated Elements in Two Sorted Arrays

## Description

<p>Find the repeated elements in two sorted arrays.</p>

## Input Format

<p>The input consists of four lines:</p><p>An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.</p><p>N space-separated integers, denoting the elements of array A in Ascending order.</p><p>An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in descending order.</p><p>M space-separated integers, denoting the elements of array B.</p>

## Output Format

<p>Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
6
1 2 3 4 5 6
5
6 5 4 3 2
```

**Output**
```text
2 3 4 5 6
```


### Sample Case 2

**Input**
```text
8
1 3 5 7 9 11 13 15
6
15 11 9 7 5 3
```

**Output**
```text
3 5 7 9 11 15
```


### Sample Case 3

**Input**
```text
71b09d77d5795c2188e48f38f3ba43181271b0e9de4ed4acd7:8317b999a6ce6d9ef76b5a41729fff3e:3c91efe237d39232a3069e0cebb7b3cd
```

**Output**
```text
cdac3205e183a35385:7723d27539154b3bfc533d1065299970:f214bb943528290725f891539a1b77df
```


### Sample Case 4

**Input**
```text
16dc966bb3c15a9779b01c093e6f90e4cf86d375de7102685b07c54f556b23637142f5b2:03a372e9644297d942ad91ce9d648eb0:8718495b783b1203a19408a3b712f354
```

**Output**
```text
da354c59d954925135b91495e6:c3f1e30e215c17fd265eb7b9b0ed1143:c9909031d5560ab3625e8b9122f70ae7
```


### Sample Case 5

**Input**
```text
8dc01df97276171e20a9b177a942475beae5b7:6680ae0e9436182900fb7215eb157354:692ce2d06bb34e96345cfd4de06c6497
```

**Output**
```text
f1:9832d4d8b2cb21d5766fefb4f01cba28:db0815cb45f729e4bb39cb159a1287b4
```


### Sample Case 6

**Input**
```text
2625274a8de116e5b154cbd2f92433eca7f560c43f96f912efc745:9fa115a7636ff7c9011f26f36063f309:7feb33d5eb1dcf5b4aad25a6a97ae006
```

**Output**
```text
a44efc203d758eba:4e900899e067cc82e660eba5af77118d:df704b32334b06048537d7a9f4cfe387
```


### Sample Case 7

**Input**
```text
0983f7daaf5defb4a09e0cdf1e85cebdc4ef36bde5bd757c:07654f674955aab172e75a56e85e9aee:48804a5d596bfb405d4e1cf6958cc785
```

**Output**
```text
3c:1f98af786198484fd81ac7ca08c2e9cd:2a91dbeb9c25c004c1097dbe8e62d1ef
```

