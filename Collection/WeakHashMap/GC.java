package Collection.WeakHashMap;

import java.lang.ref.WeakReference;

public class GC {
    static void main(String[] args) {
        Phone phone = new Phone("Oppo","2024");
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("opp","352"));
        System.out.println(phoneWeakReference.toString());
        System.gc();
        try{
            Thread.sleep(10000);
        }
        catch (Exception ignored){

        }
        System.out.println(phoneWeakReference.toString());

    }
}

class Phone{
    String name;
    String model;

    public Phone(String name,String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ",  model='" + model + '\'' +
                '}';
    }
}