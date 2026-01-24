class student{
int id;
String name;
student(String n , int i){
    id = i;
    name = n;
}
void display(){
    System.out.println(id+" "+" "+name);
}
public static void main(String args[]){
    student s1 = new student("gopi", 101);
    s1.display();
}

}
