public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "K";

        //        if (plano == "B") {
        //            System.out.println("100 minutos de ligação");
        //        }
        //        else if (plano == "M") {
        //            System.out.println("100 minutos de ligação");
        //            System.out.println("Whatsapp e Instagram ilimitado");
        //        }
        //        else if(plano == "T") {
        //            System.out.println("100 minutos de ligação");
        //            System.out.println("Whatsapp e Instagram ilimitado");
        //            System.out.println("5G e Youtube ilimitado");
        //        }
        switch (plano) {
            case "T": {
                System.out.println("5G e Youtube ilimitado");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram ilimitado");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }    
        
}
    

