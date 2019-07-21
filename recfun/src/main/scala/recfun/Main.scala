package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c < 0 || r < 0 )
        throw new IllegalArgumentException("Negative numbers are not allowed.")
      else if (c > r)
        throw new IllegalArgumentException("Column value can't by higher than the row value.")

      if (c == 0 || c == r ) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def check(tempListChars: List[Char], count: Int): Boolean = {
        if (count < 0) false
        else if (tempListChars.isEmpty) count == 0
        else {
          if (tempListChars.head == '(') check(tempListChars.tail, count + 1)
          else if (tempListChars.head == ')') check(tempListChars.tail, count - 1)
          else check(tempListChars.tail, count)
        }
      }
      check(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def nested(tempMoney: Int, tempListCoins: List[Int], count: Int): Int = {
        if (tempListCoins.isEmpty || tempMoney < 0) 0
        else {
          if (tempMoney == 0) count + 1
          else nested(tempMoney, tempListCoins.tail, count) + nested(tempMoney - tempListCoins.head, tempListCoins, count)
        }
      }

      if (money < 0) throw new IllegalArgumentException("Negative amount")
      else if (money == 0) 0
      else nested(money, coins, 0)
    }
  }
