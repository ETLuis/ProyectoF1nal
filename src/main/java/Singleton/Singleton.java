import java.sql.*;
public class Singleton {

    private static Singleton instance;
    private static Connection conn = null;
    private Statement stmt;
    private ResultSet rs;

    private Singleton() {
        // cadena de conexión
        String url = "jdbc:sqlite:/home/dam1/IdeaProjects/DataBaseLibrary/soundAdventure.sqlite";

        // hago la conexion en el constructor
        // creo un Statement para reusar
        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            //Capturamos la excepción de SQLException
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Base del Singleton
     * @return instancia de la clase Model
     */
    public static Model getInstance(){
        // solo hago el new si es null
        if (instance == null){
            instance = new Model();
        }
        // devuelvo siempre la unica instancia
        return instance;
    }

    // métodos generales que hacen consultas/inserciones/etc

    /**
     * Busca el nombre segun el id del usuario
     * @param id del usuario
     * @return nombre del usuario
     */
    public String getUserById(int id){
        String sql = "SELECT name FROM usuarios WHERE id=" + id + " LIMIT 1";
        String resultado = "";

        try {
            // recojo los resultados
            rs = stmt.executeQuery(sql);
            // loop por los resultados
            // aunque al poner LIMIT 1 nos garantizamos solo un resultado
            while (rs.next()) {
                resultado = rs.getString("name");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // devuelvo lo obtenido
        return resultado;
    }


    public Integer getScoreByUser(String name) {
        //Recogemos la puntuación del usuario con el nombre igual al del usuario
        String sql = "SELECT score FROM usuarios WHERE name='" + name + "' LIMIT 1";
        Integer resultado = 0;
        try {
            // recojo los resultados
            rs = stmt.executeQuery(sql);
            // loop por los resultados
            // aunque al poner LIMIT 1 nos garantizamos solo un resultado
            while (rs.next()) {
                resultado = rs.getInt("score");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // devuelvo lo obtenido
        return resultado;
    }
}