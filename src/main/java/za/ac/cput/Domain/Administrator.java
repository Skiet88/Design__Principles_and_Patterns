package za.ac.cput.Domain;

public class Administrator {

    private String empNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private Contact contact;

    private Administrator() {

    }
    private Administrator(AdministratorBuilder builder){
        this.empNumber = builder.empNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.contact = builder.contact;

    }

    public String getEmpNumber() {
        return empNumber;
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
        return "Administrator{" +
                "empNumber='" + empNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", contact=" + contact +
                '}';
    }

    public static class AdministratorBuilder{
        private String empNumber;
        private String firstName;
        private String lastName;
        private String gender;
        private Contact contact;

        public AdministratorBuilder copy(Administrator e) {
            this.empNumber = e.empNumber;
            this.firstName = e.firstName;
            this.lastName = e.lastName;
            this.gender = e.gender;
            this.contact = e.contact;

            return this;
        }


        public AdministratorBuilder  setEmpNumber(String empNumber) {
            this.empNumber = empNumber;

            return  this;
        }

        public AdministratorBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return  this;
        }

        public AdministratorBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return  this;
        }

        public AdministratorBuilder setGender(String gender) {
            this.gender = gender;
            return  this;
        }

        public AdministratorBuilder setContact(Contact contact) {
            this.contact = contact;
            return  this;
        }

        public Administrator build(){
            return new Administrator(this);

        }
    }
}
