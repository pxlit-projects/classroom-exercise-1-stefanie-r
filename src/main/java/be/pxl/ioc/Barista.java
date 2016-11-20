package be.pxl.ioc;

import java.util.Objects;

class Barista {
    private final String name;
    private WorkEthic workEthic;

    Barista(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    WorkEthic getWorkEthic() {
        return workEthic;
    }

    public void setWorkEthic(WorkEthic workEthic) {
        this.workEthic = workEthic;
    }

    CustomerExperience serve(String customer) {
        return new CustomerExperience(customer, workEthic.customerHappiness(), this.name, workEthic.writesCorrectName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barista barista = (Barista) o;
        return Objects.equals(name, barista.name) &&
                Objects.equals(workEthic, barista.workEthic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workEthic);
    }

    @Override
    public String toString() {
        return "Barista{" +
                "name='" + name + '\'' +
                ", workEthic=" + workEthic +
                '}';
    }
}