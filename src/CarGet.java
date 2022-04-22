public class CarGet {

    private String company;
    private String model;
    private int year;
    private int[] tablica;

    public CarGet(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public String getCompany() { //get pozwala odczytywac z pola private
        return this.company;
    }

    public String getModel() {
        return this.model == null ? "defualt" : this.model; //zabezpieczenie od nullpointerexception
    }

    public int getYear() {
        return this.year;
    }

    public int[] getTablica() {
        return this.tablica == null ? new int[0] : this.tablica; //zabezpieczenie od pustej tablicy
    }

    public void setCompany(String company) { //set pozwala zmieniac pola private
        if (company == null) //zabezpieczenie od wstawienia null
        {
            System.out.println("Marka nie może byc pusta");
            return;
        }
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTablica(int[] tablica) {
        this.tablica = tablica;
    }
}