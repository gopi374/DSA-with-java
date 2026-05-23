class Student {
    private String name;
    private int password; //

    // seeting the data
    public void setName( String name) {
        this.name = name;
    }

    // accessing encapsulated data
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
    }
}