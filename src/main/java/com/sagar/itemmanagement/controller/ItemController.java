package com.sagar.itemmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.itemmanagement.model.Item;
import com.sagar.itemmanagement.store.ItemStore;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	
	@PostMapping
	public ResponseEntity<Item> addItem(@Valid @RequestBody Item item){
		Item savedItem = ItemStore.addItem(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById(@PathVariable Long id){
		return ItemStore.getItemById(id).map(ResponseEntity::ok).orElseGet(
				()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

}
