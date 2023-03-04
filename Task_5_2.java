import java.util.*;

public class Task_5_2 {
    public static void main(String[] args) {
        Map<String, Integer> staffDict = new HashMap<String, Integer>();
        ArrayList<String> staffList = new ArrayList<>();
        Map<Integer, String> direcStaff = new TreeMap<>(Collections.reverseOrder());
        Map<String, Integer> staffDictOrder = new LinkedHashMap<>();
        staffList.add("Иванов");
        staffList.add("Петров");
        staffList.add("Иванов");
        staffList.add("Петров");
        staffList.add("Сидоров");
        staffList.add("Иванов");

        for (String i: staffList) {
            if (staffDict.containsKey(i)){
                staffDict.put(i, staffDict.get(i)+1);
            }else{
                staffDict.put(i, 1);
            }
        }
        //System.out.println(staffDict);
        for (Map.Entry<String, Integer> item :
                staffDict.entrySet()) {
            direcStaff.put(item.getValue(), item.getKey());
        }
        //System.out.println(direcStaff);
        for (Map.Entry<Integer, String> item :
                direcStaff.entrySet()) {
            staffDictOrder.put(item.getValue(), item.getKey());
        }
        System.out.println(staffDictOrder);
    }
}
