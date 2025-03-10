package estudos.devDojo.ytb.sintaxeJava;

public class Aula05Arrays {
    public static void main(String[] args) {
        int [ ] multiplos =  new int[7];
        multiplos[0] = 4;
        multiplos[1] = 8;
        multiplos[2] = 16;
        multiplos[3] = 32;
        multiplos[4] = 64;
        multiplos[5] = 128;
        multiplos[6] = 256;
        for (int i = 0; i <= 6; i++) {
            System.out.println(multiplos[i]);
        }
    }
}
