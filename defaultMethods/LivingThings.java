package defaultMethods;

public class LivingThings implements Bird, Animal { //dimond problem

    @Override
    public void food() {
        Animal.super.food();
    }

    public static void main(String[] args) {
        LivingThings livingThings = new LivingThings();
        livingThings.food();
    }
}

interface Bird {
    default void food() {
        System.out.println("Bird food");
    }
}

interface Animal {
    default void food() {
        System.out.println("Animal food");
    }
}