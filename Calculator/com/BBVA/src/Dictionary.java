package Calculator.com.BBVA.src;


import java.util.Hashtable;


public class Dictionary {
    public static String getValue(String key) {
        Hashtable<String, String> table = new Hashtable<String, String>();
        table.put("valor cuota", "installment value");
        table.put("total prestamo", "total amount");
        table.put("cantidad cuotas", "total installments");
        
        return table.get(key);
    }
}
