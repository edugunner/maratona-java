package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException  ");
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

}


