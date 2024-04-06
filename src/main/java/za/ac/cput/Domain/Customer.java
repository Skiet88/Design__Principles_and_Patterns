package za.ac.cput.Domain;

public class Customer {

    private String customerNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private Contact contact;

    private Customer() {

    }
    private Customer(CustomerBuilder builder){
        this.customerNumber = builder.customerNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.contact = builder.contact;

    }

    public String getcustomerNumber() {
        return customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", contact=" + contact +
                '}';
    }

    public static class CustomerBuilder{
        private String customerNumber;
        private String firstName;
        private String lastName;
        private String gender;
        private Contact contact;

        public CustomerBuilder copy(CustomerBuilder e) {
            this.customerNumber = e.customerNumber;
            this.firstName = e.firstName;
            this.lastName = e.lastName;
            this.gender = e.gender;
            this.contact = e.contact;

            return this;
        }

        public CustomerBuilder  setcustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;

            return  this;
        }

        public CustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return  this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return  this;
        }

        public CustomerBuilder setGender(String gender) {
            this.gender = gender;
            return  this;
        }

        public CustomerBuilder setContact(Contact contact) {
            this.contact = contact;
            return  this;
        }

        public Customer build(){
            return new Customer(this);

        }
    }
}
