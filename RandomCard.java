/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem56;

/**
 *
 * @author Asus
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class RandomCard {
    static int rand;
    public static int randodo(int min, int max){
        if (min>=max)
        {
            throw new IllegalArgumentException("Max must be greater than min");
        }
        Random r=new Random();
        return r.nextInt ((max - min) + 1) + min;
    }
    

public void main1(){
    rand=randodo(5,14);
}
}