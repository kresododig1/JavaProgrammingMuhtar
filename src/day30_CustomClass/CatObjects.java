package day30_CustomClass;

public class CatObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setInfo("Vinko", "street cat", 4,
                'M', "small", "white");

        System.out.println(cat1);

        cat1.eat();
        cat1.cuddling();
        //System.out.println(cat1);

    }
}
