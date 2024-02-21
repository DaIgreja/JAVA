<!DOCTYPE html>
<html>
<head>
	<title>Confirmação</title>
</head>
<script src="bootstrap/js/bootstrap.bundle.min.js"></script>
<body>

</body>
</html>

<?php

include("conexao.php");


if (isset($_POST['enviar'])): 
	echo "Enviou <br>";
	var_dump($_POST);

endif;

if(isset($_POST['cadastrar'])) {
	
			// Tabela Cliente
		$nome = $_POST["nome"];
		$cpf = $_POST["cpf"];
		$telefone = $_POST["telefone"];

        $sql = "INSERT INTO cliente (nome, cpf, telefone) VALUES ('{$nome}', '{$cpf}', '{$telefone}')";
        $res = $conn->query($sql);

        	// Tabela Marca
        $marca = $_POST["marca"];
        $cd_Marca = $_POST["cd_Marca"];

        $sql = "INSERT INTO marca (marca, cd_Marca) VALUES ('{$marca}', '{$cd_Marca}')";
        $res = $conn->query($sql);

        	// Tabela Modelo
        $modelo = $_POST["modelo"];
        $cd_Modelo = $_POST["cd_Modelo"];

        $sql = "INSERT INTO modelo (modelo, cd_Modelo, Marca_cd_Marca) VALUES ('{$modelo}', '{$cd_Modelo}', '{$cd_Marca}')";
        $res = $conn->query($sql);

        	// Tabela Carro
        $placa = $_POST["placa"];
        $ano = $_POST["ano"];
        $cor = $_POST["cor"];
        

        $sql = "INSERT INTO carro (placa, ano, cor, Modelo_cd_Modelo) VALUES ('{$placa}', '{$ano}', '{$cor}', '{$cd_Modelo}')";
        $res = $conn->query($sql);

        	// Tabela Locacao
        $cd_Locacao = $_POST["cd_Locacao"];
        $dtLocacao = $_POST["dtLocacao"];
        $dtdevolucao = $_POST["dtdevolucao"];
       

        $sql = "INSERT INTO locacao (cd_Locacao, dtLocacao, dtdevolucao, Carro_placa, Cliente_cpf) VALUES ('{$cd_Locacao}', '{$dtLocacao}', '{$dtdevolucao}', '{$placa}', '{$cpf}')";
        $res = $conn->query($sql);

		
	
		if ($res == true) {
			print "<script>alert('Cadastrado com sucesso, entraremos em contato em breve 😄');</script>";
			print "<script>location.href='Listar.php';</script>";
		}
		 else{
		 	print "<script>alert('Não foi possível realizar o cadastro');</script>";
			print "<script>location.href='Listar.php';</script>";
		}
		

		
}

         if (isset($_POST['editar'])) {
                $cd_Locacao = $_POST["cd_Locacao"];
                $dtLocacao = $_POST["dtLocacao"];
                $dtdevolucao = $_POST["dtdevolucao"];

                $sql ="UPDATE locacao SET 
                 cd_Locacao = '{$cd_Locacao}',
                 dtLocacao = '{$dtLocacao}',
                 dtdevolucao = '{$dtdevolucao}',

                        WHERE cd_Locacao =".$_POST['cd_Locacao'];

                $res = $conn->query($sql);


                        if ($res == true) {
                               print "<script>alert('Editado com sucesso 😄');</script>";
                                print "<script>location.href='Listar.php';</script>"; 
                        }
                        else{
                                print "<script>alert('Não foi possível editar os dados!');</script>";
                                print "<script>location.href='Listar.php';</script>";
                        }
        }

        if (isset($_POST['excluir'])) {
                $cd_Locacao = $_POST["cd_Locacao"];
                $dtLocacao = $_POST["dtLocacao"];
                $dtdevolucao = $_POST["dtdevolucao"];

                $sql ="DELETE FROM locacao WHERE cd_Locacao=".$_POST['cd_Locacao'];

                $res = $conn->query($sql);
                        if ($res == true) {
                               print "<script>alert('Excluido com sucesso 😄');</script>";
                                print "<script>location.href='Listar.php';</script>"; 
                        }
                        else{
                                print "<script>alert('Não foi possível excluir os dados!');</script>";
                                print "<script>location.href='Listar.php';</script>";
                        }
        }

?>
