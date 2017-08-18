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
 * Problem 6: Find the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 *
 * @author MicMun
 * @version 1.0, 18.08.17
 */
class Problem6(private val number: Int) {
    /**
     * Returns the sum of the squares.
     *
     * @return sum of the squares.
     */
    private fun getSumOfSquares(z: Int): Int {
        return (1..z).sumBy { (it * it) }
    }

    /**
     * Return the square of the sum.
     *
     * @return the square of the sum.
     */
    private fun getSquareOfSum(z: Int): Int {
        val sum = (1..z).sum()

        return sum * sum
    }

    /**
     * Returns the difference between the sum of the squares of the first
     * one hundred natural numbers and the square of the sum.
     *
     * @return difference number.
     */
    fun getLoesung(): Int {
        val sumOfSquares = getSumOfSquares(number)
        val squareOfSum = getSquareOfSum(number)

        return squareOfSum - sumOfSquares
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem6 - Find the difference between the sum of the squares" +
                " of the first one hundred natural numbers and the square of " +
                "the sum:"
    }
}