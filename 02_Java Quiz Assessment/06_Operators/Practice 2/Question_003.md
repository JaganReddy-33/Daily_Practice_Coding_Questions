# Understanding Byte Overflow in Java

**Question ID:** `66f26c505e9e53f1ff4a78d7`

**Question ID:** `66f26c505e9e53f1ff4a78d7`

> ✅ Solved

## Question

<p>What will be the output of the following code? </p><pre class="ql-syntax" spellcheck="false">class Demo {
&nbsp;&nbsp;&nbsp;&nbsp;public static void main(String[] args) {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;byte b = 126;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b++;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b++;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b++;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(b);
&nbsp;&nbsp;&nbsp;&nbsp;}
}

</pre>

## Answer choices

- ⬜ **A.** <p>-126</p>
- ⬜ **B.** <p>-128</p>
- ✅ **C. <p>-127</p>** — Correct answer
- ⬜ **D.** <p>128</p>

## Submission

- **Correct answer:** <p>-127</p>
- **Submitted at:** 2026-09-22T12:19:38.742Z
- **Correct submission:** True

## Explanation

_Not available._
