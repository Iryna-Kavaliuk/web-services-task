package model;

public class Company {

    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }
}
