class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Ranbir extends Animal {
    @Override
    void makeSound() {
        System.out.println("Ranbir says: Papa! papa!");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: bow! bow!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}



public class Main2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myRanbir = new Ranbir();
        
        myRanbir.makeSound();
        myDog.makeSound();  
        myCat.makeSound();  

    }
}
