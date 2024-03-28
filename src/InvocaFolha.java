public class InvocaFolha {

    public static void main(String[] args) {

        ContratoTrabalho contratotrabalho = new ContratoTrabalho();
        System.out.println("Funcionario com Filhos: " + contratotrabalho.salarioTotal);
        System.out.println("Funcionario sem Filhos:" + contratotrabalho.salarioTotalSemFilhos);
    }
}
