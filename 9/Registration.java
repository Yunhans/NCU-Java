public class Registration {
    public static void main(String [] args){
        UnderGraduate u1 = new UnderGraduate("Mary", "MIS");
        u1.addCredits(21);
        u1.addCredits(15);
        u1.setHonor(true);
        System.out.println(u1.tuition());
    }
}

class UnderGraduate {
    private String name;
    private String major;
    private int credits = 0;
    private boolean honor = false;

    public UnderGraduate(String name, String major){
        setName(name);
        setMajor(major);
    }

    public int tuition(){
        return (honor==true)? 500*getCredits(): 1000*getCredits();
    }

    public void addCredits(int credits){
        this.credits += credits;
    }

    public int getCredits(){
        return credits;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public void setHonor(boolean honor){
        this.honor = honor;
    }
}

class Graduate {
    private String name;
    private String major;
    private int credits = 0;
    private String advisor;

    public Graduate(String name, String major, String advisor){
        setName(name);
        setMajor(major);
        setAdvisor(advisor);
    }

    public int tuition(){
        return 1500*getCredits();
    }

    public void addCredits(int credits){
        this.credits += credits;
    }

    public int getCredits(){
        return credits;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public void setAdvisor(String advisor){
        this.advisor = advisor;
    }

    public String getAdvisor(){
        return advisor;
    }
}