package com.ampep.ampepservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ampep.ampepservices.entities.Menu;
import com.ampep.ampepservices.services.MenuService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/ampep"})
public class MenuController {

	@Autowired
	MenuService service;
	
	@GetMapping("/menu")
    public List<Menu>listar(){
        return service.listarMenu();
    }  
    @GetMapping(path = {"/menu/{id}"})
    public Menu listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PostMapping("/menu")
    public Menu agregar(@Valid @RequestBody Menu me){
        return service.add(me);
    }
    @PutMapping(path = {"/menu/{id}"})
    public Menu editar(@RequestBody Menu me,@PathVariable("id") int id){
    	me.setIdMenu(id);;
        return service.edit(me);
    }
    @DeleteMapping(path = {"/menu/{id}"})
    public Menu delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
