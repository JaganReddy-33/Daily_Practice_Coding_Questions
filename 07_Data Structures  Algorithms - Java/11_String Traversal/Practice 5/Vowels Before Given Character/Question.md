# Vowels Before Given Character

## Description

Print all vowels from a given string that occur before a given character alphabetically.

- Identify all the vowels present in the string s.

- Compare each vowel with the first occurrence of character ch. If the vowel comes before ch consider it has the valid character.

- Sort all these valid vowels in alphabetical order.

- If no vowels satisfy the condition, print -1.

## Input Format

A single string `s` containing characters. A single character `ch`.

## Output Format

Print all vowels from the string `s` that come before `ch` alphabetically. If no vowels occur before `ch`, print -1.

Explanation:

INPUT:

howareyou

u

The vowels in howareyou are o, a, e, o, u.

The target character is u.

The vowels a, e, o, o all come before u alphabetically.

Arranging these vowels in alphabetical order gives aeoo.

Hence, the output is aeoo.

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

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-08-27 12:48:37Z
