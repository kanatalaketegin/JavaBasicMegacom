package encapsulation;

public class Guitar {
    private String color = "yellow";
    private String stringCount = "6";
    int[] tensions = new int[6];

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getStringCount() {
        return stringCount;
    }

    public void setStringCount(String stringCount) {
        this.stringCount = stringCount;
    }
    public void tune() {
        for (int i = 0; i < tensions.length; i ++) {
            tensions[i] = 5;
            System.out.println(tensions[i]);
        }
    }

    private void unsettle(int[] tensions) {
        this.tensions = tensions;
        for (int i = 0; i < this.tensions.length; i ++) {
            this.tensions[i] = (int) (Math.random() * 3);
            System.out.println(this.tensions[i]);
        }
    }
    public void play() {
        System.out.println("Бугун мен сени эстедим, сени эстедим");
        System.out.println("Жолуксам айтып берем себептерин");
        System.out.println("Жаштыгым кеткичекти, омурум откучокту");
        System.out.println("Бул сезим аба-суудай керек дедим");
        unsettle(tensions);

    }

}
