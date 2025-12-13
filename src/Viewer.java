public class Viewer {
    private String name;
    private int age;
    private boolean hasVIPMembership;
    private String phone;


    public Viewer(String name, int age, boolean hasVIPMembership, String phone) {
        this.name = name;
        this.age = age;
        this.hasVIPMembership = hasVIPMembership;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVIP() {
        return hasVIPMembership;
    }
    public String getPhone() {
        return phone;
    }

    public void displayInfo() {
        System.out.println("Зритель: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Номер телефона: "+ phone);
        System.out.println("VIP: " + (hasVIPMembership ? "Да" : "Нет"));
    }
}
