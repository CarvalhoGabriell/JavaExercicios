import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        HashMap mapa = new HashMap();

        mapa.put("RM84826", "Gabriel");
        mapa.put("RM87451", "Joao");
        mapa.put("RM78412", "Claubson");

        System.out.println( mapa.get("RM84826"));
    }
}
