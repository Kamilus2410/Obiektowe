import java.math.BigDecimal;

public class Concatenator {

    public String concatenate (String word1, String word2){
        String concater = word1 + word2;
        return concater;
    }

    public static void main(String[] args) {
        Concatenator dodawanieString = new Concatenator();
        String wyraz1 = "wyraz1 ";
        String wyraz2 = "wyraz2 ";
        System.out.println(dodawanieString.concatenate(wyraz1, wyraz2));

        Tuna tunczyk1 = new Tuna();
        Tuna tunczyk2 = new Tuna();
        Tuna tunczyk3 = new Tuna();
        tunczyk3.name = "Dorsz"; //jakby name był static to zmieni wszystkie
        tunczyk1 = tunczyk3;
        tunczyk3.age = 2;

        tunczyk1.swim();
        tunczyk2.swim();
        tunczyk3.swim();
        Decimal();
        System.out.println();

        carBEZMETODYEQUALS();
        System.out.println();
        carZEQUALS();
        System.out.println();
        carGet();
    }

    private static void carBEZMETODYEQUALS() {

        Car fiat1 = new Car("fiat", "bravo", 2008);
        Car fiat2 = new Car("fiat", "bravo", 2008);

        System.out.println(fiat1 == fiat2); // porownywanie pamieci a nie wartosci w klasach
        System.out.println(fiat1.equals(fiat2)); // brak euqlas zdefiniowanego w klasie spowodouje ze zachowa sie jak ==
        System.out.println(fiat1); //metoda nie jest zdeklarowana wiec drukuje adres pamieci

    }
    private static void carZEQUALS() {

        CarEquals fiat1 = new CarEquals("fiat", "bravo", 2008);
        CarEquals fiat2 = new CarEquals("fiat", "bravo", 2008);
        CarEquals fiat3 = new CarEquals("fiat", "bravo", 2009);

        System.out.println(fiat1 == fiat2); // porownywanie pamieci a nie wartosci w klasach
        System.out.println(fiat1.equals(fiat2)); // zdefiniowany equals w klasie i jest ok
        System.out.println("hash1: " + fiat1.hashCode());
        System.out.println("hash2: " + fiat2.hashCode());
        System.out.println("hash3: " + fiat3.hashCode()); // hascode to numer "grupy" do ktorej bylby przypisany obiekt
        //jak da mnie to wylicozny z zawartosci identyfikator

        System.out.println(fiat1.toString()); //wywołanie stworzonej metody toString
        System.out.println(fiat1); //albo tak

    }


    private static void Decimal() {
        System.out.println("0,1 + 0,2 == 0,3 " + (0.1 + 0.2 == 0.3) );
        System.out.println("0,1 + 0,2 - 0,3 powinno byc 0 ale jest " + Math.abs(0.1 + 0.2 - 0.3) );

        BigDecimal bd3 = new BigDecimal("0.3");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal bd1 = new BigDecimal("0.1");
        System.out.println(bd3 == bd1.add(bd2)); // i tu znowu nie porownujemy wartosci a pamiec gdzie jest klasa
        System.out.println(bd3.equals(bd1.add(bd2))); // tu juz ok
        System.out.println(bd3.equals(null));
    }

    private static void carGet() {
        CarGet fiat1 = new CarGet("fiat", "bravo", 2008);
        CarGet fiat2 = new CarGet("fiat", "bravo", 2009);

        System.out.println(fiat1.getCompany());
        System.out.println(fiat1.getModel());
        System.out.println(fiat1.getYear());
        System.out.println(fiat1.getTablica().length);
        fiat1.setYear(2014);
        System.out.println(fiat1.getYear());
        fiat1.setCompany(null);



    }
}
