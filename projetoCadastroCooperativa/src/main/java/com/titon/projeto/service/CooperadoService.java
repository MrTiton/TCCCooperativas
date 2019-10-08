package com.titon.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.titon.projeto.entities.Cooperado;
import com.titon.projeto.entities.ResponseModel;
import com.titon.projeto.repository.CooperadoRepository;

@RestController
@RequestMapping("/cooperados")
public class CooperadoService {
	
	@Autowired
	private CooperadoRepository cooperadoRepository;
	
	@PostMapping
	public @ResponseBody ResponseModel save (@RequestBody Cooperado cooperado){
	       try {
	            this.cooperadoRepository.save(cooperado);
	            return new ResponseModel(1, "Registrada com sucesso");
	       } catch (Exception e) {
	            return new ResponseModel(0, e.getMessage());
	       }
	}
	
	@PutMapping
    public @ResponseBody
    ResponseModel update (@RequestBody Cooperado cooperado) {
        try {
            this.cooperadoRepository.save(cooperado);
            return new ResponseModel(1 , "Registro atualizado com sucesso");
        } catch (Exception e) {
            return new ResponseModel(0 ,e.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseModel delete (@PathVariable("id") Long id) {
        try {
            this.cooperadoRepository.deleteById(id);
            return new ResponseModel(1 , "Registro excluido com sucesso");
        } catch (Exception e) {
            return new ResponseModel(0 ,e.getMessage());
        }
    }
    
    @GetMapping
    public @ResponseBody
    List<Cooperado> findAll(){
        return this.cooperadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cooperado> findById (@PathVariable("id") Long id){
        Optional<Cooperado> cooperado = this.cooperadoRepository.findById(id);

        if(cooperado == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(cooperado.get());
        }
    }
}