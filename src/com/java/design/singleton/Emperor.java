package com.java.design.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zihuatanejo on 16/8/10.
 */
public class Emperor {

    private static List<String> nameList = new ArrayList<>();

    private static List<Emperor> emperorList = new ArrayList<>();

    private static int maxNumOfEmperor = 2;

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("第" + (i + 1) + "个皇帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
