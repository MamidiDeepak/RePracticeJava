package aug15thCompleteOopsPractice.multiLevelInheritance.SingleInheritance;

public class Father {

    private String fatherName;
    private int fatherAge;

    public String getFatherName() {
        System.out.println("Father Name is "+fatherName);
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
        System.out.println("Father Name set as "+fatherName);
    }

    public int getFatherAge() {
        System.out.println("Father Age is "+fatherAge);
        return fatherAge;
    }

    public void setFatherAge(int fatherAge) {
        this.fatherAge = fatherAge;
        System.out.println("Father Age set as "+fatherAge);
    }
}