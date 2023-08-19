package animals;



public abstract class Animal {
    private String name = "";
    private int age = 0;

    private int weight = 0;
    private String color = "";

    public String getName() {


        return name;
    }

    public int getAge() {
        return age;
    }


    public int getWeight() {
        return weight;

    }


    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;


    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут " + getName() + ", мне " + getAge() + " " + getCase() + ", мой вес " + getWeight()
                + " кг,  мой цвет " + getColor());
    }

    private String getCase() {
        int ostatok = getAge() % 10;

        if (ostatok >= 5 || getAge() >= 11 && getAge() <= 14) {
            return "лет";
        }

        if (ostatok == 1) {
            return "год";
        }
        if (ostatok >= 2) {
            return "года";
        }

        return "лет";
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void eat() {
        System.out.println("Я ем");

    }

    public void drink() {
        System.out.println("Я пью");
    }

    public static Integer convertAge(String str) {
        try {

            Integer age = Integer.parseInt(str);
            if (age < 0 || age > 100) {
                return null;
            }
            return age;

        } catch (NumberFormatException ignore) {
            return null;
        }
    }

    public static Integer convertWeight(String str) {
        try {
            Integer weight = Integer.parseInt(str);
            if (weight < 0 || weight > 200) {
                return null;
            }
            return weight;

        } catch (NumberFormatException ignore) {
            return null;
        }
    }
}






