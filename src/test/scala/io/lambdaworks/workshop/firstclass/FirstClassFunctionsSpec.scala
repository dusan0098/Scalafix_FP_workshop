package io.lambdaworks.workshop.firstclass

import io.lambdaworks.workshop.firstclass.FirstClassFunctions.sortWith
import org.scalatest.{MustMatchers, WordSpec}

final class FirstClassFunctionsSpec extends WordSpec with MustMatchers {
  "SortBy function" should {
    "sort elements in ascending order" in new Fixture {
      val sorted: List[Int] = sortWith(numbers, (x: Int, y: Int) => x < y)
      sorted mustBe numbers.sorted
    }

    "sort elements in descending order" in new Fixture {
      val sorted: List[Int] = sortWith(numbers, (x: Int, y: Int) => x > y)
      sorted mustBe numbers.sorted(Ordering.Int.reverse)
    }
  }

  trait Fixture {
    val numbers = List(46, 1, 5, 3, 8, 32, 45, 3)
  }
}
