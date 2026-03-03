public class BoletimEstudantil {
    public static void main(String[] args) {
    int mediaFinal = 6; 
        if (mediaFinal<6) {
            System.out.println("Reprovado");
        }
        else if (mediaFinal==6) {
            System.out.println("Passou raspando");
        }
        else if (mediaFinal>6) {
        System.out.println("Parabéns, você foi aprovado!");
        }
        
    }
}
