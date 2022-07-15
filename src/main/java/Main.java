
import com.mycompany.cajeroautomatico.sqlconnection.sqlconnection;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dylan
 */
public class Main {

    public static void main(String[] args) {
        sqlconnection query = new sqlconnection();
        String consulta = "select * from estado_cajero";
        LinkedList<String> resultado=query.query(consulta);
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
    }
}
