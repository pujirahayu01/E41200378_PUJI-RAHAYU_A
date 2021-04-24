
package Tugas_1;


public class Show {
    public static void main(String[] args){
    Animal animal = new Animal();
    animal.makeNoise();
    Dog dog = new Dog();
    dog.makeNoise();
    Animal animaldog = new Dog();
    animaldog.makeNoise();
        if (animal instanceof Animal)// instanceof adalah key word java yang di gunakan untuk membandingkan suatu objek
                                    // apakah instansiasi dari suatu class atau tidak. 
                                    //Hasilnya akan true and false(like boolean)
            System.out.println("animal is Animal");
        if(dog instanceof Animal)
            System.out.println("dog is Animal");
        if(dog instanceof Animal)
            System.out.println("animaldog is Animal");
        if(animal instanceof Dog)
            System.out.println("animal is dog");
    }
}
