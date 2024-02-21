 <h1>Editar Locação</h1>

 <?php
    $sql = "SELECT * FROM locacao WHERE cd_Locacao=".$_REQUEST["cd_Locacao"];
    $res = $conn->query($sql);
    $row = $res->fetch_object();
 ?>

 <form method="POST" action="Confirma.php" style="text-align: center;">
            <input type="hidden" name="acao" value="cadastrar">
            
            <section id="Cliente">
                <div class="campo">
                    <label>NOME</label>
                    <input type="text" name="nome" value="<?php print $row->nome; ?>" required>
                </div>

                <div class="campo">
                    <label>CPF</label>
                    <input type="text" name="cpf" required maxlength="11" required>
                </div>
                
               <div class="campo">
                    <label>TELEFONE</label>
                     <input type="text" name="telefone" required maxlength="11" required>
                </div>
            </section>
           
           <section id="Marca">
            <div class="campo">     
                MARCA:
                <select name="marca">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value="Ford">Ford </option>
                   </select>

                   &nbsp&nbsp CÓDIGO MARCA:
                 <select name="cd_Marca">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value= 1 >1</option>
                   </select>  
            </section>
            </div> 

            <section id="Modelo"> 
                <div class="campo">
                MODELO:
                <select name="modelo">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value ="KaSedan">Ford Ka Sedan</option>
                    <option value="EcoSport">Ford EcoSport</option>
                    <option value="Fiesta">Ford New Fiesta</option>
                    
                </select>

                 &nbsp&nbsp CÓDIGO MODELO:
                <select name="cd_Modelo">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value=1>1</option>
                    <option value=2>2</option>
                    <option value=3>3</option>
                    
                </select>     
            </section>    
            </div>

             <section id="Carro">
                <div class="campo">
                    Placa do veículo: 
                    <select name="placa" >
                    <option required selected disabled value="">SELECIONE</option>
                    <option value="ABC1234"> KA Sedan - ABC1234</option>
                    <option value="BCD456"> EcoSport - BCD456</option> 
                    <option value="EFG789"> New Fiesta- EFG789</option>  
            </select> 
                           
                    &nbsp&nbsp Ano do Veículo:: 
                    <select name="ano">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value="2019"> KA Sedan - 2019</option>
                    <option value="2018"> EcoSport - 2018</option>
                    <option value="2018">New Fiesta - 2018</option>
                </select>
            
                    &nbsp&nbsp Cor do veículo: 
                    <select name="cor">
                    <option required selected disabled value="">SELECIONE</option>
                    <option value="Prata"> KA Sedan - Prata</option>
                    <option value="Prata"> EcoSport - Prata</option>
                    <option value="Vermelho"> New Fiesta - Vermelho</option>
                    </select>
                </div>
        </div>
         </section> 
            

            <section id="Locacao">
                <div class="campo">
                    Data de locação: <input type="date" name="dtLocacao">
                    &nbsp&nbsp Data de devoluçao: <input type="date" name="dtdevolucao">

                </div>    
            </section>

                

            <button class="bot" type="submit" name="enviar">ENVIAR</button>
        </form>
