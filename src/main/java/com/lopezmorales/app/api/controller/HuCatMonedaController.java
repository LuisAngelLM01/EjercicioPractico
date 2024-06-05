package com.lopezmorales.app.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lopezmorales.app.api.model.HuCatMoneda;
import com.lopezmorales.app.api.service.HuCatMonedaService;

@Controller
@RequestMapping("/api/monedas")
public class HuCatMonedaController {
	@Autowired
    private HuCatMonedaService monedaService;

	@GetMapping("/nueva")
    public String mostrarFormularioNuevaMoneda(Model model) {
        model.addAttribute("moneda", new HuCatMoneda());
        return "nuevaMoneda";
    }

    @GetMapping("/lista")
    public String mostrarListaMonedas(Model model) {
        List<HuCatMoneda> monedas = monedaService.getAllMonedas();
        model.addAttribute("monedas", monedas);
        return "listaMoneda";
    }

    @GetMapping("/{numCia}/{claveMoneda}")
    public String verMoneda(@PathVariable Long numCia, @PathVariable String claveMoneda, Model model) {
        Optional<HuCatMoneda> moneda = monedaService.getMonedaById(numCia, claveMoneda);
        if (moneda.isPresent()) {
            model.addAttribute("moneda", moneda.get());
            return "verMoneda";
        } else {
            return "redirect:/api/monedas/lista";
        }
    }

    @PostMapping
    public ResponseEntity<HuCatMoneda> create(@RequestBody HuCatMoneda moneda) {
        HuCatMoneda createdMoneda = monedaService.createMoneda(moneda);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMoneda);
    }

    @PutMapping("/{numCia}/{claveMoneda}")
    public ResponseEntity<HuCatMoneda> update(@PathVariable Long numCia, @PathVariable String claveMoneda,
            @RequestBody HuCatMoneda moneda) {
        Optional<HuCatMoneda> updatedMoneda = monedaService.updateMoneda(numCia, claveMoneda, moneda);
        return updatedMoneda.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{numCia}/{claveMoneda}")
    public ResponseEntity<Void> delete(@PathVariable Long numCia, @PathVariable String claveMoneda) {
        monedaService.deleteMoneda(numCia, claveMoneda);
        return ResponseEntity.noContent().build();
    }
}
