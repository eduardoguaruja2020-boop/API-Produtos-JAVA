package com.eduardolima.produtosapi.controller;

import com.eduardolima.produtosapi.model.Produto; // importa a classe Produto, a classe que esse código vai controlar
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação que diz para o Spring que essa classe receberá requisições REST
@RequestMapping("/produtos") // Diz a URL deste controller, ou seja, a URL que ira receber os dados enviados em formato JSON
public class ProdutoController {

    @PostMapping // Anotação marcando esse método como POST, ou seja, ele envia informações pro servidor
    public void salvar(@RequestBody Produto produto){ // Digo para o String passar os dados recebidos pelo body como parametros para a classe Produto (@RequestBody)
        System.out.println("Produto recebido!" + produto);
    }
}
