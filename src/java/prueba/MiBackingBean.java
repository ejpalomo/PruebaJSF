/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author Esteban
 */
@Named(value = "bookController")
@RequestScoped  
public class MiBackingBean {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Creates a new instance of MiBackingBean
     */
    public MiBackingBean() {
    }
    
}
