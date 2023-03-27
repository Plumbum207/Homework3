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

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 1000000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = -12;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 1337;
        System.out.println("Значение переменной c с типом short равно " + c);
        long x = -5210000000L;
        System.out.println("Значение переменной x с типом long равно " + x);
        float y = 4.22F;
        System.out.println("Значение переменной y с типом float равно " + y);
        double z = 54.4200001;
        System.out.println("Значение переменной z с типом double равно " + z);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short x = -159;
        int y = 27897;
        byte z = 67;
        System.out.println(a + b + c + d + x + y + z); // чтобы убрать предупреждение о неиспользовании переменных

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte pupilsP = 23;
        byte pupilsS = 27;
        byte pupilsA = 30;
        short paperSheets = 480;
        byte totalPupils = (byte) (pupilsA + pupilsP + pupilsS);
        byte sheetsPerPupil = (byte) (paperSheets / totalPupils);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte productionCycleDuration = 2;
        byte bottlesPerCycle = 16;
        byte operationalTimeA = 20;
        short operationalTimeB = 24 * 60;
        short operationalTimeC = 24 * 3 * 60;
        int operationalTimeD = 24 * 31 * 60;
        long bottlesProducedA = operationalTimeA / productionCycleDuration * bottlesPerCycle;
        long bottlesProducedB = operationalTimeB / productionCycleDuration * bottlesPerCycle;
        long bottlesProducedC = operationalTimeC / productionCycleDuration * bottlesPerCycle;
        long bottlesProducedD = operationalTimeD / productionCycleDuration * bottlesPerCycle;
        System.out.println("За 20 минут машина произвела " + bottlesProducedA + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesProducedB + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesProducedC + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesProducedD + " штук бутылок");

    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte paintCansNeeded = 120;
        byte brownPaintPerClassroom = 4;
        byte whitePaintPerClassroom = 2;
        int totalPaintPerClassroom = brownPaintPerClassroom + whitePaintPerClassroom;
        int classroomsAmount = paintCansNeeded / totalPaintPerClassroom;
        int totalBrownPaintNeeded = classroomsAmount * brownPaintPerClassroom;
        int totalWhitePaintNeeded = classroomsAmount * whitePaintPerClassroom;
        System.out.println("В школе, где " + classroomsAmount + " классов, нужно " + totalWhitePaintNeeded + " банок " +
                "белой краски и " + totalBrownPaintNeeded + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        byte bananasNeeded = 5;
        byte milkNeeded = 2;
        byte iceCreamNeeded = 2;
        byte eggsNeeded = 5;
        int totalWeightG = bananaWeight * bananasNeeded + milkWeight * milkNeeded + iceCreamWeight * iceCreamNeeded + eggWeight * eggsNeeded;
        float totalWeightKg = totalWeightG / 1000F;
        System.out.println("Вес спортзавтрака сотавил " + totalWeightG + " г, или " + totalWeightKg + " кг");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte weightTarget = 7;
        float slowWeightLossPerDay = 250F / 1000;
        float fastWeightLossPerDay = 500F / 1000;
        int dietingDaysSlow = (int) (weightTarget / slowWeightLossPerDay);
        System.out.println("Если спортсмен будет терять " + slowWeightLossPerDay + " г в день, то диета займет " + dietingDaysSlow + " дней");
        int dietingDaysFast = (int) (weightTarget / fastWeightLossPerDay);
        System.out.println("Если спортсмен будет терять " + fastWeightLossPerDay + " г в день, то диета займет " + dietingDaysFast + " дней");
        int averageWeightLossPerDay = (dietingDaysFast + dietingDaysSlow) / 2;
        System.out.println(averageWeightLossPerDay + " день может потребоваться в среднем, чтобы достичь результатов похудения");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float salaryIndexation = 1.1F;
        float indexedSalaryM = salaryM * salaryIndexation;
        float indexedSalaryD = salaryD * salaryIndexation;
        float indexedSalaryK = salaryK * salaryIndexation;
        int mAnnualIncomeBeforeIndexation = salaryM * 12;
        int dAnnualIncomeBeforeIndexation = salaryD * 12;
        int kAnnualIncomeBeforeIndexation = salaryK * 12;
        float mAnnualIncomeAfterIndexation = indexedSalaryM * 12;
        float dAnnualIncomeAfterIndexation = indexedSalaryD * 12;
        float kAnnualIncomeAfterIndexation = indexedSalaryK * 12;
        float mAnnualIncomeDiff = mAnnualIncomeAfterIndexation - mAnnualIncomeBeforeIndexation;
        float dAnnualIncomeDiff = dAnnualIncomeAfterIndexation - dAnnualIncomeBeforeIndexation;
        float kAnnualIncomeDiff = kAnnualIncomeAfterIndexation - kAnnualIncomeBeforeIndexation;
        System.out.println("Маша теперь получает " + indexedSalaryM + " рублей в месяц, её годовой доход вырос на " + mAnnualIncomeDiff + " рублей");
        System.out.println("Денис теперь получает " + indexedSalaryD + " рублей в месяц, его годовой доход вырос на " + dAnnualIncomeDiff + " рублей");
        System.out.println("Кристина теперь получает " + indexedSalaryK + " рублей в месяц, её годовой доход вырос на " + kAnnualIncomeDiff + " рублей");

    }

}