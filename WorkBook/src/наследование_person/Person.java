package наследование_person;


/** final class
 * запрет наследования класса
 */
public class Person { // public final class Person {
    private String name;
    public String getName(){ return name; }

    public Person(String name){

        this.name=name;
    }

    /** final void
     * запрет переопределения метода
     */
    public void display(){ // public final void display(){
        System.out.println("Имя: " + name);
    }
}
