package homework10;

public class homework6 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Boat());
        person.pr();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("一般情况下骑马");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("过河时划船");
    }
}
class Factory{

    public static Boat f1(Boat boat){
        return boat;
    }
    public static Horse f2(Horse horse){
        return horse;
    }
}
class Person{
    Vehicles vehicles1;
    private String name;

    public Person( String name,Vehicles vehicles1) {
        this.vehicles1 = vehicles1;
        this.name = name;
    }
    public void pr(){
        if (vehicles1 instanceof Boat){
            Boat b = (Boat) vehicles1;
            b.work();
        }else {
            Horse h = (Horse) vehicles1;
            h.work();
        }
    }
}