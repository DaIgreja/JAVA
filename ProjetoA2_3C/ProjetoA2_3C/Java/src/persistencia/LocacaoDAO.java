
package persistencia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Locacao;

public class LocacaoDAO {
     protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Locacao> leTodos() throws Exception{

List<Locacao> listLocacaos = new ArrayList<Locacao>();

try {

String sql = "SELECT * FROM LOCACAO";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Locacao a = new Locacao();

a.setCdLocacao(rs.getInt("cdLocacao"));

a.setDataLocacao(rs.getDate("dataLocacao"));

a.setDataDevolucao(rs.getDate("dataDevolucao"));

a.setValorLocacao(rs.getDouble("valorLocacao"));

a.setFuncionario(FuncionarioDAO.leUm(rs.getInt("funcionario_matricula")));

a.setCliente(ClienteDAO.leUm(rs.getString("cliente_cpf")));

a.setVeiculo(CarroDAO.leUm(rs.getString("carro_placa")));


listLocacaos.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listLocacaos;

}

public static Locacao leUm(int cdLocacao) throws Exception {

Locacao locacao = new Locacao();

 try {

String sql = "SELECT * FROM Locacao WHERE cd_Locacao = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cdLocacao);

rs = st.executeQuery();

if (rs.next()) {

locacao.setCdLocacao(rs.getInt("cdLocacao"));
locacao.setDataLocacao(rs.getDate("dataLocacao"));
locacao.setDataDevolucao(rs.getDate("dataDevolucao"));
locacao.setValorLocacao(rs.getDouble("valorLocacao"));
locacao.setFuncionario(FuncionarioDAO.leUm(rs.getInt("funcionario_matricula")));
locacao.setCliente(ClienteDAO.leUm(rs.getString("cliente_cpf")));
locacao.setVeiculo(CarroDAO.leUm(rs.getString("carro_placa")));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return locacao;

}

public static int grava(Locacao locacao) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Locacao ( cdLocacao, datalocacao, dataDevolucao, valorLocacao, funcionario_matricula, cliente_cpf, carro_placa) VALUES (?, ?, ?, ?, ?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, locacao.getCdLocacao());

st.setDate(2, (Date) locacao.getDataLocacao());

st.setDate(3, (Date) locacao.getDataDevolucao());

st.setDouble(4, locacao.getValorLocacao());

st.setInt(5, locacao.getFuncionario().getMatricula());

st.setString(6, locacao.getCliente().getCpf());

st.setString(7, locacao.getVeiculo().getPlaca());

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(Locacao locacao) throws Exception {

int ret = 0;

try {

String sql = "UPDATE locacao SET cdLocacao = ?, dataLocacao = ?, dataDevolucao = ?, valorLocacao = ?  WHERE funcionario_matricula = ?, cliente_cpf = ?, carro_placa = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, locacao.getCdLocacao());
st.setDate(2, (Date) locacao.getDataLocacao());
st.setDate(3, (Date) locacao.getDataDevolucao());
st.setDouble(4, locacao.getValorLocacao());
st.setInt(5, locacao.getFuncionario().getMatricula());
st.setString(6, locacao.getCliente().getCpf());
st.setString(7, locacao.getVeiculo().getPlaca());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int cdLocacao) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM locacao WHERE cdLocacao = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, "cdLocacao");

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

   
}







