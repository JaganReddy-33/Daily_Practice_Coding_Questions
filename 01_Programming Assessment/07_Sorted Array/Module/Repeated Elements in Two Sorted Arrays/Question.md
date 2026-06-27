# Repeated Elements in Two Sorted Arrays

## Description

<p>Find the repeated elements in two sorted arrays.</p>

## Input Format

<p>The input consists of four lines:</p><p>An integer N (1 ≤ N ≤ 10^5), representing the number of elements in array A.</p><p>N space-separated integers, denoting the elements of array A in descending order.</p><p>An integer M (1 ≤ M ≤ 10^5), representing the number of elements in array B in ascending order.</p><p>M space-separated integers, denoting the elements of array B.</p>

## Output Format

<p>Print the elements that are repeated in both arrays A and B, in ascending order, separated by a space.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
6
9 8 7 6 5 4
5
4 5 6 7 8
```

**Output**
```text
4 5 6 7 8
```


### Sample Case 2

**Input**
```text
7
10 8 6 4 2 2 0
6
0 1 2 3 4 5
```

**Output**
```text
0 2 4
```


### Sample Case 3

**Input**
```text
b4adbb9e99a40d726c368603c7f6e7efbbc55ec0c6efd81ccc:c4a8f750c8a41ff7279a98d6006f10a7:f8f0b06a0981b6425fb3f0dd01c73de0
```

**Output**
```text
94b908b11fe9124d96:adb2fe8bc44726aacf641137ffc78225:2ec3e371888b1c00fbc0fb16a2d0d2dc
```


### Sample Case 4

**Input**
```text
0e85b2024e11cb9aeb291eb4a6ecd89bc2f1dda63282aecb22be4f742484:0389be87a5c54082c530452d63f028e5:72f798274f46162fc31a99995a9df9db
```

**Output**
```text
6b4ea95d9a:c017b0a04accb47c41ce664fefb7e681:bf2fa57e957e29a63b43da6fe5b7f222
```


### Sample Case 5

**Input**
```text
c3d4df357c66e3613d40738305e788426a828d:86a8694125711d3328949a278735935a:b794f03a69fdf35e9af37fc0607f60ad
```

**Output**
```text
cf:b2719aa50f86257cd6fa4a152709db13:646eb7df7ca7c5f5680d414bf3ab14ea
```


### Sample Case 6

**Input**
```text
c39a6046f5ba0179142b34a5ed580a6861fb67f91aacae77ff32de75:48af919430d82243881af3a526a4d548:7525e9181b4ed77a6831b7d7395062b0
```

**Output**
```text
ad26ab1a3d9a0a51:896a2d6950de5fe72659dff38615ffef:979fe6b6c897dda205955bcf1dc08b9b
```


### Sample Case 7

**Input**
```text
5359c4e12fd3acebeb9b5494ed4bb12fac6a4d4065300e66:ac713279aa7a706f9adae01fcf149344:7902c4d50b7ed222cbf01eb87b7e2204
```

**Output**
```text
0fdfce:0b73f248679ec6e5add75fc5b98f8a3f:3c6c93800f2f776d1d1b7d26bea07f1f
```

