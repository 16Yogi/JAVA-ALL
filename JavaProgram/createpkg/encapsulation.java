package createpkg;

class Encapsulation {
    private long acc_no;
    private String acc_name;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static void main(String args[]) {
        Encapsulation obj = new Encapsulation();
        obj.setAcc_name("Ramu");
        obj.setAcc_no(454184981719L);
        obj.setAmount(50000F);

        System.out.println(obj.getAcc_name() + " " + obj.getAcc_no() + " " + obj.getAmount());
    }
}
