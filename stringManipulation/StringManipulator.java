
public class StringManipulator{
    public String trimAndConcat(String a,String b){
     String concat = a.trim()+b.trim();
        return concat;
    }

    public int getIndexOrNull(String c, char d){

        int respuesta = c.indexOf(d);

        return respuesta;
    }

    public int getIndexOrNull(String a, String b){

        int resultado = a.indexOf(b);
        return resultado;

    }

    String concatSubstring(String f, int g, int h, String i){

        String resultado = f.substring(g, h);
        return resultado+i;




    }
    
}
