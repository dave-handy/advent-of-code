package com.handy
package com.handy.aoc2021

import scala.io.Source
import scala.util.Using

object Day2 {

  @main def day2part1(): Unit = {
    var depth = 0
    var x     = 0

    Using.resource(Source.fromResource("com/handy/aoc2021/day2.txt", getClass.getClassLoader)) {
      source =>
        source
          .getLines()
          .map(_.split(' '))
          .foreach { case Array(cmd, num) =>
            cmd match {
              case "forward" => x += num.toInt
              case "up"      => depth -= num.toInt
              case "down"    => depth += num.toInt
            }
          }
    }
    println(depth * x)
  }

  @main def day2part2(): Unit = {
    var aim   = 0
    var depth = 0
    var x     = 0

    Using.resource(Source.fromResource("com/handy/aoc2021/day2.txt", getClass.getClassLoader)) {
      source =>
        source
          .getLines()
          .map(_.split(' '))
          .foreach { case Array(cmd, num) =>
            cmd match {
              case "forward" =>
                x += num.toInt
                depth += aim * num.toInt
              case "up"   => aim -= num.toInt
              case "down" => aim += num.toInt
            }
          }
    }
    println(depth * x)
  }

}
