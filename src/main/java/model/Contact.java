package model;

public class Contact {

    private String name;
    private String email;
    private int phone;
    private String company;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
            this.email = email;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone( int phone) {
            this.phone = phone;
    }

    public String getCompany() {
        return this.company;
    }
    public void setCompany(String company) {
            this.company = company;
    }

    @Override
    public String toString() {
        return "\nName " + this.name.toUpperCase() +
                "\nPhone " + this.phone +
                 "\nEmail " + this.email.toLowerCase() +
                  "\nCompany " + this.company.toUpperCase();
    }

}