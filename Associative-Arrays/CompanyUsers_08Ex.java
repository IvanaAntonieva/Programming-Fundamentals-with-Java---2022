import java.util.*;

public class CompanyUsers_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split(" -> ");
            String company = inputData[0];
            String employeeID = inputData[1];

            if (!companyInfo.containsKey(company)) {
                List<String> employees = new ArrayList<>();
                employees.add(employeeID);
                companyInfo.put(company, employees);
                } else {
                List<String> employees = companyInfo.get(company);
                if (!employees.contains(employeeID)) {
                    employees.add(employeeID);
                }
            }
            input = scanner.nextLine();
        }
        companyInfo.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream().forEach(employeeID -> System.out.println("-- " + employeeID));
                });
    }
}
