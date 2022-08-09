public class Main {
    public static void main(String[] args) {
        //задание 1

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + "");
        }

        System.out.println();

        for (int a = 10; a > 0; a--) {
            System.out.print(+a);
        }


        //Задание 2
        {
            System.out.print("\n");
            int friday = 1;
            for (int b = 1; b < 31; b = b + 7) {
                System.out.println("Сегодня пятница"  + b +  "число.Необходимо подготовить отчет.");
            }


            //Задание 3
            System.out.print("\n");
            {
                int start = 1896;
                for (int year = 1896; year <= 2054; year = year + 79) {
                    System.out.println(year);}
            }
        }
    }
}