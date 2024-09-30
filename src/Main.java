//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);


        //task5
        var frog = 3.5;

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //task6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var sumWeights = boxer1 + boxer2;
        System.out.println(sumWeights);

        var weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);

        //task7
        var remainder = boxer2 % boxer1;
        System.out.println(remainder);

        //task8
        var allWorkHours = 640;
        var hourPerWorker = 8;

        var workers = allWorkHours / hourPerWorker;

        System.out.println("Всего работников в компании — " + workers + " человек");

        //task9
        workers = workers + 94;

        allWorkHours = allWorkHours + (94 * hourPerWorker);

        System.out.println("Если в компании работает " + workers + " человека, то всего " + allWorkHours + " часов работы может быть поделено между сотрудниками");
    }
}