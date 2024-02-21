

package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Carro;

public class CarroDAO {
    
      protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Carro> leTodos() throws Exception{

List<Carro> listCarros = new ArrayList<Carro>();

try {

String sql = "SELECT * FROM CARRO";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Carro a = new Carro();

a.setPlaca(rs.getString("placa"));

a.setRenavam(rs.getString("renavam"));

a.setAno(rs.getString("ano"));

a.setCor(rs.getString("cor"));

a.setKmInicial(rs.getDouble("kmInicial"));

a.setModelo(ModeloDAO.leUm(rs.getInt("modelo_cd_Modelo")));


listCarros.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listCarros;

}

public static Carro leUm(String placa) throws Exception {

Carro carro = new Carro();

 try {

String sql = "SELECT * FROM Carro WHERE placa = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, placa);

rs = st.executeQuery();

if (rs.next()) {

carro.setPlaca(rs.getString("placa"));
carro.setRenavam(rs.getString("renavam"));
carro.setAno(rs.getString("ano"));
carro.setCor(rs.getString("cor"));
carro.setKmInicial(rs.getDouble("kmInicial"));
carro.setModelo(ModeloDAO.leUm(rs.getInt("modelo_cd_modelo")));


}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return carro;

}

public static int grava(Carro carro) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Carro ( placa, renavam, ano, cor, kmInicial, Modelo_cd_Modelo) VALUES ( ?, ?, ?, ?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, carro.getPlaca());

st.setString(2, carro.getRenavam());

st.setString(3, carro.getAno());

st.setString(4, carro.getCor());

st.setDouble(5, carro.getKmInicial());

st.setInt(6, carro.getModelo().getCdModelo());


ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(Carro carro) throws Exception {

int ret = 0;

try {

String sql = "UPDATE carro SET placa = ?, renavam = ?, ano = ?, cor = ?, kmInicial = ?  WHERE modelo_cd_Modelo = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, carro.getPlaca());
st.setString(2, carro.getRenavam());
st.setString(3, carro.getAno());
st.setString(4, carro.getCor());
st.setDouble(5, carro.getKmInicial());
st.setInt(6, carro.getModelo().getCdModelo());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(String placa) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM carro WHERE placa = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, "placa");

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

   
}





