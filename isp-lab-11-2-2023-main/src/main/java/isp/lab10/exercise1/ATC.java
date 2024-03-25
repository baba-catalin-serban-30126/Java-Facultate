package isp.lab10.exercise1;
import java.util.ArrayList;
public class ATC {
    ArrayList<Aircraft> aircrafts = new ArrayList<>();
    public void addAircraft(String id){
        System.out.println("Aircraft with id " + id + " added");
        Aircraft a = new Aircraft(id);
        aircrafts.add(a);
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);
        //for parcurge lista avioane si cautare avion cu id=id si trimite comanda
        //for(Airplane a:list){
          //  if(a.getid().equals(id))
            //    a.sendCommand(command);
        //}
    }

    public void showAircrafts(){
        System.out.println( "Display aircrfats." + aircrafts );
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
