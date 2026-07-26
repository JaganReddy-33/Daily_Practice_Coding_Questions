# Vowels Before Given Character

## Description

<p>Print all vowels from a given string that occur before a given character alphabetically.</p><ol><li>Identify all the vowels present in the string <code>s</code>.</li><li>Compare each vowel with the first occurrence of character <code>ch</code>. If the vowel comes <strong>before</strong> <code>ch</code> consider it has the valid character.</li><li>Sort all these valid vowels in alphabetical order.</li><li>If no vowels satisfy the condition, print <code>-1</code>.</li></ol>

## Input Format

<p>A single string `s` containing characters. A single character `ch`.</p>

## Output Format

<p>Print all vowels from the string `s` that come before `ch` alphabetically. If no vowels occur before `ch`, print -1.</p><h4><strong>Explanation:</strong></h4><p><strong>INPUT: </strong></p><p>howareyou</p><p>u</p><p>The vowels in howareyou are o, a, e, o, u.</p><p>The target character is u.</p><p>The vowels a, e, o, o all come before u alphabetically.</p><p>Arranging these vowels in alphabetical order gives aeoo.</p><p>Hence, the output is aeoo.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
hello
o
```

**Output**
```text
e
```


### Sample Case 2

**Input**
```text
howareyou
u
```

**Output**
```text
aeoo
```


### Sample Case 3

**Input**
```text
87f63f63457cbe:d68a892ab186a5208655cbc4da84f468:aa1aa3abe2158969ca2eab64eff3c308
```

**Output**
```text
56:c1f9f8785409813a55e11f1fa7fd0200:c3f6f1988333b6288dd3af2a7af75237
```


### Sample Case 4

**Input**
```text
7138b1403cba89a349ea5452e9c8e033f34187b329:335cef0a2566b3710a92529d157c77d0:71435c9b9218c8e0aeb2a6376cd66f11
```

**Output**
```text
d56bc0:8121c77978e10487caefbf225272eecf:1880d522ecef807717efc156bd735a6a
```


### Sample Case 5

**Input**
```text
c546fdb3a02ff5:99ebeb06c276288388b4ffcf422a7b30:ec167222d72140f07ddac414a98c4867
```

**Output**
```text
fa:7c7b561269ea02ffa74b089f66aea26c:7906a274ecb8844b7ba3a8c1cce7c0a7
```


### Sample Case 6

**Input**
```text
e2d8d5fdc0917fc7:42600dc25fad4aa71aa0823b2aaf85c4:c58460506c9c10ba57beddffa3ec1b1c
```

**Output**
```text
a0d2:f407e96671b37dac1b0436e08cf644e3:7980ff7b4b137e6b401be3262012e9d8
```


### Sample Case 7

**Input**
```text
68812711f056fa153ebe:3c146cccd0bf26b993c890f7faee00de:958be8ceb824807bb3aacc86fb4faef8
```

**Output**
```text
bee9:5c9e21f9f8e1a19080e81c13d8ad24f4:a0d209b15803c961a6ca680fb7acbff7
```

