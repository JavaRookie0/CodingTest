package java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int m = 100;

        StageOne stageOne = new StageOne();
        List<String> stageOneList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            stageOneList.add(stageOne.output(i));
        }

        StageTwo stageTwo = new StageTwo();
        List<String> stageTwoList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            stageTwoList.add(stageTwo.output(i));
        }

        System.out.println("stageOne:"+stageOneList);
        System.out.println("stageTwo:"+stageTwoList);
    }
}
