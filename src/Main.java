public class Main {
    public static void main(String[] args) {
        //Task1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else  {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task2
        int temperature = 12;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else  {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Task3
        int speed = 78;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }

        //Task4
        int agePeople = 12;
        if (agePeople < 2) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему никуда не надо");
        } else if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить в детский сад");
        } else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить в школу");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + agePeople + " , то ему нужно ходить на работу");
        }

        //Task5
        int ageChild = 10;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя катаься на атракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно катаься в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно катаься на атракционе без сопровождения взрослого");
        }

        //Task6
        int personsCount = 68;
        int capacity = 102;
        int seatingPlace = 60;
        if (personsCount < 60) {
            System.out.println("В вагоне " + (seatingPlace - personsCount) + " сидячих мест и " + (capacity - seatingPlace) + " стоящих");
        } else if (personsCount >= 60 && personsCount < 102) {
            System.out.println("В вагоне " + (capacity-personsCount) + " стоячих мест");
        } else {
            System.out.println("Мест нет");
        }

        //Task7
        int one = 8;
        int two = 9;
        int three = 13;
        if (one == two && one == three) {
            System.out.println("Числа равны " + one);
        } else if (one >= two && one >= three) {
            System.out.println(one + " самое большое число");
        } else if (two >= one && two >= three) {
            System.out.println(two + " самое большое число");
        } else {
            System.out.println(three + " самое большое число");
        }
    }
}

