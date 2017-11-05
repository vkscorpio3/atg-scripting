package atgscripting;

import atg.nucleus.GenericService;


public class ScriptingTools extends GenericService {

    private static String PROP = "../config/atgscripting/ScriptingTools.properties";

    private boolean enableScripting;

    public void setEnableScripting(boolean enableScripting) {
        this.enableScripting = enableScripting;
    }

    public boolean isEnableScripting() {
        return enableScripting;
    }

}
