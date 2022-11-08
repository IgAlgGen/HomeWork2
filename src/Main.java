public class Main {
        public static void main(String[] args) {
            System.out.println("Задание 1");
            var dog = 8.0; // double
            var cat = 3.6; // double
            var paper = 763789; // int
            System.out.println("dog = " + (int) dog + ", cat = " + cat + ", paper = " + paper); // dog outprint as int

            System.out.println("Задание 2");
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

            System.out.println("Задание 3");
            dog -= 3.5;
            cat -= 1.6;
            paper -= 7639;
            System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

            System.out.println("Задание 4");
            var friend = 19;
            System.out.println(friend);
            friend += 2;
            System.out.println(friend);
            friend /= 7;
            System.out.println(friend);

            System.out.println("Задание 5");
            var frog = 3.5;
            System.out.println(frog);
            frog *= 10;
            System.out.println(frog);
            frog /= 3.5;
            System.out.println(frog);
            frog += 4;
            System.out.println(frog);

            System.out.println("Задание 6");
            var firstBoxerWeight = 78.2;
            var secondBoxerWeight = 82.7;
            System.out.println("Вес первого боксера = " + firstBoxerWeight + "кг.");
            System.out.println("Вес второго боксера = " + secondBoxerWeight + "кг.");
            var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
            System.out.println("Суммарный вес бойцов = " + totalBoxersWeight + "кг.");
            var weightDifference = firstBoxerWeight - secondBoxerWeight;
            System.out.println("Разница в весе бойцов = " + weightDifference + "кг.");

            System.out.println("Задание 7");
            weightDifference = secondBoxerWeight - firstBoxerWeight;
            System.out.println("Разница в весе бойцов (вычитание из большего веса меньшего) = " + weightDifference + "кг.");
            weightDifference = secondBoxerWeight % firstBoxerWeight;
            System.out.println("Разница в весе бойцов (используя функцию остаток от деления) = " + weightDifference + "кг.");

            System.out.println("Задание 8");
            var tottalWorkingHours = 640;
            var workingHours = 8;
            var amountWorkers = tottalWorkingHours / workingHours;
            System.out.println("Всего работников компании - " + amountWorkers + " человек.");
            amountWorkers += 94;
            System.out.println("Если в компании работает " + amountWorkers +" человека, то всего " + (amountWorkers * workingHours) + " часа работы может быть поделено между сотрудниками.");
        }
    }