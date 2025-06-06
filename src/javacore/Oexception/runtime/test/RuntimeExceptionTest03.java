package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o arquivo");
        }
        return null;
    }

    private static void abreConexao2() {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando o arquivo");
        }

    }
}
