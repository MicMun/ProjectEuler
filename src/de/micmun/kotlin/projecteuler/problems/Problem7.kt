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
 * Problem 7: What is the 10 001st prime number?.
 *
 * @author MicMun
 * @version 1.0, 18.08.17
 */
class Problem7(private val number: Int) {
    private val primes: MutableList<Int> = mutableListOf()

    /**
     * Returns <code>true</code>, if n is prime.
     *
     * @return <code>true</code>, if n is prime.
     */
    private fun isPrime(n: Int): Boolean {
        return (2..Math.sqrt(n.toDouble()).toInt()).none { n.rem(it) == 0 }
    }

    /**
     * Returns the 10 001st prime number.
     *
     * @return the 10 001st prime number.
     */
    fun getLoesung(): Int {
        var index = 1
        var zahl = 3

        primes.add(2)

        while (index != number) {
            if (isPrime(zahl)) {
                primes.add(zahl)
                index++
            }
            zahl += 2
        }

        return primes.last()
    }

    /**
     * Returns the name of the problem class.
     *
     * @return name of the problem class.
     */
    override fun toString(): String {
        return "Problem7 - What is the 10 001st prime number:"
    }
}