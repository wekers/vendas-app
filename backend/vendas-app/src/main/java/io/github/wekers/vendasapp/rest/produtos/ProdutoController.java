package io.github.wekers.vendasapp.rest.produtos;

import io.github.wekers.vendasapp.model.Produto;
import io.github.wekers.vendasapp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;


    @PostMapping
    public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produto){

        Produto entidadeProduto = produto.toModel();
        repository.save(entidadeProduto);
        return ProdutoFormRequest.fromModel(entidadeProduto);

    }

    @PutMapping("{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody ProdutoFormRequest produto){
        Optional<Produto> produtoExistente = repository.findById(id);

        if(produtoExistente.isEmpty()){
            return ResponseEntity.notFound().build();
            //throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Produto entidade = produto.toModel();
        entidade.setId(id);
        //entidade.setDataCadastro(LocalDate.now());
        entidade.setDataCadastro(entidade.getDataCadastro());
        repository.save(entidade);

        return ResponseEntity.ok().build();

    }
}
