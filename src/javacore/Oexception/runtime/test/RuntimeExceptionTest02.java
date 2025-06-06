package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     **
     * @param a
     * @param b não pode ser igual a zero
     * @return
     * @throws IllegalArgumentException caso b seja igual a zero.
     */

    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}

