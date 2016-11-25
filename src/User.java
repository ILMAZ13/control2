/**
 * Created by ilmaz on 25.11.16.
 */
public class User {
    private String name;
    private String surName;
    private String number;
    private boolean bool;

    public User(String name, String surName, String number, boolean bool) {
        this.name = name;
        this.surName = surName;
        this.number = number;
        this.bool = bool;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getNumber() {
        return number;
    }

    public boolean isBool() {
        return bool;
    }
}
