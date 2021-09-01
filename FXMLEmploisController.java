/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dgsescuela.Emplois;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import dgsescuela.DBConnection;
import static dgsescuela.LoginPackage.loginController.adminStage;
import static dgsescuela.LoginPackage.loginController.rootAccueil;
import static dgsescuela.LoginPackage.loginController.sceneAccueil;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hdegd
 */
public class FXMLEmploisController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private JFXTextField titreFormation;
    @FXML
    private JFXTextField DateF1;
    @FXML
    private JFXTextField DateF2;
    @FXML
    private JFXComboBox<String> semaine;
    @FXML
    private Label jrs1;
    @FXML
    private Label jrs2;
    @FXML
    private Label jrs3;
    @FXML
    private Label jrs4;
    @FXML
    private Label jrs5;
    @FXML
    private Label jrs6;
    @FXML
    private Label jrs7;
    @FXML
    private JFXTextField D1;
    @FXML
    private JFXTextField D2;
    @FXML
    private JFXTextField D6;
    @FXML
    private JFXTextField D5;
    @FXML
    private JFXTextField D4;
    @FXML
    private JFXTextField D3;
    @FXML
    private JFXTextField D7;
    @FXML
    private JFXTextField HD1;
    @FXML
    private JFXTextField HD2;
    @FXML
    private JFXTextField HD3;
    @FXML
    private JFXTextField HD4;
    @FXML
    private JFXTextField HD5;
    @FXML
    private JFXTextField HD6;
    @FXML
    private JFXTextField HD7;
    @FXML
    private JFXTextField HF1;
    @FXML
    private JFXTextField HF2;
    @FXML
    private JFXTextField HF3;
    @FXML
    private JFXTextField HF4;
    @FXML
    private JFXTextField HF5;
    @FXML
    private JFXTextField HF6;
    @FXML
    private JFXTextField HF7;
    Connection conn;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            conn= DBConnection.EtablirConnection();
            semaine.getItems().addAll("1","2","3","4","5");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FXMLEmploisController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    

