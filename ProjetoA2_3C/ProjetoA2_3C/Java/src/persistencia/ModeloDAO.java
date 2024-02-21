
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Modelo;

public class ModeloDAO {
    
      protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Modelo> leTodos() throws Exception{

List<Modelo> listModelos = new ArrayList<Modelo>();

try {

String sql = "SELECT * FROM MODELO";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Modelo a = new Modelo();

a.setCdModelo(rs.getInt("cd_Modelo"));

a.setModelo(rs.getString("Modelo"));

a.setMarca(MarcaDAO.leUm(rs.getInt("marca_cd_Marca")));


listModelos.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listModelos;

}

public static Modelo leUm(int cd_Modelo) throws Exception {

Modelo modelo = new Modelo();

 try {

String sql = "SELECT * FROM Modelo WHERE cd_Modelo = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cd_Modelo);

rs = st.executeQuery();

if (rs.next()) {

modelo.setCdModelo(rs.getInt("cd_modelo"));
modelo.setModelo(rs.getString("Modelo"));
modelo.setMarca(MarcaDAO.leUm(rs.getInt("marca_cd_marca")));


}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return modelo;

}

public static int grava(Modelo modelo) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Modelo (cd_Modelo, Modelo, Marca_cd_Marca) VALUES (?, ?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, modelo.getCdModelo());

st.setString(2, modelo.getModelo());

st.setInt(3, modelo.getMarca().getCdMarca());


ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(Modelo modelo) throws Exception {

int ret = 0;

try {

String sql = "UPDATE modelo SET cd_Modelo= ?, marca_cd_Marca = ? WHERE Modelo  = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, modelo.getCdModelo());

st.setString(2, modelo.getModelo());

st.setInt(3, modelo.getMarca().getCdMarca());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int cd_Modelo) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM modelo WHERE cd_Modelo = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, "cd_Modelo");

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

   
}





