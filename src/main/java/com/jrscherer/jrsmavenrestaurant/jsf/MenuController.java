package com.jrscherer.jrsmavenrestaurant.jsf;

import com.jrscherer.jrsmavenrestaurant.entities.Menu;
import com.jrscherer.jrsmavenrestaurant.managedbeans.MenuFacade;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@Named("menuController")
@SessionScoped
public class MenuController implements Serializable {
private List<Menu> items;
@EJB
private MenuFacade menuEao;

@PostConstruct
public void loadMenuItems(){
   items = getMenuEao().findAll();
}
    public List<Menu> getMenuItems() {
        return items;
    }
  
    public void setMenuItems(List<Menu> menuItems) {
        this.items = menuItems;
    }

 

    public MenuFacade getMenuEao() {
        return menuEao;
    }

    public void setMenuEao(MenuFacade menuEao) {
        this.menuEao = menuEao;
    }

}
