package com.handy
package com.handy.aoc2021

import scala.io.Source
import scala.util.Using

object Day1 {

  @main def part1(): Unit = {
    Using.resource(Source.fromResource("com/handy/aoc2021/day1.txt", getClass.getClassLoader)) {
      source =>
        val num = source.getLines().map(_.toInt).sliding(2, 1).count(s => s(1) > s.head)
        println(num)
    }
  }

  @main def part2(): Unit = {
    Using.resource(Source.fromResource("com/handy/aoc2021/day1.txt", getClass.getClassLoader)) {
      source =>
        val num = source
          .getLines()
          .map(_.toInt)
          .sliding(3, 1)
          .map(_.sum)
          .sliding(2, 1)
          .count(s => s(1) > s.head)
        println(num)
    }
  }
}
