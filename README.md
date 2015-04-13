# ExploringMarsWeb

Este projeto implementa uma interface/serviço web para o projeto ExploringMars (https://github.com/andregarcia/ExploringMars), o qual implementa uma solução para o teste de programação da elo7 (https://gist.github.com/nirev/fa9e63cfe8251f585611)


### Dependencia (ATENÇÃO!!)
Para a execução deste projeto é necessário instalar em seu repositório maven local o projeto ExploringMars encontrado em https://github.com/andregarcia/ExploringMars


### Execução
Execute "mvn tomcat:run" para rodar a aplicação via maven ou faça deploy do arquivo war gerado via maven (utilizando "mvn package")


### Input via formulário
Com a aplicação executando localmente na porta 8080, va para http://localhost:8080/exploringmarsweb/form.jsp para acessar o formulário. 
Neste formulário, entre com os dados de entrada na caixa de texto'input'.


### Input via curl
Faça um POST com upload de um arquivo de entrada via curl, especificando o caminho do arquivo de entrada no parâmetro -F

```sh
curl -i -X POST -H "Content-Type: multipart/form-data" -F "file=@sample_input.txt" http://localhost:8080/exploringmarsweb/explore/mars
```

