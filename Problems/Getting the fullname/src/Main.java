class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (!firstName.equals("") && !lastName.equals("")) {
            return firstName + " " + lastName;
        } else if (!firstName.equals("")) {
            return firstName;
        } else if (!lastName.equals("")) {
            return lastName;
        }
        return "Unknown";
    }
}