public class Main {
    public static void main(String[] args) {

        //task1
        byte age = 75;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он достиг совершеннолетия");
        }
        if (age < 18) {
            // Блок выполнится, так как возраст действительно меньше 18
            System.out.println("Нужно немного подождать");

        }
        // task2
        byte degreesTemp = 3;
        byte mountDegrees = 5;
        boolean aboveDegrees = degreesTemp > mountDegrees;
        boolean belowDegrees = degreesTemp <= mountDegrees; // тут я добавил <= тк 5 градусов у нас ушло из интервала

        if (aboveDegrees) {
            System.out.println("На улице "+ degreesTemp + " градусов, можно идти без шапки");

        }
        if (belowDegrees) {
            System.out.println("На улице " + degreesTemp + " градусов,  нужно надеть шапку");
        }

        //task3
        int speedTemp = 60;
        int limSpeed = 60;
        boolean aboveSpeed = speedTemp > limSpeed;
        boolean belowSpeed = speedTemp <= limSpeed;
        if (aboveSpeed){
            System.out.println("Если скорость " + speedTemp +" , то придется заплатить штраф");
        }
        if (belowSpeed){
            System.out.println("Если скорость " + speedTemp +" , можно ездить спокойно");
        }
        //task4

        //берем age из другого задания
        byte schoolАgeUp = 17;
        byte schoolАgeDwn = 7;
        byte nurserySchoolUp = 6;
        byte nurserySchoolDwn = 2;
        byte universityAgeUp = 24;
        byte universityAgeDwn = 18;

        boolean childLim = age >= nurserySchoolDwn && age <= nurserySchoolUp;
        boolean schAgeLim = age >= schoolАgeDwn && age <= schoolАgeUp;
        boolean univerAgelim = age >= universityAgeDwn && age <= universityAgeUp;
        boolean workAge = age > universityAgeUp;

        if (childLim){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в десткий сад");
        }
        if (schAgeLim){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (univerAgelim){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (workAge){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить работу");
        }
        //task5
        //Как правило, на аттракционах действуют ограничения для детей по возрасту:
        //
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».

        byte inAge = 75;
        boolean inMaintainer = true;
        boolean ageOfСonstr = inAge < 5;
        boolean ageWithMaintainer = inAge >= 5 && inAge < 14 && inMaintainer != false;
        boolean ageNoMaintainer = inAge >= 14;

        if (ageOfСonstr){
            System.out.println("Если возраст ребенка равен "+ inAge + " , то ему нельзя кататься на аттракционе");
        }
        if (ageWithMaintainer){
            System.out.println("Если возраст ребенка равен " + inAge +" , то ему можно кататься на аттракционе в сопровождения взрослого");
        }
        if (ageNoMaintainer){
            System.out.println("Если возраст ребенка равен " + inAge +" , то ему можно кататься на аттракционе без сопровождении взрослого");
        }

        //task6

        byte allNumOfSeats = 102;
        byte seatСapacity = 60;
        byte standPlaces = 42;
        byte seatInc = 30; // количество занятых мест сидячих
        byte standInc = 42;// количество занятых мест стоячих

        boolean availabOfSeats = seatСapacity - seatInc != 0;
        boolean availabOfStand = standPlaces - standInc != 0;
        boolean availabOf = seatInc + standInc < allNumOfSeats;

        if (availabOf || availabOfSeats || availabOfStand) {
            System.out.println("В вагоне имеются места сидячие или стоячие");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

        //task7



        int one = 0;
        int two = 1;
        int three = 2;

        boolean a1 = false, a2 = false;

        boolean a3 = a1 && a2;

        boolean bigOne = (one - two > 0) && (one - three > 0);
        boolean bigTwo = two - one > 0 && two - three> 0;
        boolean bigThree = three - one > 0 && three - two > 0;

        if((one - two > 0) && (one - three > 0)){
            System.out.println(true);
        }

        if (bigOne){
            System.out.println("Больше всех " + one);
        }
        if(bigTwo){
            System.out.println("Больше всех " + two);
        }
        if (bigThree){
            System.out.println("Больше всех " + three);
        }
        else {
            System.out.println("Все числа равны");
        }







    }
}
