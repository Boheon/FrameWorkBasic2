package org.galapagos.multiCampus.command;

import org.galapagos.common.cli.command.Command;

public class SearchCommand implements Command {
    @Override
    public void execute() {
        System.out.println("검색을 시작합니다.");
    }
}
