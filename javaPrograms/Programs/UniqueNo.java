        package Programs;
        import java.util.Scanner;

        public class UniqueNo {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num1 = sc.nextInt();
                int num2 = num1;
                int count = 0;

                while (num1 > 0) {
                    int reminder = num1 % 10;

                    num1 = num1 / 10;
                    int temp = num1;
                    while (temp > 0) {

                        if (temp % 10 == reminder) {
                            count = 1;
                            break;
                        }
                        temp = temp / 10;
                    }
                }

                if (count == 0) {
                    System.out.println(num2 + " is a unique number");
                } else {
                    System.out.println(num2 + " is not a unique number");
                }
            }

        }
