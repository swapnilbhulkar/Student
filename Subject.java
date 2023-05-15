package Student;

public class Subject {
    private int sub_id;
    private String sub_name;
    private double sub_fee;

    public Subject(int sub_id, String sub_name, double sub_fee) {
        this.sub_id = sub_id;
        this.sub_name = sub_name;
        this.sub_fee = sub_fee;
    }
    public int getSub_id() {
        return sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public double getSub_fee() {
        return sub_fee;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public void setSub_fee(double sub_fee) {
        this.sub_fee = sub_fee;
    }
}
