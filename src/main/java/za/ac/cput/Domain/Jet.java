package za.ac.cput.Domain;

public class Jet {
    private String regNumber;
    private String model;
    private int  capacity;

    private Jet(JetBuilder jetBuilder) {
        this.regNumber = jetBuilder.regNumber;
        this.model = jetBuilder.model;
        this.capacity = jetBuilder.capacity;
    }

    private String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public static class JetBuilder{
        private String regNumber;
        private String model;
        private int  capacity;
        public JetBuilder copy(Jet e) {
            this.regNumber = e.regNumber;
            this.model = e.model;
            this.capacity = e.capacity;
            return this;

        }

        public JetBuilder setRegNumber(String regNumber) {
            this.regNumber = regNumber;
            return  this;
        }

        public JetBuilder setModel(String model) {
            this.model = model;
            return  this;
        }

        public JetBuilder setCapacity(int capacity) {
            this.capacity = capacity;

            return  this;
        }

        public Jet build(){
            return  new Jet(this);
        }


    }

}
