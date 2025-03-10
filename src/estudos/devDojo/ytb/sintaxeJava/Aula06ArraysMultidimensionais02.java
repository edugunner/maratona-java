package estudos.devDojo.ytb.sintaxeJava;

public class Aula06ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{3,2,1};
        arrayInt[2] = new int[]{1,2,3,4,5,6};
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
