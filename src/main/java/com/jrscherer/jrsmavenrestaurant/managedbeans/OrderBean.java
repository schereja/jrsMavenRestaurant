

package com.jrscherer.jrsmavenrestaurant.managedbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.primefaces.model.DualListModel;

/**
 *
 * @author schereja
 */
@Named(value = "orderBean")
@Dependent
public class OrderBean {

    private DualListModel<com.jrscherer.jrsmavenrestaurant.entities.Menu> menuItems;
    private DualListModel<com.jrscherer.jrsmavenrestaurant.entities.Menu> orderItems;
    /**
     * Creates a new instance of OrderBean
     */
    public OrderBean() {
    }
    
}
