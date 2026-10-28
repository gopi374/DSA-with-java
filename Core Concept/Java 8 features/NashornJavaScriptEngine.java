//Nashorn was a JavaScript engine introduced in Java 8 that allowed JavaScript code to run on the Java platform.

import javax.script.*;

public class NashornJavaScriptEngine {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager =
                new ScriptEngineManager();

        ScriptEngine engine =
                manager.getEngineByName("nashorn");

        System.out.println(engine.eval("10 + 20"));
    }
}
