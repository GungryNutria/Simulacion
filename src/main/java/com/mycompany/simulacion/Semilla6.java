package com.mycompany.simulacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

public class Semilla6 {
int index=0;
int size;
float media;
float desviacion;
float [] xi;
String [] fi;
float [] zi;
float [] lista;
float [] alpha;
float [] omega;
float [] fullist1;
float [] fullist2;
float [] S;
float varianza;
float maxnumber;
Object[] content;
DecimalFormat df = new DecimalFormat("#0.00");
DecimalFormat df2 = new DecimalFormat("#.000");
char [] abc = {'A','B','C','D','E','F','G','H','I','J'};
    public void newSeed(float[] AC){
        this.size = AC.length;
        this.xi = setOrderNumbers(AC);
        setFi();
        this.media = getMiddle();
        System.out.println(media);
        this.desviacion = getDeviation();
        System.out.println(desviacion);
        setZi();
        setS();
        setAlpha();
        setOmega();
        getMaxNumber();
    }
    public float[] setOrderNumbers(float[] AC) {
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis();
        final int N = AC.length;
        float temp;
        int limInferior = 0;
        int limSuperior = N - 1;
        while (limInferior <= limSuperior) {
            for (int i = limInferior; i < limSuperior; i++) {
                if (AC[i] > AC[i + 1]) {
                    temp = AC[i];
                    AC[i] = AC[i + 1];
                    AC[i + 1] = temp;
                }
            }
            limSuperior--;
            for (int i = limSuperior; i > limInferior; i--) {
                if (AC[i] < AC[i - 1]) {
                    temp = AC[i];
                    AC[i] = AC[i - 1];
                    AC[i - 1] = temp;
                }
            }
            limInferior++;
        }
        return AC;

    }
    public void setFi(){
        fi = new String[size];
        for (int i = 0; i < fi.length; i++) {
            fi[i] = String.valueOf((float)(i+1)/size);
        }
    }
    public void setZi(){
        zi = new float[size];
        for (int i = 0; i < zi.length; i++) {
            zi[i] = Float.parseFloat(df2.format((xi[i]-media) / desviacion));
        }
    }
    public void setS(){
        S= new float[size];
        for (int i = 0; i < size; i++) {
            char indice;
         String numero = df.format((double)zi[i]);
            System.out.println("numero"+numero);
         indice = numero.charAt(numero.length()-1);
            System.out.println("indice "+indice);
         numero = numero.substring(0, numero.length()-1);
            System.out.println("nuevo numero"+numero);
         String columna = String.valueOf(abc[Integer.parseInt(String.valueOf(indice))]);
            System.out.println("Columna "+columna);
        String usr = "root";
        String pwd = "24060085";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/chi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);
            String sql = "";
            sql += "SELECT "+columna+" FROM normal WHERE Z IN ('"+numero+"')";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
               String muestra = rs.getString(columna);
               S[i] = Float.parseFloat(muestra);
                System.out.println(S[i]+" "+columna+" "+numero);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }   
        }
    }
    public void setAlpha(){
        alpha = new float[size];
        for (int i = 0; i < size; i++) {
            alpha[i]= Math.abs(Float.parseFloat(fi[i])-S[i]);
        }
    }
    public void setOmega(){
        omega = new float[size];
       omega[0] = S[0];
        for (int i = 1; i < size; i++) {
            omega[i] = Math.abs(Float.parseFloat(fi[i-1]) -S[i]);
        }
    }
    public float[] getOrderNumbers() {
        return xi;
    }
    public String[] getFi(){
        return fi;
    }
    public float[] getZi(){
        return zi;
    }
    public float[] getS(){
        return S;
    }
    public float[] getAlpha(){
        return alpha;
    }
    public float[] getOmega(){
        return omega;
    }
    public float getMiddle(){
        float media=0;
        for (int i = 0; i < size; i++) {
            media = media +xi[i];
        }
        media = media /size;
        return media;
    }
    public float getDeviation(){
        float Desviacion= 0;
        lista = new float[size];
        for (int i = 0; i < size; i++) {
            float rango;
            rango = (float) Math.pow((xi[i]-media), 2);
            varianza = varianza + rango;
        }
        varianza = varianza / size;
        desviacion = (float) Math.sqrt(varianza);
        return desviacion;
    }
    public float getMaxNumber(){
        fullist1 = setOrderNumbers(alpha);
        fullist2 = setOrderNumbers(omega);
        if (fullist1[size-1] > fullist2[size-1]) {
            return fullist1[size-1];
        }else{
            return fullist2[size-1];
        }
    }
}
