package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задание №1
        byte lesson = 3;
        System.out.println(lesson);
        short homework = 151;
        System.out.println(homework);
        int priceIphone = 54999;
        System.out.println(priceIphone);
        long costCar = 350000L;
        System.out.println(costCar);
        float averageTemperature = -3.4f;
        System.out.println(averageTemperature);
        double averageScore = 1.3;
        System.out.println(averageScore);
        int age = 33;
        boolean isAdult = age >= 18;
        System.out.println(isAdult);
        char a = 42;
        char b = '*';
        System.out.println(a + "=" + b);


        //Задание №2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        float weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе двух бойцов " + weightDifference + " кг");

        //Задание №3
        int bananas = 5;
        bananas = bananas * 80;
        double milk = 200f;
        milk = milk * 1.05;
        int iceCream = 2;
        iceCream = iceCream * 100;
        int eggs = 4;
        eggs = eggs * 70;
        double weightProducts = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес спорт-завтрака " + weightProducts + " грамм");
        double weightProductsInKg = weightProducts / 1000;
        System.out.println("Общий вес спорт-завтрака составляет " + weightProductsInKg + " кг");

        //Задание №4
        int excessWeight = 7;
        excessWeight = excessWeight * 1000;
        int minWeightLoss = 250;
        int maxWeightLoss = 500;
        int maxDaysWeightLoss = excessWeight / minWeightLoss;
        System.out.println("Максимальное количество дней для похудения на 7 кг - " + maxDaysWeightLoss + " дней");
        int minDaysWeightLoss = excessWeight / maxWeightLoss;
        System.out.println("Минимальное количество дней для похудения на 7 кг - " + minDaysWeightLoss + " дней");
        int averageNumberDays = (maxDaysWeightLoss + minDaysWeightLoss) / 2;
        System.out.println("Среднее количество дней для похудения на 7 кг - " + averageNumberDays + " день");

        //Задание №5
        int salaryMashaBeforeTheIncrease = 67760;
        float salaryMashaAfterTheIncrease = salaryMashaBeforeTheIncrease * 1.1f;
        float incomeDifferenceMasha = (salaryMashaAfterTheIncrease * 12) - (salaryMashaBeforeTheIncrease * 12);
        System.out.println("Маша теперь получает " + salaryMashaAfterTheIncrease + " рублей." + " Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        int salaryDenisBeforeTheIncrease = 83690;
        float salaryDenisAfterTheIncrease = salaryDenisBeforeTheIncrease * 1.1f;
        float incomeDifferenceDenis = (salaryDenisAfterTheIncrease * 12) - (salaryDenisBeforeTheIncrease * 12);
        System.out.println("Денис теперь получает " + salaryDenisAfterTheIncrease + " рублей." + " Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        int salaryKristinaBeforeTheIncrease = 76230;
        float salaryKristinaAfterTheIncrease = salaryKristinaBeforeTheIncrease * 1.1f;
        float incomeDifferenceKristina = (salaryKristinaAfterTheIncrease * 12) - (salaryKristinaBeforeTheIncrease * 12);
        System.out.println("Кристина теперь получает " + salaryKristinaAfterTheIncrease + " рублей." + " Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");


    }
}
