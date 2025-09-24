public class Main {
    public static void main(String[] args) {
        String name = "Julia";
        String birthday = "02/09/2000";
        double height = 1.65;
        char first_letter = 'J';

        Data.displayData(name, birthday, height, first_letter);
        System.out.println("Multiplication table");
        for (int i=1; i< 11; i ++){
            System.out.println("---------");
            System.out.println("number " + i);
            System.out.println("---------");
            for(int j=1 ; j < 11; j ++){
                int product = i*j;
                System.out.println(i + " * " + j+ " = " + product);

            }
        }
    }
}