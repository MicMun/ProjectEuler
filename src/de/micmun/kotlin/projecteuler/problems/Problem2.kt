/*
 * Copyright (c) 2017 Michael Munzert
 *
 * This file is part of ProjectEuler.
 *
 * ProjectEuler is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * ProjectEuler is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with ProjectEuler.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package de.micmun.kotlin.projecteuler.problems

/**
 * Problem 2: By considering the terms in the Fibonacci sequence whose values
 * do not exceed four million, find the sum of the even-valued terms.
 *
 * @author MicMun
 * @version 1.0, 12.08.17
 */

class Problem2(val maxNumber: Int) {
    private fun fib(n1: Int, n2: Int): List<Int> {
        val numbers: MutableList<Int> = mutableListOf()
        var nr1: Int = n1
        var nr2: Int = n2

        while (nr1 + nr2 < maxNumber) {
            val f: Int = nr1 + nr2
            numbers.add(f)
            nr1 = nr2
            nr2 = f
        }

        return numbers
    }

    /**
     * Returns the sum of the even-valued numbers of fibonacci below maxNumber.
     *
     * @return sum of numbers.
     */
    fun getLoesung(): Int {
        val fibs: List<Int> = fib(0, 1)
        val sum: Int = (0 until fibs.size).sumBy {
            if (fibs[it].rem(2) == 0) fibs[it] else 0
        }

        return sum
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem2 - By considering the terms in the Fibonacci sequence " +
                "whose values do not exceed four million, find the sum of the" +
                " even-valued terms:"
    }
}