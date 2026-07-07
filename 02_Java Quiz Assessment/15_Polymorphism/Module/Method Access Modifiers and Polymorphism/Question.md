# Method Access Modifiers and Polymorphism

> ✅ Solved

## Question

<p>Guess the output of the code.</p><p><br></p><p>class A{</p><p>protected int method(){</p><p>return 1;</p><p>}</p><p>}</p><p>public class B extends A{</p><p>private int method() {</p><p>return 6;</p><p>}</p><p>public static void main(String[] args){</p><p>A a = new B();</p><p>System.out.println(a.method());</p><p>}</p><p>}</p>

## Answer choices

- ✅ **A. <p>Compilation error</p>** — Correct answer
- ⬜ **B.** <p>Runtime error</p>
- ⬜ **C.** <p>1</p>
- ⬜ **D.** <p>6</p>

## Submission

- **Correct answer:** <p>Compilation error</p>
- **Submitted at:** 2026-07-07T16:41:37.284Z
- **Correct submission:** True

## Explanation

_Not available._
