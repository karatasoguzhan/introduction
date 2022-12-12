public class Scope {

    public static void main(String[] args) {

        int a = 0;

        {
            int b = 1;

            {
                int c = 2;
            }

        }

        /*{
            int b = 1;

            {
                int c = 2;
            }
        }*/

        //System.out.println(b); cannot


    }


}
