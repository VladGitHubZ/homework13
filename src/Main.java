//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Harry Potter", 33, 55, 40, 60,40);
        GryffindorStudent hermione = new GryffindorStudent("Hermione Granger", 60, 95, 90, 85,78);
        GryffindorStudent ron = new GryffindorStudent("Ron Weasley", 50, 85, 99, 35,60);

        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias Smith", 44, 22, 50, 60, 10);
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric Diggory", 24, 12, 90, 40, 50);
        HufflepuffStudent justin = new HufflepuffStudent("Justin Finch-Fletchley", 55, 90, 30, 70, 20);

        SlytherinStudent draco = new SlytherinStudent("Draco Malfoy", 54, 89, 33, 76, 34);
        SlytherinStudent gregory = new SlytherinStudent("Gregory Goyle", 78, 34, 76, 89, 30);
        SlytherinStudent graham = new SlytherinStudent("Graham Montague", 33, 55, 77, 99, 30);

        RavenclawStudent cho = new RavenclawStudent("Cho Chang", 89, 98, 45, 54, 67);
        RavenclawStudent padma = new RavenclawStudent("Padma Patil", 23, 32, 45, 54, 77);
        RavenclawStudent marcus = new RavenclawStudent("Marcus Belby", 70, 30, 50, 66, 98);

        harry.compareHogwartsStudent(hermione);
        harry.compareGryffindorStudent(ron);

        cho.compareHogwartsStudent(draco);
    }
}