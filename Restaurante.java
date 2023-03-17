import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {


        String Pedido = JOptionPane.showInputDialog("Informe o pedido:\n1 Hambuguer,\n2 pizza, \n3 Sair");
        if (Pedido.equals("1")) {
            String nome = JOptionPane.showInputDialog("Informe o Sabor do Hamburguer:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("O valor do Hambuguer"));

            String valorArtesanal = JOptionPane.showInputDialog("O Hamburguer sera artesanal? \n Sim, \n Não");
            boolean artesanalParaCalculo;

            if (valorArtesanal.equals("Sim")) {
                artesanalParaCalculo = true;
            } else {
                artesanalParaCalculo = false;
            }
            Hamburguer Food = new Hamburguer();
            Food.nome = nome;
            Food.valor = valor;
            double valotTotal = Food.CalcularValor(artesanalParaCalculo);

            JOptionPane.showMessageDialog(null, "Pedido" + valotTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);

            if (Pedido.equals("2")) {
                String nome2 = JOptionPane.showInputDialog("Informe o Sabor do Pizza:");
                double valor2 = Double.parseDouble(JOptionPane.showInputDialog("O valor do Pizza"));

                String valorBorda = JOptionPane.showInputDialog("A pizza vai ter borda recheada? \n Sim, \n Não");
                boolean bordaParaCalculo;

                if (valorBorda.equals("Sim")) {
                    bordaParaCalculo = true;
                } else {
                    bordaParaCalculo = false;
                }
                Pizza boa = new Pizza();
                boa.nome = nome;
                boa.valor = valor;
                double valortTotal2 = boa.CalcularValor(bordaParaCalculo);

                JOptionPane.showMessageDialog(null, "Pedido" + valotTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);

            }


        }
    }
}















