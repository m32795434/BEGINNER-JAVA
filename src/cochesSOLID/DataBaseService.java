package cochesSOLID;

import netscape.javascript.JSObject;

public class DataBaseService implements Conexion{
    @Override
    public String getDatos(){
        return "{'nombre':'Manuel'} retornado desde la DB";
    }
    @Override
public void setDatos(){
        System.out.println("Setting data to the DB!");
    }
}
