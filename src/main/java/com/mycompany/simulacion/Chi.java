/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simulacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author edgar
 */
public class Chi {
    String error;
    String grados;
    String chi;
    public Chi(float error, int grados){
        this.error = String.valueOf(error);
        this.grados = String.valueOf(grados);
        searchChi();
    }
    public void searchChi(){
        String usr = "root";
        String pwd = "24060085";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/cuadrada?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usr, pwd);
            String sql = "";
            sql += "SELECT `"+error+"` FROM tabla WHERE VP IN ('"+grados+".0')";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                this.chi = rs.getString(error);
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
    public String getChi(){
        return chi;
    }
    
}
