
package com.mycompany.simulacion;

public class Confirmaciones {
    
    public boolean isnegative(String n){
        if (n.charAt(0) == '-') {
            return true;
        }else{
            return false;
        }
    }
    public boolean isNone(int n){
        if (!(n%2 == 0)) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isGreaterThan(int r1, int index){
        if (r1 > index) {
            return true;
        }else{
            return false;
        }
    }
    public int toRounded(float n){
        int numero = Math.round(n);
        return numero;
    }
}
