/*
 * Copyright (c) 2017 Michael Munzert
 *
 * This file is part of ProjectEuler.
 *
 * ProjectEuler is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * ProjectEuler is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with ProjectEuler.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.micmun.kotlin.projecteuler.problems

/**
 * Problem 1: Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author MicMun
 * @version 1.0, 12.08.17
 */

class Problem1(val number: Int) {
    val q1: Int = 3
    val q2: Int = 5

    /**
     * Returns the sum of the numbers which are dividable through q1 and q2
     * below number.
     *
     * @return sum of numbers.
     */
    fun getLoesung(): Int {
        val sum: Int = (1 until number).sumBy {
            if (it.rem(q1) == 0 || it.rem(q2) == 0) it else 0
        }
        return sum
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem1"
    }
}