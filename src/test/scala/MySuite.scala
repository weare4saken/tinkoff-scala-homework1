class MySuite extends munit.FunSuite {
  test("Test homework1") {
    val input = """
                  10
                  123..137..
                  ...*......
                  ..88..633.
                  ......#...
                  921*......
                  .....+.21.
                  ..777.....
                  ......755.
                  ...$.*....
                  .334.321..
                """

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 3952)
  }
}
