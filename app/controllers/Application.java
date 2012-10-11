package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void list() {
    	List<Usuario> list=Usuario.find("ORDER BY id").fetch();
        renderJSON(list);
    }

    public static void create(Usuario usuario) {
    	usuario.save();
    	Map resultado=new HashMap();
    	resultado.put("success", "1");
    	resultado.put("msg", "Se creo el usuario");
    	renderJSON(resultado);
    }
    
    public static void update(Usuario usuario) {
    	usuario.save();
    	Map resultado=new HashMap();
    	resultado.put("success", "1");
    	resultado.put("msg", "Se modifico el usuario");
    	renderJSON(resultado);
    }
    
    public static void delete(Usuario usuario) {
    	usuario.delete();
    	Map resultado=new HashMap();
    	resultado.put("success", "1");
    	resultado.put("msg", "Se elimino el usuario");
    	renderJSON(resultado);
    }
    
}