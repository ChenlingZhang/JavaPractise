package Day09.HomeWork.Practice2;

public class Duck extends Poultry{
    public Duck(){}
    public Duck(String name, String symptom, int age, String illness){
        super(name,symptom,age,illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为：" + getSymptom());
    }

}
