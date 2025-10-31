/* public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}
class Pen{
        String color;
        int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
} */

/* public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
} */

/* public class OOPS{
    public static void main(String args[]) {
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Pradeep";
    myAcc.setPassword("abcdefgh");
    System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    public String username;
    private String password = "abcdefgh";
    
    public void setPassword(String pwd) {
        password = pwd;
    }
    String getPassword() {
        return this.password;
    }
} */

// Constructor
/* 
public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student(1223);
        Student s2 = new Student(s1);
        System.out.println(java.util.Arrays.toString(s2.marks));
    }
}
class Student{
    String name;
    int rollno;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Constructor has been called....");
    }
    Student(int password){
        marks = new int[3];
        int pwd = password;
    }

    //Deep Copy comstructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i = 0;i < marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }


    //Shallow constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    // }
} */

//Inheritance
/* 
public class OOPS{
    public static void main(String[] args) {
        Dog Dobby  = new Dog();
        Dobby.eats();
        Dobby.legs = 4;
        System.out.println(Dobby.legs);
    }
}
class Animal{
    String color;

    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
// class Fish extends Animal{
//     int fins;
//     void swim() {
//         System.out.println("Swims");
//     }
// }
class Mammal extends Animal{
    void Walk(){
        System.out.println("Walks");
    }
}
class Bird extends Animal{
    void Fly(){
        System.out.println("Flies");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swims");
    }
} */

//Polymorphism

//Compile Time(Static) Method Overloading
/* 
public class OOPS{
    public static void main(String args[]){
        Calculator Addition = new Calculator();
        System.out.println(Addition.sum(1,5));
        System.out.println(Addition.sum((float)1.5,(float)(1.5)));
        System.out.println(Addition.sum(1,4,3));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
} */

//Run Time(Dynamic) Method overriding
/* 
public class OOPS{
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats Meat");
    }   
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
} */

//Abstraction
/* public class OOPS{
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);
        Mustang MyHorse = new Mustang();
        // Animal => Horse => Mustang //
    }
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor Called");
    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changeColor(){
        color = "DarkBrown";
    }
    void walk(){
        System.out.println("Walks with four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
} */

//Interface 
public class OOPS{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,right,and diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,right by 1 Step");
    }
}