public class Main {
    public static void main(String[] args) {
//                 ||||| 1 ЧАСТЬ |||||

//        task1_1();
//        task1_2();
//        task1_3();

//                 ||||| 2 ЧАСТЬ |||||

//        task2_1();
//        task2_2();
//        task2_3();
//        task2_4();

//                 ||||| 3 ЧАСТЬ |||||

//        task3_1();
//        task3_2();
    }

//                          ||||| 1 ЧАСТЬ |||||

    //task1_1
    private static void task1() {
        int money = 29_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + money;
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей. \n", i, total);
        }
    }

    //task1_2
    private static void task2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    //task1_3
    private static void task3() {
        int populationCountryY = 12_000_000;
        int brithRatePer1000 = 17;
        int deadRatePer1000 = 8;
        int brithRate = populationCountryY / 1000 * brithRatePer1000;
        int deadRate = populationCountryY / 1000 * deadRatePer1000;
        int year = 2022;
        int numberOfYear = 10;
        int endYear = year + numberOfYear;
        while (year <= endYear) {
            System.out.printf("Год %d, численость населения составляет %d. \n", year, populationCountryY);
            year++;
            populationCountryY = populationCountryY + brithRate - deadRate;
        }
    }



    //                          ||||| 2 ЧАСТЬ |||||
    //task2_1
    private static void task2_1() {
        int depositAmount = 15000;
        int purpose = 12_000_000;
        int percent = 7;
        int savings = 0;
        for (int i = 1; savings < purpose; i++) {
            savings = savings + depositAmount;
            savings = savings + savings / 100 * percent;
            System.out.printf("Спустя  %d-й месяц, сумма накоплений будет равна %d рублей. \n", i, savings);
        }
    }

    //task2_2
    private static void task2_2() {
        var depositAmount = 15000;
        var purpose = 12_000_000;
        var percent = 7;
        var savings = 0f;
        for (int i = 1; savings <= purpose; i++) {
            savings = savings + depositAmount;
            savings = savings + savings / 100 * percent;
            if (i % 6 == 0) {
                System.out.printf("Спустя  %d-й месяц, сумма накоплений будет равна %.2f рублей. \n", i, savings);
            }
        }
    }

    //task 2_3
    private static void task2_3() {
        var depositAmount = 15000;
        var percent = 7;
        int numberOfYears = 9;
        int totalMonths = numberOfYears * 12;
        var savings = 15000f;
        for (int i = 1; i <= totalMonths; i++) {
            savings = savings + depositAmount;
            savings = savings + savings / 100 * percent;
            if (i % 6 == 0) {
                System.out.printf("Спустя  %d-й месяц, сумма накоплений будет равна %.2f рублей. \n", i, savings);
            }
        }
    }

    //task2_4
    private static void task2_4() {
        int firstFriday = 3;
        int dayInMonth = 31;
        for (int i = firstFriday; i <= dayInMonth; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

//        while (firstFriday <= dayInMonth) {
//            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
//            firstFriday = firstFriday + 7;
//        }

//        for (int i = 0; i <= dayInMonth; i++){
//            if (i == firstFriday) {
//                while (i <= dayInMonth){
//                    System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
//                    i = i + 7; }}}
    }

    //                          ||||| 3 ЧАСТЬ |||||
    //task3_1
    private static void task3_1() {
        int frequencyCometYear = 79;
        int year = 2022;
        int periodOfYears = 200;
        int minusYears = year - periodOfYears;
        int plusYears = year + (periodOfYears / 2);
        int i = minusYears;
        for (; i <= plusYears; i++) {
            if (i % frequencyCometYear == 0) {
                System.out.println(i);
            }
        }
    }

    //task3_2
    private static void task3_2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2" + "*" + i + "=" + 2*i);
        }
    }
}