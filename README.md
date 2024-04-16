# EnterConnection
Projeto para o Challenge Sprints 2024 oferecido pela Plusoft na Fiap

## Integrantes:
Francineldo Luan Martins Alvelino – RM99558 
- Responsavel pela documentação .NET e prototipagem Mobile da aplicação.

Enrico do Nascimento Ferreira Galdino - RM552082
- Responsavel pelo desenvolvimento do banco de dados Relacional.

Daniel Alves de Souza - RM552310
- Responsavel pelo video Pitch e documentação da técnica de virtualização (DevOps)

Luiz Felipe dos Santos Tragl - RM99476
- Responsavel pelo video Pitch e desenvolvimento de IOT

Eduardo Ferreira Silva de Jesus - RM98410
- Responsavel pela documentação do projeto em Quality Assurance

## MODELO LÓGICO
![image](https://github.com/FrancineldoLuan/EnterConnection/assets/127765135/93178ef4-5538-41f6-beb5-016182afab70)

## MODELO RELACIONAL
![image](https://github.com/FrancineldoLuan/EnterConnection/assets/127765135/c348893f-817a-4f8c-8f10-6353a9d84b1e)


## Video Pitch
https://youtu.be/GoJ_h2p5hos

## Definição do problema
O problema central que buscamos resolver é a subutilização dos dados disponíveis, impedindo as empresas de entenderem completamente seus clientes e de tomarem decisões estratégicas informadas. No contexto atual, as empresas têm o desafio de aproveitar ao máximo os dados gerados em suas interações com os clientes, já que, muitas vezes, essas informações valiosas não são totalmente exploradas, o que resulta em oportunidades não aproveitadas de crescimento e Desenvolvimento.

# Lista de EndPoints
## @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.getUserById(id);
        return usuario.orElse(null);
        
        este endpoint aceita requisições GET para "/id", onde o "id" é um número inteiro representando o ID de um usuário.
        Ele chama um serviço para obter o usuário correspondente e o retorna. 
        Se o usuário não for encontrado, retorna null.
        
## @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUser(usuario);

        este endpoint aceita requisições POST para criar um novo usuário. 
        O corpo da requisição deve conter os dados do usuário a ser criado. 
        Ele chama um serviço para criar o usuário e retorna o usuário recém-criado.

## @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.updateUser(id, usuario);
    }

    este endpoint aceita requisições PUT para atualizar um usuário existente. 
    O ID do usuário é especificado no caminho da URL, e os dados atualizados do usuário são fornecidos no corpo da requisição.
    Ele chama um serviço para realizar a atualização e retorna o usuário atualizado.

## @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUser(id);
    }
    
    este endpoint aceita requisições DELETE para excluir um usuário com um ID específico. 
    Ele chama um serviço para realizar a exclusão do usuário. 
    Como o método não retorna nenhum valor, ele simplesmente exclui o usuário sem retornar nenhum dado adicional
    












        
