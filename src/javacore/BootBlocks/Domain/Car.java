package javacore.BootBlocks.Domain;

public class Car {
    private String model;
    private int[] speeds;
    {
        speeds = new int[5];
        for (int i = 0; i < speeds.length ; i++) {
            speeds[i] = (i+1) * 10;
        }
    }

    public void showSpeeds(){
        for (int i = 0; i < speeds.length ; i++) {
            System.out.println(speeds[i]);
        }
        System.out.println("Model: " + model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
