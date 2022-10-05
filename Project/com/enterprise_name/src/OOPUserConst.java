package Project.com.enterprise_name.src;

import java.time.LocalDate;

public class OOPUserConst {
    private String name;
    private LocalDate birthDay;
    OOPUserConst(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String toString() {
        return this.name;
    }

    // getter
    public LocalDate getBirthday() {
        return this.birthDay;
    }
}
