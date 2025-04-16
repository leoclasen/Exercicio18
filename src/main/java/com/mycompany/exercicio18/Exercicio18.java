package com.mycompany.exercicio18;
import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        String categoria = JOptionPane.showInputDialog("Digite a categoria do produto (A, B, C, D ou E): ");
        double desconto = 0;
        
    switch (categoria.toUpperCase()){
        case "A":
            desconto = preco * 0.10;
        break;
        
        case "B":
            desconto = preco * 0.15;
        break;
        
        case "C":
            desconto = preco * 0.20;
        break;
        
        case "D":
            desconto = preco * 0.25;
        break;
        
        case "E":
            desconto = preco * 0.50;
        break;
        
        default:
            JOptionPane.showMessageDialog(null, "Categoria inválida, o desconto não foi aplicado.");
        }
    double precoFinal = preco - desconto;
    
    JOptionPane.showMessageDialog(null, "O preço final com desconto é de R$ " + precoFinal);
            
    }
}
