class MySuite extends munit.FunSuite {
  test("Test 1") {
    val input = """10
                  123..137..
                  ...*......
                  ..88..633.
                  ......#...
                  921*......
                  .....+.21.
                  ..777.....
                  ......755.
                  ...$.*....
                  .334.321.."""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 3952)
  }

  test("Test 2") {
    val input = """2
                  1..*2
                  .*1.."""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 4)
  }

  test("Test 3") {
    val input = """5
                  *
                  6
                  0
                  .
                  1"""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 6)
  }

  test("Test 4") {
    val input ="""4
                    ....
                    .1..
                    1.1.
                    .2.9"""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 0)
  }

  test("Test 5") {
    val input = """5
                    80
                    ..=
                    .100.
                    .
                    3000
                    !"""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 3180)
  }

  test("Test 6") {
    val input = """1
                  2464146114545614634561123"""

    val lines = input.stripMargin.split("\n").filter(_.nonEmpty).map(_.trim)
    val newList = lines.tail.toList
    assertEquals(sumNumbers(newList), 0)
  }
}