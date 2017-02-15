/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACSL2;
import java.util.ArrayList;
/**
 *
 * @author mdelmonaco
 */
public class AscendingStrings {
    public static String one(String num,String prev, boolean atStart){
        if(atStart){
            for(int i = 0;i<num.length();i++){
                if( Integer.parseInt(num.substring(0,i+1)) > Integer.parseInt(prev))
                    return num.substring(0,i+1);
            }
        }
        else{
            for(int i = num.length()-1;i>=0;i--){
                if( Integer.parseInt(num.substring(i,num.length())) > Integer.parseInt(prev))
                    return num.substring(i,num.length());
            }
        }
        return "duque";
    }
    public static int cutLength(String num,String prev, boolean atStart){
        if(atStart){
            for(int i = 0;i<num.length();i++){
                if( Integer.parseInt(num.substring(0,i+1)) > Integer.parseInt(prev))
                    return num.substring(0,i+1).length();
            }
        }
        else{
            for(int i = num.length()-1;i>=0;i--){
                if( Integer.parseInt(num.substring(i,num.length())) > Integer.parseInt(prev))
                    return num.substring(i,num.length()).length();
            }
        }
        return -1;
    }
    public static ArrayList<Integer> process(String num){
        ArrayList<Integer> nums = new ArrayList<>();
        boolean atStart = false;
        String prev = num.substring(0,1);
        nums.add(prev);
        num = num.substring(1);
        int len = 1;
        while(!prev.equals("duque") && len != -1 && cutLength(num,prev,atStart)!=-1 && !one(num,prev,atStart).equals("duque")){
            
            prev = one(num,prev,atStart);//change stuff, append, etc
            nums.add(prev);
            len = cutLength(num,prev,atStart);
            if(atStart){
                num = num.substring(len-1);
            }
            else{
                num = num.substring(0,num.length()-len+1);
            }
            atStart = !atStart;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        String num = "31415926538";//should have an arrayList later
        nums = process(num);
    }
}
