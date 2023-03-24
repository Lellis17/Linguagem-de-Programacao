import javax.swing.*;

public class TesteFrame {
    public static void main(String[] args) {
        JFrame Janela = new JFrame("Interface Grafica");
        JButton botao = new JButton("Botao do Swing");
        JLabel texto = new JLabel("Numero de clicks:0");

            JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(texto);
        Janela.getContentPane( ).add(painel);
        Janela.setSize(300,200);
        Janela.show( );
    }
    }

