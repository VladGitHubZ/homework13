public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambitiousness;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambitiousness) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    private int totalPower() {
        return cunning + determination + ambitiousness;
    }

    public void compareHufflepuffStudent(SlytherinStudent slytherinStudent) {
        if (totalPower() > slytherinStudent.totalPower()) {
            System.out.println("This студент Slytherin имеет большую суммарную мощность.");
        } else if (totalPower() < slytherinStudent.totalPower()) {
            System.out.println("This студент Slytherin имеет меньшую суммарную мощность.");
        } else {
            System.out.println("Оба Slytherin студента имеют одинаковую суммарную мощность.");
        }
    }
}
