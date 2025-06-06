package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked e Unchecked
        //Checked são filhas da classe exception diretamente. Irão lançar um erro diretamente não sendo capaz de compilar o código. Precisa ser feito um tratamento
        //RuntimeException geralmente acontecem quando existe erro de código feito pelo desenvolvedor
        //Unchecked são filhas de RuntimeException: NullPointer,ArrayOutOfBounds,IndexOutOfBounds. Acontecem quando você faz o código errado gerando uma exceção

        int[] nums = {1,2};

        System.out.println(nums[2]);
    }
}
