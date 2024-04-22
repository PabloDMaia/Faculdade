package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpetion {
    
    public static void main(String[] args) {
        
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoSelect = "SELECT * FROM pessoas";
        final String driverBanco = "org.postgresql.Driver";

        Connection conexao=null;

        try {

            Class.forName(driverBanco);
            conexao = DriverManager.getConnection(url, usuario, senha);

            Statement sentenca = conexao.createStatement();

            ResultSet rs = sentenca.executeQuery(instrucaoSelect);

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("Id: " + id + " - Nome: " + nome);
            }

            System.out.println("Consulta realizada com sucesso");

        }
        catch(SQLException exception){
            exception.printStackTrace();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("Fim");
        }

    }

}
