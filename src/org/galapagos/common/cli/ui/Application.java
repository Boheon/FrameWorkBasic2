package org.galapagos.common.cli.ui;

import org.galapagos.multiCampus.command.ExitCommand;
import org.galapagos.common.cli.ui.Menu;
import org.galapagos.common.cli.ui.MenuItem;

public class Application {
    private Menu menu;

    public void createMenu(Menu menu) {
    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand()));
    }

    public void run() {
        init();
        while (true) {
            menu.print();
            MenuItem item = menu.select();
            if (item != null) item.execute();
        }
    }
}
