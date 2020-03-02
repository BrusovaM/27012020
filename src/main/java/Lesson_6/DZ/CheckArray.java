package Lesson_6.DZ;

import java.util.Arrays;

public class CheckArray {

    public Integer[] checkN(Integer[] arr){
        int index = -1;
        if(arr==null) {
            throw new RuntimeException();
        }

        for(int i=0; i < arr.length; i ++){
            if(arr[i]==4){
                index = i;
            }
        }

        if(index==-1) {
            throw new RuntimeException();
        }

        return Arrays.copyOfRange(arr,index+1, arr.length);
    }
    public boolean check14(Integer[] arr) {
        if(arr==null) {
            return false;
        }

        for(int i=0; i < arr.length; i ++){
            if(arr[i]==1 || arr[i]==4){
                return true;
            }
        }

        return false;

    }

}
