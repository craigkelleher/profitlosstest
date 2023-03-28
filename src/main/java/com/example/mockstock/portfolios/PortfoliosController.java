package com.example.mockstock.portfolios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class PortfoliosController {
    PortfoliosService portfoliosService;
    @GetMapping("/id/portfolio")
    public Portfolios getPortfolio(@PathVariable String id) { return portfoliosService.getPortfolio(id); }
}
