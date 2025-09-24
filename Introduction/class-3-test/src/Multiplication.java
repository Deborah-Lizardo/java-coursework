public class Multiplication {
    private double num_1, num_2;

    public Multiplication(double num_1, double num_2){
        this.num_1= num_1;
        this.num_2= num_2;
    }

    public double getNum_1(){
        return this.num_1;
    }
    public void setNum_1(double num_1) {
        this.num_1 = num_1;
    }

    public double getNum_2(){
        return this.num_2;
    }
    public void setNum_2(double num_2){
        this.num_2 = num_2;
    }

    public double resolver(){
        return  num_1*num_2;
    }
}
