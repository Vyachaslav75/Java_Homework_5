import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_5_1 {
    public static void main(String[] args) {
        // Map<String, ArrayList<Integer>> phonesBook = new HashMap<>();
        // ArrayList<Integer> phones = new ArrayList<>();
        Map<String, Phones> phonesBook = new HashMap<>();
        phonesBook.put("Иванов", new Phones(123456));
        phonesBook.get("Иванов").addPhone(456575674);
        phonesBook.put("Петров", new Phones(987654));
        phonesBook.get("Петров").addPhone(9374564);
        System.out.println(phonesBook);

    }
}

class Phones {
    private ArrayList<Integer> phone = new ArrayList<>();

    public Phones(Integer number) {
        phone.add(number);
    }

    public void addPhone(Integer number) {
        phone.add(number);
    }

    @Override
    public String toString() {
        String res = "";
        for (Integer i : phone) {
            res = res + String.format("%d", i) + "; ";
        }
        return res;
    }
}
