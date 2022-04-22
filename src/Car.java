public class Car {

    private String company1;
    private String model;
    private int year;

    public Car (String company1, String model, int year) {   //this. towrzy nowe zmienne w metodzie mimo zastosowania
                                                            // ich wczesniej w klasie
        this.company1 = company1;
        this.model = model;
        this.year = year;
        System.out.println(company1 + " " + model + " " + year);

    }
}