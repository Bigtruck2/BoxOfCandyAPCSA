import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BoxOfCandy boxOfCandy = new BoxOfCandy(new Candy[][]{new Candy[]{null,new Candy("lime"),null},new Candy[]{null,new Candy("orange"),null},new Candy[]{null,null,new Candy("cherry")},new Candy[]{null,new Candy("lemon"),new Candy("grape")}});
        System.out.println(Arrays.deepToString(boxOfCandy.getBox()));
        System.out.println(boxOfCandy.moveCandyToFirstRow(0));
        System.out.println(Arrays.deepToString(boxOfCandy.getBox()));
        System.out.println(boxOfCandy.moveCandyToFirstRow(2));
        System.out.println(Arrays.deepToString(boxOfCandy.getBox()));
        BoxOfCandy boxOfCandy2 = new BoxOfCandy(new Candy[][]{new Candy[]{new Candy("lime"),new Candy("lime"),null,new Candy("lemon"),null},new Candy[]{new Candy("orange"),null,null,new Candy("lime"),new Candy("lime")},new Candy[]{new Candy("cherry"),null, new Candy("lemon"),null,new Candy("orange")}});
        System.out.println(Arrays.deepToString(boxOfCandy2.getBox()));
        System.out.println(boxOfCandy2.removeNextByFlavor("cherry"));
        System.out.println(Arrays.deepToString(boxOfCandy2.getBox()));
        System.out.println(boxOfCandy2.removeNextByFlavor("lime"));
        System.out.println(Arrays.deepToString(boxOfCandy2.getBox()));
    }
}