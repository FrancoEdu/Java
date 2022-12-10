package secondExercise;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public String toString(){
        return name + ", $" + String.format("%.2f%",price)+ "," + quantity + " units, Total : $" + String.format("%.2f%",totalValueInStoc());
    }

    public double totalValueInStoc(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity = this.quantity + quantity;
    }

    public void removeProducts(int quantity){
        if (this.quantity < 0){
            System.out.println("Não conseguimos tirar esse produto, ele não existe!");
        }else
            this.quantity = this.quantity - quantity;
    }
}
