package computer;


import java.util.ArrayList;

public class ListComputer {
    private ArrayList<Computer> listComputer;

    public ListComputer(){
        this.listComputer = new ArrayList<>();
    }
    public void add(Computer cp){
        this.listComputer.add(cp);
    }
    public void outList(){
        for(Computer computer: listComputer){
            System.out.println(computer);
        }
    }
}
