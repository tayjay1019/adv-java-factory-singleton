package factory.singleton.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorDriver {

    public static void main(String[] args) {
        List<Client> clientList = initClientList();

        for (Client client : clientList) {
            String weightUnits = client.getMeasurementSystem() == MeasurementSystem.METRIC ? "kilograms" : "pounds";
            String heightUnits = client.getMeasurementSystem() == MeasurementSystem.METRIC ? "meters" : "inches";

            double bmi = CalcTool.calcBMI(client.getHeight(), client.getWeight(), client.getMeasurementSystem());

            System.out.printf("%s weighs %.1f %s and is %.1f %s tall with a BMI of %.2f\n",
                    client.getName(),
                    client.getWeight(),
                    weightUnits,
                    client.getHeight(),
                    heightUnits,
                    bmi);
        }

        System.out.println("The average BMI calculated in this run is " + CalcTool.averageBMI());
    }

    private static List<Client> initClientList() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Alan", 195.5, 70, MeasurementSystem.ENGLISH));
        clients.add(new Client("Naveen", 84, 1.7, MeasurementSystem.METRIC));
        clients.add(new Client("Ayano", 135, 63, MeasurementSystem.ENGLISH));
        clients.add(new Client("Daniela", 141, 2.1, MeasurementSystem.METRIC));
        return clients;
    }
}
