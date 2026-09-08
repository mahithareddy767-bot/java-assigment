import java.util.*;
import java.io.*;
interface Library { void borrow(); }
abstract class Student implements Library {
    String name; int books=0;
    Student(String n){ name=n; }
    abstract void type();
    public void borrow(){ if(books<5) books++; }
    void show(){ System.out.println(name+" : "+books+" books"); }
}
class Regular extends Student {
    Regular(String n){ super(n); }
    void type(){ System.out.println("Regular"); }
}
class Premium extends Student {
    Premium(String n){ super(n); }
    void type(){ System.out.println("Premium"); }
}
public class LibrarySystem {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.print("Name: ");
        String n=s.nextLine();
        System.out.print("1.Regular 2.Premium: ");
        Student st=s.nextInt()==1 ? new Regular(n) : new Premium(n);
        st.type();
        st.borrow(); st.borrow();
        st.show();
        FileWriter f=new FileWriter("library.txt");
        f.write(n+" - "+st.books+" books");
        f.close();
    }
}
