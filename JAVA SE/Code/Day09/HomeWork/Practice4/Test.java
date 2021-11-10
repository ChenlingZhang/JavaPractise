package Day09.HomeWork.Practice4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SUV v1 = new SUV("Suv",4813.0,760000);
        SUV v2 = new SUV("Suv",4545.0,1888800.0);
        SUV v3 = new SUV("Suv",7000,2000000);
        ArrayList<SUV> suvArrayList = new ArrayList<>();
        suvArrayList.add(v1);
        suvArrayList.add(v2);
        suvArrayList.add(v3);
        for (SUV suv: suvArrayList) {
            int mark = SUV.carKindCheck(suv);
            if (mark == 2){
                suv.showInfo();
            }

        }

    }
}
