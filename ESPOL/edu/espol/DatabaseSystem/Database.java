package ec.edu.espol.DatabaseSystem;

public class Database{

    private static Database instance;
   
    public Database() {
    
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
        }
        }
        return instance;
    }

    public void ejecutarConsulta(String query) {
        // Lógica para ejecutar la consulta SQL en la base de datos
        System.out.println("Ejecutando consulta: " + query);
    }

}
