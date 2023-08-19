import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,Auto> hashMap = new HashMap<>();
        hashMap.put(new Car(12,176,"Mersedes"),new Auto(12,"w210",7000,"blac"));
        hashMap.put(new Car(12,176,"Renault"),new Auto(12,"w210",7000,"blac"));
        hashMap.put(new Car(12,176,"Mazda"),new Auto(12,"w210",7000,"blac"));
        for (Map.Entry s: hashMap.entrySet()) {
            System.out.println(s.getKey()+" "+ s.getValue());

        }
    }
}

