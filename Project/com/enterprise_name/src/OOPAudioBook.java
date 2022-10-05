package Project.com.enterprise_name.src;

public class OOPAudioBook extends OOPBook {
    private int runTime;

    OOPAudioBook(String title, OOPUser author, int runTime) {
        super(title, author);
        this.runTime = runTime;
    }

    public String toString() {
        return this.title + " with runtime " + this.runTime;
    }
}
