//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog+4;
        cat = cat+4;
        paper = paper+4;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var totalWeightBoxers = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeightBoxers);

        var diffWeightBoxers = firstBoxerWeight - secondBoxerWeight;
        System.out.println(diffWeightBoxers);

        var remainsBetweenTwoWeight = secondBoxerWeight%firstBoxerWeight;
        System.out.println(remainsBetweenTwoWeight);

        var workHours = 640;
        var countEmployees = 640/8;
        System.out.println("Всего работников в компании - "+countEmployees);
        var incCountEmployees = countEmployees+94;
        var incWorkHour = incCountEmployees*8;
        System.out.println("Если в компании работает " +incCountEmployees+" человек, то всего "+incWorkHour+" часов работы может быть поделено между сотрудниками");

    }
}