# dev-backend
> O projeto foi desenvolvido em ambiente Linux (Ubuntu 16.04), utilizando EclipseKepler.
Foi utilizado Maven pela facilidade que a ferramenta oferece no sentido de
dependências e configurações em relação à aplicação.
Banco H2(em memória) - http://www.h2database.com/html/main.html
Não é necessário baixar uma vez que esse já é detectado na configuração do
maven e instanciado pela aplicação.
Springboot2 como framework para criação dos endpoints da aplicação.
Para inicializar o projeto foi utilizado o Spring Initializr: https://start.spring.io/
Hibernate para o mapeamento Objeto-Relacional: http://hibernate.org/

> Utilizei o banco H2 (em memória), pela facilidade de implantação uma vez que
temos não mais que duas entidades de domínio para persistência. É também
realizada a inserção de alguns dados como exemplo na inicialização da
aplicação. Os dados ficam no arquivo sql localizado em:
/src/main/resources/data.sql
## Como usar os serviços:
Para o consumo dos serviços utilizei o Postman na sua versão mais recente para
Linux. https://www.getpostman.com/downloads/
## Criar um Cliente: POST http://localhost:8080/clientes
raw/JSON:
{
 "name": "Tom2",
 "idade": "25"
}
## Alterar um Cliente: PUT http://localhost:8080/clientes/1
Ex.:
raw/JSON:
{
 "name": "Tom2",
 "idade": "26"
}
## Consultar um Cliente por id: GET http://localhost:8080/clientes/{ID}
Ex.: GET http://localhost:8080/clientes/1000
## Listar todos os Clientes salvos: GET http://localhost:8080/clientes/
## Remover Cliente por id DELETE GET http://localhost:8080/clientes/{ID}
Ex.: GET http://localhost:8080/clientes/1001
## Como executar, testar, empacotar e entregar o seu projeto:
> 1. Criar uma pasta para deploy, e dentro desta baixar os fontes do projeto:
git clone https://github.com/hgbcam/dev-backend.git
> 2. Acessar a pasta do projeto:
cd dev-backend/plat_corp_v1
> 3. Compilar e empacotar o jar com o Maven:
mvn clean install
> 4. Acessar a pasta target, e verificar a existencia do arquivo:
SelecaoSpringBootRestService-0.0.1-SNAPSHOT.jar
> 5. Executar o arquivo com:
java -jar SelecaoSpringBootRestService-0.0.1-SNAPSHOT.jar
