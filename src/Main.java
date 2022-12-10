public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        public static void task1() {
            System.out.println("Задача 1");
            int accumulation = 15000;
            int total = 0;
            int i = 0;
            while (total < 2459000){
                total = total + accumulation;
                i++;
                System.out.println("Месяц" + i +" сумма накоплений равна " + total +  " рублей");
            }
        }
        public static void task2(){
            System.out.println("Задача 2");
            int i = 1;
            while(i < 11){
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (i=10; i>0; i--){
                System.out.print(i + " ");
            }
            System.out.println();

        }

        public static void task3(){
            System.out.println("Задача 3");
            int y = 12000000;
            int fertility = 17;
            int mortality = 8;
            int people = 1000;
            for (int i = 1; i < 11; i++){
                y = (y / people) * (fertility - mortality)+y;
                System.out.println("Год " + i +" численность населения состовляет " + y);
            }
        }
        public static void task4(){
            System.out.println("Задача 4");
            int contribution = 15000;
            double total = 0;
            double monthlyInterest = 1.07;
            for (int i = 1; total < 12000000; i++){
                total = (total + contribution) * monthlyInterest;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");

            }

        }
        public static void task5(){
            System.out.println("Задание 5");
            int contribution = 15000;
            double total = 0;
            double monthlyInterest = 1.07;
            for (int i = 6; total < 12000000; i+=6){
                total = (total + contribution) * monthlyInterest;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");

            }

        }
        public static void task6() {
            System.out.println("Задание 6");
            int contribution = 15000;
            double total = 0;
            double monthlyInterest = 1.07;
            int months = 12 * 9;
            for (int i = 1; i <= months; i ++) {
                total = (total + contribution) * monthlyInterest;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
                }

            }
        }
            public static void task7() {
                System.out.println("Задача 7");
                int number = 1;
                for (; number < 32; number+=7){
                    System.out.println("Сегодня пятница, " + number +  "-е число. Необходимо подготовить отчет");
                }
            }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2022;
        int yearMax = year + 100;
        int yearMin = year - 200;
        for (int i = yearMin; i < yearMax; i++ ){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
    }
}
