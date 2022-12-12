public class DataTypes2 {

    public static void main(String[] args) {


        // literal

        byte b = 25;

        int i = 25;
        // x = y

        //byte b1 = i;

        float f = 0.5F; // 32
        double d = f;   // 64

        // 32 bit = 64 bit;
        // float f1 = d; CANNOT




        double d1 = 5; // 5.0

        //System.out.println(d1);

        // casting

        // 1 1111 0100
        int x = 500;

        // 1111 0100 (-128 + 64 + 32 + 16 + 4 )
        byte y = (byte) x;
        //         |
        //   donusturulecek tip

        System.out.println(y);


        long l = 9865;
        int i2 = (int)l;


    }

}
