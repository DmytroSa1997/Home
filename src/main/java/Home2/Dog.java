package Home2;

public class Dog extends Animal{
    private String name;

    public Dog (String ration, String color, int weight, String name){
        this.name = "Борис";
    }

    public Dog() {

    }

    public void getVoice(){
        System.out.println("Гав");
    }

    public void eat(){
        System.out.println("Паштет");
    }

    public void sleep(){
        System.out.println("Сплю на коврике");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
