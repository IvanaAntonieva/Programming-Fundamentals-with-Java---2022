import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean win = false;
        while (!win) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i < inputData.length; i += 2) {
                String material = inputData[i + 1].toLowerCase();
                int quantity = Integer.parseInt(inputData[i]);


                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentsJunkQuantity = junk.get(material);
                        junk.put(material, currentsJunkQuantity + quantity);
                    }
                }
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    win = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    win = true;
                    break;
                } else if (items.get("motes") >= 250) {
                            System.out.println("Dragonwrath obtained!");
                            items.put("motes", items.get("motes") - 250);
                            win = true;
                            break;
                    }
                }
                if (win) {
                    break;
                }
            }
            items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
            junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }
    }
