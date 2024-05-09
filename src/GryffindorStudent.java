public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    private int totalPower() {
        return nobility + honor + courage;
    }

    public void compareGryffindorStudent(GryffindorStudent gryffindorStudent) {
        if (totalPower() > gryffindorStudent.totalPower()) {
            System.out.println("This студент Griffendor имеет большую суммарную мощность.");
        } else if (totalPower() < gryffindorStudent.totalPower()) {
            System.out.println("This студент Griffendor имеет меньшую суммарную мощность.");
        } else {
            System.out.println("Оба Griffindor студента имеют одинаковую суммарную мощность.");
        }
    }
}




