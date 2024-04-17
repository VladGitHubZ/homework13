//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HogwartsStudent harry = new Gryffindor("Гарри Поттер", 90, 85, 75, 70, 95, 60);
        HogwartsStudent hermione = new Gryffindor("Гермиона Грейнджер", 80, 95, 90, 80, 90, 70);
        HogwartsStudent ron = new Gryffindor("Рон Уизли", 85, 80, 70, 65, 80, 55);

        HogwartsStudent draco = new Slytherin("Драко Малфой", 80, 70, 85, 90, 80, 50);
        HogwartsStudent graham = new Slytherin("Грэхэм Монтегю", 75, 65, 80, 85, 75, 45);
        HogwartsStudent gregory = new Slytherin("Грегори Гойл", 70, 60, 75, 80, 70, 40);

        HogwartsStudent zacharias = new Hufflepuff("Захария Смит", 75, 80, 70, 75, 70, 60);
        HogwartsStudent cedric = new Hufflepuff("Седрик Диггори", 85, 90, 80, 85, 85, 70);
        HogwartsStudent justin = new Hufflepuff("Джастин Финч-Флетчли", 80, 85, 75, 80, 75, 65);

        HogwartsStudent cho = new Ravenclaw("Чжоу Чанг", 85, 90, 95, 85, 80, 70);
        HogwartsStudent padma = new Ravenclaw("Падма Патил", 80, 85, 90, 80, 75, 65);
        HogwartsStudent marcus = new Ravenclaw("Маркус Белби", 75, 80, 85, 75, 70, 60);


        harry.describeStudent();
        hermione.describeStudent();
        ron.describeStudent();
        draco.describeStudent();
        graham.describeStudent();
        gregory.describeStudent();
        zacharias.describeStudent();
        cedric.describeStudent();
        justin.describeStudent();
        cho.describeStudent();
        padma.describeStudent();
        marcus.describeStudent();
        System.out.println();

        harry.compareGryffindorStudents(harry, ron);
        draco.compareSlytherinStudents(draco,gregory);
        zacharias.compareHufflepuffStudents(zacharias,cedric);
        cho.compareRavenclawStudents(cho,marcus);
        System.out.println();

        harry.compareMagicAndTransgression(harry,hermione);
        draco.compareMagicAndTransgression(draco,graham);
    }
}