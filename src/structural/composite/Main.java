package structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Halit","Kalaycı",1000);
        Employee headOfSoftware = new Employee("Irem","Balcı",500);
        Employee headOfSales = new Employee("Eren","Uygun",300);

        Employee softwareDeveloper1 = new Employee("Muhammet","Sağlam",200);
        Employee softwareDeveloper2  = new Employee("Aysu","Yiğit",200);

        CEO.add(headOfSoftware);
        CEO.add(headOfSales);

        headOfSoftware.add(softwareDeveloper1);
        headOfSoftware.add(softwareDeveloper2);

        System.out.println(CEO.toString());
        for(Employee heads: CEO.subordinates){
            System.out.println(heads.toString());
            for(Employee employee: heads.subordinates){
                System.out.println(employee.toString());
            }
        }
    }
}
