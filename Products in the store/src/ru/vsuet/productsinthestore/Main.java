package ru.vsuet.productsinthestore;

import ru.vsuet.productsinthestore.domain.Otdel;
import ru.vsuet.productsinthestore.repository.DataBaseConnector;
import ru.vsuet.productsinthestore.repository.InMemoryOtdelRepository;
import ru.vsuet.productsinthestore.repository.OtdelRepository;
import ru.vsuet.productsinthestore.repository.Repository;
import ru.vsuet.productsinthestore.tovars.OtdelService;
import ru.vsuet.productsinthestore.tovars.Service;
import ru.vsuet.productsinthestore.view.Menu;

public class Main {
    public static void main(String[] args){
        DataBaseConnector connector=new DataBaseConnector();
        Repository<Otdel> repository= new OtdelRepository(connector);
        //Repository<Otdel> repository=new InMemoryOtdelRepository();
        Service <Otdel> otdelService=new OtdelService(repository);
        Menu menu=new Menu(otdelService);
        while (true){
            menu.draw();
        }

    }
}
