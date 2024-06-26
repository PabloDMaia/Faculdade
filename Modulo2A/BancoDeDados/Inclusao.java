package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Inclusao {
    
    public static void main(String[] args) {
        
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_insert = "INSERT INTO PESSOAS(id, nome) VALUES(?,?)";
        final String driverBanco = "org.postgresql.Driver";

        try {

            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "Satanael");

            preparedStatement.executeUpdate();

            System.out.println("Inclusão realizada com sucesso");

        }catch(Exception exception){
            exception.printStackTrace();
        }

    }
}
