package bd;

import core.*;
import daos.*;

public class BD
{
    public static final MeuPreparedStatement COMANDO;
    public static final Idosos               IDOSO; 
    public static final Funcionarios         FUNCIONARIOS;
    public static final Consultas            CONSULTAS;
    
   

    static
    {
    	MeuPreparedStatement comando      = null;
    	Idosos               idoso        = null;
    	Funcionarios         funcionarios = null;
    	Consultas            consultas    = null;
     	
    	try
        {
            comando =
            new MeuPreparedStatement (
            "oracle.jdbc.driver.OracleDriver",
            "jdbc:oracle:thin:@fs8:1521:orc1",
            "bdbes1818", "Wshut7");

           /* livros = new Livros (); um como esse para cada classe DAO */
        //   Idosos= new IdosoResources();
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            System.exit(0); // aborta o programa
        }
        
        COMANDO      = comando;
        IDOSO        = idoso;
        FUNCIONARIOS = funcionarios;
        CONSULTAS    = consultas;
    }
}