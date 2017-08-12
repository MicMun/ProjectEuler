/*
 * Copyright (c) 2017 Michael Munzert
 *
 * This file is part of ProjectEuler.
 *
 * ProjectEuler is free software: you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License as published by the Free Software 
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
 * Problem 4: Find the largest palindrome made from the product of two 3-digit
 * numbers.
 *
 * @author MicMun
 * @version 1.0, 12.08.17
 */

class Problem4 {
    /**
     * Returns the reversed number.
     *
     * @param n number to reverse.
     * @return reversed number.
     */
    private fun rev(n: Int): Int {
        val s: String = n.toString()
        return s.reversed().toInt()
    }

    /**
     * Returns <code>true</code>, if n is a palindrome.
     *
     * @param n number to check.
     * @return <code>true</code>, if n is a palindrome.
     */
    private fun palin(n: Int): Boolean {
        return n == rev(n)
    }

    /**
     * Returns the largest palindrome made from the product of two 3-digit
     * numbers.
     *
     * @return sum of numbers.
     */
    fun getLoesung(): Int {
        var max: Int = 0

        for (i in 100..999) {
            (100..999)
                    .asSequence()
                    .filter { palin(i * it) && i * it > max }
                    .forEach { max = i * it }
        }

        return max
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem4"
    }
}