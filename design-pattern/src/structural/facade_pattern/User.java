package structural.facade_pattern;

public class User {

    private String name;
    private String email;
    private Long number;

    User(String name, String email, Long number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public Long getNumber() {
        return this.number;
    }
    
}
