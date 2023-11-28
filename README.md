# Loja de Roupas - Atlética Fatec Ipiranga

Bem-vindo à loja de roupas da Atlética Fatec Ipiranga! Este projeto é uma aplicação web construída com Spring Boot para o backend e Angular para o frontend. A loja oferece funcionalidades essenciais para gerenciar clientes, produtos, cestas de compras e pedidos.

## Funcionalidades

### 1. Cliente
   - **Cadastro de Clientes:** Os usuários podem se cadastrar como clientes, fornecendo informações como nome, endereço e informações de contato.

### 2. Produto
   - **Gestão de Produtos:** Administradores podem adicionar, editar e excluir produtos da loja. Cada produto possui informações como nome, descrição, preço e quantidade em estoque.

### 3. Cesta
   - **Cesta de Compras:** Os clientes podem adicionar produtos à cesta de compras enquanto navegam pela loja.

### 4. Pedido
   - **Realização de Pedidos:** Os clientes podem revisar os itens em sua cesta e efetuar pedidos, fornecendo detalhes de entrega.

## Estrutura do Projeto

O projeto está organizado em diversos diretórios, cada um responsável por uma funcionalidade específica. Além disso, há arquivos principais que desempenham papéis cruciais na aplicação.

### Diretórios

1. **cliente:** Contém os arquivos relacionados à funcionalidade de clientes.
2. **produto:** Gerencia os produtos disponíveis na loja.
3. **cesta:** Responsável pela lógica da cesta de compras.
4. **pedido:** Envolve a realização e processamento de pedidos.

### Arquivos Principais

1. **AppController.java:** Controlador principal da aplicação Spring Boot.
2. **ClienteComponent.ts:** Componente Angular para a gestão de clientes.
3. **ProdutoService.java:** Serviço Spring Boot para a gestão de produtos.
4. **CestaComponent.ts:** Componente Angular para a cesta de compras.
5. **PedidoController.java:** Controlador Spring Boot para a realização de pedidos.

## Como Rodar o Projeto

Siga estas instruções para rodar a aplicação em seu ambiente local:

1. **Backend (Spring Boot):**
   - Navegue até o diretório `backend`.
   - Execute o comando `./mvnw spring-boot:run` para iniciar o servidor.

2. **Frontend (Angular):**
   - Navegue até o diretório `frontend`.
   - Execute o comando `ng serve` para iniciar o servidor de desenvolvimento.

3. Abra o navegador e acesse `http://localhost:4200/` para visualizar a aplicação.

## Capturas de Tela

![Loja]()
![Login]()

## Como Contribuir

Sua contribuição é valiosa para aprimorar esta loja de roupas! Se você tiver ideias, correções ou novas funcionalidades, fique à vontade para abrir uma issue ou enviar uma pull request.

Agradecemos por contribuir para a loja de roupas da Atlética Fatec Ipiranga! 🎉
