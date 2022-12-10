package StaticMembers;

public class CurrencyConverter {
    public static double IOF = 1.06;

    public static double Converter(double priceOfDolar, double dollars){
        return priceOfDolar * dollars * IOF;
    }
}
