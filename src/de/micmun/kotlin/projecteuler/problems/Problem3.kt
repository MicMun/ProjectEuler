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
 * Problem 3: What is the largest prime factor of the number 600851475143.
 *
 * @author MicMun
 * @version 1.0, 12.08.17
 */

class Problem3(val number: Long) {
    /**
     * Returns the largest prime factor of the number 600851475143.
     *
     * @return sum of numbers.
     */
    fun getLoesung(): Long {
        var n: Double = number.toDouble()

        var d: Double = 3.0
        var rt: Double

        if (n < 2)
            return -1

        while (n.rem(2) == 0.0)
            n /= 2

        if (n == 1.0)
            return 2

        rt = Math.sqrt(n)

        while (d <= rt) {
            if (n.rem(d) == 0.0) {
                n /= d;
                rt = Math.sqrt(n)
                continue
            }
            d += 2
        }

        return n.toLong()
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem3 - What is the largest prime factor of the number " +
                "600851475143:"
    }
}