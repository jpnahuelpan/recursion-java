/**
 * Author: J.P. Nahuelpán
 *
 * Retuns the fibonacci value of the given [number].
 * Definition:
 *    - f(0) = 0
 *    - f(1) = 1
 *    - f(n) = f(n - 1) + f(n - 2), for n > 1
 * Example: f(3) = f(2) + f(1)
 *               = (f(1) + f(0)) + 1
 *               = 1 + 1
 *               = 2 
 */
package org.example;

class Fibonacci {
    static int linear(int n) {
        return evalBC(n) ? n : (n == 2) ? 1 : (int)(1.618 * linear(n - 1) + 0.5);
    }

    static int tail(int n) {
        return tail(n, 0, 1);
    }
    
    static int multiple(int n) {
        return evalBC(n) ? n : multiple(n - 1) + multiple(n - 2);
    }

    static int mutual(int n) {
        return (n == 0) ? n : A(n) + B(n); 
    }

    static int nested(int n) {
        return nested(n, 0);
    }

    private static int tail(int n, int acc, int aux) {
        return (n == 0) ? acc : tail(n - 1, aux, acc + aux);
    }

    private static int nested(int n, int s) {
        return (n == 0) ? n : nestedBC(n) ? 1 + s : nested(n - 1, s + nested(n - 2, 0));
    }

    private static int A(int n) {
        return (n == 1) ? 0 : B(n - 1) + A(n - 1);
    }

    private static int B(int n) {
        return (n == 1) ? 1 : A(n - 1);
    }

    private static boolean evalBC(int n) {
        return (n == 1 || n == 0); 
    }

    private static boolean nestedBC(int n) {
        return (n == 1 || n == 2);
    }
}
