# Common Repeating Odd Elements in Sorted Arrays

## Description

<p>Find the common repeating odd elements in two sorted arrays.</p>

## Input Format

<p>First line contains an integer representing size of the array A</p><p>Second line contains an Integers separated by a space, representing the elements of array A (A[0], A[1], ..., A[n-1]).</p><p>Third line contains an integer representing size of the array B</p><p>Fourth line contains an Integers separated by a space, representing the elements of array B (B[0], B[1], ..., B[m-1]).</p>

## Output Format

<p>Print a single line containing the odd elements that are common to both arrays, separated by a space, in ascending order.</p><p>If no common odd elements are found, output "No common odd elements found."</p>

## Sample Cases

### Sample Case 1

**Input**
```text
5
1 2 3 4 5
5
3 4 5 6 7
```

**Output**
```text
3 5
```


### Sample Case 2

**Input**
```text
4
2 4 6 8
4
1 3 5 7
```

**Output**
```text
No common odd elements found.
```


### Sample Case 3

**Input**
```text
8c8b81daaeaa54bb5bf0a8d839f760cb410d10045b21f6:7602814cf31c4ab063b1e9d416bd0374:d8545083f23daab7d53548f64dddc849
```

**Output**
```text
d081e2:7a69aeea5ab1f2dde862efb4115a76f1:5dce853c8313e2c4b536c7543e0d1d7e
```


### Sample Case 4

**Input**
```text
afe60a6bc54de89ccb7d1329c854315726fe64:f1476fa483e2a3378489e19ea2334104:d5c75aebe7205bde35e0b0267eb73273
```

**Output**
```text
73133f3db7642647542b1c0ebe8bafa455f60be11a37aa78d176268c17:1ee4f7a6f7563a0a21f6a7002a64a0b7:08c4a4c8a84604d04a06e27a69c5e4db
```


### Sample Case 5

**Input**
```text
f979dbf8f26b9b4e7e9807b3004b9bb388cc127c08a43eb388ec:30d0b373dd927c209ab006c2774ac230:25bf657132a474ff82002cca1c1984c1
```

**Output**
```text
590be89bce243dadcba7680dd3060fcb3a9a1a59b5a238871cc575acd1:e9316bbf70e98e610ee97e6da5ced250:e601df14485dc9e3ba8df612cf765d57
```


### Sample Case 6

**Input**
```text
89c1b836cfffe6c58586e68e9e3a27052a9de02ceab1b8ce:6a6a5621253ed90766660b9179e40bca:2fb53806b45c0454a47552b73dd3d5e7
```

**Output**
```text
5917059fd19a585914a2f2ad40cdc27e37001cb9326d6caa1a161e3cb5:9ba45a918a0b44acd2cab7fa6575fba3:d1c95a1ae3bd8af15884bb3eeb461d4e
```


### Sample Case 7

**Input**
```text
36825de8422ca5:cc2cb0188fa3247cbc705d3f8b97e19c:eed82ef80eb233498d1bf789cfc39aba
```

**Output**
```text
96:90b269729dea2d75a1abfa67511082cc:862e97e61f2a8fc2d37894ae7bb0ef86
```

