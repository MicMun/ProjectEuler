/*
 * Copyright (c) 2017 Michael Munzert
 *
 * This file is part of ProjectEuler.
 *
 * ProjectEuler is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * ProjectEuler is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with ProjectEuler.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.micmun.kotlin.projecteuler

import de.micmun.kotlin.projecteuler.problems.*

/**
 * Main application for ProjectEuler.
 *
 * @author MicMun
 * @version 1.0, 12.08.17
 */

fun main(args: Array<String>) {
    // Problem 1: Find the sum of all the multiples of 3 or 5 below 1000.
    val p1 = Problem1(1000)
    println("$p1 ${p1.getLoesung()}")

    // Problem 2: By considering the terms in the Fibonacci sequence whose
    // values do not exceed four million, find the sum of the even-valued terms.
    val p2 = Problem2(4000000)
    println("$p2 ${p2.getLoesung()}")

    // Problem 3: What is the largest prime factor of the number 600851475143.
    val p3 = Problem3(600851475143)
    println("$p3 ${p3.getLoesung()}")

    // Problem 4: Find the largest palindrome made from the product of two
    // 3-digit numbers.
    val p4 = Problem4()
    println("$p4 ${p4.getLoesung()}")

    // Problem 5: What is the smallest positive number that is evenly divisible
    // by all of the numbers from 1 to 20.
    val p5 = Problem5(20)
    println("$p5 ${p5.getLoesung()}")

    // Problem 6: Find the difference between the sum of the squares of the
    // first one hundred natural numbers and the square of the sum.
    val p6 = Problem6(100)
    println("$p6 ${p6.getLoesung()}")

    // Problem 7: What is the 10 001st prime number?
    val p7 = Problem7(10001)
    println("$p7 ${p7.getLoesung()}")
}
