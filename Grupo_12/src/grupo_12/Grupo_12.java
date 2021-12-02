/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo_12;

import ConexionBD.Conexion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import listas.CircleDoubleLinkedList;


/**
 *
 * @author Lea
 */
public class Grupo_12 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/Inicio.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*Connection conexion;
        Conexion c = new Conexion();
        conexion = c.getConexion();
        Statement s;
            try {
                s = conexion.createStatement();
                ResultSet rs = s.executeQuery("select sin_acentos from palabras");
                while(rs.next()){
                    //System.out.println(rs.getString(1));                    
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/recursos/palabras/espanol/ciudades.txt",true))){
                        if(rs.getString(1).length() > 2)
                            bw.append(rs.getString(1)+"\n");
                    } catch (IOException ex) {
                        Logger.getLogger(SopaDeLetras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }*/
        CircleDoubleLinkedList<String> prueba = new CircleDoubleLinkedList<>();
        prueba.addLast("a");
        prueba.addLast("b");
        prueba.addLast("c");
        prueba.addLast("d");
        prueba.addLast("e");
        System.out.println(prueba);
        prueba.setLast(0);
        prueba.setLast(0);
        System.out.println(prueba);
        prueba.setLast(prueba.size()-2);
        prueba.setLast(prueba.size()-2);
        System.out.println(prueba);
        launch(args);
    }
    
}
