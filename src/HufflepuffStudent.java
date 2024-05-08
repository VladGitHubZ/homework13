public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    private int totalPower() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuffStudent(HufflepuffStudent hufflepuffStudent) {
        if (totalPower() > hufflepuffStudent.totalPower()) {
            System.out.println("This студент Hufflepuff имеет большую суммарную мощность.");
        } else if (totalPower() < hufflepuffStudent.totalPower()) {
            System.out.println("This студент Hufflepuff имеет меньшую суммарную мощность.");
        } else {
            System.out.println("Оба Hufflepuff студента имеют одинаковую суммарную мощность.");
        }

    }
}
