# Voting Eligibility Check

## Description

<p>Verify the eligibility of an individual to participate in voting.</p>

## Input Format

<p>The first line contains a single integer representing the age of the individual. The second line contains a string 'Yes' or 'No', indicating whether the individual possesses a voter card.</p>

## Output Format

<p>Print the eligibility status of the individual as per the given conditions.Print the eligibility status of the individual as per the given conditions. If the person is eligible to vote and has a voter card, provide additional information indicating their eligibility to cast their vote. Here are the details of the output:</p><p><br></p><p>If the individual's age is 18 or above and possesses a voter card, print 'Eligible and can Vote'.</p><p>If the individual's age is 18 or above but does not possess a voter card, prompt them to 'Get a Voter ID'.</p><p>If the individual's age is below 18, output 'Not Eligible to Vote'.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
20
Yes
```

**Output**
```text
Eligible and can Vote
```


### Sample Case 2

**Input**
```text
17
Yes
```

**Output**
```text
Not Eligible to Vote
```


### Sample Case 3

**Input**
```text
bc1b3e63a7:6a88516aa0cf5c525354a2a994e879b5:a9156923c02e92761ed1f75ddb442a43
```

**Output**
```text
ee0e1a04b20f39eae4a4d8f3ccfc6089eefba414:9e696efc112930e1340a4d18e6351321:6fcaefd18fb268f433d9b43781045bb2
```


### Sample Case 4

**Input**
```text
93549a9ebc5e:c0d313976f1c913e71a9621e90fc62ff:786186b45f525b8b095c5a31d6a6f9c1
```

**Output**
```text
3464d9a86ef3ce458603393f504cae8320979bd968:033827061db7c6aa06423eb2d3cbbf5b:a420957f6dc10ae5374d45fc1bfe641b
```


### Sample Case 5

**Input**
```text
682e1ea89500:e103ab24f3847453eef3fdb862c059ef:9a014915fefd35885e4be6f3ce419a0c
```

**Output**
```text
227368382d7ded96658f19e05d0011f962716cb6bc:1030d52c5fbe95b0cfe28dad7969eae9:4ca1cda0d674df56dc6710d6617b6c31
```


### Sample Case 6

**Input**
```text
ff892e9620:81a8d596756ff5852b4dcaee9374c563:1c644b8c4c715fef3db4acb17cb88c20
```

**Output**
```text
b1c5a06b5a5fd086a9640e86ef5e578944742f76:7968c05ba0c2b3ff49932e3703282208:05c5439fb2e2b67d75d16e7c5c96e2ce
```


### Sample Case 7

**Input**
```text
4fefcdd01f:2aa3ce2b7ce380d58a55ea662e05428a:763066712bfc2cfaed57db13797cdfe1
```

**Output**
```text
b212778a965c05aa236fe6059670:bf1bc864481bdaaac032f9574f2006e5:dd571d363ac6527f8fa6bb4fd3c774a6
```

