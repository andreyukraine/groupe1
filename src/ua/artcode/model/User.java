package ua.artcode.model;

/**
 * Created by serhii on 21.08.16.
 */
public class User {

    private long id;
    private String email;
    private String fullname;
    private String phone;

    private String pass;

    public User() {
    }

    public User(String email, String fullname,
                String phone, String pass) {
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
