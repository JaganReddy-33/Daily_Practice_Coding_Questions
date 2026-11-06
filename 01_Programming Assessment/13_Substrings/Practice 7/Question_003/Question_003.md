# Substrings Lesser Than K

**Question ID:** `663c7043bc427c696edaf51c`

## Description

Print all substrings of a given string whose size is lesser than k.

## Input Format

The input consists of two lines:
- The first line contains a string S.
- The second line contains an integer k.

## Output Format

Print all substrings of S whose size is lesser than k, separated by newline. If no substring print 'None'.

## Sample Cases

### Sample Case 1

**Input**
```text
hello
4
```

**Output**
```text
h
e
l
l
o
he
el
ll
lo
hel
ell
llo
```

### Sample Case 2

**Input**
```text
programming
7
```

**Output**
```text
p
r
o
g
r
a
m
m
i
n
g
pr
ro
og
gr
ra
am
mm
mi
in
g
pro
rog
ogr
gra
ram
amm
mmi
min
ing
```

### Sample Case 3

**Input**
```text
example
3
```

**Output**
```text
e
x
a
m
p
l
e
ex
xa
am
mp
pl
le
```

### Sample Case 4

**Input**
```text
abcd
2
```

**Output**
```text
a
b
c
d
```

### Sample Case 5

**Input**
```text
xyz
5
```

**Output**
```text
x
y
z
xy
yz
xyz
```

### Sample Case 6

**Input**
```text
123456789
6
```

**Output**
```text
1
2
3
4
5
6
7
8
9
12
23
34
45
56
67
78
89
123
234
345
456
567
678
789
1234
2345
3456
4567
5678
6789
12345
23456
34567
45678
56789
```

### Sample Case 7

**Input**
```text
hello
0
```

**Output**
```text
None
```

---

**Submitted at:** 2026-11-06 16:27:31Z
