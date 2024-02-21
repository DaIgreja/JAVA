
package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class FuncionarioDAO {
      protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Funcionario> leTodos() throws Exception{

List<Funcionario> listFuncionarios = new ArrayList<Funcionario>();

try {

String sql = "SELECT * FROM FUNCIONARIO";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Funcionario a = new Funcionario();

a.setMatricula(rs.getInt("Matricula"));

a.setNome(rs.getString("Nome"));

a.setCpf(rs.getString("Cpf"));


listFuncionarios.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listFuncionarios;

}

public static Funcionario leUm(int matricula) throws Exception {

Funcionario funcionario = new Funcionario();

 try {

String sql = "SELECT * FROM Funcionario WHERE matricula = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, matricula);

rs = st.executeQuery();

if (rs.next()) {

funcionario.setMatricula(rs.getInt(matricula));
funcionario.setNome(rs.getString("Nome"));
funcionario.setCpf(rs.getString("Cpf"));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return funcionario;

}

public static int grava(Funcionario funcionario) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Funcionario (Matricula, Nome, Cpf) VALUES (?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, funcionario.getMatricula());

st.setString(2, funcionario.getNome());

st.setString(3, funcionario.getCpf());


ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(int matricula, String nome, String cpf) throws Exception {

int ret = 0;

try {

String sql = "UPDATE funcionario SET matricula = ? WHERE Nome = ?, cpf =?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, matricula);

st.setString(2,nome);

st.setString(3,cpf);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int matricula) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM funcionario WHERE matricula = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, matricula);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
}


