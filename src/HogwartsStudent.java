abstract public class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    private int totalPower() {
        return magicPower + transgressionDistance;
    }

    public void compareHogwartsStudent(HogwartsStudent hogwartsStudent) {
        if (totalPower() > hogwartsStudent.totalPower()) {
            System.out.println("This имеет большую суммарную мощность.");
        } else if (totalPower() < hogwartsStudent.totalPower()) {
            System.out.println("This имеет меньшую суммарную мощность.");
        } else {
            System.out.println("Оба студента имеют одинаковую суммарную мощность.");
        }
    }
}
