package org.galapagos.multiCampus.command;

public class SearchCommand implements Command{
    @Override
    public void execute() {
        System.out.println("검색을 시작합니다.");
    }
}
