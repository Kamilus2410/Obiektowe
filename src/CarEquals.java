public class CarEquals {

    private String company;
    private String model;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CarEquals car = (CarEquals) o;

        if (year != car.year) {
            return false;
        }
        if (company != null) {
            if (!company.equals(car.company)) {
                return false;
            }
        } else {
            if (car.company != null) {
                return false;
            }
        }
        if (model != null) {
            return model.equals(car.model);
        }
        return car.model == null;
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    public CarEquals(String company, String model, int year) {   //this. towrzy nowe zmienne w metodzie mimo zastosowania
                                                            // ich wczesniej w klasie
        this.company = company;
        this.model = model;
        this.year = year;
        System.out.println(company + " " + model + " " + year);

        //alt + insert

    }

    @Override
    public String toString() {
        return "CarEquals{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
