package ru.vsuet.productsinthestore.domain;

import java.util.ArrayList;
import java.util.List;

public class Otdel {
    private String nameot;
    private Integer time;
    private List<Tovar> tovars;

    public Otdel(String nameot, Integer time){
        this.nameot=nameot;
        this.time=time;
        this.tovars= new ArrayList<>();
    }
    public void addTovar(Tovar tovar){
        tovars.add(tovar);
    }
    public void removeTovar(Tovar tovar){
        tovars.removeIf(p->p.getName().equalsIgnoreCase(tovar.getName()));
    }
    public String getNameot(){
        return nameot;
    }

    public Integer getTime(){
        return time;
    }
    public List<Tovar> getTovars(){
        return new ArrayList<>(tovars);
    }

    @Override
    public String toString(){
        return "Otdel:{"+
                "name='"+nameot+'\''+
                ",time="+time+
                ",tovar"+tovars+
                '}';
    }
}