public class Main {
    public static void main(String[] args) {

        //task1
        byte age = 75;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он достиг совершеннолетия");
        }
        else  {
            // Блок выполнится, так как возраст действительно меньше 18
            System.out.println("Нужно немного подождать");

        }
        // task2
        byte degreesTemp = 10;
        byte mountDegrees = 5;
        boolean aboveDegrees = degreesTemp > mountDegrees;


        if (aboveDegrees) {
            System.out.println("На улице "+ degreesTemp + " градусов, можно идти без шапки");

        }
        else  {
            System.out.println("На улице " + degreesTemp + " градусов,  нужно надеть шапку");
        }

        //task3
        int speedTemp = 61;
        int limSpeed = 60;
        boolean aboveSpeed = speedTemp > limSpeed;

        if (aboveSpeed){
            System.out.println("Если скорость " + speedTemp +" , то придется заплатить штраф");
        }
        else {
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
        byte incPeople = 101;

        if (incPeople >= 0 && incPeople <= seatСapacity) {
            System.out.println("В вагоне имеются места сидячие");
        }

        if (incPeople < allNumOfSeats) {
            System.out.println("В вагоне имеются места стоячие");
        }else {
            System.out.println("В вагоне нет свободных мест");
        }



        //task7

        int one = 0;
        int two = 1;
        int three = 2;

        boolean bigOne = (one - two > 0) && (one - three > 0);
        boolean bigTwo = two - one > 0 && two - three> 0;
        boolean bigThree = three - one > 0 && three - two > 0;



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
