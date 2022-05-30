
import java.util.Scanner; //n esquecer de importar o sc
public class IdadeEmDias {
    public static void main(String[] args){
        int anos, meses, dias;
        int idadeEmDias; // Cammel Case
Scanner leitor = new Scanner(System.in); //Sc para ter aceso ao tc do usuario

System.out.println("Digite a sua Idade em anos:");
anos = leitor.nextInt(); // Int pois é um inteiro
System.out.println("Digite a sua Idade em meses:");
meses = leitor.nextInt();
System.out.println("Digite a sua Idade em dias:");
dias = leitor.nextInt();

        int i = meses * 365;
        idadeEmDias = i + meses * 30 + dias;
        System.out.println("Idade em dias:" + idadeEmDias);

        
    }
}
