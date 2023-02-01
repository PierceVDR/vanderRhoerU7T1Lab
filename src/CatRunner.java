
import java.lang.reflect.Array;
import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("One");
        Cat cat2 = new Cat("Two");
        Cat cat3 = new Cat("Three");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);



        Cat cat4 = new Cat("Four");
        Cat replacedCat = cats.set(2,cat4);
        System.out.println(cats);
        System.out.println(replacedCat);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);

        System.out.println(cats);

        for(int i=0; i<cats.size(); i++) {
            Cat element = cats.get(i);
            element.setName(element.getName().toUpperCase());
        }

        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
