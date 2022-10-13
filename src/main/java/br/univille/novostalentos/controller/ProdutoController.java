package br.univille.novostalentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.Produto;
import br.univille.novostalentos.service.ProdutoService;

@RequestMapping("/produto")
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping()
    public ModelAndView mostrar(){
        var listaProdutos = service.getAll();
        return new ModelAndView("produto/index","listaProdutos", listaProdutos);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var produto = new Produto();
        return new ModelAndView("produto/form","produto", produto);
    }

    @PostMapping(params = "form")
    public ModelAndView salvar(Produto produto){
        service.salvar(produto);
        return new ModelAndView("redirect:/produto");
    }
}