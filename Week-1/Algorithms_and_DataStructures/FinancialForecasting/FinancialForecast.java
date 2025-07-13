import java.util.*;

public class FinancialForecast {
    public static double forecast(double presentValue, double growthRate, int years) {
        if(years==0) return presentValue;
        return forecast(presentValue,growthRate,years-1)*(1+growthRate);
    }

    public static void main(String[] args) {
        double presentValue=10000.0;
        double growthRate=0.05;
        int years=5;
        double futureValue=forecast(presentValue,growthRate,years);
        System.out.printf("Forecasted value after %d years: ₹%.2f\n",years,futureValue);
    }
}
