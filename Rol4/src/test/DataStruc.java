package test;

import java.util.concurrent.ConcurrentHashMap;

public class DataStruc {
    public ConcurrentHashMap<String, Double> symTable = new ConcurrentHashMap<String, Double>();
    public ConcurrentHashMap<String,String> BindTable = new ConcurrentHashMap<String, String>();
    public ConcurrentHashMap<String, Double> simulatorBindTable=new ConcurrentHashMap<String, Double>();

    public ConcurrentHashMap<String,Double> getSimTable(){
        return symTable;
    }
    public ConcurrentHashMap<String,String> getBindTable(){
        return BindTable;
    }
    public ConcurrentHashMap<String,Double> getsimulatorBindTable(){return simulatorBindTable; }


    public boolean exists(String sym) {
        return (symTable.containsKey(sym) || BindTable.containsKey(sym));
    }

    public Double getValue(String sym) {
        if (BindTable.containsKey(sym)) {
            return simulatorBindTable.get(BindTable.get(sym));
        }
        else if (symTable.containsKey(sym))
        {
            return symTable.get(sym);
        }
        return null;
    }

    public void setValue(String sym, Double val) {
        if (BindTable.containsKey(sym)) {
          //  Connect.simulatorSetCommand("set " + BindTable.get(sym) + " " + val);
            simulatorBindTable.put(BindTable.get(sym), val);
        }
        else if (symTable.containsKey(sym)) {
            symTable.put(sym, val);
        }
    }
}
