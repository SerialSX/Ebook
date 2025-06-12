import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.print("Digite a temperatura em Celsius: ");

        // Lê o valor digitado pelo usuário
        double celsius = entrada.nextDouble();
        double fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.printf("Resultado: "+celsius+"°C é igual a "+fahrenheit+"°F\n");

        entrada.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
