package com.nealford

/**
 * Created by igorlazarev on 11/19/2014.
 * Functional Thinking, by Neal Ford
 * http://techbus.safaribooksonline.com/book/programming/9781449365509/1dot-why/_concision_html#X2ludGVybmFsX0h0bWxWaWV3P3htbGlkPTk3ODE0NDkzNjU1MDklMkZfYV9jb21tb25fZXhhbXBsZV9odG1sJnF1ZXJ5PQ==
 */
object ProcessingEmployees {
  def main(args: Array[String]) {
    val result = List("neal", "s", "stu", "j", "rich", "bob", "aiden", "j", "ethan",
      "liam", "mason", "noah", "lucas", "jacob", "jayden", "jack")
      .par //  In the Scala version, I can make the code parallel by adding par to the stream, as shown in Example 2-8.
      .filter(_.length() > 1)
      .map(_.capitalize)
      .reduce(_ + "," + _)
    println("result=" + result)
  }
}
