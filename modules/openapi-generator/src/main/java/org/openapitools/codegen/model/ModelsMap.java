package org.openapitools.codegen.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelsMap extends HashMap<String, Object> {

    public ModelsMap() {
    }

    public void setModels(List<ModelMap> modelMaps) {
        put("models", modelMaps);
    }

    @SuppressWarnings("unchecked")
    public List<ModelMap> getModels() {
        return (List<ModelMap>) get("models");
    }

    public void setImports(List<Map<String, String>> imports) {
        put("imports", imports);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, String>> getImports() {
        return (List<Map<String, String>>) get("imports");
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, String>> getImportsOrEmpty() {
        return (List<Map<String, String>>) getOrDefault("imports", new ArrayList<>());
    }
    
    public void setImportsBean(List<Map<String, String>> imports) {
        put("importsBean", imports);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, String>> getImportsBean() {
        return (List<Map<String, String>>) get("importsBean");
    }
    
    public void setImportsEntity(List<Map<String, String>> imports) {
        put("importsEntity", imports);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, String>> getImportsEntity() {
        return (List<Map<String, String>>) get("importsEntity");
    }      

}
