
package tugas_mg_2;

class orang {

    private String Name;
    private int Age;

    public void set(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public int getAge() {
        return this.Age;
    }

    public String getName() {
        return this.Name;
    }
}   
public class Managingpeople {
     public static void main(String[] args) {

        orang p1 = new orang();
        p1.set(" Arial ", 37);

        orang p2 = new orang();
        p2.set(" Joseph ", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + "is the same age as" + p2.getName());
        } else {
            System.out.println(p1.getName() + "is NOT the same age as" + p2.getName());
        }

    }
    
}
