package com.festivities;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("api")
public class App extends Application {
    @Override
    public Set<Class<?>> getClasses(){
        return Collections.singleton(SimpleRest.class);
    }
}
