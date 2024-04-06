package za.ac.cput.Domain;

public class Contact {
    private String phoneNumber;
    private String emailAddress;
    private String address;

    private Contact() {

    }

    private Contact(ContactBuilder builder) {
        this.phoneNumber = builder.phoneNumber;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public static class ContactBuilder {
        private String phoneNumber;
        private String emailAddress;
        private String address;

        public ContactBuilder copy(Contact e){
            this.phoneNumber = e.phoneNumber;
            this.emailAddress = e.emailAddress;
            this.address = e.address;
            return this;

        }
        public ContactBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ContactBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public ContactBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
