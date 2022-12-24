package Home2;

import java.util.Objects;

public class Veterinarian extends Animal{

    public String name;


    public  Veterinarian(){

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Veterinarian that = (Veterinarian) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }

    public  void treatment (){
        System.out.println("Лечение животного. Лечить можно и кошек и собак");
    }
}
