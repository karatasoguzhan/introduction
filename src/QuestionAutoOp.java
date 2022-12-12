public class QuestionAutoOp {

    public static void main(String[] args) {

        int i = 0;

        System.out.println(i++); // 1     0    0    0
        System.out.println(i);   // 0     1    1    1
        System.out.println(--i); //       0    0    0
        System.out.println(i++); // 1     0    1    2
        System.out.println(--i); //       0    0    1



    }

}
