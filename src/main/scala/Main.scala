import scala.io.StdIn.readLine

@main def homework1: Unit = {
  val n = readLine().toInt
  val lines = List.fill(n)(readLine().trim)
  val sum = sumNumbers(lines)
  println(sum)
}

def sumNumbers(lines: List[String]): Int = {
  lines.indices.flatMap(it => splitLine(lines, it)).sum
}

def splitLine(lines: List[String], rowIndex: Int): List[Int] = {
  var requiredNumbers = List[Int]()
  var currentNumber = ""
  var stopFlag = false

  for {
    i <- 0 until lines(rowIndex).length
    ch = lines(rowIndex).charAt(i)
  } if (ch.isDigit) {
    currentNumber += ch
    if (!stopFlag) {
      stopFlag = checkNeighborhood(lines, rowIndex, i)
    }
  } else {
    if (stopFlag) {
      requiredNumbers = requiredNumbers :+ currentNumber.toInt
    }
    currentNumber = ""
    stopFlag = false
  }

  requiredNumbers
}

def checkNeighborhood(lines: List[String], lineIndex: Int, ch: Int): Boolean = {
  var isNeighborhood = false

  for {
    i <- -1 to 1
    j <- -1 to 1
    if lineIndex + i >= 0 && lineIndex + i < lines.length && ch + j >= 0 && ch + j < lines(lineIndex + i).length && !isNeighborhood
  } isNeighborhood = checkAnotherSymbol(lines(lineIndex + i).charAt(ch + j))

  isNeighborhood
}

def checkAnotherSymbol(ch: Char): Boolean = {
  !ch.isDigit && ch != '.'
}