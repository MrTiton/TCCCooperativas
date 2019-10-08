package com.titon.projeto.service;

import com.titon.projeto.entities.ResponseModel;
import com.titon.projeto.repository.CooperativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.titon.projeto.entities.Cooperativa;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cooperativas")
public class CooperativaService {

    @Autowired
    private CooperativaRepository cooperativaRepository;

    @PostMapping
    public @ResponseBody ResponseModel save (@RequestBody Cooperativa cooperativa){
        try {
            this.cooperativaRepository.save(cooperativa);
            return new ResponseModel(1, "Registrada com sucesso");
        } catch (Exception e) {
            return new ResponseModel(0, e.getMessage());
        }

    }

    @PutMapping
    public @ResponseBody
    ResponseModel update (@RequestBody Cooperativa mensagem) {
        try {
            this.cooperativaRepository.save(mensagem);
            return new ResponseModel(1 , "Registro atualizado com sucesso");
        } catch (Exception e) {
            return new ResponseModel(0 ,e.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseModel delete (@PathVariable("id") Long id) {
        try {
            this.cooperativaRepository.deleteById(id);
            return new ResponseModel(1 , "Registro excluido com sucesso");
        } catch (Exception e) {
            return new ResponseModel(0 ,e.getMessage());
        }
    }

    @GetMapping
    public @ResponseBody
    List<Cooperativa> findAll(){
        return this.cooperativaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cooperativa> findById (@PathVariable("id") Long id){
        Optional<Cooperativa> cooperativa = this.cooperativaRepository.findById(id);

        if(cooperativa == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(cooperativa.get());
        }
    }
}
