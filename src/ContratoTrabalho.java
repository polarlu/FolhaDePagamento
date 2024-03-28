public class ContratoTrabalho {

    Funcionario funcionario = new Funcionario("joao", 2);
    Funcionario funcionarioSemFilho = new Funcionario("Airton", 0);

    FolhaPagamento folha = new FolhaPagamento();

    double salarioTotal = folha.calculaSalario(40, 5,
            10, 15, funcionario);

    double salarioTotalSemFilhos = folha.calculaSalario(40, 5,
            10, 15, funcionarioSemFilho);

}
