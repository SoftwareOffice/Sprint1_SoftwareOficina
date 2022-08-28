package SoftwareOffice;

public class Principal {

    public static void main(String[] args){
        System.out.println("Hola mundo");

        Administrativo admin = new Administrativo("juan", "juan@empresa.com", "empresa", "contador");
        Operativo op = new Operativo("carlo", "carlos@empresa.com", "empresa","cortador");
        
        System.out.println(op);
        
        
        
       
    }

}
