package com.scn.pos.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This annotation mean that it will accept request
@RequestMapping("api/v1/article")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {this.articleService = articleService;}

    @GetMapping("allArticles")
    public List<Article> getAllArticles(){return articleService.getArticles();}
}
