package etu2034.framework.servlet;

import java.io.*;
import java.util.HashMap;

import etu2034.framework.Mapping;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class FrontServlet extends HttpServlet {
    HashMap<String, Mapping> MappingUrls;

    HashMap<String, Mapping> mappingUrls;

    public HashMap<String, Mapping> getMappingUrls() {
        return mappingUrls;
    }

    public void setMappingUrls(HashMap<String, Mapping> mappingUrls) {
        this.mappingUrls = mappingUrls;
    }

    public void init() {

        String objectPackage="etu2034.framework.DataObject";
        String packageDirectory="/Users/valisoa/IdeaProjects/Framework Servlet/src/main/java/etu2034/framework/DataObject";
        try {
            this.MappingUrls=Mapping.getMethodsFromPackage(packageDirectory,objectPackage);
        }catch (Exception e){
            System.out.println("Erreur: "+e.getMessage());
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
       PrintWriter out=response.getWriter();
       String contextpath=request.getRequestURI().toString();
       String tobesplited="/Framework Servlet_war_exploded";

//        System.out.println(contextpath.split(tobesplited)[0]);
        String key=contextpath.split(tobesplited)[1];


        if(MappingUrls.containsKey(key)){
            Mapping map=MappingUrls.get(key);

            out.println(map.getMethods());
            out.println(map.getClassName());
        }
        else{
            out.println("Non c'ect non");
        }
    }

    public void destroy() {
    }
}