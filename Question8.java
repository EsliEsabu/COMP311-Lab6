public class Question8 {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.speak();

        Cat myCat = new Cat();
        myCat.speak();

        // Even though "a" is declared as Animal, it holds a Cat
        // so Java runs the Cat's version of speak()
        Animal a = new Cat();
        a.speak();
    }
}

class Animal {
    // The normal/default sound
    public void speak() {
        System.out.println("Some generic animal sound");
    }
}

// Cat is a type of Animal
class Cat extends Animal {
    // This replaces Animal's speak() with a cat-specific one
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}