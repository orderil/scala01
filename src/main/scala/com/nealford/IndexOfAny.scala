package com.nealford

/**
 * Created by igorlazarev on 11/19/2014.
 * Functional Thinking, by Neal Ford
 * http://techbus.safaribooksonline.com/book/programming/9781449365509/1dot-why/_concision_html?percentage=0&reader=html
 */
object IndexOfAny {
  def firstIndexOfAny(input: String, searchChars: Seq[Char]): Option[Int] = {
    def indexedInput = (0 until input.length).zip(input)
    println("indexedInput=" + indexedInput)
    val result = for (pair <- indexedInput;
                      char <- searchChars;
                      if (char == pair._2)) yield (pair._1)
    if (result.isEmpty)
      None
    else
      Some(result.head)
  }

  def indexOfAny(input: String, searchChars: Seq[Char]): Seq[Int] = {
    def indexedInput = (0 until input.length).zip(input)
    for (pair <- indexedInput;
         char <- searchChars;
         if (char == pair._2)) yield (pair._1)
  }

  def main(args: Array[String]) {
    val input: String = "zzabyycdxx"
    println("input=" + input)
    val chars: Seq[Char] = Seq('c', 'x')
    println("chars=" + chars)
    println("the first index: " + firstIndexOfAny(input, chars))
    println("all indexes: " + indexOfAny(input, chars))
  }
}
