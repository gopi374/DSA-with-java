class Car {
    String Name;
    String Type;
    int speed;
    private int year;
    int milage;

    public void start(){
        System.out.println("start, Lets Goo!");
    }
    public void accelerate(int increament){
        speed += increament;
    }
    public void Stop(){
        System.out.println("Engine stops");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.Name="BMW M4";
        car.speed=40;
        car.Type="EV";
        car.year=2026;
        car.milage=12;
        car.year=2021;
        car.accelerate(2);
        System.out.println(car.Name);
        System.out.println(car.accelerate(2));
    }

}

