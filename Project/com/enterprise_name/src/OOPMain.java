package Project.com.enterprise_name.src;

import java.time.LocalDate;

public class OOPMain {
    public static void main(String[] args) {
        OOPUser youngUser = new OOPUser();
        youngUser.name = "Juan Perez";
        youngUser.birthDay = LocalDate.parse("1985-07-17");

        OOPUser oldUser = new OOPUser();
        oldUser.name = "Catalina Guta";
        oldUser.birthDay = LocalDate.parse("1972-05-03");

        System.out.println(youngUser.format());
        System.out.println(oldUser.format());

        OOPBook oneBook = new OOPBook("Guns, Germs and Steel", oldUser);
        oneBook.show();
        
        youngUser.borrowBook(oneBook);
        System.out.println("Borrowed books by " + youngUser.name);
        youngUser.borrowedBooks.forEach(book -> {
            System.out.println(book.toString());
        });

        OOPUserConst otherUser = new OOPUserConst("Marguerite Duras", "1992-05-06");
        System.out.println(otherUser.toString());
        // This does not compile, as the method is private
        // System.out.println(otherUser.name);

        OOPUser bram = new OOPUser();
        bram.name = "Bram Stoker";
        bram.birthDay= LocalDate.parse("1892-04-05");
        OOPAudioBook draculaAudio = new OOPAudioBook("Dracula", bram, 127);
        System.out.println(draculaAudio.toString());
    }

}