/*------------------------------------------------Fenetre----------------------------------------*/
 String S =null;
        String v=null;
         String S2 =null;
        String v2=null;
        String S3=null;
        String S4=null;
        String S5=null;
        String S6=null;
          String S7 =null;
        String v7=null;
        String S8=null;
        String S9=null;
        String S10=null;
        String S11=null; 
        String S12=null;
        String S13=null;
        String S14=null;
        String S15=null;
        String S16=null;
        String S17=null;
        String S18=null;
        String S19=null;
        String S20=null;
        String S21=null; 
         String S22=null;   String S24=null;    String S211=null;
        String S212=null;
        String S213=null;
        String S214=null;   String S66=null;
        String S215=null; 
         String S216=null;   String S217=null;  String S218=null;   String S219=null;  String S220=null;   String S221=null;
         String S222=null;   String S223=null;  String S224=null;   String S226=null;  String S227=null;   String S228=null; String S225=null;
         String S256=null;   String S257=null;  String S258=null;   String S259=null;  String S260=null;   String S261=null; String S262=null; String S263=null;
         String v216=null;   String v217=null;  String v218=null;   String v219=null;  String v220=null;   String v221=null;
         String v222=null;   String v223=null;  String v224=null;   String v226=null;  String v227=null;   String v228=null; String v225=null;
         String v256=null;   String v257=null;  String v258=null;   String v259=null;  String v260=null;   String v261=null; String v262=null; String v263=null;
         String v66=null;
         String S25=null;   String S26=null;
        String S27=null;
        String S23=null;
       String v4=null;
        String v3=null;
        String v5=null;
        String v6=null; String S36=null; String v36=null;
        String v8=null;
        String v9=null;
        String v10=null;
        String v11=null;
         String v12=null;
         String v13=null;
         String v14=null;
         String v15=null;
         String v16=null;
         String v17=null;
         String v18=null;
         String v19=null;
         String v20=null;  String v21=null;  String v22=null;  String v23=null; String v24=null; String v25=null; String v26=null;
           String v211=null;    String v212=null;  String v213=null;  String v214=null;  String v215=null; String v255=null;
          
         
    @FXML
    void Formation() throws SQLException, ParseException{
       
       
     S = "SELECT DateDebut FROM `formation` where TitreFormation='"+titreFormation.getText()+"'" ;
                    pst = conn.prepareStatement(S);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v=rs.getString(1);
                     }
                    rs.close(); 
                    
                    DateF1.setText(v);
          S2 = "SELECT DateFin FROM `formation`where TitreFormation='"+titreFormation.getText()+"'" ;
                    pst = conn.prepareStatement(S2);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v2=rs.getString(1);
                     }
                    
                    rs.close(); 
         DateF2.setText(v2);
    
        
    }
    @FXML
    int Sceance() throws SQLException, ParseException{
         S3 = "SELECT IDFormation FROM `formation` where TitreFormation='"+titreFormation.getText()+"'" ;
                    pst = conn.prepareStatement(S3);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v3=rs.getString(1);
                     }
                     System.out.println("vv3vvv   "+v3);
                    rs.close(); 
                    int f= Integer.parseInt(semaine.getValue().toString());
                    if(f==0) System.out.println("vvvvvvvvviiiiiiiiiiiiiiiiiiidddddddddeeeeeee  ");
                    if(f==1){
                        Initialisation();
                     S4 = "SELECT IDSemaine FROM `semaine` where numero='1' and IDFormation='"+v3+"'" ;
                    pst = conn.prepareStatement(S4);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v4=rs.getString(1);
                     }
                      rs.close(); 
                     if(v4==null){
                         D1.setText(""); D2.setText(""); D3.setText(""); D4.setText(""); D5.setText(""); D6.setText(""); D7.setText("");
                         HD1.setText("");HD2.setText(""); HD3.setText(""); HD4.setText(""); HD5.setText(""); HD6.setText(""); HD7.setText("");
                         HF1.setText("");HF2.setText(""); HF3.setText(""); HF4.setText(""); HF5.setText(""); HF6.setText(""); HF7.setText("");

                     }
                     System.out.println("IDSemaine1   "+v4);
                   
                     S5 = "SELECT HeureDebut FROM `sceance` where jour= 'samedi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S5);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v5=rs.getString(1);
                     }
                     System.out.println("HeureDebutSamedi   "+v5);
                    rs.close(); 
                      if(v5==null) {HD1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD1.setText(v5);
                    
                     S6 = "SELECT HeureFin FROM `sceance` where jour= 'samedi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S6);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v6=rs.getString(1);
                     }
                     System.out.println("vv6vvv   "+v6);
                    rs.close(); 
                      if(v6==null) {HF1.setText(""); System.out.println("hEURESamedi Null");}
                    else HF1.setText(v6);
                    
                      S36 = "SELECT DateSceance FROM `sceance` where jour= 'samedi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S36);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v36=rs.getString(1);
                     }
                    if(v36==null) {D1.setText(""); System.out.println("DateSAMEDI Null");}
                    else D1.setText(v36);
                       
                
                    /*******************************/
                 
                    S66 = "SELECT HeureDebut FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S66);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v66=rs.getString(1);
                     }
                     System.out.println("HeureDebutDimanche   "+v66);
                    rs.close(); 
                    if(v66==null) {HD2.setText(""); System.out.println("hEUREDimanche Null");}
                    else HD2.setText(v66);
                    
                     S7 = "SELECT HeureFin FROM `sceance` where jour='dimanche' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S7);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v7=rs.getString(1);
                     }
                     System.out.println("HeureFinDimanche   "+v7);
                    rs.close(); 
                     if(v7==null) {HF2.setText(""); System.out.println("hEUREDimanche Null");}
                    else HF2.setText(v7);
                    
                     S20 = "SELECT DateSceance FROM `sceance` where jour='dimanche' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S20);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v20=rs.getString(1);
                     }
                     System.out.println("DateSDimanche   "+v20);
                    rs.close(); 
                     if(v20==null) {D2.setText(""); System.out.println("DateDimanche Null");}
                    else D2.setText(v20);
                    
                    
                    /***************************************/
                    
                    S9 = "SELECT HeureDebut FROM `sceance` where jour='lundi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S9);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v8=rs.getString(1);
                     }
                     System.out.println("HeureDebutLundi   "+v8);
                    rs.close(); 
                     if(v8==null) {HD3.setText(""); System.out.println("HHHHLundi Null");}
                    else HD3.setText(v8);
                   
                     S10 = "SELECT HeureFin FROM `sceance` where jour='lundi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S10);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v9=rs.getString(1);
                     }
                     System.out.println("HeureFinLundi   "+v9);
                    rs.close(); 
                     if(v9==null) {HF3.setText(""); System.out.println("hhhLUNDI Null");}
                    else HF3.setText(v9);
                  
                     S21 = "SELECT DateSceance FROM `sceance` where jour='lundi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S21);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v21=rs.getString(1);
                     }
                     System.out.println("DateSDLundi   "+v21);
                    rs.close();
                     if(v21==null) {D3.setText(""); System.out.println("Datelundi Null");}
                    else D3.setText(v21);
                    
                    /*********************/
                          
                       S11 = "SELECT HeureDebut FROM `sceance` where jour='mardi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S11);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v10=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v10);
                    rs.close(); 
                    if(v10==null) {HD4.setText(""); System.out.println("HHHMARDDII Null");}
                    else HD4.setText(v10);
                   
                     S12 = "SELECT HeureFin FROM `sceance` where jour= 'mardi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S12);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v11=rs.getString(1);
                     }
                     System.out.println("HeureFinMardi   "+v11);
                    rs.close(); 
                    if(v11==null) {HF4.setText(""); System.out.println("HHHMARDDII Null");}
                    else HF4.setText(v11);
                    
                     S22 = "SELECT DateSceance FROM `sceance` where jour= 'mardi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S22);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v22=rs.getString(1);
                     }
                     System.out.println("DateSMardi   "+v22);
                    rs.close(); 
                    if(v22==null) {D4.setText(""); System.out.println("dATEMARDDII Null");}
                    else D4.setText(v22);
                   
                    /*********************/
                    S13 = "SELECT HeureDebut FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S13);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v12=rs.getString(1);
                     }
                     System.out.println("HeureDebutMercredi  "+v12);
                    rs.close(); 
                    if(v12==null) {HD5.setText(""); System.out.println("HHHMERCREDI Null");}
                    else HD5.setText(v12);
                    
                     S14 = "SELECT HeureFin FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S14);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v13=rs.getString(1);
                     }
                     System.out.println("HeureFinMercredi   "+v13);
                    rs.close(); 
                    if(v13==null) {HF5.setText(""); System.out.println("HHHMERCREDI Null");}
                    else HF5.setText(v13);
                   
                     S23 = "SELECT DateSceance FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S23);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v23=rs.getString(1);
                     }
                     System.out.println("DateSMercredi   "+v23);
                    rs.close(); 
                    if(v23==null) {D5.setText(""); System.out.println("DateKKKKKSMercredi Null");}
                    else D5.setText(v23);
                    
                    /************/
                    S15 = "SELECT HeureDebut FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S15);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v14=rs.getString(1);
                     }
                     System.out.println("HeureDebutJeudi  "+v14);
                    rs.close(); 
                    if(v14==null) {HD6.setText(""); System.out.println("HHHHHSJEUDI Null");}
                    else HD6.setText(v14);
                    
                     S16 = "SELECT HeureFin FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S16);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v15=rs.getString(1);
                     }
                     System.out.println("HeureFinJeudi   "+v15);
                    rs.close(); 
                      if(v15==null) {HF6.setText(""); System.out.println("HHHSJEUDI Null");}
                    else HF6.setText(v15);
                    
                     S24 = "SELECT DateSceance FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S24);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v24=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v24);
                    rs.close(); 
                     if(v24==null) {D6.setText(""); System.out.println("DATEEEEJEUDI Null");}
                    else D6.setText(v24);

                    
                    /*********/
                    S17 = "SELECT HeureDebut FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S17);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v16=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v16);
                    rs.close(); 
                    if(v16==null) {HD7.setText(""); System.out.println("DHHHHHvENDREDI Null");}
                    else HD7.setText(v16);
                    
                     S18 = "SELECT HeureFin FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S18);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v17=rs.getString(1);
                     }
                     System.out.println("HeureFinVendredi   "+v17);
                    rs.close(); 
                     if(v17==null) {HF7.setText(""); System.out.println("DHHHHHvENDREDI Null");}
                    else  HF7.setText(v17);
                   
                     S25 = "SELECT DateSceance FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v4+"'" ;
                    pst = conn.prepareStatement(S25);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v26=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v26);
                    rs.close(); 
                    if(v26==null) {D7.setText(""); System.out.println("dATEvENDREDI Null");}
                    else     D7.setText(v26);
                    
                    } 
                    /*+++++++++++++++++++++++++++++*/
                     if(f==4){
                         Initialisation();
                     S211 = "SELECT IDSemaine FROM `semaine` where numero='4' and IDFormation='"+v3+"'" ;
                    pst = conn.prepareStatement(S211);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v211=rs.getString(1);
                     }
                     if(v211==null)
                        {
                         D1.setText(""); D2.setText(""); D3.setText(""); D4.setText(""); D5.setText(""); D6.setText(""); D7.setText("");
                         HD1.setText("");HD2.setText(""); HD3.setText(""); HD4.setText(""); HD5.setText(""); HD6.setText(""); HD7.setText("");
                         HF1.setText("");HF2.setText(""); HF3.setText(""); HF4.setText(""); HF5.setText(""); HF6.setText(""); HF7.setText("");

                     }
                     System.out.println("IDSemaine2   "+v211);
                    rs.close(); 
                     S212 = "SELECT HeureDebut FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S212);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v212=rs.getString(1);
                     }
                     System.out.println("HeureDebutSamedi   "+v212);
                    rs.close(); 
                    if(v212==null) {HD1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD1.setText(v212);
                   
                     S213 = "SELECT HeureFin FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S213);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v213=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v213);
                    rs.close();
                    if(v213==null) {HF1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF1.setText(v213);
                      
                    S214 = "SELECT DateSceance FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S214);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v214=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v214);
                    rs.close(); 
                    if(v214==null) {D1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D1.setText(v214);
                      
                       
                    /*******************************/
                 
                      S215 = "SELECT HeureDebut FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S215);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v216=rs.getString(1);
                     }
                     System.out.println("HeureDebutDimanche   "+v216);
                    rs.close(); 
                    if(v216==null) {HD2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD2.setText(v216);
                    
                     S217 = "SELECT HeureFin FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S217);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v217=rs.getString(1);
                     }
                     System.out.println("HeureFinDimanche   "+v217);
                    rs.close(); 
                    if(v217==null) {HF2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF2.setText(v217);
                   
                     S218 = "SELECT DateSceance FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S218);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v218=rs.getString(1);
                     }
                     System.out.println("DateSDimanche   "+v218);
                    rs.close(); 
                    if(v218==null) {D2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D2.setText(v218);
                    
                    
                    //***************************************
                    
                       S219 = "SELECT HeureDebut FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S219);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v219=rs.getString(1);
                     }
                     System.out.println("HeureDebutLundi   "+v219);
                    rs.close(); 
                    if(v219==null) {HD3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD3.setText(v219);
                    
                     S220 = "SELECT HeureFin FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S220);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v220=rs.getString(1);
                     }
                     System.out.println("HeureFinLundi   "+v220);
                    rs.close(); 
                    if(v220==null) {HF3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF3.setText(v220);
                  
                     S221 = "SELECT DateSceance FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S221);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v221=rs.getString(1);
                     }
                     System.out.println("DateSDLundi   "+v221);
                    rs.close(); 
                    if(v221==null) {D3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D3.setText(v221);
                 
                    //********************
                          
                       S222 = "SELECT HeureDebut FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S222);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v222=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v222);
                    rs.close(); 
                    if(v222==null) {HD4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD4.setText(v222);
                   
                     S223 = "SELECT HeureFin FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S223);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v223=rs.getString(1);
                     }
                     System.out.println("HeureFinMardi   "+v223);
                    rs.close(); 
                    if(v223==null) {HF4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF4.setText(v223);
                    
                     S224 = "SELECT DateSceance FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S224);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v224=rs.getString(1);
                     }
                     System.out.println("DateSMardi   "+v224);
                    rs.close(); 
                    if(v224==null) {D4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D4.setText(v224);
                    
                    //********************
                    S225 = "SELECT HeureDebut FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S225);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v255=rs.getString(1);
                     }
                     System.out.println("HeureDebutMercredi  "+v255);
                    rs.close(); 
                    if(v255==null) {HD5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD5.setText(v255);
                    
                     S256 = "SELECT HeureFin FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S256);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v256=rs.getString(1);
                     }
                     System.out.println("HeureFinMercredi   "+v256);
                    rs.close(); 
                    if(v256==null) {HF5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF5.setText(v256);
                  
                     S257 = "SELECT DateSceance FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S257);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v257=rs.getString(1);
                     }
                     System.out.println("DateSMercredi   "+v257);
                    rs.close(); 
                    if(v257==null) {D5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D5.setText(v257);
                   
                    //***********
                    S258 = "SELECT HeureDebut FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S258);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v258=rs.getString(1);
                     }
                     System.out.println("HeureDebutJeudi  "+v258);
                    rs.close(); 
                    if(v258==null) {HD6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD6.setText(v258);
                  
                     S259 = "SELECT HeureFin FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S259);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v259=rs.getString(1);
                     }
                     System.out.println("HeureFinJeudi   "+v259);
                    rs.close(); 
                    if(v259==null) {HF6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF6.setText(v259);
                    
                    S260 = "SELECT DateSceance FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S260);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v260=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v260);
                    rs.close(); 
                    if(v260==null) {D6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D6.setText(v260);
                    
                    //********
                    S261 = "SELECT HeureDebut FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S261);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v261=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v261);
                    rs.close(); 
                    if(v261==null) {HD7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD7.setText(v261);
                   
                     S262 = "SELECT HeureFin FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S262);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v262=rs.getString(1);
                     }
                     System.out.println("HeureFinVendredi   "+v262);
                    rs.close(); 
                    if(v262==null) {HF7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF7.setText(v262);
                   
                     S263 = "SELECT DateSceance FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S263);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v263=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v263);
                    rs.close(); 
                    if(v263==null) {D7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D7.setText(v263);
                 
                    
                    } 
                    /*+++++++++++++++++++++++++++++*/
                    if(f==3){
                              Initialisation();
                     S211 = "SELECT IDSemaine FROM `semaine` where numero='3' and IDFormation='"+v3+"'" ;
                    pst = conn.prepareStatement(S211);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v211=rs.getString(1);
                     }
                     if(v211==null)
                        {
                         D1.setText(""); D2.setText(""); D3.setText(""); D4.setText(""); D5.setText(""); D6.setText(""); D7.setText("");
                         HD1.setText("");HD2.setText(""); HD3.setText(""); HD4.setText(""); HD5.setText(""); HD6.setText(""); HD7.setText("");
                         HF1.setText("");HF2.setText(""); HF3.setText(""); HF4.setText(""); HF5.setText(""); HF6.setText(""); HF7.setText("");

                     }
                     System.out.println("IDSemaine2   "+v211);
                    rs.close(); 
                     S212 = "SELECT HeureDebut FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S212);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v212=rs.getString(1);
                     }
                     System.out.println("HeureDebutSamedi   "+v212);
                    rs.close(); 
                    if(v212==null) {HD1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD1.setText(v212);
                   
                     S213 = "SELECT HeureFin FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S213);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v213=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v213);
                    rs.close();
                    if(v213==null) {HF1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF1.setText(v213);
                      
                    S214 = "SELECT DateSceance FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S214);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v214=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v214);
                    rs.close(); 
                    if(v214==null) {D1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D1.setText(v214);
                      
                       
                    /*******************************/
                 
                      S215 = "SELECT HeureDebut FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S215);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v216=rs.getString(1);
                     }
                     System.out.println("HeureDebutDimanche   "+v216);
                    rs.close(); 
                    if(v216==null) {HD2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD2.setText(v216);
                    
                     S217 = "SELECT HeureFin FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S217);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v217=rs.getString(1);
                     }
                     System.out.println("HeureFinDimanche   "+v217);
                    rs.close(); 
                    if(v217==null) {HF2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF2.setText(v217);
                   
                     S218 = "SELECT DateSceance FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S218);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v218=rs.getString(1);
                     }
                     System.out.println("DateSDimanche   "+v218);
                    rs.close(); 
                    if(v218==null) {D2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D2.setText(v218);
                    
                    
                    //***************************************
                    
                       S219 = "SELECT HeureDebut FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S219);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v219=rs.getString(1);
                     }
                     System.out.println("HeureDebutLundi   "+v219);
                    rs.close(); 
                    if(v219==null) {HD3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD3.setText(v219);
                    
                     S220 = "SELECT HeureFin FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S220);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v220=rs.getString(1);
                     }
                     System.out.println("HeureFinLundi   "+v220);
                    rs.close(); 
                    if(v220==null) {HF3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF3.setText(v220);
                  
                     S221 = "SELECT DateSceance FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S221);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v221=rs.getString(1);
                     }
                     System.out.println("DateSDLundi   "+v221);
                    rs.close(); 
                    if(v221==null) {D3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D3.setText(v221);
                 
                    //********************
                          
                       S222 = "SELECT HeureDebut FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S222);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v222=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v222);
                    rs.close(); 
                    if(v222==null) {HD4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD4.setText(v222);
                   
                     S223 = "SELECT HeureFin FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S223);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v223=rs.getString(1);
                     }
                     System.out.println("HeureFinMardi   "+v223);
                    rs.close(); 
                    if(v223==null) {HF4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF4.setText(v223);
                    
                     S224 = "SELECT DateSceance FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S224);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v224=rs.getString(1);
                     }
                     System.out.println("DateSMardi   "+v224);
                    rs.close(); 
                    if(v224==null) {D4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D4.setText(v224);
                    
                    //********************
                    S225 = "SELECT HeureDebut FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S225);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v255=rs.getString(1);
                     }
                     System.out.println("HeureDebutMercredi  "+v255);
                    rs.close(); 
                    if(v255==null) {HD5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD5.setText(v255);
                    
                     S256 = "SELECT HeureFin FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S256);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v256=rs.getString(1);
                     }
                     System.out.println("HeureFinMercredi   "+v256);
                    rs.close(); 
                    if(v256==null) {HF5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF5.setText(v256);
                  
                     S257 = "SELECT DateSceance FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S257);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v257=rs.getString(1);
                     }
                     System.out.println("DateSMercredi   "+v257);
                    rs.close(); 
                    if(v257==null) {D5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D5.setText(v257);
                   
                    //***********
                    S258 = "SELECT HeureDebut FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S258);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v258=rs.getString(1);
                     }
                     System.out.println("HeureDebutJeudi  "+v258);
                    rs.close(); 
                    if(v258==null) {HD6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD6.setText(v258);
                  
                     S259 = "SELECT HeureFin FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S259);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v259=rs.getString(1);
                     }
                     System.out.println("HeureFinJeudi   "+v259);
                    rs.close(); 
                    if(v259==null) {HF6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF6.setText(v259);
                    
                    S260 = "SELECT DateSceance FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S260);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v260=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v260);
                    rs.close(); 
                    if(v260==null) {D6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D6.setText(v260);
                    
                    //********
                    S261 = "SELECT HeureDebut FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S261);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v261=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v261);
                    rs.close(); 
                    if(v261==null) {HD7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD7.setText(v261);
                   
                     S262 = "SELECT HeureFin FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S262);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v262=rs.getString(1);
                     }
                     System.out.println("HeureFinVendredi   "+v262);
                    rs.close(); 
                    if(v262==null) {HF7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF7.setText(v262);
                   
                     S263 = "SELECT DateSceance FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S263);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v263=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v263);
                    rs.close(); 
                    if(v263==null) {D7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D7.setText(v263);
                 
                    
                    
                        
                    }
                    /*+++++++++++++++++++++++++++++*/
                     if(f==5){
                            Initialisation();
                     S211 = "SELECT IDSemaine FROM `semaine` where numero='5' and IDFormation='"+v3+"'" ;
                    pst = conn.prepareStatement(S211);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v211=rs.getString(1);
                     }
                     if(v211==null)
                        {
                         D1.setText(""); D2.setText(""); D3.setText(""); D4.setText(""); D5.setText(""); D6.setText(""); D7.setText("");
                         HD1.setText("");HD2.setText(""); HD3.setText(""); HD4.setText(""); HD5.setText(""); HD6.setText(""); HD7.setText("");
                         HF1.setText("");HF2.setText(""); HF3.setText(""); HF4.setText(""); HF5.setText(""); HF6.setText(""); HF7.setText("");

                     }
                     System.out.println("IDSemaine2   "+v211);
                    rs.close(); 
                     S212 = "SELECT HeureDebut FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S212);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v212=rs.getString(1);
                     }
                     System.out.println("HeureDebutSamedi   "+v212);
                    rs.close(); 
                    if(v212==null) {HD1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD1.setText(v212);
                   
                     S213 = "SELECT HeureFin FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S213);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v213=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v213);
                    rs.close();
                    if(v213==null) {HF1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF1.setText(v213);
                      
                    S214 = "SELECT DateSceance FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S214);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v214=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v214);
                    rs.close(); 
                    if(v214==null) {D1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D1.setText(v214);
                      
                       
                    /*******************************/
                 
                      S215 = "SELECT HeureDebut FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S215);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v216=rs.getString(1);
                     }
                     System.out.println("HeureDebutDimanche   "+v216);
                    rs.close(); 
                    if(v216==null) {HD2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD2.setText(v216);
                    
                     S217 = "SELECT HeureFin FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S217);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v217=rs.getString(1);
                     }
                     System.out.println("HeureFinDimanche   "+v217);
                    rs.close(); 
                    if(v217==null) {HF2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF2.setText(v217);
                   
                     S218 = "SELECT DateSceance FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S218);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v218=rs.getString(1);
                     }
                     System.out.println("DateSDimanche   "+v218);
                    rs.close(); 
                    if(v218==null) {D2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D2.setText(v218);
                    
                    
                    //***************************************
                    
                       S219 = "SELECT HeureDebut FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S219);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v219=rs.getString(1);
                     }
                     System.out.println("HeureDebutLundi   "+v219);
                    rs.close(); 
                    if(v219==null) {HD3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD3.setText(v219);
                    
                     S220 = "SELECT HeureFin FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S220);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v220=rs.getString(1);
                     }
                     System.out.println("HeureFinLundi   "+v220);
                    rs.close(); 
                    if(v220==null) {HF3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF3.setText(v220);
                  
                     S221 = "SELECT DateSceance FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S221);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v221=rs.getString(1);
                     }
                     System.out.println("DateSDLundi   "+v221);
                    rs.close(); 
                    if(v221==null) {D3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D3.setText(v221);
                 
                    //********************
                          
                       S222 = "SELECT HeureDebut FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S222);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v222=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v222);
                    rs.close(); 
                    if(v222==null) {HD4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD4.setText(v222);
                   
                     S223 = "SELECT HeureFin FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S223);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v223=rs.getString(1);
                     }
                     System.out.println("HeureFinMardi   "+v223);
                    rs.close(); 
                    if(v223==null) {HF4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF4.setText(v223);
                    
                     S224 = "SELECT DateSceance FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S224);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v224=rs.getString(1);
                     }
                     System.out.println("DateSMardi   "+v224);
                    rs.close(); 
                    if(v224==null) {D4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D4.setText(v224);
                    
                    //********************
                    S225 = "SELECT HeureDebut FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S225);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v255=rs.getString(1);
                     }
                     System.out.println("HeureDebutMercredi  "+v255);
                    rs.close(); 
                    if(v255==null) {HD5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD5.setText(v255);
                    
                     S256 = "SELECT HeureFin FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S256);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v256=rs.getString(1);
                     }
                     System.out.println("HeureFinMercredi   "+v256);
                    rs.close(); 
                    if(v256==null) {HF5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF5.setText(v256);
                  
                     S257 = "SELECT DateSceance FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S257);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v257=rs.getString(1);
                     }
                     System.out.println("DateSMercredi   "+v257);
                    rs.close(); 
                    if(v257==null) {D5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D5.setText(v257);
                   
                    //***********
                    S258 = "SELECT HeureDebut FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S258);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v258=rs.getString(1);
                     }
                     System.out.println("HeureDebutJeudi  "+v258);
                    rs.close(); 
                    if(v258==null) {HD6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD6.setText(v258);
                  
                     S259 = "SELECT HeureFin FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S259);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v259=rs.getString(1);
                     }
                     System.out.println("HeureFinJeudi   "+v259);
                    rs.close(); 
                    if(v259==null) {HF6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF6.setText(v259);
                    
                    S260 = "SELECT DateSceance FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S260);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v260=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v260);
                    rs.close(); 
                    if(v260==null) {D6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D6.setText(v260);
                    
                    //********
                    S261 = "SELECT HeureDebut FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S261);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v261=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v261);
                    rs.close(); 
                    if(v261==null) {HD7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD7.setText(v261);
                   
                     S262 = "SELECT HeureFin FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S262);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v262=rs.getString(1);
                     }
                     System.out.println("HeureFinVendredi   "+v262);
                    rs.close(); 
                    if(v262==null) {HF7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF7.setText(v262);
                   
                     S263 = "SELECT DateSceance FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S263);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v263=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v263);
                    rs.close(); 
                    if(v263==null) {D7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D7.setText(v263);
                 
                    
                    
                 
                    
                    } 
                       if(f==2){
                          Initialisation();
                     S211 = "SELECT IDSemaine FROM `semaine` where numero='2' and IDFormation='"+v3+"'" ;
                    pst = conn.prepareStatement(S211);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v211=rs.getString(1);
                     }
                     if(v211==null)
                        {
                         D1.setText(""); D2.setText(""); D3.setText(""); D4.setText(""); D5.setText(""); D6.setText(""); D7.setText("");
                         HD1.setText("");HD2.setText(""); HD3.setText(""); HD4.setText(""); HD5.setText(""); HD6.setText(""); HD7.setText("");
                         HF1.setText("");HF2.setText(""); HF3.setText(""); HF4.setText(""); HF5.setText(""); HF6.setText(""); HF7.setText("");

                     }
                     System.out.println("IDSemaine2   "+v211);
                    rs.close(); 
                     S212 = "SELECT HeureDebut FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S212);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v212=rs.getString(1);
                     }
                     System.out.println("HeureDebutSamedi   "+v212);
                    rs.close(); 
                    if(v212==null) {HD1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD1.setText(v212);
                   
                     S213 = "SELECT HeureFin FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S213);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v213=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v213);
                    rs.close();
                    if(v213==null) {HF1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF1.setText(v213);
                      
                    S214 = "SELECT DateSceance FROM `sceance` where jour= 'samedi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S214);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v214=rs.getString(1);
                     }
                     System.out.println("vv5vvv   "+v214);
                    rs.close(); 
                    if(v214==null) {D1.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D1.setText(v214);
                      
                       
                    /*******************************/
                 
                      S215 = "SELECT HeureDebut FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S215);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v216=rs.getString(1);
                     }
                     System.out.println("HeureDebutDimanche   "+v216);
                    rs.close(); 
                    if(v216==null) {HD2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD2.setText(v216);
                    
                     S217 = "SELECT HeureFin FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S217);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v217=rs.getString(1);
                     }
                     System.out.println("HeureFinDimanche   "+v217);
                    rs.close(); 
                    if(v217==null) {HF2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF2.setText(v217);
                   
                     S218 = "SELECT DateSceance FROM `sceance` where jour= 'dimanche' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S218);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v218=rs.getString(1);
                     }
                     System.out.println("DateSDimanche   "+v218);
                    rs.close(); 
                    if(v218==null) {D2.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D2.setText(v218);
                    
                    
                    //***************************************
                    
                       S219 = "SELECT HeureDebut FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S219);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v219=rs.getString(1);
                     }
                     System.out.println("HeureDebutLundi   "+v219);
                    rs.close(); 
                    if(v219==null) {HD3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD3.setText(v219);
                    
                     S220 = "SELECT HeureFin FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S220);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v220=rs.getString(1);
                     }
                     System.out.println("HeureFinLundi   "+v220);
                    rs.close(); 
                    if(v220==null) {HF3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF3.setText(v220);
                  
                     S221 = "SELECT DateSceance FROM `sceance` where jour= 'lundi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S221);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v221=rs.getString(1);
                     }
                     System.out.println("DateSDLundi   "+v221);
                    rs.close(); 
                    if(v221==null) {D3.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D3.setText(v221);
                 
                    //********************
                          
                       S222 = "SELECT HeureDebut FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S222);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v222=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v222);
                    rs.close(); 
                    if(v222==null) {HD4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD4.setText(v222);
                   
                     S223 = "SELECT HeureFin FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S223);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v223=rs.getString(1);
                     }
                     System.out.println("HeureFinMardi   "+v223);
                    rs.close(); 
                    if(v223==null) {HF4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF4.setText(v223);
                    
                     S224 = "SELECT DateSceance FROM `sceance` where jour= 'mardi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S224);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v224=rs.getString(1);
                     }
                     System.out.println("DateSMardi   "+v224);
                    rs.close(); 
                    if(v224==null) {D4.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D4.setText(v224);
                    
                    //********************
                    S225 = "SELECT HeureDebut FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S225);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v255=rs.getString(1);
                     }
                     System.out.println("HeureDebutMercredi  "+v255);
                    rs.close(); 
                    if(v255==null) {HD5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD5.setText(v255);
                    
                     S256 = "SELECT HeureFin FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S256);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v256=rs.getString(1);
                     }
                     System.out.println("HeureFinMercredi   "+v256);
                    rs.close(); 
                    if(v256==null) {HF5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF5.setText(v256);
                  
                     S257 = "SELECT DateSceance FROM `sceance` where jour= 'mercredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S257);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v257=rs.getString(1);
                     }
                     System.out.println("DateSMercredi   "+v257);
                    rs.close(); 
                    if(v257==null) {D5.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D5.setText(v257);
                   
                    //***********
                    S258 = "SELECT HeureDebut FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S258);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v258=rs.getString(1);
                     }
                     System.out.println("HeureDebutJeudi  "+v258);
                    rs.close(); 
                    if(v258==null) {HD6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD6.setText(v258);
                  
                     S259 = "SELECT HeureFin FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S259);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v259=rs.getString(1);
                     }
                     System.out.println("HeureFinJeudi   "+v259);
                    rs.close(); 
                    if(v259==null) {HF6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF6.setText(v259);
                    
                    S260 = "SELECT DateSceance FROM `sceance` where jour= 'jeudi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S260);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v260=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v260);
                    rs.close(); 
                    if(v260==null) {D6.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D6.setText(v260);
                    
                    //********
                    S261 = "SELECT HeureDebut FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S261);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v261=rs.getString(1);
                     }
                     System.out.println("HeureDebutMardi  "+v261);
                    rs.close(); 
                    if(v261==null) {HD7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HD7.setText(v261);
                   
                     S262 = "SELECT HeureFin FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S262);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v262=rs.getString(1);
                     }
                     System.out.println("HeureFinVendredi   "+v262);
                    rs.close(); 
                    if(v262==null) {HF7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else HF7.setText(v262);
                   
                     S263 = "SELECT DateSceance FROM `sceance` where jour= 'vendredi' and IDSemaine='"+v211+"'" ;
                    pst = conn.prepareStatement(S263);
                    rs = pst.executeQuery();
                     if(rs.next()){
                    v263=rs.getString(1);
                     }
                     System.out.println("DateSVendredi   "+v263);
                    rs.close(); 
                    if(v263==null) {D7.setText(""); System.out.println("hEUREsAMEDI Null");}
                    else D7.setText(v263);
                 
                    
                    } 
                return 1;    
    }
    
    @FXML 
    public void Initialisation(){
         S =null; S2 =null;v2=null;
         S3=null;   S7 =null;
         v7=null;v260=null;
         
         S8=null;
         S9=null; S36=null;  v36=null;
         S10=null;
         S11=null; 
         S4=null;v263=null;
         S5=null;
         S6=null;
           S19=null;S22=null;    S24=null;     S211=null;  S20=null;
         S21=null; 
         S12=null;
         S13=null;
         S14=null;
         S15=null;
         S16=null;
         S17=null;
         S18=null;
         S212=null;
         S213=null;
         S214=null;    S66=null;
         S215=null; 
          S216=null;    S217=null;   S218=null;    S219=null;   S220=null;    S221=null;
          S222=null;    S223=null;   S224=null;    S226=null;   S227=null;    S228=null;  S225=null;
          S256=null;    S257=null;   S258=null;    S259=null;   S260=null;    S261=null;  S262=null;  S263=null;
          v216=null;    v217=null;   v218=null;    v219=null;   v220=null;    v221=null;
          v222=null;    v223=null;   v224=null;    v226=null;   v227=null;    v228=null;  v225=null;
          v256=null;      v258=null;    v259=null;      v261=null;  v262=null;  v263=null;
          v66=null; v257=null;
          S25=null;    S26=null;
         S27=null;
         S23=null;
        v4=null;
         
         v5=null;
         v6=null;
         v8=null;v260=null;
         v9=null;
         v10=null;
         v11=null;
          v12=null;v36=null;
          v13=null;
          v14=null;v255=null;
          v15=null; v224=null;
          v16=null;
          v17=null;
          v18=null;
          v19=null;
          v20=null;   v21=null;   v22=null;   v23=null;  v24=null;  v25=null;  v26=null;
            v211=null;     v212=null;   v213=null;   v214=null;   v215=null;  v255=null;
    
    }
  
    @FXML
   public void FenetreEnseignant() throws IOException {

        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Enseignants/FXMLEnseignants.fxml"));
        sceneAccueil = new Scene(rootAccueil);

            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);

    }

   
    @FXML
   public void FenetreEtudiant() throws IOException {

        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Etudiants/FXMLEtudiants.fxml"));
        sceneAccueil = new Scene(rootAccueil);

            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);


    }

   
    @FXML
   public void FenetreFormation() throws IOException {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Formations/FXMLFormations.fxml"));
        sceneAccueil = new Scene(rootAccueil);

      
            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);


    }
   
   
    @FXML
   public void FenetreFrais() throws IOException {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Frais/FXMLFais.fxml"));
        sceneAccueil = new Scene(rootAccueil);

      
            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);
    }

   @FXML
   public void FenetreInscription() throws IOException  {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Inscriptions/FXMLInscriptions.fxml"));
        sceneAccueil = new Scene(rootAccueil);

      
            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);

    }
   
   
    @FXML
   public void FenetreStatistiques() throws IOException {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Statistiques/FXMLStatistiques.fxml"));
        sceneAccueil = new Scene(rootAccueil);

      
            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);



    }

   
   
    @FXML
   public void FenetreEmploisDuTemps() throws IOException {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/Emplois/FXMLEmplois.fxml"));
        sceneAccueil = new Scene(rootAccueil);

      
            adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);

    }

    @FXML
      public void FenetreAccueil() throws IOException {


        rootAccueil = FXMLLoader.load(getClass().getResource("/dgsescuela/AccueilPackage/FXMLAccueil.fxml"));
        sceneAccueil = new Scene(rootAccueil);

       adminStage.setScene(sceneAccueil);
            adminStage.show();
            adminStage.setMaximized(false);
            adminStage.setMaximized(true);

    }
      
   /*------------------------------------------------Fenetre----------------------------------------*/

}
