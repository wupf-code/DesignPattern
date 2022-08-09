package com.wpf.adapter;

import java.io.File;
import java.nio.file.attribute.AclEntry.Builder;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
    public static Object getBean(){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance(); //DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            org.w3c.dom.Document doc;
            doc =  documentBuilder.parse(new File("D:\\Workspace\\尚硅谷\\DesignPattern\\src\\main\\java\\com\\wpf\\adapter\\config.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
