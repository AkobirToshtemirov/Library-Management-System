package library.model;

import java.util.UUID;

public class Patron {
    private String name;
    private String address;
    private String email;

    private final String uniqueID;

//    String uniqueID = UUID.randomUUID().toString();

    public Patron(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.uniqueID = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getUiqueID() {
        return uniqueID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setUiqueID(String uiqueID) {
//        this.uiqueID = uiqueID;
//    }


    @Override
    public String toString() {
        return "Patron{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", uniqueID='" + uniqueID + '\'' +
                '}';
    }
}
