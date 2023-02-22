/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Modellizzare la classe Blog e la classe Article
La classe Blog presenta:
- Article[] articles
+ addArticle(Article article)*/
package com.mycompany.app;

public class Blog {
    private int articlesCount;
    private Article[] articles;

    public Blog() {
        this.articlesCount = 0;
        this.articles = new Article[3]; 
    }
    
    public void addArticle(Article article){
        
        if(articlesCount >= articles.length) {
            //qui
        }
        
        this.articles[articlesCount] = article;
        articlesCount++;
    }
}
