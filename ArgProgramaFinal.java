/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.argprogramafinal;

import com.fasterxml.jackson.core.JsonProcessingException;

import static com.mycompany.argprogramafinal.Alumno.crearAlumno;
import static com.mycompany.argprogramafinal.Inscripcion.realizadInscripcion;
import static com.mycompany.argprogramafinal.Materia.crearMateria;

import java.sql.SQLException;

import java.util.Scanner;

public class ArgProgramaFinal {

    public static void main(String[] args) throws SQLException, JsonProcessingException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String menu = "1- Para crear alumno, 2- Para crear materia,3- inscribirse a materia, 4- salir";
            System.out.println(menu);

            int opcion = 0;

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    crearMateria();
                    break;

                case 3:
                    Inscripcion.realizadInscripcion();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }

    }

    public static void Inscripcionnueva() throws SQLException, JsonProcessingException {

        Inscripcion inscripcion = new Inscripcion();

        Inscripcion a = new Inscripcion();
        a.aprobado(Alumno alumno, Materia materia);

    }

    

    }

    //Creo el hashmap de las materias para poder trabajar dentro del codigo
//    public static void traerDatos() throws SQLException, JsonProcessingException {
//
//        Materia materia = new Materia("");
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//
//        HashMap<String, ArrayList<String>> hmMaterias = new HashMap<>();
//
//        conexion.estableceConexion();
//        Statement stmt = conexion.conectar.createStatement();
//
//        ResultSet rs = stmt.executeQuery("SELECT * FROM materias");
//
//        while (rs.next()) {
//
//            materia = new Materia(rs.getString("nombre"));
//
//            String jsonText = objectMapper.writeValueAsString(rs.getString("correlativas"));
//
//            ArrayList<String> nombreCorrelativas = objectMapper.readValue(jsonText, ArrayList.class);
//
//            materia.setCorrelativas(nombreCorrelativas);
//
//            hmMaterias.put(materia.getNombre(), materia.getCorrelativas());
//
//        }
//        conexion.cerrarConnection();
//
//        System.out.println(hmMaterias);
//
//    }
}
