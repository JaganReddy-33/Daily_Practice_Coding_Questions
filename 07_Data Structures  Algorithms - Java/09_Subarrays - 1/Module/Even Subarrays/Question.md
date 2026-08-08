# Even Subarrays

## Description

<p>Print all possible subarrays whose sum is even.</p>

## Input Format

<p>The first line contains a single integer n, representing the number of elements in the array. The second line contains n space-separated integers, representing the elements of the array.</p>

## Output Format

<p>Print all the possible subarrays whose sum is even, separated by a space. If no such subarrays exist, print "None".</p>

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 2 3 4 5
```

**Output**
```text
2 
4 
1 2 3 
3 4 5 
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
-2 
-4 
-1 -2 -3 
-1 -2 -3 -4
```


### Sample Case 3

**Input**
```text
eb88926c460a8b0c5bed58:512446ebf343cb4f9050de2876c0d518:1f83a3d0c79bf2ad99b07c69cd65542a
```

**Output**
```text
73833255b4f9eac5e3485570efe2437c14e887c48eaceb57916f6d1bb16f10baa3402214711c:274d19d22e55453bbc6434d249c7b3f2:54a108b8517413e63e59fca7df7f5814
```


### Sample Case 4

**Input**
```text
eb853cc656628df0ce97a47c04:24bfecb93941a97f4903602540f294ea:e89b999c9595197937e120df8dce7a14
```

**Output**
```text
c1bc83bc7b43e4ce2e1eac1392852330e7f23130f1750976bcedf2de21a01d:1c2305791da3f9b507443d3d403846d3:0fa4589496f92250a71c01327312285a
```


### Sample Case 5

**Input**
```text
b4daead952dcf1:ad60ddbeab20d085fb05ced54e9fedff:6fa5cd18f55d21bb3fbe59d4d37be520
```

**Output**
```text
275fc7b35f3d8b2b7210:641d514a10e6405903a784bcf452f6a0:23e2608a0acad566fe5e1428428856ed
```


### Sample Case 6

**Input**
```text
6cf48dcfbbfc8c634cdf1151a3:dc4d165832923cb0c4c94d5e5e3db7bf:200a061525a12a2032d8dcb8f5974a41
```

**Output**
```text
3662cb1b42b397f71faa06bcda459ec5aa83300b6253d96e9fe33ed6a3c50900b8212e18464010f9e0579bd708089322f0683b7b48d2ec5cb39fcd53ce:23425b8173de78bed8dfbdb93f43dfff:efbca64ac139e5fb2596cb95931b88e4
```


### Sample Case 7

**Input**
```text
812646196b2cb4:e295ffd3cdbd7d028e0d0cdf3df81e9a:99780487d1bfbdf6049a3b07bb0fc24b
```

**Output**
```text
9443c9ec7985a4813655:7a18c8cf33e2a2e9ba4eaf99e39429f1:6aa41a9173603ed923212547b2173546
```

