package Home2;

public class Cat extends Animal{
    private String name;

    public Cat (String ration, String color, int weight, String name){
        this.name = "Барсик";
    }

    public Cat() {

    }


    public void getVoice(){
        System.out.println("Мяу");
    }

    public void eat(){
        System.out.println("Корм");
    }

    public void sleep(){
        System.out.println("Сплю на диване");
    }


    public String getName() {
        return name;
    }

 
}
