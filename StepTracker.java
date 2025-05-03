public class StepTracker{
    private int stepsMin = 0;
    private int activeD = 0;
    private int totalSteps = 0;
    private int days = 0; 
    public StepTracker(int s){
        stepsMin = s;
    }
    public int activeDays(){
        return(activeD);
    }

    public void addDailySteps(int steps){
        if(steps >= stepsMin) activeD++;
        totalSteps += steps;
        days++;
    }

    public double averageSteps(){
        double average = 0.0;
        if(days >0) average = (double) totalSteps/days;
        return average;
    }

    public static void main(String[] agrs){
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }

}