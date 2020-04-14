package test;

import java.util.HashMap;

public class DataBase {
    private static DataBase dbInstance = null;

    String [] simVars2;

    HashMap<String,Double> symbolTable;

    private DataBase(){
        simVars2 = new String[]{"simX", "simY","simZ"};
        symbolTable = new HashMap<>();
    }

    public static DataBase getDbInstance() {
        if (dbInstance == null){
            dbInstance = new DataBase();
        }
        return dbInstance;
    }
}
