package test;

import test.Commands.Command;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class OurInterpreter {

/*    String [] simVars1 = {
           "/instrumentation/airspeed-indicator/indicated-speed-kt",
           "/instrumentation/altimeter/indicated-altitude-ft",
           "/instrumentation/altimeter/pressure-alt-ft",
           "/instrumentation/attitude-indicator/indicated-pitch-deg",
           "/instrumentation/attitude-indicator/indicated-roll-deg",
           "/instrumentation/attitude-indicator/internal-pitch-deg",
           "/instrumentation/attitude-indicator/internal-roll-deg",
           "/instrumentation/encoder/indicated-altitude-ft",
           "/instrumentation/encoder/pressure-alt-ft",
           "/instrumentation/gps/indicated-altitude-ft",
           "/instrumentation/gps/indicated-ground-speed-kt",
           "/instrumentation/gps/indicated-vertical-speed",
           "/instrumentation/heading-indicator/indicated-heading-deg",
           "/instrumentation/magnetic-compass/indicated-heading-deg",
           "/instrumentation/slip-skid-ball/indicated-slip-skid",
           "/instrumentation/turn-indicator/indicated-turn-rate",
           "/instrumentation/vertical-speed-indicator/indicated-speed-fpm",
           "/controls/flight/aileron",
           "/controls/flight/elevator",
           "/controls/flight/rudder",
           "/controls/flight/flaps",
           "/controls/engines/engine/throttle",
           "/engines/engine/rpm"
    };*/
    Lexer lexer;
    Parser parser;
    static ConcurrentHashMap<String, Double> simTable = new ConcurrentHashMap<String, Double>();

    public OurInterpreter(){
        Lexer lexer = new Lexer();
        Parser parser = new Parser();
    }

    public Double getVarValue(String key){
        Double val =simTable.get(key);
        return val;
    }

    public static ConcurrentHashMap<String,Double> getSimTable(){
        return simTable;
    }

}
