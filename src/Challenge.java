public class Challenge {
    public static void main(String[] args) {


        double x = 20.0d;
        double y = 80.0d;

        double result = (x + y) * 100;
        double remainder = result % 40.00;
        boolean noRemainder = (remainder == 0) ? true : false;

        System.out.println(noRemainder);

        if(!noRemainder){
            System.out.println("Got some remainder! A remainder of: " + remainder);
        } else {
            System.out.println("There is no remainder!");
        }


        double z = 7;
        double o = 96;

        double hannah = z % o;
        System.out.println(hannah);

    }
}
