public class RavenclawStudent extends HogwartsStudent {
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    private int totalPower() {
        return wise + witty + creativity;
    }

    public void compareHufflepuffStudent(RavenclawStudent ravenclawStudent) {
        if (totalPower() > ravenclawStudent.totalPower()) {
            System.out.println("This студент Ravenclaw имеет большую суммарную мощность.");
        } else if (totalPower() < ravenclawStudent.totalPower()) {
            System.out.println("This студент Ravenclaw имеет меньшую суммарную мощность.");
        } else {
            System.out.println("Оба Ravenclaw студента имеют одинаковую суммарную мощность.");
        }
    }
}
