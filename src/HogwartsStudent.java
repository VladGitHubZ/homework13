class HogwartsStudent {
    private String name;
    private int bravery;
    private int loyalty;
    private int wit;
    private int cunning;

    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int bravery, int loyalty, int wit, int cunning, int magicPower, int transgressionDistance) {
        this.name = name;
        this.bravery = bravery;
        this.loyalty = loyalty;
        this.wit = wit;
        this.cunning = cunning;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void describeStudent() {
        System.out.println("Студент: " + name);
        System.out.println("Общие качества: Храбрость, Верность, Ум, Хитрость");
    }
    public void compareGryffindorStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPropertiesStudent1 = student1.bravery + student1.loyalty + student1.wit + student1.cunning + student1.transgressionDistance + student1.magicPower;
        int totalPropertiesStudent2 = student1.bravery + student2.loyalty + student2.wit + student2.cunning + student2.transgressionDistance + student2.magicPower;

        if (totalPropertiesStudent1 > totalPropertiesStudent2) {
            System.out.println(student1.name + " является лучшим студентом Гриффиндора.");
        } else if (totalPropertiesStudent1 < totalPropertiesStudent2) {
            System.out.println(student2.name + " является лучшим студентом Гриффиндора.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равными качествами Гриффиндора.");
        }
    }
    public void compareSlytherinStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPropertiesStudent1 = student1.bravery + student1.loyalty + student1.wit + student1.cunning + student1.transgressionDistance + student1.magicPower;
        int totalPropertiesStudent2 = student1.bravery + student2.loyalty + student2.wit + student2.cunning + student2.transgressionDistance + student2.magicPower;

        if (totalPropertiesStudent1 > totalPropertiesStudent2) {
            System.out.println(student1.name + " является лучшим студентом Слизерина.");
        } else if (totalPropertiesStudent1 < totalPropertiesStudent2) {
            System.out.println(student2.name + " является лучшим студентом Слизерина.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равными качествами Слизерина.");
        }
    }
    public void compareHufflepuffStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPropertiesStudent1 = student1.bravery + student1.loyalty + student1.wit + student1.cunning + student1.transgressionDistance + student1.magicPower;
        int totalPropertiesStudent2 = student1.bravery + student2.loyalty + student2.wit + student2.cunning + student2.transgressionDistance + student2.magicPower;

        if (totalPropertiesStudent1 > totalPropertiesStudent2) {
            System.out.println(student1.name + " является лучшим студентом Пуффендуя.");
        } else if (totalPropertiesStudent1 < totalPropertiesStudent2) {
            System.out.println(student2.name + " является лучшим студентом Пуффендуя.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равными качествами Пуффендуя.");
        }
    }
    public void compareRavenclawStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPropertiesStudent1 = student1.bravery + student1.loyalty + student1.wit + student1.cunning + student1.transgressionDistance + student1.magicPower;
        int totalPropertiesStudent2 = student1.bravery + student2.loyalty + student2.wit + student2.cunning + student2.transgressionDistance + student2.magicPower;

        if (totalPropertiesStudent1 > totalPropertiesStudent2) {
            System.out.println(student1.name + " является лучшим студентом Когтевранца.");
        } else if (totalPropertiesStudent1 < totalPropertiesStudent2) {
            System.out.println(student2.name + " является лучшим студентом Когтевранца.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равными качествами Пуффендуя.");
        }
    }

    public void compareStudents(HogwartsStudent student1, HogwartsStudent student2) {
        int totalPropertiesStudent1 = student1.bravery + student1.loyalty + student1.wit + student1.cunning + student1.magicPower+student1.transgressionDistance;
        int totalPropertiesStudent2 = student2.bravery + student2.loyalty + student2.wit + student2.cunning + student2.magicPower+student2.transgressionDistance;

        if (totalPropertiesStudent1 > totalPropertiesStudent2) {
            System.out.println(student1.name + " обладает большими качествами.");
        } else if (totalPropertiesStudent1 < totalPropertiesStudent2) {
            System.out.println(student2.name + " обладает большими качествами.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равными качествами.");
        }
    }

    public void compareMagicAndTransgression(HogwartsStudent student1, HogwartsStudent student2) {
        int totalMagicStudent1 = student1.magicPower + student1.transgressionDistance;
        int totalMagicStudent2 = student2.magicPower + student2.transgressionDistance;

        if (totalMagicStudent1 > totalMagicStudent2) {
            System.out.println(student1.name + " обладает более мощной магией и способностью к трансгрессии.");
        } else if (totalMagicStudent1 < totalMagicStudent2) {
            System.out.println(student2.name + " обладает более мощной магией и способностью к трансгрессии.");
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают равной магической силой и способностью к трансгрессии.");
        }
    }
}

class Gryffindor extends HogwartsStudent {
    public Gryffindor(String name, int bravery, int loyalty, int wit, int cunning, int magicPower, int transgressionDistance) {
        super(name, bravery, loyalty, wit, cunning, magicPower, transgressionDistance);
        System.out.println("Факультет Гриффиндор");
        System.out.println("Качества: Храбрость, Верность, Ум, Хитрость");
    }
}

class Hufflepuff extends HogwartsStudent {
    public Hufflepuff(String name, int bravery, int loyalty, int wit, int cunning, int magicPower, int transgressionDistance) {
        super(name, bravery, loyalty, wit, cunning, magicPower, transgressionDistance);
        System.out.println("Факультет Пуффендуй");
        System.out.println("Качества: Трудолюбие, Верность, Честность");
    }
}

class Ravenclaw extends HogwartsStudent {
    public Ravenclaw(String name, int bravery, int loyalty, int wit, int cunning, int magicPower, int transgressionDistance) {
        super(name, bravery, loyalty, wit, cunning, magicPower, transgressionDistance);
        System.out.println("Факультет Когтевран");
        System.out.println("Качества: Ум, Мудрость, Остроумие, Творчество");
    }
}

class Slytherin extends HogwartsStudent {
    public Slytherin(String name, int bravery, int loyalty, int wit, int cunning, int magicPower, int transgressionDistance) {
        super(name, bravery, loyalty, wit, cunning, magicPower, transgressionDistance);
        System.out.println("Факультет Слизерин");
        System.out.println("Качества: Хитрость, Решительность, Амбициозность, Находчивость");
    }
}
