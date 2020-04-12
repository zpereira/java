import otherShip.ship1;

public class mainServer {
    public static void main(String args[]){
        /*
        Main server control program
        */
        ship1 s1 = new ship1();
        s1.showShip1();
        try {
            System.out.println("Argument: " + args[0]);
            System.out.println("No of arguments: " + args.length);
        }catch(Exception ex){
                System.out.println(ex.getMessage());
                System.exit(1);
        }
    }
    
    
    public static void erroHelp(){
        System.out.println("Usage: ");
        System.out.println("-i <input file>");
        System.out.println("-j ");
    }
}
