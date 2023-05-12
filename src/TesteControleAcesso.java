import java.util.ArrayList;

public class TesteControleAcesso {

    public static void main(String[] args) {
        ControleAcesso controle = new ControleAcesso();

        // Teste 1: Registrar acesso com código que não existe
        controle.registrarAcesso(123);
        ArrayList<RegistroAcesso> registros = controle.getRegistros();
        if (registros.size() != 1 || registros.get(0).getCodigo() != 123) {
            System.out.println("Teste 1 falhou");
        } else {
            System.out.println("Teste 1 passou");
        }

        // Teste 2: Registrar acesso com código que já existe
        controle.registrarAcesso(123);
        registros = controle.getRegistros();
        if (registros.size() != 1 || registros.get(0).getCodigo() != 123) {
            System.out.println("Teste 2 falhou");
        } else {
            System.out.println("Teste 2 passou");
        }

        // Teste 3: Registrar acesso com outro código
        controle.registrarAcesso(456);
        registros = controle.getRegistros();
        if (registros.size() != 2 || registros.get(1).getCodigo() != 456) {
            System.out.println("Teste 3 falhou");
        } else {
            System.out.println("Teste 3 passou");
        }

    }
}
