package org.openapitools.codegen.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsMap extends HashMap<String, Object> {

    public void setOperation(OperationMap objs) {
        put("operations", objs);
    }

    public OperationMap getOperations() {
        return (OperationMap) get("operations");
    }

    public void setImports(List<Map<String, String>> imports) {
        put("imports", imports);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, String>> getImports() {
        return (List<Map<String, String>>) get("imports");
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
