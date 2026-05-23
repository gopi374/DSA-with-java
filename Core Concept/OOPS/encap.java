class Student {

    //Encapsulation - bundling the data into an single unit.
    // -> making the data(fields/variable) private/controlled access
    // -> controlled by getter and setter methods

    // private variables (hidden data)
    private String name;
    private int password; //

    // setter method() 
    public void setName( String name) {
        this.name = name;
    }
    // this keyword refers to the current object of the class
    // it is used inside methods to access current object data

    // getter method()
    public String getName() {
        return name;
    }

    public void setpassword(int password) {
        this.password = password;
    }

    public int getpassword() {
        return password;
    }

}

class encap {
    public static void main(String[] args) {
        Student e = new Student();
        e.setpassword(124536);
        System.out.println(e.getpassword());
        e.setpassword(526341);
        System.out.println(e.getpassword());
    }
}