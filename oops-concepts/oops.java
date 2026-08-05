/* public class oops{

    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Orange";
        System.out.println(p1.color);

        p1.tip = 7;
        System.out.println(p1.tip);
    }


    
}

class Pen {
        String color;
        int tip;

        void setcolor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
            tip = newTip;
        }
    }


    */

// import oops.oops.Student;

/*
//how can use the constructors
public class oops{        
        public static void main(String args[]){
            Student s1 = new Student("RAJAT");
            System.out.println(s1.name);

            Student s2 = new Student(3);
            System.out.println(s2.rollNum);
        }
    }

    class Student{
            String name;
            int rollNum ;

            //this is the constructor
            Student(int roll){
                this.rollNum = roll;
            }
            // this is the constructor
            Student(String name){
                this.name = name;
            }
        }


*/


/*
public class oops {

    public static void main(String args[]) {
        Student s1 = new Student(2, "01 / 01 / 2000");
        System.out.println(s1.rollNum);

        Student s2 = new Student("Mohan", "B", "chatur");

        System.out.println(s2.name + " " + s2.sec + " " + s2.fatherName);

        Student s3 = new Student();
    }

}

class Student {

    String name;
    String sec;
    String fatherName;
    int rollNum;
    String dob;

    Student() {
        System.out.println("Parameterized Constructor");
    }

    Student(String name, String sec, String fatherName) {
        this.name = name;
        this.sec = sec;
        this.fatherName = fatherName;
    }

    Student(int rollNum, String dob) {
        this.rollNum = rollNum;
        this.dob = dob;
    }

}


 */
