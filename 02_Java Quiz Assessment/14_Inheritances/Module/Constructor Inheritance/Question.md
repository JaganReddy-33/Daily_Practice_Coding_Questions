# Constructor Inheritance

> ✅ Solved

## Question

<p>What is the outcome of the code?</p><p><br></p><p>class X extends Z {</p><p>&nbsp;&nbsp;public void methodX() {</p><p>&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("X");</p><p>&nbsp;&nbsp;}</p><p>}</p><p><br></p><p>class Y extends X {</p><p>&nbsp;&nbsp;public void methodY() {</p><p>&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Y");</p><p>&nbsp;&nbsp;}</p><p>}</p><p><br></p><p>class Z extends Y {</p><p>&nbsp;&nbsp;public void methodZ() {</p><p>&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Z");</p><p>&nbsp;&nbsp;}</p><p>}</p><p><br></p><p>public class Demo {</p><p>	public static void main(String[] args) {</p><p>		X x = new X();</p><p>		x.methodX();</p><p>		Y y = new Y();</p><p>		y.methodY();</p><p>		Z z = new Z();</p><p>		z.methodZ();</p><p><br></p><p>	}</p><p>}</p>

## Answer choices

- ⬜ **A.** <p>X Y Z</p>
- ⬜ **B.** <p>Z Y X</p>
- ✅ **C. <p>Compilation error due to cyclic inheritance</p>** — Correct answer
- ⬜ **D.** <p>Compilation error due to undefined method calls</p>

## Submission

- **Correct answer:** <p>Compilation error due to cyclic inheritance</p>
- **Submitted at:** 2026-06-26T14:33:35.240Z
- **Correct submission:** True

## Explanation

_Not available._
