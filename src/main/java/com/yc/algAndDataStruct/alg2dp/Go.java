package com.yc.algAndDataStruct.alg2dp;

import java.util.Random;

public class Go {
    int  patition (int[] arr) {
        int len = arr.length;
        int l = 0;
        int r = len -1;
        int ran = new Random(len-1).nextInt();
        int solder = arr[ran];
        while (true) {
            while (l < r && (arr[l] < solder)) {
                 l++;
            }
            while (l < r && (arr[r] > solder)) {
                r--;
            }
            int tem = arr[l];
            arr[l] = arr[r];
            arr[r] = tem;
            if (l>= r) {
                arr[l] = solder;
                return l;
            }
        }
    }
}
