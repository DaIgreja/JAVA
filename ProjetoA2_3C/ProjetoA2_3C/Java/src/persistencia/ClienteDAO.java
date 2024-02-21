
package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {
      protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Cliente> leTodos() throws Exception{

List<Cliente> listClientes = new ArrayList<Cliente>();

try {

String sql = "SELECT * FROM CLIENTE";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Cliente a = new Cliente();

a.setCpf(rs.getString("cpf"));
a.setNome(rs.getString("nome"));
a.setRenach(rs.getString("renach"));

listClientes.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listClientes;

}

public static Cliente leUm(String cpf) throws Exception {

Cliente cliente = new Cliente();

 try {

String sql = "SELECT * FROM Cliente WHERE cpf = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, cpf);

rs = st.executeQuery();

if (rs.next()) {

cliente.setCpf(rs.getString(cpf));
cliente.setNome(rs.getString("nome"));
cliente.setRenach(rs.getString("renach"));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return cliente;

}

public static int grava(Cliente cliente) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Cliente (cpf, nome, renach) VALUES (?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, cliente.getCpf());

st.setString(2, cliente.getNome());

st.setString(3, cliente.getRenach());

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(String cpf,String nome,  String renach) throws Exception {

int ret = 0;

try {

String sql = "UPDATE cliente SET cpf = ? WHERE nome = ?, renach = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, cpf);

st.setString(2,nome);

st.setString(3,renach);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(String cpf) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM cliente WHERE cpf = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1,cpf);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
}


