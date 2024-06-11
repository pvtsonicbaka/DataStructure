package Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Gpa {
    Scanner sc = new Scanner(System.in);
    Vector<Students> s = new  Vector<>();
    public static void main(String[] args) {
        Gpa gp = new Gpa();
        gp.add();
        gp.add();
        
        gp.add();
        gp.add();
        gp.add();
        gp.sort();
        gp.display();
        System.out.println();
    }
    void display(){
        for(Students i:s){
            System.out.println(i);
        }
    }
    void sort(){
        Collections.sort(s,Comparator.comparing(Students::getGpa));
    }
    void add(){
        System.err.println("enter name");
        String name = sc.nextLine();
        
        System.out.println(name);
        System.err.println("enter id");
        int id  = sc.nextInt();
        System.out.println(id);
        
        System.err.println("enter Gpa ");
        double gpa = sc.nextDouble();
        sc.nextLine();
        System.out.println(gpa);
        Students sl = new Students(id, name, gpa);
        s.add(sl);
    }
}

/**
 *  Students
 */
 class  Students {
        int id;
        String name;
        double gpa;
        public Students(int id, String name, double gpa) {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }
        public int getId() {
            return id;
        }
        @Override
        public String toString() {
            return "Students [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    
}
