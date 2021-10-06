import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NManager {

    private HashMap<String, ResourceBundle> data;
    private static I18NManager manager;
    private final static Logger logger = Logger.getLogger(I18NManager.class);


    private I18NManager(){
        this.data = new HashMap<String,ResourceBundle>();
    }

    public static I18NManager getInstance(){
        if (manager==null){
            logger.info("Nova instancia I18N");
            manager = new I18NManager();
        }
        return  manager;
    }
    public String getText(String idiom,String key){

        if (data.get(idiom)==null){


            logger.info("No s'ha trobat les propietats al cache");
            manager.cargarDatosCache(idiom);

        }
        return data.get(idiom).getString(key);

    }

    private void cargarDatosCache(String idiom){
        try {
            ResourceBundle res = ResourceBundle.getBundle(idiom);
            data.put(idiom, res);
        }catch(Exception e) {
        }


    }
    public void cleanCache(){
        data.clear();
    }
}
