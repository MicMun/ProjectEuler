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
 * Problem 5: What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 *
 * @author MicMun
 * @version 1.0, 18.08.17
 */

class Problem5(private val number: Int) {
    /**
     * Returns the smallest positive number that is evenly divisible
     * by all of the numbers from 1 to 20.
     *
     * @return smallest positive number.
     */
    fun getLoesung(): Int {
        var result = 1

        for (j in 1..number) {
            if (result.rem(j) > 0) {
                for (k in 1..number) {
                    if ((result * k).rem(j) == 0) {
                        result *= k
                        break
                    }
                }
            }
        }

        return result
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem5 - What is the smallest positive number that is " +
                "evenly divisible by all of the numbers from 1 to 20:"
    }
}