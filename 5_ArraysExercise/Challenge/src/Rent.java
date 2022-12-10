public class Rent {
    private String name;
    private String email;

    public Rent(String name, String Email){
        this.name = name;
        this.email = Email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return (name+ "," + email);
    }
}
