public class Main {
    public static void main(String[] args) {
        //Задача №1
        byte greenApples = 3;
        short redApples = 130;
        int lightSpeed = 299792458;
        long myBalance = 3000000001L;
        float numberPi = 3.1415f;
        double a = 145.405405405405;
        System.out.println("Значение переменной greenApples с типом byte равно: " + greenApples);
        System.out.println("Значение переменной redApples с типом short равно: " + redApples);
        System.out.println("Значение переменной lightSpeed с типом int равно: " + lightSpeed);
        System.out.println("Значение переменной myBalance с типом long равно: " + myBalance);
        System.out.println("Значение переменной numberPi с типом float равно: " + numberPi);
        System.out.println("Значение переменной a с типом double равно: " + a);
        System.out.println("________________________________________________");

        //Задача 2
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
        System.out.println("________________________________________________");

        //Задача 3
        byte learnersLP = 23;
        byte learnersAS = 27;
        byte learnersEA = 30;
        short countPaper = 480;
        int totalLearners = learnersLP + learnersAS + learnersEA;  /*При объявлении переменной totalLearners типа byte
            IDEA подчеркивает красным, хотя тут мы ожидаем 80(23+27+30), что входит в диапозон byte.
            Предлаегает такой синтаксис: byte totalLearners = (byte) (learnersLP + learnersAS + learnersEA);
            В уроке такого не было...
            */
        int countPaperLearner = countPaper / totalLearners; // Тут аналогично...Надеюсь поприсутствовать на субботнем разборе
        System.out.println("На каждого ученика рассчитано " + countPaperLearner + " листов бумаги");
        System.out.println("________________________________________________");

        //Задача №4
        byte machineProductivity = 8;  //8 бутылок в мин
        byte time1 = 20;               //20 мин
        short time2 = 1440;            //1440 мин (1 сутки)
        short time3 = 4320;            //4340 мин (3 суток)
        int time4 = 43200;             //43200 мин (30 суток)
        float mpTime1 = time1 / machineProductivity; //Warnings: тут IDEA предлагает: float mpTime1 = (float) time1 / machineProductivity;
        int mpTime2 = time2 / machineProductivity;   //Тут не дает задать short, хотя мы ожидаем 180...
        int mpTime3 = time3 / machineProductivity;   //Тут не дает задать short, хотя мы ожидаем 540...
        int mpTime4 = time4 / machineProductivity;   //Тут не дает задать short, хотя мы ожидаем 5400...
        System.out.println("За 20 минут машина произвела " + mpTime1 + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + mpTime2 + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + mpTime3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + mpTime4 + " штук бутылок");
        System.out.println("________________________________________________");

        //Задача 5
        byte totalJar = 120;                                      //Колличество банок всего
        byte whiteJarOneRoom = 2;                                 //Колличество белой на один класс
        byte brownJarOneRoom = 4;                                 //Колличество коричневой на один класс
        int totalJarOneRoom = whiteJarOneRoom + brownJarOneRoom;  //Общее колличество банок на один класс
        int countRooms = totalJar / totalJarOneRoom;              //Получаем колличество классов
        int totalWhite = whiteJarOneRoom * countRooms;            //Общее колличество банок с белой краской
        int totalBrown = brownJarOneRoom * countRooms;            //Общее колличество банок с коричневой краской
        System.out.println("В школе, где " + countRooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println("________________________________________________");

        //Задача 6
        byte countBananas = 5;        //Колличество бананов, шт
        short countMilk = 200;        //Колличество молока в мл
        byte countIceCream = 2;       //Колличество мороженого в брикетах
        byte countEggs = 4;           //Колличество яиц, шт
        byte weightBananas = 80;      //Вес одного банана
        float weightMilk = 1.05f;     //Вес 1 мл молока
        byte weightEggs = 70;         //Вес 1 яйца
        byte weightIceCream = 100;    //Вес одного брикета мороженого
        float weightBreakfest_g = countBananas * weightBananas + countMilk * weightMilk +
                                countIceCream * weightIceCream + countEggs * weightEggs;
        float weightBreakfest_kg = weightBreakfest_g / 1000;
        System.out.println("Завтрак спортсмена составляет " + weightBreakfest_g + " грамм, или "
                           + weightBreakfest_kg + " кг.");
        System.out.println("________________________________________________");

        //Задача №7
        byte excessWeight = 7;        //Лишний вес, кг
        float programm1 = 0.25f;      //Сброс веса по программе 1, кг
        float programm2 = 0.500f;     //Сброс веса по программе 2, кг
        float countDaysPr1 = excessWeight / programm1;
        float countDaysPr2 = excessWeight / programm2;
        float meanCountDays = (countDaysPr1 + countDaysPr2) / 2;
        System.out.println("Если сбрасывать по 250 г в день, то потребуется " + countDaysPr1 + " дней, если " +
                           "по 500 г - " + countDaysPr2 + " дней. В среднем уйдет " + meanCountDays + " дней.");
        System.out.println("________________________________________________");

        //Задача 8







    }
}