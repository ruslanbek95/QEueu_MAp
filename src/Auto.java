public class Auto {
    private int age;
    private String model;
    private int prise;
    private String color;

    public Auto(int age, String model, int prise, String color) {
        this.age = age;
        this.model = model;
        this.prise = prise;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "age=" + age +
                ", model='" + model + '\'' +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }
}
