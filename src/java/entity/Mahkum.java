package entity;

public class Mahkum {
    
    private  int mahkum_id;
    private String firstName;
    private String lastName;
    private String inFor;
    //private Date arrivedAt; No idea how to get this to database

    public Mahkum() {
    }

    public int getMahkum_id() {
        return mahkum_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInFor() {
        return inFor;
    }

    public void setInFor(String inFor) {
        this.inFor = inFor;
    }

    @Override
    public String toString() {
        return "Mahkum{" + "mahkum_id=" + mahkum_id + ", firstName=" + firstName + ", lastName=" + lastName + ", inFor=" + inFor + '}';
    }  
}
