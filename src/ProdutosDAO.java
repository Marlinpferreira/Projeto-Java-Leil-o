/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {

    private Connection conn;

    // Construtor que obtém a conexão do banco de dados
    public ProdutosDAO() {
        this.conn = new ConexaoBD().getConnection();
    }

    // Método para cadastrar o produto no banco de dados, retornando um boolean
    public boolean cadastrarProduto(ProdutosDTO produto) throws java.sql.SQLException {
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";
        
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, produto.getNome());
            pst.setInt(2, produto.getValor());
            pst.setString(3, produto.getStatus());

            // Executa o comando SQL
            pst.executeUpdate();
            return true; // Retorna true em caso de sucesso
        }
        // Retorna false em caso de erro
            }

    ArrayList<ProdutosDTO> listarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

