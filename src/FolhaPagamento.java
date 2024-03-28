public class FolhaPagamento {

    double acrecimo = 0.10;

    public double calculaSalario(double horasTrabalhadas, double HorasExtras,
                                 double valorDaHora, double valorHorasExtras,
                                 Funcionario funcionario) {

        double totalAPagar = horasTrabalhadas * valorDaHora
                +  HorasExtras * valorHorasExtras;

       // double totalComAcrecimo = totalAPagar;

        if (funcionario.getNumeroFilhos() > 0) { // acrecimo de 47,5 // 475 valor normal sem acrecimo
            totalAPagar *= (1 + acrecimo);     // o cálculo de (1 + acrecimo) é uma forma de representar o fator de aumento percentual que será aplicado ao salário total, permitindo uma fácil modificação do acréscimo sem a necessidade de alterar a lógica de cálculo do salário.
        }

        return totalAPagar;
    }

}