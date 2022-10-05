package Project.com.enterprise_name.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class OOPUser {
    public String name;
    public LocalDate birthDay;
    public ArrayList<OOPBook> borrowedBooks = new ArrayList<OOPBook>();

    public String format() {
        String formatted = this.name + " was born in " + this.birthDay + " so they are " + this.age() + " years old.";
        return formatted;
    }

    public void borrowBook(OOPBook book) {
        this.borrowedBooks.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }

    public String toString() {
        return this.name;
    }
}
