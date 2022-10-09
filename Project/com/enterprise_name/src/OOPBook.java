package Project.com.enterprise_name.src;

public class OOPBook {
    // 'protected' allows them to be accesed from sibling classes and classes inheriting this one.
    protected String title;
    protected OOPUser author;

    OOPBook(String title, OOPUser author) {
        this.title = title;
        this.author = author;
    }

    public void show() {
        String printData = "This beautiful book is called " + this.title;
        System.out.println(printData);
    }
    public String toString() {
        String result = this.title + " by " + this.author.toString();
        return result;
    }
}
