# Voting Eligibility Check

**Question ID:** `660673adf51c6d596b4364be`

## Description

Verify the eligibility of an individual to participate in voting.

## Input Format

The first line contains a single integer representing the age of the individual. The second line contains a string 'Yes' or 'No', indicating whether the individual possesses a voter card.

## Output Format

Print the eligibility status of the individual as per the given conditions.Print the eligibility status of the individual as per the given conditions. If the person is eligible to vote and has a voter card, provide additional information indicating their eligibility to cast their vote. Here are the details of the output:

If the individual's age is 18 or above and possesses a voter card, print 'Eligible and can Vote'.

If the individual's age is 18 or above but does not possess a voter card, prompt them to 'Get a Voter ID'.

If the individual's age is below 18, output 'Not Eligible to Vote'.

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

_5 sample case(s) omitted because the captured values were empty or looked like links/encoded data._

---

**Submitted at:** 2026-08-18 18:52:33Z
