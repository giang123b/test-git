import java.util.EnumMap;
import java.util.Map;

enum Homes {
    NHA_GIANG, NHA_lONG, NHA_VINH
}

public class TestEnumMap {
    private static Map<Homes, String> home;

    public static void main(String[] args) {
        createHomesEnumMap();
    }

    private static void createHomesEnumMap() {

    }
//        createCitiesEnumMap();
//
//        System.out.println("\nAll entries");
//        listEntries();
//
//        System.out.println("\nAll keys");
//        listKeys();
//
//        System.out.println("\nAll values");
//        listValues();
//
//        System.out.println("\nAdding duplicate key => Old key's value replaced");
//        cities.put(Cities.TOKYO, "China");
//        System.out.println(cities.get(Cities.TOKYO));
//
//        System.out.println("\nAdding null key");
//        try {
//            cities.put(null, "Country");
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
//        }
//
//        System.out.println("\nAdding null value => OK");
//        cities.put(Cities.TOKYO, null);
//        System.out.println(cities.get(Cities.TOKYO));
//    }
//
//    private static void createCitiesEnumMap() {
//        cities = new EnumMap<Cities, String>(Cities.class);
//
//        cities.put(Cities.HANOI, "Vietnam");
//        cities.put(Cities.HO_CHI_MINH, "Vietnam");
//        cities.put(Cities.THANH_HOA, "Vietnam");
//        cities.put(Cities.NGHE_AN, "Vietnam");
//        cities.put(Cities.HA_TINH, "Vietnam");
//        cities.put(Cities.TOKYO, "Japan");
//        cities.put(Cities.LOS_ANGELES, "USA");
//        cities.put(Cities.LONDON, "UK");
//        cities.put(Cities.NEW_YORK, "USA");
//    }
//
//    private static void listEntries() {
//        for (Cities city : cities.keySet()) {
//            System.out.printf("%s is a city in %s\n", city, cities.get(city));
//        }
//    }
//
//    private static void listKeys() {
//        for (Cities city : cities.keySet()) {
//            System.out.println(city);
//        }
//    }
//
//    private static void listValues() {
//        for (String country : cities.values()) {
//            System.out.println(country);
//        }
}
