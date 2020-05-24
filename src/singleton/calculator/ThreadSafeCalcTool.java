package singleton.calculator;

public class ThreadSafeCalcTool {

    private static int totalBMICalculated = 0;
    private static int numberOfCalculations = 0;
    private static ThreadSafeCalcTool firstInstance = null;
    static boolean firstThread = true;

    public static ThreadSafeCalcTool getInstance(){
        if(firstInstance == null) {
            if(firstThread){
                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (ThreadSafeCalcTool.class) {
                if(firstInstance == null) {

                    firstInstance = new ThreadSafeCalcTool();
                }
            }
        }
        return firstInstance;
    }

    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
            if (measurementSystem == MeasurementSystem.ENGLISH) {
                bmi *= 703;
            }
            totalBMICalculated += bmi;
            numberOfCalculations++;

            return bmi;

    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }

}
