# Tutorial: Configurando e Executando no Railway

## Pré-requisitos
- Conta no [Railway](https://railway.app/)

## Passos para Criar um Banco de Dados PostgreSQL

### 1. Crie uma Conta no Railway
Se você ainda não possui uma conta no Railway, acesse [Railway](https://railway.app/) e crie uma conta. Caso já tenha, faça o login.

### 2. Crie um Novo Projeto
1. No painel do Railway, clique no botão **New Project**.
2. Selecione a opção **Deploy PostgreSQL**.

### 3. Configurando as Tabelas da API
1. Clone o repositório do seu projeto.
2. Abra o arquivo `application.properties`.
3. Altere o valor da variável **spring.jpa.hibernate.ddl-auto** para **create** (por padrão, ela deve estar como `validate`).
4. No Railway, vá até a aba **Data** e clique em **Connect**.
   ![image](https://github.com/user-attachments/assets/73db0c83-cffe-474b-bca0-7274854524f6)
5. Na aba **Public Network**, copie a URL do banco.
   ![image](https://github.com/user-attachments/assets/bc9b22cf-f2b3-48e8-a9bd-876e7fb619f6)
6. No IntelliJ, configure as variáveis de ambiente selecionando a configuração para `application`.
   ![image](https://github.com/user-attachments/assets/d6ca2f01-f1d7-4391-b6fe-a1db72d05fba)
7. Crie as variáveis e cole a URL do banco na variável `PGHost` e a porta da URL na variável `PGPort`.
8. Configure o restante das variáveis de acordo com as informações do seu banco. O resultado final deve ser semelhante a:
   ![image](https://github.com/user-attachments/assets/eef00025-c673-4445-8f13-5bcb6eddb2b6)
9. Execute a aplicação.

### 4. Deploy da API no Railway
1. Clique com o **botão direito** no seu projeto e selecione o repositório do GitHub.
2. Escolha o repositório da API.
3. Configure as variáveis de ambiente no Railway da mesma forma que na execução na IDE.
   ![image](https://github.com/user-attachments/assets/84e06ab3-6278-46f1-9443-3abc33e88282)

Pronto! Agora sua aplicação deve estar configurada e rodando no Railway.
