
package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Marca;

public class MarcaDAO {
      protected static Connection connection;

protected static PreparedStatement st;

protected static ResultSet rs;

public static List<Marca> leTodos() throws Exception{

List<Marca> listMarcas = new ArrayList<Marca>();

try {

String sql = "SELECT * FROM MARCA";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Marca a = new Marca();

a.setCdMarca(rs.getInt("cd_Marca"));

a.setMarca(rs.getString("Marca"));


listMarcas.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listMarcas;

}

public static Marca leUm(int cd_Marca) throws Exception {

Marca marca = new Marca();

 try {

String sql = "SELECT * FROM Marca WHERE cd_Marca = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cd_Marca);

rs = st.executeQuery();

if (rs.next()) {

marca.setCdMarca(rs.getInt(cd_Marca));
marca.setMarca(rs.getString("Marca"));


}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return marca;

}

public static int grava(Marca marca) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Marca (cd_Marca, Marca) VALUES (?, ?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, marca.getCdMarca());

st.setString(2, marca.getMarca());


ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(int cd_Marca, String marca) throws Exception {

int ret = 0;

try {

String sql = "UPDATE marca SET cd_Marca = ? WHERE Marca = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cd_Marca);

st.setString(2,marca);


ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int cd_Marca) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM marca WHERE cd_Marca = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cd_Marca);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

   
}



