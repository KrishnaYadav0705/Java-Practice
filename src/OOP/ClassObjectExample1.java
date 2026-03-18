//esme nested class hai isliye samajhne me thodi dikkat ho sakti hai

package OOP;

public class ClassObjectExample1 {


        public static class student {
            String name;
            int rollNo;
            double marks;

            student(String name, int rollNo, double marks) {
                this.name = name;
                this.rollNo = rollNo;
                this.marks = marks;
            }

            public void display() {
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + rollNo);
                System.out.println("Marks: " + marks);
            }


        }
        public static void main(String[] args) {
            student s1 = new student("krishna",1,36);
            s1.display();


        }
    }

