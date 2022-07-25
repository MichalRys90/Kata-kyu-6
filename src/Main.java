import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Decode.decode("1122305vvkhrrcsyfkvejxjfvafzwpsdqgp"));
    }

    class Decode {
        public static String decode(String r) {
            Map<String, Integer> map = new HashMap<>();
            map.put("a",0);
            map.put("b",1);
            map.put("c",2);
            map.put("d",3);
            map.put("e",4);
            map.put("f",5);
            map.put("g",6);
            map.put("h",7);
            map.put("i",8);
            map.put("j",9);
            map.put("k",10);
            map.put("l",11);
            map.put("m",12);
            map.put("n",13);
            map.put("o",14);
            map.put("p",15);
            map.put("q",16);
            map.put("r",17);
            map.put("s",18);
            map.put("t",19);
            map.put("u",20);
            map.put("v",21);
            map.put("w",22);
            map.put("x",23);
            map.put("y",24);
            map.put("z",25);
            List<Integer> list = new ArrayList<>();
            int n = Integer.parseInt(r.replaceAll("[\\D]", ""));
            String fin = r.replaceAll("\\d", "");
            String[] asd = fin.split("");
            String[] asd2 = new String[asd.length];
            int[] table = new int[asd.length];
            int[] table1 = new int[table.length];
            for (int i=0; i<asd.length; i++) {
                if (map.containsKey(asd[i])) {
                    table[i] = map.get(asd[i]);
                }
            }
            for (int j=0; j< asd.length; j++) {
                for (int i = 0; i < map.size(); i++) {
                    if (i * n % 26 == table[j]){
                        table1[j] = i;
                        list.add(i);
                    }
                }
            }
            for (Map.Entry<String, Integer> ma: map.entrySet()){
                for (int i = 0; i< table1.length; i++){
                    if(table1[i]==ma.getValue()) {
                        asd2[i] = ma.getKey();
                    }
                }
            }
            StringBuffer s = new StringBuffer();
            for(int i=0; i< asd2.length; i++) {
                s.append(asd2[i]);
            }
            if (table1.length== list.size()) {
                return s.toString();
            } else {
                return"Impossible to decode";
            }
        }
    }
}