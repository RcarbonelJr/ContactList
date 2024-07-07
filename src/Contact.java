public class Contact {

    // Instance Variables
    private String fName;
    private String lName;
    private String eMail;
    private String phone;

    // Constructor
    public Contact() {
        this.fName = "";
        this.lName = "";
        this.eMail = "";
        this.phone = "";
    }

    // Setters
    public void setFirstName(String name) {
        fName = name;
    }

    public void setLastName(String name) {
        lName = name;
    }

    public void setEmail(String email) {
        eMail = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getters
    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getEmail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    // Display
    public String displayContact() {
        String contactDisplay = """
                --------------------------------------------
                ---- Current Contact -----------------------
                --------------------------------------------
                """;
        contactDisplay += "Name:           " + getFirstName() + " " + getLastName() + "\n";
        contactDisplay += "E-mail Address: " + getEmail() + "\n";
        contactDisplay += "Phone Number:   " + getPhone() + "\n";
        return contactDisplay;
    }
}